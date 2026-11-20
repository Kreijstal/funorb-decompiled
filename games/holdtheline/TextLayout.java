/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class TextLayout {
    static String field_c;
    static int field_a;
    TextLineLayout[] lines;
    static int[] field_d;

    final static CourseDefinition decodeCourseDefinition(byte[] param0, byte param1) throws IOException {
        CourseDefinition stackIn_15_0 = null;
        int stackIn_16_1 = 0;
        StraightRoadSegment stackIn_28_0;
        StraightRoadSegment stackIn_28_1;
        Point2i stackIn_28_2;
        Point2i stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        int stackIn_28_9;
        int stackIn_28_10;
        int stackIn_28_11;
        int stackIn_28_12;
        int stackIn_28_13;
        int stackIn_28_14;
        StraightRoadSegment stackIn_29_0 = null;
        StraightRoadSegment stackIn_29_1 = null;
        boolean stackIn_29_15 = false;
        boolean stackIn_32_16 = false;
        boolean stackIn_35_17 = false;
        boolean stackIn_38_18 = false;
        boolean stackIn_41_19 = false;
        boolean stackIn_44_20 = false;
        CurvedRoadSegment stackIn_46_0;
        CurvedRoadSegment stackIn_46_1;
        Point2i stackIn_46_2;
        int stackIn_46_3;
        float stackIn_46_4;
        float stackIn_46_5;
        int stackIn_46_6;
        int stackIn_46_7;
        int stackIn_46_8;
        int stackIn_46_9;
        int stackIn_46_10;
        Object stackIn_46_11;
        Object stackIn_46_12;
        Point2i stackIn_46_13;
        CurvedRoadSegment stackIn_47_0 = null;
        CurvedRoadSegment stackIn_47_1 = null;
        boolean stackIn_47_14 = false;
        boolean stackIn_50_15 = false;
        boolean stackIn_53_16 = false;
        boolean stackIn_56_17 = false;
        boolean stackIn_59_18 = false;
        boolean stackIn_62_19;
        StraightRoadSegment stackIn_65_0;
        StraightRoadSegment stackIn_65_1;
        Point2i stackIn_65_2;
        Point2i stackIn_65_3;
        int stackIn_65_4;
        int stackIn_65_5;
        int stackIn_65_6;
        int stackIn_65_7;
        int stackIn_65_8;
        int stackIn_65_9;
        int stackIn_65_10;
        int stackIn_65_11;
        int stackIn_65_12;
        int stackIn_65_13;
        int stackIn_65_14;
        StraightRoadSegment stackIn_66_0 = null;
        StraightRoadSegment stackIn_66_1 = null;
        boolean stackIn_66_15 = false;
        boolean stackIn_69_16 = false;
        boolean stackIn_72_17 = false;
        boolean stackIn_75_18 = false;
        boolean stackIn_78_19 = false;
        boolean stackIn_81_20 = false;
        float stackIn_84_0 = 0.0f;
        float stackIn_95_0 = 0.0f;
        Object stackIn_98_0 = null;
        CourseDefinition stackIn_129_0 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        PacketBuffer var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        char[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        GrowableObjectList var18 = null;
        Point2i var19 = null;
        Point2i var20 = null;
        Point2i var22 = null;
        Object var23 = null;
        CurvedRoadSegment var23_ref = null;
        int var23_int = 0;
        int[] var24 = null;
        float var25 = 0.0f;
        int var26 = 0;
        float var26_float = 0.0f;
        int var27 = 0;
        Point2i var27_ref_qm = null;
        int var28 = 0;
        CurvedRoadSegment var28_ref_hn = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var34 = 0.0f;
        float var35 = 0.0f;
        Object var36 = null;
        Object var37_ref = null;
        StraightRoadSegment var37_ref_dd = null;
        int var37 = 0;
        Object var38_ref = null;
        int var38 = 0;
        CurvedRoadSegment var38_ref_hn = null;
        Object var39_ref = null;
        int var39 = 0;
        CurvedRoadSegment var39_ref_hn = null;
        int var44_int = 0;
        Point2i var44 = null;
        int var45 = 0;
        float var46 = 0.0f;
        TrackObject var47 = null;
        int var48 = 0;
        int var49 = 0;
        PointLight var50 = null;
        int var51 = 0;
        Point2i var52 = null;
        int[] var53 = null;
        Object var54 = null;
        CourseDefinition var57 = null;
        char[] var58 = null;
        StraightRoadSegment var59 = null;
        StraightRoadSegment var60 = null;
        Object var61 = null;
        CurvedRoadSegment var61_ref = null;
        GrowableObjectList var62 = null;
        GrowableObjectList var63 = null;
        GrowableObjectList var64 = null;
        GrowableObjectList var65 = null;
        GrowableObjectList var66 = null;
        GrowableObjectList var67 = null;
        GrowableObjectList var68 = null;
        GrowableObjectList var69 = null;
        char[] var72 = null;
        byte[] var75 = null;
        byte[] var76 = null;
        StraightRoadSegment var77 = null;
        StraightRoadSegment stackIn_29_0Lifetime1;
        StraightRoadSegment stackIn_29_0Lifetime2;
        StraightRoadSegment stackIn_29_0Lifetime3;
        StraightRoadSegment stackIn_29_0Lifetime4;
        StraightRoadSegment stackIn_29_0Lifetime5;
        StraightRoadSegment stackIn_29_1Lifetime1;
        StraightRoadSegment stackIn_29_1Lifetime2;
        StraightRoadSegment stackIn_29_1Lifetime3;
        StraightRoadSegment stackIn_29_1Lifetime4;
        StraightRoadSegment stackIn_29_1Lifetime5;
        CurvedRoadSegment stackIn_47_0Lifetime1;
        CurvedRoadSegment stackIn_47_0Lifetime2;
        CurvedRoadSegment stackIn_47_0Lifetime3;
        CurvedRoadSegment stackIn_47_0Lifetime4;
        CurvedRoadSegment stackIn_47_0Lifetime5;
        CurvedRoadSegment stackIn_47_1Lifetime1;
        CurvedRoadSegment stackIn_47_1Lifetime2;
        CurvedRoadSegment stackIn_47_1Lifetime3;
        CurvedRoadSegment stackIn_47_1Lifetime4;
        CurvedRoadSegment stackIn_47_1Lifetime5;
        StraightRoadSegment stackIn_66_0Lifetime1;
        StraightRoadSegment stackIn_66_0Lifetime2;
        StraightRoadSegment stackIn_66_0Lifetime3;
        StraightRoadSegment stackIn_66_0Lifetime4;
        StraightRoadSegment stackIn_66_0Lifetime5;
        StraightRoadSegment stackIn_66_1Lifetime1;
        StraightRoadSegment stackIn_66_1Lifetime2;
        StraightRoadSegment stackIn_66_1Lifetime3;
        StraightRoadSegment stackIn_66_1Lifetime4;
        StraightRoadSegment stackIn_66_1Lifetime5;
        Point2i var19Lifetime1;
        Point2i var20Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        float var25Lifetime1;
        int var14Lifetime3;
        int var15Lifetime2;
        var54 = null;
        var23 = null;
        var61 = null;
        var37_ref = null;
        var38_ref = null;
        var39_ref = null;
        var51 = HoldTheLine.field_D;
        try {
          GameMenu.initializeTrackObjectDefinitions(false);
          var57 = new CourseDefinition(param0);
          var3 = new PacketBuffer(param0);
          var75 = new byte[EmailAddressValidator.field_m.length];
          var3.readBytes(EmailAddressValidator.field_m.length, 0, (byte) 113, var75);
          if (!NameAvailabilityResult.equalByteArrays(EmailAddressValidator.field_m, 0, var75)) {
            throw new IOException("Invalid file format!");
          }
          var76 = new byte[CourseVersionTag.bytes.length];
          var3.readBytes(CourseVersionTag.bytes.length, 0, (byte) 75, var76);
          if (NameAvailabilityResult.equalByteArrays(WeightedLruCache.field_b, 0, var76)) {
            var6 = 0;
          } else {
            if (!NameAvailabilityResult.equalByteArrays(NodeHashTableIterator.field_e, 0, var76)) {
              throw new IOException("Invalid file version!");
            }
            var6 = 1;
          }
          var57.field_v = (byte)var3.readUnsignedByte((byte) -83);
          var57.field_o = var57.field_v & 7;
          stackIn_15_0 = var57;
          if (var57.field_o == 0) {
            stackIn_16_1 = 0;
          } else {
            if (var57.field_o < 3) {
              stackIn_16_1 = 1;
            } else {
              if (var57.field_o >= 6) {
                stackIn_16_1 = 3;
              } else {
                stackIn_16_1 = 2;
              }
            }
          }
          stackIn_15_0.field_p = stackIn_16_1;
          var7 = var3.readUnsignedByte((byte) -44);
          if (param1 < 107) {
            field_d = (int[]) null;
          }
          var8 = var3.readUnsignedByte((byte) -109);
          var9 = 0;
          var10 = 0;
          if (var6 != 0) {
            var9 = var3.readUnsignedByte((byte) -19);
            var10 = var3.readUnsignedByte((byte) -33);
          }
          var11 = var3.readUnsignedByte((byte) -26);
          var72 = new char[var7];
          var58 = var72;
          var12 = var58;
          for (var13 = 0; var7 > var13; var13++) {
            var12[var13] = (char)kc.a(var3.readUnsignedByte((byte) -102) << 8, var3.readUnsignedByte((byte) -95));
          }
          var57.field_b = new String(var72);
          var18 = new GrowableObjectList();
          for (var13Lifetime1 = 0; var13Lifetime1 < var8; var13Lifetime1++) {
            var19 = new Point2i(var3.readUnsignedShort(-48), var3.readUnsignedShort(-128));
            var20 = new Point2i(var3.readUnsignedShort(-114), var3.readUnsignedShort(71));
            var14 = var3.readByte(0);
            var15 = var3.readUnsignedByte((byte) -19);
            var16 = var3.readByte(0);
            var17 = var3.readByte(0);
            stackIn_28_0 = null;
            stackIn_28_1 = null;
            stackIn_28_2 = var19;
            stackIn_28_3 = var20;
            stackIn_28_4 = var14;
            stackIn_28_5 = 0;
            stackIn_28_6 = 0;
            stackIn_28_7 = 0;
            stackIn_28_8 = 0;
            stackIn_28_9 = 0;
            stackIn_28_10 = 0;
            stackIn_28_11 = 0;
            stackIn_28_12 = 0;
            stackIn_28_13 = var16;
            stackIn_28_14 = var17;
            if ((2 & var15) == 0) {
              stackIn_29_0 = null;
              stackIn_29_1 = null;
              stackIn_29_15 = false;
            } else {
              stackIn_29_0 = null;
              stackIn_29_1 = null;
              stackIn_29_15 = true;
            }
            if ((4 & var15) == 0) {
              stackIn_29_0Lifetime1 = null;
              stackIn_29_1Lifetime1 = null;
              stackIn_32_16 = false;
            } else {
              stackIn_29_0Lifetime1 = null;
              stackIn_29_1Lifetime1 = null;
              stackIn_32_16 = true;
            }
            if ((1 & var15) == 0) {
              stackIn_29_0Lifetime2 = null;
              stackIn_29_1Lifetime2 = null;
              stackIn_35_17 = false;
            } else {
              stackIn_29_0Lifetime2 = null;
              stackIn_29_1Lifetime2 = null;
              stackIn_35_17 = true;
            }
            if (0 == (var15 & 8)) {
              stackIn_29_0Lifetime3 = null;
              stackIn_29_1Lifetime3 = null;
              stackIn_38_18 = false;
            } else {
              stackIn_29_0Lifetime3 = null;
              stackIn_29_1Lifetime3 = null;
              stackIn_38_18 = true;
            }
            if (0 == (16 & var15)) {
              stackIn_29_0Lifetime4 = null;
              stackIn_29_1Lifetime4 = null;
              stackIn_41_19 = false;
            } else {
              stackIn_29_0Lifetime4 = null;
              stackIn_29_1Lifetime4 = null;
              stackIn_41_19 = true;
            }
            if ((32 & var15) == 0) {
              stackIn_29_0Lifetime5 = null;
              stackIn_29_1Lifetime5 = null;
              stackIn_44_20 = false;
            } else {
              stackIn_29_0Lifetime5 = null;
              stackIn_29_1Lifetime5 = null;
              stackIn_44_20 = true;
            }
            var59 = new StraightRoadSegment(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, stackIn_28_9, stackIn_28_10, stackIn_28_11, stackIn_28_12, stackIn_28_13, stackIn_28_14, stackIn_29_15, stackIn_32_16, stackIn_35_17, stackIn_38_18, stackIn_41_19, stackIn_44_20, 0.0f, 0.0f, 3.1415927410125732f);
            var18.add(var59, (byte) 6);
            var52 = new Point2i(var3.readUnsignedShort(101), var3.readUnsignedShort(-49));
            var22 = var52;
            var23_int = var3.readUnsignedShort(-109);
            var53 = new int[]{-var3.readUnsignedByte((byte) -62), -var3.readUnsignedByte((byte) -125), var3.readUnsignedByte((byte) -45), var3.readUnsignedByte((byte) -120)};
            var24 = var53;
            var15Lifetime2 = var3.readUnsignedByte((byte) -127);
            var25 = (float)var3.readShort(-14232) / 256.0f;
            var26_float = (float)var3.readShort(-14232) / 256.0f;
            var14Lifetime3 = var3.readByte(0);
            var27_ref_qm = new Point2i(var3.readUnsignedShort(-127), var3.readUnsignedShort(97));
            stackIn_46_0 = null;
            stackIn_46_1 = null;
            stackIn_46_2 = var52;
            stackIn_46_3 = var23_int;
            stackIn_46_4 = var25;
            stackIn_46_5 = var26_float;
            stackIn_46_6 = var14Lifetime3;
            stackIn_46_7 = var53[1];
            stackIn_46_8 = var53[2];
            stackIn_46_9 = var53[0];
            stackIn_46_10 = var53[3];
            stackIn_46_11 = null;
            stackIn_46_12 = null;
            stackIn_46_13 = var27_ref_qm;
            if ((var15Lifetime2 & 2) == 0) {
              stackIn_47_0 = null;
              stackIn_47_1 = null;
              stackIn_47_14 = false;
            } else {
              stackIn_47_0 = null;
              stackIn_47_1 = null;
              stackIn_47_14 = true;
            }
            if ((var15Lifetime2 & 4) == 0) {
              stackIn_47_0Lifetime1 = null;
              stackIn_47_1Lifetime1 = null;
              stackIn_50_15 = false;
            } else {
              stackIn_47_0Lifetime1 = null;
              stackIn_47_1Lifetime1 = null;
              stackIn_50_15 = true;
            }
            if ((1 & var15Lifetime2) == 0) {
              stackIn_47_0Lifetime2 = null;
              stackIn_47_1Lifetime2 = null;
              stackIn_53_16 = false;
            } else {
              stackIn_47_0Lifetime2 = null;
              stackIn_47_1Lifetime2 = null;
              stackIn_53_16 = true;
            }
            if ((8 & var15Lifetime2) == 0) {
              stackIn_47_0Lifetime3 = null;
              stackIn_47_1Lifetime3 = null;
              stackIn_56_17 = false;
            } else {
              stackIn_47_0Lifetime3 = null;
              stackIn_47_1Lifetime3 = null;
              stackIn_56_17 = true;
            }
            if ((var15Lifetime2 & 16) == 0) {
              stackIn_47_0Lifetime4 = null;
              stackIn_47_1Lifetime4 = null;
              stackIn_59_18 = false;
            } else {
              stackIn_47_0Lifetime4 = null;
              stackIn_47_1Lifetime4 = null;
              stackIn_59_18 = true;
            }
            if ((var15Lifetime2 & 32) == 0) {
              stackIn_47_0Lifetime5 = null;
              stackIn_47_1Lifetime5 = null;
              stackIn_62_19 = false;
            } else {
              stackIn_47_0Lifetime5 = null;
              stackIn_47_1Lifetime5 = null;
              stackIn_62_19 = true;
            }
            var28_ref_hn = new CurvedRoadSegment(stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5, stackIn_46_6, stackIn_46_7, stackIn_46_8, stackIn_46_9, stackIn_46_10, (Point2i) (stackIn_46_11), (Point2i) (stackIn_46_12), stackIn_46_13, stackIn_47_14, stackIn_50_15, stackIn_53_16, stackIn_56_17, stackIn_59_18, stackIn_62_19);
            var18.add(var28_ref_hn, (byte) 6);
          }
          var19Lifetime1 = new Point2i(var3.readShort(-14232), var3.readShort(-14232));
          var20Lifetime1 = new Point2i(var3.readShort(-14232), var3.readShort(-14232));
          var14Lifetime1 = var3.readByte(0);
          var15Lifetime1 = var3.readUnsignedByte((byte) -101);
          var16Lifetime1 = var3.readByte(0);
          var17Lifetime1 = var3.readByte(0);
          stackIn_65_0 = null;
          stackIn_65_1 = null;
          stackIn_65_2 = var19Lifetime1;
          stackIn_65_3 = var20Lifetime1;
          stackIn_65_4 = var14Lifetime1;
          stackIn_65_5 = 0;
          stackIn_65_6 = 0;
          stackIn_65_7 = 0;
          stackIn_65_8 = 0;
          stackIn_65_9 = 0;
          stackIn_65_10 = 0;
          stackIn_65_11 = 0;
          stackIn_65_12 = 0;
          stackIn_65_13 = var16Lifetime1;
          stackIn_65_14 = var17Lifetime1;
          if ((2 & var15Lifetime1) == 0) {
            stackIn_66_0 = null;
            stackIn_66_1 = null;
            stackIn_66_15 = false;
          } else {
            stackIn_66_0 = null;
            stackIn_66_1 = null;
            stackIn_66_15 = true;
          }
          if ((4 & var15Lifetime1) == 0) {
            stackIn_66_0Lifetime1 = null;
            stackIn_66_1Lifetime1 = null;
            stackIn_69_16 = false;
          } else {
            stackIn_66_0Lifetime1 = null;
            stackIn_66_1Lifetime1 = null;
            stackIn_69_16 = true;
          }
          if ((1 & var15Lifetime1) == 0) {
            stackIn_66_0Lifetime2 = null;
            stackIn_66_1Lifetime2 = null;
            stackIn_72_17 = false;
          } else {
            stackIn_66_0Lifetime2 = null;
            stackIn_66_1Lifetime2 = null;
            stackIn_72_17 = true;
          }
          if ((var15Lifetime1 & 8) == 0) {
            stackIn_66_0Lifetime3 = null;
            stackIn_66_1Lifetime3 = null;
            stackIn_75_18 = false;
          } else {
            stackIn_66_0Lifetime3 = null;
            stackIn_66_1Lifetime3 = null;
            stackIn_75_18 = true;
          }
          if ((var15Lifetime1 & 16) == 0) {
            stackIn_66_0Lifetime4 = null;
            stackIn_66_1Lifetime4 = null;
            stackIn_78_19 = false;
          } else {
            stackIn_66_0Lifetime4 = null;
            stackIn_66_1Lifetime4 = null;
            stackIn_78_19 = true;
          }
          if (0 == (32 & var15Lifetime1)) {
            stackIn_66_0Lifetime5 = null;
            stackIn_66_1Lifetime5 = null;
            stackIn_81_20 = false;
          } else {
            stackIn_66_0Lifetime5 = null;
            stackIn_66_1Lifetime5 = null;
            stackIn_81_20 = true;
          }
          var60 = new StraightRoadSegment(stackIn_65_2, stackIn_65_3, stackIn_65_4, stackIn_65_5, stackIn_65_6, stackIn_65_7, stackIn_65_8, stackIn_65_9, stackIn_65_10, stackIn_65_11, stackIn_65_12, stackIn_65_13, stackIn_65_14, stackIn_66_15, stackIn_69_16, stackIn_72_17, stackIn_75_18, stackIn_78_19, stackIn_81_20, 0.0f, 0.0f, 3.1415927410125732f);
          var77 = (StraightRoadSegment) (var18.elements[0]);
          var23_ref = (CurvedRoadSegment) (var18.elements[1]);
          var61_ref = (CurvedRoadSegment) (var18.elements[var18.size - 1]);
          var18.add(var60, (byte) 6);
          var25Lifetime1 = var60.length(50) / (var60.length(50) + var77.length(50));
          var26 = var61_ref.leftRoadOffset;
          var27 = var23_ref.leftRoadOffset;
          var28 = var61_ref.leftCollisionOffset;
          var29 = var23_ref.leftCollisionOffset;
          var30 = var61_ref.rightRoadOffset;
          var31 = var23_ref.rightRoadOffset;
          var32 = var61_ref.rightCollisionOffset;
          var33 = var23_ref.rightCollisionOffset;
          var34 = (float)(3.141592653589793 * (double)var25Lifetime1);
          if (var23_ref.startAngle < var23_ref.endAngle) {
            stackIn_84_0 = var23_ref.startAngle;
          } else {
            stackIn_84_0 = 3.1415927410125732f + var23_ref.startAngle;
          }
          var35 = stackIn_84_0;
          var77.blendStartAngle = var34;
          var60.rightCollisionStartOffset = var61_ref.rightCollisionOffset;
          var13Lifetime2 = 0;
          var60.rightRoadStartOffset = var61_ref.rightRoadOffset;
          var60.blendEndAngle = var34;
          var60.leftRoadStartOffset = var61_ref.leftRoadOffset;
          var60.leftCollisionStartOffset = var61_ref.leftCollisionOffset;
          var36 = null;
          while (true) {
            var37_ref_dd = (StraightRoadSegment) (var18.elements[var13Lifetime2]);
            var37_ref_dd.setOffsetDirection(58, var35);
            if (var37_ref_dd.end.x == var37_ref_dd.start.x &&
              ~var37_ref_dd.start.y == ~var37_ref_dd.end.y) {
              var18.removeAt(true, var13Lifetime2);
            } else {
              var13Lifetime2++;
              var37_ref_dd.leftRoadStartOffset = var26;
              var37_ref_dd.rightRoadEndOffset = var31;
              var37_ref_dd.leftCollisionEndOffset = var29;
              var37_ref_dd.leftRoadEndOffset = var27;
              var37_ref_dd.rightCollisionStartOffset = var32;
              var37_ref_dd.leftCollisionStartOffset = var28;
              var37_ref_dd.rightRoadStartOffset = var30;
              var37_ref_dd.rightCollisionEndOffset = var33;
            }
            if (var36 != null) {
              ((CurvedRoadSegment) (var36)).controlPathEnd = var37_ref_dd.getControlPathStart(-1);
            }
            if (var13Lifetime2 < var18.size) {
              var38_ref_hn = (CurvedRoadSegment) (var18.elements[var13Lifetime2]);
              var38_ref_hn.controlPathStart = var37_ref_dd.getControlPathEnd((byte) -77);
              var13Lifetime2++;
              if (!(var38_ref_hn.startAngle < var38_ref_hn.endAngle)) {
                stackIn_95_0 = 3.1415927410125732f + var38_ref_hn.endAngle;
              } else {
                stackIn_95_0 = var38_ref_hn.endAngle;
              }
              var35 = stackIn_95_0;
              if (-1 + var18.size <= var13Lifetime2) {
                stackIn_98_0 = var23_ref;
              } else {
                stackIn_98_0 = var18.elements[var13Lifetime2 + 1];
              }
              var39_ref_hn = (CurvedRoadSegment) (stackIn_98_0);
              var26 = var27;
              var28 = var29;
              var27 = var39_ref_hn.leftRoadOffset;
              var30 = var31;
              var29 = var39_ref_hn.leftCollisionOffset;
              var32 = var33;
              var31 = var39_ref_hn.rightRoadOffset;
              var33 = var39_ref_hn.rightCollisionOffset;
              var36 = var38_ref_hn;
              continue;
            }
            break;
          }
          var57.roadSegments = new RoadSegment[var18.size];
          for (var13Lifetime3 = 0; var13Lifetime3 < var18.size; var13Lifetime3++) {
            var57.roadSegments[var13Lifetime3] = (RoadSegment) (var18.elements[var13Lifetime3]);
          }
          var37 = var57.roadSegments[-1 + var57.roadSegments.length].layer;
          var38 = var57.roadSegments[0].layer;
          for (var13Lifetime4 = 0; var13Lifetime4 < var57.roadSegments.length; var13Lifetime4++) {
            var39 = var57.roadSegments[(1 + var13Lifetime4) % var57.roadSegments.length].layer;
            if (0 == var38) {
              var57.roadSegments[var13Lifetime4].layerSlope = (float)(var39 - var37) / var57.roadSegments[var13Lifetime4].length(50);
            }
            var37 = var38;
            var38 = var39;
          }
          var57.field_e = new GrowableObjectList();
          var64 = new GrowableObjectList();
          var62 = new GrowableObjectList();
          var65 = new GrowableObjectList();
          var63 = new GrowableObjectList();
          TextLineLayout.buildCourseBoundaries(var62, var63, var64, var57.field_e, var57.roadSegments, var65, -68);
          var57.field_e = NanoTickClock.removeShortBoundaryEdges(var57.field_e, (byte) -127);
          var67 = NanoTickClock.removeShortBoundaryEdges(var64, (byte) -127);
          var69 = NanoTickClock.removeShortBoundaryEdges(var65, (byte) -127);
          var66 = NanoTickClock.removeShortBoundaryEdges(var62, (byte) -127);
          var68 = NanoTickClock.removeShortBoundaryEdges(var63, (byte) -127);
          var57.field_c = ao.a(var66, (byte) 21, false, var67);
          var57.field_t = ao.a(var68, (byte) 21, false, var69);
          if (var6 != 0) {
            var44_int = var10 * 8 + var9 * 3;
            var3.readBytes(var44_int, 0, (byte) 84, new byte[var44_int]);
          }
          for (var13Lifetime5 = 0; var13Lifetime5 < var11; var13Lifetime5++) {
            var44 = new Point2i(var3.readShort(-14232), var3.readShort(-14232));
            var45 = var3.readUnsignedByte((byte) -27);
            var46 = (float)(3.141592653589793 * (double)var3.readUnsignedByte((byte) -55) / 128.0);
            var14Lifetime2 = var3.readByte(0);
            if ((var45 < 5 ||
              var45 > 8) && (var45 < 62 ||
              var45 > 69)) {
              var47 = new TrackObject(var44, var45, var14Lifetime2, var46, 0.0f, 0.0f);
              if ((32768 & var47.flags) == 0) {
                var57.field_k.addLast((byte) -88, var47);
              } else {
                var57.field_m.addLast((byte) -103, var47);
              }
              if (var45 == 53) {
                var48 = var44.x - (int)(Math.sin((double)var46) * 10.0);
                var49 = var44.y - (int)(10.0 * Math.cos((double)var46));
                var50 = new PointLight(var48, var49, var14Lifetime2, 60, DisplayNameForm.field_Q);
                var57.field_x.addLast((byte) -78, var50);
              } else {
                if (var45 == 54) {
                  var48 = var44.x - (int)(35.0 * Math.sin((double)var46));
                  var49 = var44.y - (int)(35.0 * Math.cos((double)var46));
                  var50 = new PointLight(var48, var49, var14Lifetime2, 60, DisplayNameForm.field_Q);
                  var57.field_x.addLast((byte) -99, var50);
                  var48 = var44.x + (int)(35.0 * Math.sin((double)var46));
                  var49 = var44.y + (int)(35.0 * Math.cos((double)var46));
                  var50 = new PointLight(var48, var49, var14Lifetime2, 60, DisplayNameForm.field_Q);
                  var57.field_x.addLast((byte) -114, var50);
                }
              }
            }
          }
          stackIn_129_0 = var57;
          return stackIn_129_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_132_0 = var2;
          stackIn_132_1 = new StringBuilder().append("lm.I(");
          if (param0 == null) {
            stackIn_133_2 = "null";
          } else {
            stackIn_133_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_132_0), ((StringBuilder) (Object) stackIn_132_1).append(stackIn_133_2).append(',').append(param1).append(')').toString());
        }
    }

    final int hitTestCharacter(int param0, int param1, int param2) {
        TextLineLayout var6 = null;
        int var7 = 0;
        int var8 = HoldTheLine.field_D;
        if (null == this.lines ||
          this.lines.length == 0 ||
          this.lines[0].top > param2) {
          return -1;
        }
        if (param2 > this.lines[-1 + this.lines.length].bottom) {
          return -1;
        }
        if (this.lines.length == 1) {
          return this.lines[0].hitTestCharacter(param0, 1800174305);
        }
        int var4 = 0;
        int var5 = 0;
        if (param1 != 8) {
          this.getLineForCharacter(58, -57);
        }
        while (this.lines.length > var5) {
          var6 = this.lines[var5];
          if (var6.top <= param2 &&
            param2 <= var6.bottom) {
            var7 = var6.hitTestCharacter(param0, 1800174305);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (var6.caretPositions.length - 1);
          var5++;
        }
        return -1;
    }

    final int getCaretX(int param0, int param1) {
        int var4 = 0;
        TextLineLayout var5 = null;
        int var6 = HoldTheLine.field_D;
        TextLineLayout[] var7 = this.lines;
        TextLineLayout[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.caretPositions.length > param1) {
            return var5.caretPositions[param1];
          }
          param1 = param1 - (-1 + var5.caretPositions.length);
        }
        if (param0 != 16777215) {
          TextLayout.clearSharedReferences(-28);
        }
        return 0;
    }

    final int getLineForCharacter(int param0, int param1) {
        int var3 = 0;
        TextLineLayout var4 = null;
        int var5 = HoldTheLine.field_D;
        if (param1 != -22539) {
          return 80;
        }
        for (var3 = 0; this.lines.length > var3; var3++) {
          var4 = this.lines[var3];
          if (var4.caretPositions.length > param0) {
            return var3;
          }
          param0 = param0 - (var4.caretPositions.length - 1);
        }
        return this.lines.length;
    }

    final static void drawTooltip(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          var2_int = HoldTheLine.field_F.getLineCount(param1, 180);
          var3 = 20 + var2_int * 20;
          var4 = 0 != (DialogLayer.field_I & 2) ? NodeHashTableIterator.field_g : -200 + NodeHashTableIterator.field_g;
          var5 = (1 & DialogLayer.field_I) == 0 ? -var3 + FullscreenErrorDialog.field_X : FullscreenErrorDialog.field_X;
          int var6 = -2 % ((param0 - 12) / 60);
          SoftwareRasterizer.fillRectangleAlpha(var4, var5, 200, var3, 0, 192);
          SoftwareRasterizer.drawRectangle(var4, var5, 200, var3, 16777215);
          HoldTheLine.field_F.drawParagraph(param1, 10 + var4, var5, 180, var3, 0, -1, 1, 1, 20);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "lm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int calculateJustificationSpacing(int param0, int param1, String param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HoldTheLine.field_D;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          if (param3 >= -37) {
            this.lines = (TextLineLayout[]) null;
          }
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (60 != var9) {
              if (62 == var9) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            return 0;
          }
          stackIn_19_0 = (-param0 + param1 << 8) / var5_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("lm.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final int getHeight(int param0) {
        int stackIn_6_0 = 0;
        if (param0 > -32) {
          field_a = -50;
        }
        if (this.lines != null &&
          0 < this.lines.length) {
          stackIn_6_0 = -this.lines[0].top + this.lines[this.lines.length - 1].bottom;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -11521) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final int getWidth(byte param0) {
        int var5 = 0;
        int var2;
        int var3;
        TextLineLayout[] var4;
        TextLineLayout var6;
        int var8;
        int var7;
        var8 = HoldTheLine.field_D;
        var3 = -127 % ((60 - param0) / 36);
        var2 = -1;
        if (null != this.lines) {
          var4 = this.lines;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 != null) {
              var7 = var6.getWidth((byte) -100);
              if (var2 < var7) {
                var2 = var7;
              }
            }
          }
        }
        return var2;
    }

    static {
        field_a = -1;
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
