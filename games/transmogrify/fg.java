/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg extends cj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_k;
    static long field_j;
    private java.awt.image.ColorModel field_h;
    static int[] field_i;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static String a(String param0, ci param1, int param2, String param3, int param4) {
        RuntimeException var5 = null;
        int[] var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 32389) {
                break L1;
              } else {
                var6 = (int[]) null;
                fg.a(61, 83, (byte) 125, 103, 62, -127, (int[]) null, -45);
                break L1;
              }
            }
            if (param1.a((byte) -127)) {
              stackIn_6_0 = param0 + " - " + param1.a(true, param2) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fg.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_k = param0;
            param0.setDimensions(this.field_d, this.field_g);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_h);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_k == param0) {
                this.field_k = null;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("fg.removeConsumer(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void d(byte param0) {
        if (!ge.field_x) {
          throw new IllegalStateException();
        } else {
          bg.field_n = true;
          n.a(false, false);
          if (param0 != 91) {
            return;
          } else {
            gl.field_y = 0;
            return;
          }
        }
    }

    private final synchronized void c(byte param0) {
        if (param0 != 28) {
            return;
        }
        if (!(this.field_k != null)) {
            return;
        }
        this.field_k.setPixels(0, 0, this.field_d, this.field_g, this.field_h, this.field_a, 0, this.field_d);
        this.field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.c((byte) 28);
            if (param0 != -32299) {
                java.awt.Component var6 = (java.awt.Component) null;
                this.a(8, -89, (java.awt.Component) null, (byte) 114);
            }
            param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        String stackIn_147_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
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
        int var32 = 0;
        int var33 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var33 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var8_int = param3 + param1 - 1;
                    var9 = param0 + param5 + -1;
                    var10 = param4 * param4;
                    var11 = -param4 + param1;
                    var12 = var8_int + param4;
                    var13 = param0 - param4;
                    var14 = param4 + var9;
                    var15 = var13;
                    if (var15 >= sb.field_e) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var15 = sb.field_e;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var16 = var15;
                    var17 = var11;
                    if (sb.field_d <= var17) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var17 = sb.field_d;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var18 = param1;
                    if (var18 <= sb.field_b) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var18 = sb.field_b;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var19 = var8_int;
                    if (sb.field_b < var19) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var19 = sb.field_b;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var20 = var12;
                    if (var20 > sb.field_b) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var20 = sb.field_b;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var21 = (-var16 + param0 + 1) * (1 + -var16 + param0);
                    var22 = (1 + param1 + -var17) * (-var17 + (param1 - -1));
                    var23 = param0;
                    if (sb.field_f >= var23) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var23 = sb.field_f;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = var23;
                    stackIn_16_1 = var16;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 <= stackIn_16_1) {
                        statePc = 36;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var21 = var21 + ((-param0 + var16 << 1677889697) - 1);
                    var24 = var17 + sb.field_c * var16;
                    var25 = var17;
                    stackIn_37_0 = var21 - -var22;
                    stackIn_18_0 = stackIn_37_0;
                    if (var33 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var26 = stackIn_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var25 >= var18) {
                        statePc = 25;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var26 = var26 + ((var25 + -param1 << -270157823) + -1);
                    stackIn_16_0 = var26;
                    stackIn_21_0 = stackIn_16_0;
                    stackIn_16_1 = var10;
                    stackIn_21_1 = stackIn_16_1;
                    if (var33 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 <= stackIn_21_1) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var27 = var24;
                    var28 = param6[(var10 + -var26) * param7 / var10];
                    var29 = sb.field_h[var27];
                    var30 = var29 + var28;
                    var28 = (var29 & 16711935) + (var28 & 16711935);
                    var29 = (16777472 & var28) + (var30 - var28 & 65536);
                    sb.field_h[var27] = cl.b(-(var29 >>> -321382360) + var29, var30 - var29);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var24++;
                    var25++;
                    if (var33 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var27 = param6[(var10 + -var21) * param7 / var10];
                    var26 = 1 + var21;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var25 >= var19) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var28 = var24;
                    var29 = var27;
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (var29 & 16711935) + (var30 & 16711935);
                    var30 = (16777472 & var29) + (65536 & -var29 + var31);
                    sb.field_h[var28] = cl.b(var30 + -(var30 >>> 2027212104), var31 - var30);
                    var24++;
                    var25++;
                    if (var33 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var33 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var25 >= var20) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var26 = var26 + (-1 + (-var8_int + var25 << 1798921409));
                    stackIn_16_0 = var10 ^ -1;
                    stackIn_32_0 = stackIn_16_0;
                    stackIn_16_1 = var26 ^ -1;
                    stackIn_32_1 = stackIn_16_1;
                    if (var33 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 > stackIn_32_1) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var28 = var24;
                    var29 = param6[param7 * (-var26 + var10) / var10];
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (16711935 & var30) + (var29 & 16711935);
                    var30 = (var29 & 16777472) + (var31 - var29 & 65536);
                    sb.field_h[var28] = cl.b(-(var30 >>> 55419336) + var30, var31 - var30);
                    var24++;
                    var25++;
                    if (var33 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var16++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var33 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var23 = param4 + param0;
                    stackIn_37_0 = var23 ^ -1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 >= (sb.field_f ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var23 = sb.field_f;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param2 > 76) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    field_j = 46L;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = var23;
                    stackIn_42_1 = var16;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 <= stackIn_42_1) {
                        statePc = 66;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var21 = var21 + ((-param0 + var16 << 1430730785) + -1);
                    var24 = sb.field_c * var16 + var17;
                    var25 = var17;
                    stackIn_67_0 = var22;
                    stackIn_44_0 = stackIn_67_0;
                    if (var33 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var26 = stackIn_44_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var16 + (param1 - param0) <= var25) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var26 = var26 + ((var25 + -param1 << -1298665055) + -1);
                    stackIn_42_0 = var25 ^ -1;
                    stackIn_47_0 = stackIn_42_0;
                    stackIn_42_1 = sb.field_b ^ -1;
                    stackIn_47_1 = stackIn_42_1;
                    if (var33 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 > stackIn_47_1) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var27 = var24;
                    var28 = param6[(var10 - var26) * param7 / var10];
                    var29 = sb.field_h[var27];
                    var30 = var29 + var28;
                    var28 = (var29 & 16711935) + (16711935 & var28);
                    var29 = (16777472 & var28) + (65536 & var30 - var28);
                    sb.field_h[var27] = cl.b(var29 + -(var29 >>> -612613368), -var29 + var30);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var24++;
                    var25++;
                    if (var33 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var27 = param6[param7 * (var10 - var21) / var10];
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var8_int + -var16 - -param0 <= var25) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_59_0 = var25;
                    stackIn_54_0 = stackIn_59_0;
                    stackIn_59_1 = sb.field_b;
                    stackIn_54_1 = stackIn_59_1;
                    if (var33 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 < stackIn_54_1) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var28 = var24;
                    var29 = var27;
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (16711935 & var29) + (var30 & 16711935);
                    var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                    sb.field_h[var28] = cl.b(-(var30 >>> -108879032) + var30, -var30 + var31);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var24++;
                    var25++;
                    if (var33 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = var8_int - (var25 + -1);
                    stackIn_59_1 = -var25 + var8_int - -1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var26 = stackIn_59_0 * stackIn_59_1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var25 >= var20) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var26 = var26 + ((-var8_int + var25 << -476816703) + -1);
                    var28 = var24;
                    var29 = param6[param7 * (-var26 + var10) / var10];
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (16711935 & var30) + (var29 & 16711935);
                    var30 = (var29 & 16777472) - -(var31 + -var29 & 65536);
                    sb.field_h[var28] = cl.b(var31 - var30, var30 - (var30 >>> 1935514952));
                    var24++;
                    var25++;
                    if (var33 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var33 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var16++;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (var33 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var23 = -param4 + var9;
                    stackIn_67_0 = var23 ^ -1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 >= (sb.field_f ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var23 = sb.field_f;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var24 = -param4 + (param3 - param4 + -1);
                    if (var17 > param1 + param4) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var24 = var24 + (param4 + param1 + -var17);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = var16;
                    stackIn_73_1 = var23;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (stackIn_73_0 >= stackIn_73_1) {
                        statePc = 90;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var25 = var17 + var16 * sb.field_c;
                    var26 = var22;
                    stackIn_91_0 = var17;
                    stackIn_75_0 = stackIn_91_0;
                    if (var33 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var27 = stackIn_75_0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (param1 + param4 <= var27) {
                        statePc = 82;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var26 = var26 + (-1 + (-param1 + var27 << -1244466495));
                    stackIn_83_0 = sb.field_b ^ -1;
                    stackIn_78_0 = stackIn_83_0;
                    stackIn_83_1 = var27 ^ -1;
                    stackIn_78_1 = stackIn_83_1;
                    if (var33 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (stackIn_78_0 < stackIn_78_1) {
                        statePc = 80;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var28 = var25;
                    var29 = param6[(-var26 + var10) * param7 / var10];
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (var29 & 16711935) + (var30 & 16711935);
                    var30 = (var29 & 16777472) - -(65536 & -var29 + var31);
                    sb.field_h[var28] = cl.b(var30 - (var30 >>> -1385613112), var31 + -var30);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var25++;
                    var27++;
                    if (var33 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var26 = 1 + (param4 + var10) - -param4;
                    var25 = var25 + var24;
                    stackIn_83_0 = var8_int;
                    stackIn_83_1 = -param4;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var27 = stackIn_83_0 + stackIn_83_1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (var27 >= var20) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var26 = var26 + (-1 + (-var8_int + var27 << 501491297));
                    stackIn_73_0 = sb.field_d ^ -1;
                    stackIn_86_0 = stackIn_73_0;
                    stackIn_73_1 = var27 ^ -1;
                    stackIn_86_1 = stackIn_73_1;
                    if (var33 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 < stackIn_86_1) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var28 = var25;
                    var29 = param6[param7 * (-var26 + var10) / var10];
                    var30 = sb.field_h[var28];
                    var31 = var29 + var30;
                    var29 = (16711935 & var30) + (var29 & 16711935);
                    var30 = (65536 & -var29 + var31) + (var29 & 16777472);
                    sb.field_h[var28] = cl.b(var31 - var30, var30 + -(var30 >>> 2081393352));
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var25++;
                    var27++;
                    if (var33 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var16++;
                    if (var33 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var23 = var9;
                    var21 = (var9 + (-var16 - -1)) * (1 + -var16 + var9);
                    stackIn_91_0 = var23;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 > sb.field_f) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var23 = sb.field_f;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_95_0 = var16;
                    stackIn_95_1 = var23;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 >= stackIn_95_1) {
                        statePc = 118;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var21 = var21 + ((-var9 + var16 << 783861889) + -1);
                    var25 = sb.field_c * var16 + var17;
                    var26 = var17;
                    stackIn_119_0 = var22;
                    stackIn_97_0 = stackIn_119_0;
                    if (var33 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var27 = stackIn_97_0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var26 >= var9 + (-var16 + param1)) {
                        statePc = 104;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var27 = var27 + (-1 + (-param1 + var26 << -1144888671));
                    stackIn_95_0 = var26 ^ -1;
                    stackIn_100_0 = stackIn_95_0;
                    stackIn_95_1 = sb.field_b ^ -1;
                    stackIn_100_1 = stackIn_95_1;
                    if (var33 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 > stackIn_100_1) {
                        statePc = 102;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var28 = var25;
                    var29 = param6[param7 * (var10 - var27) / var10];
                    var30 = sb.field_h[var28];
                    var31 = var29 + var30;
                    var29 = (var29 & 16711935) - -(var30 & 16711935);
                    var30 = (var31 - var29 & 65536) + (16777472 & var29);
                    sb.field_h[var28] = cl.b(-var30 + var31, var30 + -(var30 >>> 649140840));
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var25++;
                    var26++;
                    if (var33 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var28 = param6[(var10 - var21) * param7 / var10];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (var26 >= -var9 + var8_int - -var16) {
                        statePc = 110;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_111_0 = var26;
                    stackIn_107_0 = stackIn_111_0;
                    stackIn_111_1 = sb.field_b;
                    stackIn_107_1 = stackIn_111_1;
                    if (var33 != 0) {
                        statePc = 111;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 >= stackIn_107_1) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var29 = var25;
                    var30 = var28;
                    var31 = sb.field_h[var29];
                    var32 = var31 + var30;
                    var30 = (var31 & 16711935) + (var30 & 16711935);
                    var31 = (16777472 & var30) + (65536 & var32 - var30);
                    sb.field_h[var29] = cl.b(var31 + -(var31 >>> 1025857608), -var31 + var32);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var25++;
                    var26++;
                    if (var33 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_111_0 = 1 + var8_int - var26;
                    stackIn_111_1 = -var26 + var8_int + 1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var27 = stackIn_111_0 * stackIn_111_1;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var26 >= var20) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var27 = var27 + ((var26 - var8_int << 1680675873) + -1);
                    var29 = var25;
                    var30 = param6[param7 * (-var27 + var10) / var10];
                    var31 = sb.field_h[var29];
                    var32 = var30 - -var31;
                    var30 = (16711935 & var31) + (16711935 & var30);
                    var31 = (var30 & 16777472) + (-var30 + var32 & 65536);
                    sb.field_h[var29] = cl.b(var31 - (var31 >>> -2007951192), -var31 + var32);
                    var25++;
                    var26++;
                    if (var33 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var33 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var16++;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var33 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var23 = var14;
                    stackIn_119_0 = sb.field_f;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 < var23) {
                        statePc = 121;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var23 = sb.field_f;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_123_0 = var23;
                    stackIn_123_1 = var16;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (stackIn_123_0 <= stackIn_123_1) {
                        statePc = 148;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var25 = var17 + var16 * sb.field_c;
                    var21 = var21 + ((-var9 + var16 << 980968193) + -1);
                    var26 = var17;
                    if (var33 != 0) {
                        statePc = 149;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var27 = var21 + var22;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (var26 >= var18) {
                        statePc = 132;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var27 = var27 + ((var26 + -param1 << 279067809) + -1);
                    stackIn_123_0 = var27;
                    stackIn_128_0 = stackIn_123_0;
                    stackIn_123_1 = var10;
                    stackIn_128_1 = stackIn_123_1;
                    if (var33 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 <= stackIn_128_1) {
                        statePc = 130;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var28 = var25;
                    var29 = param6[(var10 - var27) * param7 / var10];
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (16711935 & var29) + (var30 & 16711935);
                    var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                    sb.field_h[var28] = cl.b(var31 + -var30, -(var30 >>> -1586190520) + var30);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var25++;
                    var26++;
                    if (var33 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var28 = param6[(-var21 + var10) * param7 / var10];
                    var27 = var21 + 1;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var19 <= var26) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var29 = var25;
                    var30 = var28;
                    var31 = sb.field_h[var29];
                    var32 = var31 + var30;
                    var30 = (16711935 & var31) + (16711935 & var30);
                    var31 = (var30 & 16777472) + (65536 & var32 - var30);
                    sb.field_h[var29] = cl.b(-(var31 >>> 533496872) + var31, var32 - var31);
                    var25++;
                    var26++;
                    if (var33 != 0) {
                        statePc = 142;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var33 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var20 <= var26) {
                        statePc = 141;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var27 = var27 + (-1 + (-var8_int + var26 << -2000980191));
                    stackIn_123_0 = var27 ^ -1;
                    stackIn_139_0 = stackIn_123_0;
                    stackIn_123_1 = var10 ^ -1;
                    stackIn_139_1 = stackIn_123_1;
                    if (var33 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0 < stackIn_139_1) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var29 = var25;
                    var30 = param6[(var10 - var27) * param7 / var10];
                    var31 = sb.field_h[var29];
                    var32 = var30 + var31;
                    var30 = (16711935 & var31) + (var30 & 16711935);
                    var31 = (16777472 & var30) - -(-var30 + var32 & 65536);
                    sb.field_h[var29] = cl.b(var32 - var31, -(var31 >>> 433266888) + var31);
                    var25++;
                    var26++;
                    if (var33 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var16++;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (var33 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    return;
                }
                case 149: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("fg.imageUpdate(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
            this.field_d = param0;
            this.field_a = new int[1 + param0 * param1];
            this.field_g = param1;
            int var5_int = 101 / ((-90 - param3) / 34);
            this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_f = param2.createImage((java.awt.image.ImageProducer) (this));
            this.c((byte) 28);
            param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.c((byte) 28);
            param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.c((byte) 28);
            param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.a(103);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -56) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_j = -24L;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = (gd) ((Object) rh.field_r.a((byte) -95));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ne.a((byte) 7, (gd) (var2), param1);
                        var2 = (gd) ((Object) rh.field_r.a(true));
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2 = oc.field_G.a((byte) -95);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var2 == null) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        re.a(2, param1);
                        var2 = oc.field_G.a(true);
                        if (var3 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = caughtException;
                    throw ch.a((Throwable) (var2), "fg.D(" + param0 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 <= 76) {
            field_j = 102L;
        }
    }

    fg() {
    }

    static {
        field_j = 20000000L;
        field_i = new int[]{25, 142, 50, 95, 101, 174, 185, 112, 125, 29, 66, 86, 3, 59, 2, 44, 177, 158, 116};
    }
}
