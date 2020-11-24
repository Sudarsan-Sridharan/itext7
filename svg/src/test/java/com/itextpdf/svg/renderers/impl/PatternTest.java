/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2020 iText Group NV
    Authors: iText Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.svg.renderers.impl;

import com.itextpdf.styledxmlparser.LogMessageConstant;
import com.itextpdf.svg.renderers.SvgIntegrationTest;
import com.itextpdf.test.ITextTest;
import com.itextpdf.test.annotations.LogMessage;
import com.itextpdf.test.annotations.LogMessages;
import com.itextpdf.test.annotations.type.IntegrationTest;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class PatternTest extends SvgIntegrationTest {
    public static final String DESTINATION_FOLDER = "./target/test/com/itextpdf/svg/renderers/impl/PatternTest/";
    public static final String SOURCE_FOLDER = "./src/test/resources/com/itextpdf/svg/renderers/impl/PatternTest/";

    @BeforeClass
    public static void beforeClass() {
        ITextTest.createDestinationFolder(DESTINATION_FOLDER);
    }

    @Test
    //TODO: DEVSIX-4782 support 'viewbox'
    public void widthHeightXYInCmUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInCmUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support 'viewbox'
    public void widthHeightXYInInchUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInInchUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support 'viewbox'
    public void widthHeightXYInEmUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInEmUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support 'viewbox'
    public void widthHeightXYInExUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInExUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support viewbox
    public void widthHeightXYInPercentsDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInPercentsDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support viewbox
    public void widthHeightXYInPxUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInPxUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support 'viewbox'
    public void widthHeightXYInMmUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInMmUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support viewbox
    public void widthHeightXYInPtUnitDiffPatternUnitsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYInPtUnitDiffPatternUnits");
    }

    @Test
    //TODO: DEVSIX-4782 support viewbox
    public void widthHeightXYNoMeasureUnitTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "widthHeightXYNoMeasureUnit");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void hrefAttributeTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "hrefAttribute");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void patternUnitsObjectBoundingBoxTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternUnitsObjectBoundingBox");
    }

    @Test
    //TODO: DEVSIX-4782 Support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void patternUnitsUserSpaceOnUseTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternUnitsUserSpaceOnUse");
    }

    @Test
    public void patternContentUnitsUserSpaceOnUseTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternContentUnitsUserSpaceOnUse");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void patternContentUnitsObjBoundBoxTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternContentUnitsObjBoundBox");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.UNKNOWN_ABSOLUTE_METRIC_LENGTH_PARSED, count = 8)})
    // TODO DEVSIX-4834 support relative units in attributes of svg elements
    public void patternContentUnitsObjBoundBoxAbsoluteCoordTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternContentUnitsObjBoundBoxAbsoluteCoord");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void viewBoxAndAbsoluteCoordinatesTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "viewBoxAndAbsoluteCoordinates");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    //TODO DEVSIX-4811 support 'patternTransform' attribute for SVG pattern element
    public void patternTransformSimpleTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternTransformSimple");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    //TODO DEVSIX-4811 support 'patternTransform' attribute for SVG pattern element
    public void patternTransformUnitsObjectBoundingBoxTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternTransformUnitsObjectBoundingBox");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    //TODO DEVSIX-4811 support 'patternTransform' attribute for SVG pattern element
    public void patternTransformUnitsUserSpaceOnUseTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternTransformUnitsUserSpaceOnUse");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void preserveAspectRatioXMaxYMidMeetTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "preserveAspectRatioXMaxYMidMeet");
    }

    @Test

    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void preserveAspectRatioXMaxYMidSliceTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "preserveAspectRatioXMaxYMidSlice");
    }

    @Test

    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void preserveAspectRatioXMidYMaxMeetTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "preserveAspectRatioXMidYMaxMeet");
    }

    @Test

    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void preserveAspectRatioXMidYMaxSliceTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "preserveAspectRatioXMidYMaxSlice");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void relativeUnitsResolveFromDefsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "relativeUnitsResolveFromDefs");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void relativeUnitsResolveFromPatternTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "relativeUnitsResolveFromPattern");
    }

    @Test
    public void linearGradientInsidePatternTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "linearGradientInsidePattern");
    }

    @Test
    public void nestedPatternsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "nestedPatterns");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.UNKNOWN_ABSOLUTE_METRIC_LENGTH_PARSED, count = 2)})
    // TODO DEVSIX-4834 support relative units in attributes of svg elements
    public void severalComplexElementsInsidePatternTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "severalComplexElementsInsidePattern");
    }

    @Test
    //TODO DEVSIX-4782 support 'viewbox' and `preserveAspectRatio' attribute for SVG pattern element
    public void nestedPatternsWithComplexElementsInsideTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "nestedPatternsWithComplexElementsInside");
    }

    @Test
    // Behavior differs from browser. In our implementation we use default color for element with cycled pattern.
    public void patternUseItselfTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternUseItself");
    }

    @Test
    // Behavior differs from browser. In our implementation we use default color for element with cycled pattern.
    public void nestedPatternsLinkedToEachOtherTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "nestedPatternsLinkedToEachOther");
    }

    @Test
    public void simplePatternTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "simplePatternTest");
    }

    @Test
    public void simplePatternInheritStylesTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "simplePatternInheritStylesTest");
    }

    @Test
    public void simplePatternNestedTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "simplePatternNestedTest");
    }

    @Test
    public void simplePatternStrokeTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "simplePatternStrokeTest");
    }

    @Test
    public void simplePatternNestedFillInheritanceTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "simplePatternNestedFillInheritanceTest");
    }

    @Test
    public void patternContentUnitsObjectBoundingBoxTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternContentUnitsObjectBoundingBox");
    }

    @Test
    // Behavior differs from browser. We use default color instead cycled pattern.
    public void cycledPatternsUserSpaceOnUseTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "cycledPatternsUserSpaceOnUse");
    }

    @Test
    public void objBoundingBoxWithMarginsTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "objBoundingBoxWithMargins");
    }

    @Test
    public void objBoundingBoxUserSpaceOnUseTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "objBoundingBoxUserSpaceOnUse");
    }

    @Test
    public void userSpaceOnUseObjBoundingBoxTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "userSpaceOnUseObjBoundingBox");
    }

    @Test
    // we print the default color that is black
    public void patternDefaultWidthTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternDefaultWidth");
    }

    @Test
    // we print the default color that is black
    public void patternDefaultHeightTest() throws IOException, InterruptedException {
        convertAndCompare(SOURCE_FOLDER, DESTINATION_FOLDER, "patternDefaultHeight");
    }
}