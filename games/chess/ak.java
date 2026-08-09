/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends o {
    static int field_j;
    static int[][] field_q;
    static kj field_u;
    static int[] field_y;
    static int[] field_k;
    int field_n;
    int field_w;
    int field_t;
    static String field_x;
    int field_v;
    static int[] field_r;
    int field_l;
    int field_s;
    int[] field_o;
    static int[] field_m;
    int field_p;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_q = (int[][]) null;
        if (param0 != 21296) {
          field_m = (int[]) null;
          field_m = null;
          field_k = null;
          field_u = null;
          field_r = null;
          field_y = null;
          field_x = null;
          return;
        } else {
          field_m = null;
          field_k = null;
          field_u = null;
          field_r = null;
          field_y = null;
          field_x = null;
          return;
        }
    }

    final static void a(jk param0, byte param1, Object param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        Exception var4 = null;
        int var5 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            if (param0.field_x != null) {
              var3_int = -60 % ((param1 - 44) / 55);
              var4_int = 0;
              L1: while (true) {
                L2: {
                  if (-51 >= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    if (param0.field_x.peekEvent() == null) {
                      break L2;
                    } else {
                      bc.a(1L, (byte) -123);
                      var4_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param2 == null) {
                        break L4;
                      } else {
                        param0.field_x.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ak.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            Object var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    if (!param0) {
                      break L1;
                    } else {
                      var3 = (Object) null;
                      ak.a((jk) null, (byte) 6, (Object) null);
                      break L1;
                    }
                  }
                  param1.getAppletContext().showDocument(rh.a(var2, param1, (byte) -87), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("ak.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(km[][] param0, byte[] param1, int[] param2, um param3, byte[] param4, int param5, rk[] param6, int param7, String[] param8, String[][] param9, int[] param10, int param11, km[][] param12, um param13, um param14, boolean param15, String[][] param16) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          L0: {
            L1: {
              if (param11 == 22193) {
                break L1;
              } else {
                ak.c((byte) -125);
                break L1;
              }
            }
            var18 = (String[]) null;
            Chess.a(param8, (String[]) null, param1, param6, param14, param7, param2, param4, param12, param15, param9, param13, 1, param3, param10, param0, param16, 1, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var17);

            stackIn_6_1 = new StringBuilder().append("ak.C(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L14;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L14;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_43_2 + ')');
        }
    }

    final static void c(byte param0) {
        a.field_a = hm.a(-64);
        jh.field_e = new fm();
        if (param0 >= -87) {
            return;
        }
        in.a((byte) 112, true, true);
    }

    final static boolean a(boolean param0) {
        Object var2;
        if (param0) {
          if (tj.h(105)) {
            if (-1 != (8 & r.field_Eb ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = (Object) null;
          ak.a((jk) null, (byte) 23, (Object) null);
          if (tj.h(105)) {
            if (-1 != (8 & r.field_Eb ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1796065185;
        if (param1 != 1045) {
          field_u = (kj) null;
          param0 = param0 | param0 >>> -1905065694;
          param0 = param0 | param0 >>> -1551630844;
          param0 = param0 | param0 >>> -498468376;
          param0 = param0 | param0 >>> 1797442160;
          return 1 + param0;
        } else {
          param0 = param0 | param0 >>> -1905065694;
          param0 = param0 | param0 >>> -1551630844;
          param0 = param0 | param0 >>> -498468376;
          param0 = param0 | param0 >>> 1797442160;
          return 1 + param0;
        }
    }

    ak(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_w = param1;
            this.field_p = param4;
            fieldTemp$0 = th.field_b;
            th.field_b = th.field_b + 1;
            this.field_s = fieldTemp$0 & 65535;
            this.field_v = param2;
            this.field_l = param5;
            this.field_t = param0;
            this.field_o = param6;
            this.field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ak.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[12][];
        field_y = new int[12];
        field_x = "<%0> wants to join";
        field_r = new int[12];
        field_k = new int[12];
        field_m = new int[12];
        sa.a(new int[]{0, 1, 14, 15, 5, 26, 3, 16, 4, 13}, 455, 27, 170, 0, 185, 27690);
        sa.a(new int[]{2, 14, 15, 26, 4, 8}, 455, 27, 190, 1, 185, 27690);
        sa.a(new int[]{2, 14, 15, 26, 4, 9, 10, 11}, 455, 27, 190, 2, 185, 27690);
        sa.a(new int[]{32, 35, 11}, 208, 25, 133, 3, 31, 27690);
        sa.a(new int[]{17, 6}, 440, 27, 410, 4, 200, 27690);
        sa.a(new int[]{19, 20, 21, 22, 23, 24, 25, 35, 35, 7}, 620, 27, 155, 5, 485, 27690);
        sa.a(new int[]{17, 7}, 420, 27, 410, 6, 220, 27690);
        sa.a(new int[]{17, 18}, 540, 27, 170, 7, 50, 27690);
        sa.a(new int[]{6}, 590, 27, 400, 8, 500, 27690);
        sa.a(new int[]{30, 28, 29, 27, 31}, 480, 27, 200, 9, 160, 27690);
        sa.a(new int[]{32, 35, 6}, 208, 25, 133, 10, 31, 27690);
        sa.a(new int[]{37, 14, 15, 26, 4, 11}, 540, 27, 190, 11, 50, 27690);
    }
}
