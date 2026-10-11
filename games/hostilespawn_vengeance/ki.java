/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static bd field_b;
    static String field_a;
    static bd field_c;
    static fk field_f;
    static bd field_e;
    static String field_d;

    final static void a(int param0) {
        g.a((byte) 2, 17);
        if (param0 != -1) {
          field_c = (bd) null;
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, byte param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = se.field_h.getGraphics();
            if (vh.field_d == null) {
              vh.field_d = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param0) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, hf.field_h, qc.field_s);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == he.field_y) {
                he.field_y = se.field_h.createImage(304, 34);
              }
              var10 = he.field_y.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param1, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param1 * 3 + 2, 2, 300 - param1 * 3, 30);
              var10.setFont(vh.field_d);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (-(6 * param2.length()) + 304) / 2, 22);
              var9.drawImage(he.field_y, -152 + hf.field_h / 2, qc.field_s / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + hf.field_h / 2;
              var8 = -18 + qc.field_s / 2;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, 2 + var8, 3 * param1, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(param1 * 3 + (var7 + 2), 2 + var8, -(3 * param1) + 300, 30);
              var9.setFont(vh.field_d);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, (304 - param2.length() * 6) / 2 + var7, var8 + 22);
            }
            var6 = 50 % ((param4 + 62) / 50);
            if (ed.field_e != null) {
              var9.setFont(vh.field_d);
              var9.setColor(java.awt.Color.white);
              var9.drawString(ed.field_e, hf.field_h / 2 - ed.field_e.length() * 6 / 2, qc.field_s / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            se.field_h.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, bd param7) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_206_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        double var32 = 0.0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var40Lifetime1;
        int var40Lifetime2;
        int var40Lifetime3;
        int var40Lifetime4;
        int var41Lifetime1;
        int var41Lifetime2;
        int var41Lifetime3;
        int var41Lifetime4;
        int var42Lifetime1;
        int var42Lifetime2;
        int var42Lifetime3;
        int var42Lifetime4;
        int var43Lifetime1;
        int var43Lifetime2;
        int var43Lifetime3;
        int var43Lifetime4;
        int var44Lifetime1;
        int var44Lifetime2;
        int var44Lifetime3;
        int var44Lifetime4;
        int var45Lifetime1;
        int var45Lifetime2;
        int var45Lifetime3;
        int var45Lifetime4;
        int var46Lifetime1;
        int var46Lifetime2;
        int var46Lifetime3;
        int var46Lifetime4;
        int var13Lifetime5;
        int var13Lifetime6;
        int var14Lifetime5;
        int var14Lifetime6;
        int var40Lifetime5;
        int var41Lifetime5;
        int var41Lifetime6;
        int var42Lifetime5;
        int var42Lifetime6;
        int var43Lifetime5;
        int var43Lifetime6;
        int var44Lifetime5;
        int var44Lifetime6;
        int var45Lifetime5;
        int var45Lifetime6;
        int var46Lifetime5;
        int var46Lifetime6;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime2Lifetime1;
        int var14Lifetime3Lifetime1;
        int var14Lifetime4Lifetime1;
        int var40Lifetime1Lifetime1;
        int var40Lifetime1Lifetime2;
        int var40Lifetime2Lifetime1;
        int var40Lifetime3Lifetime1;
        int var40Lifetime3Lifetime2;
        int var40Lifetime3Lifetime3;
        int var40Lifetime4Lifetime1;
        int var40Lifetime4Lifetime2;
        int var40Lifetime4Lifetime3;
        int var41Lifetime1Lifetime1;
        int var41Lifetime1Lifetime2;
        int var42Lifetime1Lifetime1;
        int var42Lifetime1Lifetime2;
        int var43Lifetime1Lifetime1;
        int var43Lifetime1Lifetime2;
        int var44Lifetime1Lifetime1;
        int var44Lifetime1Lifetime2;
        int var45Lifetime1Lifetime1;
        int var45Lifetime1Lifetime2;
        int var46Lifetime1Lifetime1;
        int var46Lifetime1Lifetime2;
        var47 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (0 == param5) {
            return;
          }
          var8_int = param7.field_w;
          var9 = param7.field_y;
          var10 = param7.field_z;
          var11 = param7.field_A;
          var12 = param7.field_D;
          param0 = param0 - (var9 << 4);
          param1 = param1 - (var8_int << 4);
          var15 = (double)(param6 & 65535) * 0.00009587379924285257;
          var17 = (int)Math.floor(Math.sin(var15) * (double)param5 + 0.5);
          var18 = (int)Math.floor(0.5 + Math.cos(var15) * (double)param5);
          var19 = var18 * -param1 + var17 * -param0;
          var20 = -param0 * var18 + -(-param1) * var17;
          var21 = (-param1 + (var10 << 4)) * var18 + -param0 * var17;
          var22 = var17 * -((var10 << 4) - param1) + var18 * -param0;
          var23 = (-param0 + (var11 << 4)) * var17 + -param1 * var18;
          var24 = var18 * ((var11 << 4) - param0) + var17 * -(-param1);
          var25 = var17 * (-param0 + (var11 << 4)) + var18 * ((var10 << 4) - param1);
          if (param3) {
            ki.a(-102);
          }
          var26 = (-param0 + (var11 << 4)) * var18 + -((var10 << 4) - param1) * var17;
          if (var19 < var21) {
            var28 = var21;
            var27 = var19;
          } else {
            var28 = var19;
            var27 = var21;
          }
          if (var27 > var23) {
            var27 = var23;
          }
          if (var27 > var25) {
            var27 = var25;
          }
          if (var28 < var23) {
            var28 = var23;
          }
          if (var28 < var25) {
            var28 = var25;
          }
          if (var20 < var22) {
            var29 = var20;
            var30 = var22;
          } else {
            var29 = var22;
            var30 = var20;
          }
          if (var24 < var29) {
            var29 = var24;
          }
          if (var26 < var29) {
            var29 = var26;
          }
          if (var30 < var24) {
            var30 = var24;
          }
          var28 = var28 + 4095 >> 12;
          if (var30 < var26) {
            var30 = var26;
          }
          var29 = var29 >> 12;
          var27 = var27 >> 12;
          var28 = var28 + param4;
          var27 = var27 + param4;
          var30 = var30 + 4095 >> 12;
          var29 = var29 + param2;
          var27 = var27 >> 4;
          var28 = var28 + 15 >> 4;
          var29 = var29 >> 4;
          var30 = var30 + param2;
          if (var28 > si.field_l) {
            var28 = si.field_l;
          }
          if (var27 < si.field_b) {
            var27 = si.field_b;
          }
          if (var29 < si.field_j) {
            var29 = si.field_j;
          }
          var30 = 15 + var30 >> 4;
          var28 = -var28 + var27;
          if (var30 > si.field_a) {
            var30 = si.field_a;
          }
          if (var28 >= 0) {
            return;
          }
          var30 = -var30 + var29;
          if (var30 >= 0) {
            return;
          }
          var31 = var27 + var29 * si.field_e;
          var32 = 16777216.0 / (double)param5;
          var34 = (int)Math.floor(var32 * Math.sin(var15) + 0.5);
          var35 = (int)Math.floor(0.5 + Math.cos(var15) * var32);
          var36 = -param4 + (8 + (var27 << 4));
          var37 = 8 + (var29 << 4) - param2;
          var38 = (param1 << 8) - (var37 * var34 >> 4);
          var39 = (param0 << 8) + (var37 * var35 >> 4);
          if (0 == var35) {
            if (var34 == 0) {
              var41 = var30;
              while (0 > var41) {
                var42 = var31;
                var43 = var38;
                var44 = var39;
                var45 = var28;
                if (var43 >= 0 &&
                  var44 >= 0 &&
                  -(var10 << 12) + var43 < 0 &&
                  var44 - (var11 << 12) < 0) {
                  while (var45 < 0) {
                    var46 = var12[(var43 >> 12) + (var44 >> 12) * var10];
                    if (var46 == 0) {
                      var42++;
                    } else {
                      var14 = si.field_i[var42];
                      var13 = var46 + var14;
                      var46 = (16711935 & var46) + (16711935 & var14);
                      var14 = (var46 & 16777472) + (-var46 + var13 & 65536);
                      incrementValue$6 = var42;
                      var42++;
                      si.field_i[incrementValue$6] = ll.a(var13 - var14, -(var14 >>> 8) + var14);
                    }
                    var45++;
                  }
                }
                var41++;
                var31 = var31 + si.field_e;
              }
              return;
            }
            if (var34 >= 0) {
              var41Lifetime5 = var30;
              while (0 > var41Lifetime5) {
                var42Lifetime5 = var31;
                var43Lifetime5 = var38;
                var44Lifetime5 = var39 + (var36 * var34 >> 4);
                var45Lifetime5 = var28;
                if (var43Lifetime5 >= 0 &&
                  0 > var43Lifetime5 - (var10 << 12)) {
                  if (var44Lifetime5 < 0) {
                    var40 = (-1 + (var34 - var44Lifetime5)) / var34;
                    var44Lifetime5 = var44Lifetime5 + var40 * var34;
                    var42Lifetime5 = var42Lifetime5 + var40;
                    var45Lifetime5 = var45Lifetime5 + var40;
                  }
                  var40 = (-var34 + var44Lifetime5 + (1 - (var11 << 12))) / var34;
                  if (var45Lifetime5 < (-var34 + var44Lifetime5 + (1 - (var11 << 12))) / var34) {
                    var45Lifetime5 = var40;
                  }
                  while (var45Lifetime5 < 0) {
                    var46Lifetime5 = var12[(var43Lifetime5 >> 12) + var10 * (var44Lifetime5 >> 12)];
                    if (var46Lifetime5 != 0) {
                      var14Lifetime5 = si.field_i[var42Lifetime5];
                      var13Lifetime5 = var46Lifetime5 + var14Lifetime5;
                      var46Lifetime5 = (16711935 & var14Lifetime5) + (var46Lifetime5 & 16711935);
                      var14Lifetime5 = (var46Lifetime5 & 16777472) + (var13Lifetime5 - var46Lifetime5 & 65536);
                      incrementValue$7 = var42Lifetime5;
                      var42Lifetime5++;
                      si.field_i[incrementValue$7] = ll.a(-(var14Lifetime5 >>> 8) + var14Lifetime5, -var14Lifetime5 + var13Lifetime5);
                    } else {
                      var42Lifetime5++;
                    }
                    var44Lifetime5 = var44Lifetime5 + var34;
                    var45Lifetime5++;
                  }
                }
                var41Lifetime5++;
                var31 = var31 + si.field_e;
                var38 = var38 - var34;
              }
              return;
            }
            var41Lifetime6 = var30;
            while (0 > var41Lifetime6) {
              var42Lifetime6 = var31;
              var43Lifetime6 = var38;
              var44Lifetime6 = (var34 * var36 >> 4) + var39;
              var45Lifetime6 = var28;
              if (0 <= var43Lifetime6 &&
                -(var10 << 12) + var43Lifetime6 < 0) {
                var40Lifetime5 = -(var11 << 12) + var44Lifetime6;
                if (0 <= -(var11 << 12) + var44Lifetime6) {
                  var40Lifetime5 = (-var40Lifetime5 + var34) / var34;
                  var44Lifetime6 = var44Lifetime6 + var40Lifetime5 * var34;
                  var42Lifetime6 = var42Lifetime6 + var40Lifetime5;
                  var45Lifetime6 = var45Lifetime6 + var40Lifetime5;
                }
                var40Lifetime5 = (-var34 + var44Lifetime6) / var34;
                if (var45Lifetime6 < (-var34 + var44Lifetime6) / var34) {
                  var45Lifetime6 = var40Lifetime5;
                }
                while (0 > var45Lifetime6) {
                  var46Lifetime6 = var12[(var43Lifetime6 >> 12) + var10 * (var44Lifetime6 >> 12)];
                  var44Lifetime6 = var44Lifetime6 + var34;
                  if (0 != var46Lifetime6) {
                    var14Lifetime6 = si.field_i[var42Lifetime6];
                    var13Lifetime6 = var14Lifetime6 + var46Lifetime6;
                    var46Lifetime6 = (16711935 & var14Lifetime6) + (16711935 & var46Lifetime6);
                    var14Lifetime6 = (var13Lifetime6 - var46Lifetime6 & 65536) + (var46Lifetime6 & 16777472);
                    incrementValue$8 = var42Lifetime6;
                    var42Lifetime6++;
                    si.field_i[incrementValue$8] = ll.a(-var14Lifetime6 + var13Lifetime6, var14Lifetime6 - (var14Lifetime6 >>> 8));
                  } else {
                    var42Lifetime6++;
                  }
                  var45Lifetime6++;
                }
              }
              var41Lifetime6++;
              var31 = var31 + si.field_e;
              var38 = var38 - var34;
            }
            return;
          }
          if (var35 >= 0) {
            if (var34 == 0) {
              var41Lifetime1 = var30;
              while (var41Lifetime1 < 0) {
                var42Lifetime1 = var31;
                var43Lifetime1 = var38 + (var35 * var36 >> 4);
                var44Lifetime1 = var39;
                var45Lifetime1 = var28;
                if (var44Lifetime1 >= 0 &&
                  var44Lifetime1 - (var11 << 12) < 0) {
                  if (var43Lifetime1 < 0) {
                    var40Lifetime1 = (-1 + (var35 - var43Lifetime1)) / var35;
                    var45Lifetime1 = var45Lifetime1 + var40Lifetime1;
                    var43Lifetime1 = var43Lifetime1 + var35 * var40Lifetime1;
                    var42Lifetime1 = var42Lifetime1 + var40Lifetime1;
                  }
                  var40Lifetime1 = (-var35 - (var10 << 12) + 1 + var43Lifetime1) / var35;
                  if (var45Lifetime1 < (-var35 - (var10 << 12) + 1 + var43Lifetime1) / var35) {
                    var45Lifetime1 = var40Lifetime1;
                  }
                  while (var45Lifetime1 < 0) {
                    var46Lifetime1 = var12[var10 * (var44Lifetime1 >> 12) + (var43Lifetime1 >> 12)];
                    var43Lifetime1 = var43Lifetime1 + var35;
                    if (var46Lifetime1 == 0) {
                      var42Lifetime1++;
                    } else {
                      var14Lifetime1 = si.field_i[var42Lifetime1];
                      var13Lifetime1 = var14Lifetime1 + var46Lifetime1;
                      var46Lifetime1 = (16711935 & var14Lifetime1) + (var46Lifetime1 & 16711935);
                      var14Lifetime1 = (var13Lifetime1 - var46Lifetime1 & 65536) + (var46Lifetime1 & 16777472);
                      incrementValue$0 = var42Lifetime1;
                      var42Lifetime1++;
                      si.field_i[incrementValue$0] = ll.a(-(var14Lifetime1 >>> 8) + var14Lifetime1, -var14Lifetime1 + var13Lifetime1);
                    }
                    var45Lifetime1++;
                  }
                }
                var41Lifetime1++;
                var39 = var39 + var35;
                var31 = var31 + si.field_e;
              }
              return;
            }
            if (var34 >= 0) {
              var41Lifetime1Lifetime1 = var30;
              while (0 > var41Lifetime1Lifetime1) {
                var42Lifetime1Lifetime1 = var31;
                var43Lifetime1Lifetime1 = var38 + (var35 * var36 >> 4);
                var44Lifetime1Lifetime1 = (var34 * var36 >> 4) + var39;
                var45Lifetime1Lifetime1 = var28;
                if (0 > var43Lifetime1Lifetime1) {
                  var40Lifetime1Lifetime1 = (var35 + (-1 - var43Lifetime1Lifetime1)) / var35;
                  var42Lifetime1Lifetime1 = var42Lifetime1Lifetime1 + var40Lifetime1Lifetime1;
                  var45Lifetime1Lifetime1 = var45Lifetime1Lifetime1 + var40Lifetime1Lifetime1;
                  var44Lifetime1Lifetime1 = var44Lifetime1Lifetime1 + var34 * var40Lifetime1Lifetime1;
                  var43Lifetime1Lifetime1 = var43Lifetime1Lifetime1 + var40Lifetime1Lifetime1 * var35;
                }
                var40Lifetime1Lifetime1 = (-(var10 << 12) + (var43Lifetime1Lifetime1 + 1 - var35)) / var35;
                if ((-(var10 << 12) + (var43Lifetime1Lifetime1 + 1 - var35)) / var35 > var45Lifetime1Lifetime1) {
                  var45Lifetime1Lifetime1 = var40Lifetime1Lifetime1;
                }
                if (var44Lifetime1Lifetime1 < 0) {
                  var40Lifetime1Lifetime1 = (-var44Lifetime1Lifetime1 + var34 - 1) / var34;
                  var43Lifetime1Lifetime1 = var43Lifetime1Lifetime1 + var40Lifetime1Lifetime1 * var35;
                  var44Lifetime1Lifetime1 = var44Lifetime1Lifetime1 + var34 * var40Lifetime1Lifetime1;
                  var45Lifetime1Lifetime1 = var45Lifetime1Lifetime1 + var40Lifetime1Lifetime1;
                  var42Lifetime1Lifetime1 = var42Lifetime1Lifetime1 + var40Lifetime1Lifetime1;
                }
                var40Lifetime1Lifetime1 = (-var34 + (var44Lifetime1Lifetime1 + 1) - (var11 << 12)) / var34;
                if ((-var34 + (var44Lifetime1Lifetime1 + 1) - (var11 << 12)) / var34 > var45Lifetime1Lifetime1) {
                  var45Lifetime1Lifetime1 = var40Lifetime1Lifetime1;
                }
                while (var45Lifetime1Lifetime1 < 0) {
                  var46Lifetime1Lifetime1 = var12[(var43Lifetime1Lifetime1 >> 12) + var10 * (var44Lifetime1Lifetime1 >> 12)];
                  var43Lifetime1Lifetime1 = var43Lifetime1Lifetime1 + var35;
                  var44Lifetime1Lifetime1 = var44Lifetime1Lifetime1 + var34;
                  if (var46Lifetime1Lifetime1 != 0) {
                    var14Lifetime1Lifetime1 = si.field_i[var42Lifetime1Lifetime1];
                    var13Lifetime1Lifetime1 = var14Lifetime1Lifetime1 + var46Lifetime1Lifetime1;
                    var46Lifetime1Lifetime1 = (16711935 & var46Lifetime1Lifetime1) + (var14Lifetime1Lifetime1 & 16711935);
                    var14Lifetime1Lifetime1 = (65536 & -var46Lifetime1Lifetime1 + var13Lifetime1Lifetime1) + (var46Lifetime1Lifetime1 & 16777472);
                    incrementValue$2 = var42Lifetime1Lifetime1;
                    var42Lifetime1Lifetime1++;
                    si.field_i[incrementValue$2] = ll.a(var13Lifetime1Lifetime1 - var14Lifetime1Lifetime1, var14Lifetime1Lifetime1 - (var14Lifetime1Lifetime1 >>> 8));
                  } else {
                    var42Lifetime1Lifetime1++;
                  }
                  var45Lifetime1Lifetime1++;
                }
                var31 = var31 + si.field_e;
                var41Lifetime1Lifetime1++;
                var38 = var38 - var34;
                var39 = var39 + var35;
              }
              return;
            }
            var41Lifetime1Lifetime2 = var30;
            while (var41Lifetime1Lifetime2 < 0) {
              var42Lifetime1Lifetime2 = var31;
              var43Lifetime1Lifetime2 = (var36 * var35 >> 4) + var38;
              var44Lifetime1Lifetime2 = var39 + (var34 * var36 >> 4);
              var45Lifetime1Lifetime2 = var28;
              if (var43Lifetime1Lifetime2 < 0) {
                var40Lifetime1Lifetime2 = (var35 - (1 + var43Lifetime1Lifetime2)) / var35;
                var45Lifetime1Lifetime2 = var45Lifetime1Lifetime2 + var40Lifetime1Lifetime2;
                var43Lifetime1Lifetime2 = var43Lifetime1Lifetime2 + var35 * var40Lifetime1Lifetime2;
                var44Lifetime1Lifetime2 = var44Lifetime1Lifetime2 + var34 * var40Lifetime1Lifetime2;
                var42Lifetime1Lifetime2 = var42Lifetime1Lifetime2 + var40Lifetime1Lifetime2;
              }
              var40Lifetime1Lifetime2 = (var43Lifetime1Lifetime2 + 1 - ((var10 << 12) + var35)) / var35;
              if ((var43Lifetime1Lifetime2 + 1 - ((var10 << 12) + var35)) / var35 > var45Lifetime1Lifetime2) {
                var45Lifetime1Lifetime2 = var40Lifetime1Lifetime2;
              }
              var40Lifetime1Lifetime2 = -(var11 << 12) + var44Lifetime1Lifetime2;
              if (0 <= -(var11 << 12) + var44Lifetime1Lifetime2) {
                var40Lifetime1Lifetime2 = (var34 - var40Lifetime1Lifetime2) / var34;
                var45Lifetime1Lifetime2 = var45Lifetime1Lifetime2 + var40Lifetime1Lifetime2;
                var44Lifetime1Lifetime2 = var44Lifetime1Lifetime2 + var34 * var40Lifetime1Lifetime2;
                var43Lifetime1Lifetime2 = var43Lifetime1Lifetime2 + var40Lifetime1Lifetime2 * var35;
                var42Lifetime1Lifetime2 = var42Lifetime1Lifetime2 + var40Lifetime1Lifetime2;
              }
              var40Lifetime1Lifetime2 = (var44Lifetime1Lifetime2 - var34) / var34;
              if (var45Lifetime1Lifetime2 < (var44Lifetime1Lifetime2 - var34) / var34) {
                var45Lifetime1Lifetime2 = var40Lifetime1Lifetime2;
              }
              while (var45Lifetime1Lifetime2 < 0) {
                var46Lifetime1Lifetime2 = var12[(var43Lifetime1Lifetime2 >> 12) + var10 * (var44Lifetime1Lifetime2 >> 12)];
                var44Lifetime1Lifetime2 = var44Lifetime1Lifetime2 + var34;
                var43Lifetime1Lifetime2 = var43Lifetime1Lifetime2 + var35;
                if (var46Lifetime1Lifetime2 != 0) {
                  var14Lifetime1Lifetime2 = si.field_i[var42Lifetime1Lifetime2];
                  var13Lifetime1Lifetime2 = var46Lifetime1Lifetime2 + var14Lifetime1Lifetime2;
                  var46Lifetime1Lifetime2 = (var46Lifetime1Lifetime2 & 16711935) + (16711935 & var14Lifetime1Lifetime2);
                  var14Lifetime1Lifetime2 = (16777472 & var46Lifetime1Lifetime2) + (65536 & -var46Lifetime1Lifetime2 + var13Lifetime1Lifetime2);
                  incrementValue$1 = var42Lifetime1Lifetime2;
                  var42Lifetime1Lifetime2++;
                  si.field_i[incrementValue$1] = ll.a(var14Lifetime1Lifetime2 - (var14Lifetime1Lifetime2 >>> 8), -var14Lifetime1Lifetime2 + var13Lifetime1Lifetime2);
                } else {
                  var42Lifetime1Lifetime2++;
                }
                var45Lifetime1Lifetime2++;
              }
              var38 = var38 - var34;
              var31 = var31 + si.field_e;
              var41Lifetime1Lifetime2++;
              var39 = var39 + var35;
            }
            return;
          }
          if (var34 == 0) {
            var41Lifetime2 = var30;
            while (var41Lifetime2 < 0) {
              var42Lifetime2 = var31;
              var43Lifetime2 = (var35 * var36 >> 4) + var38;
              var44Lifetime2 = var39;
              var45Lifetime2 = var28;
              if (var44Lifetime2 >= 0 &&
                0 > var44Lifetime2 - (var11 << 12)) {
                var40Lifetime2 = var43Lifetime2 - (var10 << 12);
                if (var43Lifetime2 - (var10 << 12) >= 0) {
                  var40Lifetime2 = (var35 - var40Lifetime2) / var35;
                  var42Lifetime2 = var42Lifetime2 + var40Lifetime2;
                  var43Lifetime2 = var43Lifetime2 + var40Lifetime2 * var35;
                  var45Lifetime2 = var45Lifetime2 + var40Lifetime2;
                }
                var40Lifetime2Lifetime1 = (var43Lifetime2 - var35) / var35;
                if (var45Lifetime2 < (var43Lifetime2 - var35) / var35) {
                  var45Lifetime2 = var40Lifetime2Lifetime1;
                }
                while (var45Lifetime2 < 0) {
                  var46Lifetime2 = var12[(var43Lifetime2 >> 12) + var10 * (var44Lifetime2 >> 12)];
                  if (var46Lifetime2 != 0) {
                    var14Lifetime2 = si.field_i[var42Lifetime2];
                    var13Lifetime2 = var14Lifetime2 + var46Lifetime2;
                    var46Lifetime2 = (16711935 & var14Lifetime2) + (16711935 & var46Lifetime2);
                    var14Lifetime2Lifetime1 = (16777472 & var46Lifetime2) + (65536 & var13Lifetime2 - var46Lifetime2);
                    incrementValue$3 = var42Lifetime2;
                    var42Lifetime2++;
                    si.field_i[incrementValue$3] = ll.a(-var14Lifetime2Lifetime1 + var13Lifetime2, -(var14Lifetime2Lifetime1 >>> 8) + var14Lifetime2Lifetime1);
                  } else {
                    var42Lifetime2++;
                  }
                  var43Lifetime2 = var43Lifetime2 + var35;
                  var45Lifetime2++;
                }
              }
              var39 = var39 + var35;
              var41Lifetime2++;
              var31 = var31 + si.field_e;
            }
            return;
          }
          if (var34 >= 0) {
            for (var41Lifetime3 = var30; var41Lifetime3 < 0; var41Lifetime3++) {
              var42Lifetime3 = var31;
              var43Lifetime3 = (var36 * var35 >> 4) + var38;
              var44Lifetime3 = var39 + (var36 * var34 >> 4);
              var45Lifetime3 = var28;
              var40Lifetime3 = var43Lifetime3 - (var10 << 12);
              if (var43Lifetime3 - (var10 << 12) >= 0) {
                var40Lifetime3 = (var35 - var40Lifetime3) / var35;
                var44Lifetime3 = var44Lifetime3 + var34 * var40Lifetime3;
                var42Lifetime3 = var42Lifetime3 + var40Lifetime3;
                var43Lifetime3 = var43Lifetime3 + var40Lifetime3 * var35;
                var45Lifetime3 = var45Lifetime3 + var40Lifetime3;
              }
              var40Lifetime3Lifetime1 = (var43Lifetime3 - var35) / var35;
              if ((var43Lifetime3 - var35) / var35 > var45Lifetime3) {
                var45Lifetime3 = var40Lifetime3Lifetime1;
              }
              if (var44Lifetime3 < 0) {
                var40Lifetime3Lifetime2 = (-var44Lifetime3 + (var34 - 1)) / var34;
                var42Lifetime3 = var42Lifetime3 + var40Lifetime3Lifetime2;
                var45Lifetime3 = var45Lifetime3 + var40Lifetime3Lifetime2;
                var44Lifetime3 = var44Lifetime3 + var34 * var40Lifetime3Lifetime2;
                var43Lifetime3 = var43Lifetime3 + var40Lifetime3Lifetime2 * var35;
              }
              var40Lifetime3Lifetime3 = (-var34 + (-(var11 << 12) + (1 + var44Lifetime3))) / var34;
              if ((-var34 + (-(var11 << 12) + (1 + var44Lifetime3))) / var34 > var45Lifetime3) {
                var45Lifetime3 = var40Lifetime3Lifetime3;
              }
              while (var45Lifetime3 < 0) {
                var46Lifetime3 = var12[(var44Lifetime3 >> 12) * var10 + (var43Lifetime3 >> 12)];
                var43Lifetime3 = var43Lifetime3 + var35;
                var44Lifetime3 = var44Lifetime3 + var34;
                if (var46Lifetime3 != 0) {
                  var14Lifetime3 = si.field_i[var42Lifetime3];
                  var13Lifetime3 = var46Lifetime3 + var14Lifetime3;
                  var46Lifetime3 = (16711935 & var14Lifetime3) + (16711935 & var46Lifetime3);
                  var14Lifetime3Lifetime1 = (var13Lifetime3 - var46Lifetime3 & 65536) + (var46Lifetime3 & 16777472);
                  incrementValue$5 = var42Lifetime3;
                  var42Lifetime3++;
                  si.field_i[incrementValue$5] = ll.a(var14Lifetime3Lifetime1 - (var14Lifetime3Lifetime1 >>> 8), var13Lifetime3 - var14Lifetime3Lifetime1);
                } else {
                  var42Lifetime3++;
                }
                var45Lifetime3++;
              }
              var39 = var39 + var35;
              var38 = var38 - var34;
              var31 = var31 + si.field_e;
            }
            return;
          }
          var41Lifetime4 = var30;
          while (var41Lifetime4 < 0) {
            var42Lifetime4 = var31;
            var43Lifetime4 = (var36 * var35 >> 4) + var38;
            var44Lifetime4 = var39 + (var34 * var36 >> 4);
            var45Lifetime4 = var28;
            var40Lifetime4 = var43Lifetime4 - (var10 << 12);
            if (var43Lifetime4 - (var10 << 12) >= 0) {
              var40Lifetime4 = (-var40Lifetime4 + var35) / var35;
              var44Lifetime4 = var44Lifetime4 + var40Lifetime4 * var34;
              var42Lifetime4 = var42Lifetime4 + var40Lifetime4;
              var45Lifetime4 = var45Lifetime4 + var40Lifetime4;
              var43Lifetime4 = var43Lifetime4 + var40Lifetime4 * var35;
            }
            var40Lifetime4Lifetime1 = (var43Lifetime4 - var35) / var35;
            if ((var43Lifetime4 - var35) / var35 > var45Lifetime4) {
              var45Lifetime4 = var40Lifetime4Lifetime1;
            }
            var40Lifetime4Lifetime2 = -(var11 << 12) + var44Lifetime4;
            if (-(var11 << 12) + var44Lifetime4 >= 0) {
              var40Lifetime4Lifetime2 = (-var40Lifetime4Lifetime2 + var34) / var34;
              var45Lifetime4 = var45Lifetime4 + var40Lifetime4Lifetime2;
              var43Lifetime4 = var43Lifetime4 + var35 * var40Lifetime4Lifetime2;
              var44Lifetime4 = var44Lifetime4 + var34 * var40Lifetime4Lifetime2;
              var42Lifetime4 = var42Lifetime4 + var40Lifetime4Lifetime2;
            }
            var40Lifetime4Lifetime3 = (var44Lifetime4 - var34) / var34;
            if ((var44Lifetime4 - var34) / var34 > var45Lifetime4) {
              var45Lifetime4 = var40Lifetime4Lifetime3;
            }
            while (0 > var45Lifetime4) {
              var46Lifetime4 = var12[(var43Lifetime4 >> 12) + var10 * (var44Lifetime4 >> 12)];
              var44Lifetime4 = var44Lifetime4 + var34;
              var43Lifetime4 = var43Lifetime4 + var35;
              if (0 != var46Lifetime4) {
                var14Lifetime4 = si.field_i[var42Lifetime4];
                var13Lifetime4 = var14Lifetime4 + var46Lifetime4;
                var46Lifetime4 = (16711935 & var46Lifetime4) + (16711935 & var14Lifetime4);
                var14Lifetime4Lifetime1 = (16777472 & var46Lifetime4) + (var13Lifetime4 - var46Lifetime4 & 65536);
                incrementValue$4 = var42Lifetime4;
                var42Lifetime4++;
                si.field_i[incrementValue$4] = ll.a(var14Lifetime4Lifetime1 - (var14Lifetime4Lifetime1 >>> 8), var13Lifetime4 - var14Lifetime4Lifetime1);
              } else {
                var42Lifetime4++;
              }
              var45Lifetime4++;
            }
            var39 = var39 + var35;
            var38 = var38 - var34;
            var41Lifetime4++;
            var31 = var31 + si.field_e;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_205_0 = var8;
          stackIn_205_1 = new StringBuilder().append("ki.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_c = null;
        if (!param0) {
          return;
        }
        field_b = null;
    }

    static {
        field_a = "Your objective is to bring the ship's reactor back online. You can press <img=0> to view your objectives at any time. The location of your current objective is shown by the yellow pointer.";
        field_d = "Par time: <col=ffffff>";
    }
}
