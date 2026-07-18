/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class rt extends i {
    private int field_N;
    static String[] field_G;
    private int field_P;
    private int field_H;
    private up field_J;
    private int[] field_M;
    static vg field_F;
    private gm field_I;
    private hd field_L;
    static String field_K;
    private hd[] field_O;

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ((rt) this).field_I.g((byte) 125);
        ((rt) this).field_L.b(0, param1);
        for (var3 = 0; 3 > var3; var3++) {
            if (!(1 != ((rt) this).field_O[var3].field_sb)) {
                ((rt) this).field_H = ((rt) this).field_H == var3 ? -1 : var3;
            }
        }
        ((rt) this).field_i[0].field_lb = ((rt) this).field_H != -1 ? true : false;
        var3 = param0;
        if (!(((rt) this).field_H != 0)) {
            var3 = 16;
        }
        if (((rt) this).field_H == 1) {
            var3 = 5;
        }
        if (!(((rt) this).field_H != 2)) {
            var3 = 9;
        }
        ((rt) this).field_I.b((byte) -128, var3);
        ((rt) this).field_I.field_R = 128;
    }

    rt(int param0, int param1, up param2) {
        super(20);
        RuntimeException var4 = null;
        int var4_int = 0;
        gr var6 = null;
        hd stackIn_4_0 = null;
        hd stackIn_5_0 = null;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        up stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        up stackIn_8_4 = null;
        int stackIn_8_5 = 0;
        Object stackIn_9_0 = null;
        up stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        up stackIn_9_4 = null;
        int stackIn_9_5 = 0;
        Object stackIn_10_0 = null;
        up stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        up stackIn_10_4 = null;
        int stackIn_10_5 = 0;
        Object stackIn_11_0 = null;
        up stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        up stackIn_11_4 = null;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        up stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        up stackOut_7_4 = null;
        int stackOut_7_5 = 0;
        Object stackOut_8_0 = null;
        up stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        up stackOut_8_4 = null;
        int stackOut_8_5 = 0;
        Object stackOut_9_0 = null;
        up stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        up stackOut_9_4 = null;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        Object stackOut_10_0 = null;
        up stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        up stackOut_10_4 = null;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        hd stackOut_3_0 = null;
        hd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((rt) this).field_H = -1;
        ((rt) this).field_N = -1;
        try {
          L0: {
            ((rt) this).field_J = param2;
            ((rt) this).field_P = param0;
            ((rt) this).field_N = param1;
            ((rt) this).field_L = new hd();
            ((rt) this).field_L.field_q = 150;
            ((rt) this).field_O = new hd[3];
            ((rt) this).field_M = new int[]{((rt) this).field_J.field_n, ((rt) this).field_J.field_g, ((rt) this).field_J.field_o};
            ((rt) this).field_L.field_mb = 110;
            var4_int = 0;
            L1: while (true) {
              if (3 <= var4_int) {
                L2: {
                  L3: {
                    var6 = tu.field_E;
                    stackOut_7_0 = this;
                    stackOut_7_1 = ((rt) this).field_J;
                    stackOut_7_2 = var6.field_w;
                    stackOut_7_3 = var6.field_k;
                    stackOut_7_4 = ((rt) this).field_J;
                    stackOut_7_5 = -107;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_10_2 = stackOut_7_2;
                    stackIn_10_3 = stackOut_7_3;
                    stackIn_10_4 = stackOut_7_4;
                    stackIn_10_5 = stackOut_7_5;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    stackIn_8_5 = stackOut_7_5;
                    if (jd.f(-1)) {
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = (up) (Object) stackIn_8_1;
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = stackIn_8_3;
                      stackOut_8_4 = (up) (Object) stackIn_8_4;
                      stackOut_8_5 = stackIn_8_5;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      stackIn_10_4 = stackOut_8_4;
                      stackIn_10_5 = stackOut_8_5;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      stackIn_9_3 = stackOut_8_3;
                      stackIn_9_4 = stackOut_8_4;
                      stackIn_9_5 = stackOut_8_5;
                      if (!wn.a((byte) -3)) {
                        break L3;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = (up) (Object) stackIn_9_1;
                        stackOut_9_2 = stackIn_9_2;
                        stackOut_9_3 = stackIn_9_3;
                        stackOut_9_4 = (up) (Object) stackIn_9_4;
                        stackOut_9_5 = stackIn_9_5;
                        stackOut_9_6 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_11_4 = stackOut_9_4;
                        stackIn_11_5 = stackOut_9_5;
                        stackIn_11_6 = stackOut_9_6;
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = this;
                  stackOut_10_1 = (up) (Object) stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = (up) (Object) stackIn_10_4;
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  stackIn_11_4 = stackOut_10_4;
                  stackIn_11_5 = stackOut_10_5;
                  stackIn_11_6 = stackOut_10_6;
                  break L2;
                }
                ((rt) this).field_I = mg.a(stackIn_11_1, stackIn_11_2, stackIn_11_3, ((up) (Object) stackIn_11_4).c((byte) stackIn_11_5, stackIn_11_6 != 0), var6.field_R, (byte) 120);
                ((rt) this).field_i[0].field_lb = false;
                ((rt) this).field_I.field_nb = true;
                break L0;
              } else {
                L4: {
                  ((rt) this).field_O[var4_int] = new hd();
                  ((rt) this).field_O[var4_int].a(true, 150, 0, var4_int * 40, 30);
                  stackOut_3_0 = ((rt) this).field_O[var4_int];
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (((rt) this).field_M[var4_int] >= 100) {
                    stackOut_5_0 = (hd) (Object) stackIn_5_0;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L4;
                  } else {
                    stackOut_4_0 = (hd) (Object) stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L4;
                  }
                }
                stackIn_6_0.field_lb = stackIn_6_1 != 0;
                ((rt) this).field_L.a((byte) -127, ((rt) this).field_O[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rt.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final void a(int param0, int param1) {
        hn var4 = null;
        if (param0 < 60) {
            int discarded$0 = ((rt) this).a((byte) 89);
        }
        super.a(62, param1);
        if (param1 == 0) {
            if (((rt) this).field_H != -1) {
                if (((rt) this).field_M[((rt) this).field_H] < 100) {
                    if (cq.field_h instanceof ta) {
                        cu.a((byte) -5, ((rt) this).field_P, ((rt) this).field_H);
                    } else {
                        if (!(la.a(100))) {
                            var4 = new hn(3, new int[2]);
                            if (cq.field_h instanceof ap) {
                                if (null != um.field_e) {
                                    if (um.field_e.d((byte) 76)) {
                                        um.field_e.a(((rt) this).field_N, var4, (byte) -78, ((rt) this).field_H);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final int a(byte param0) {
        if (param0 <= 75) {
            ((rt) this).field_N = 96;
        }
        return 280;
    }

    final static java.net.URL a(java.net.URL param0, String param1, int param2, String param3) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_38_0 = null;
            java.net.URL stackIn_40_0 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_37_0 = null;
            java.net.URL stackOut_39_0 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            var9 = Kickabout.field_G;
            try {
              var5_ref = param0.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    break L2;
                  } else {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L3: {
                  if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param3 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    if (param1 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                  if (param3 == null) {
                    break L6;
                  } else {
                    if (param3.length() > 0) {
                      StringBuilder discarded$8 = var7.append("/p=");
                      StringBuilder discarded$9 = var7.append(param3);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param1 == null) {
                    break L7;
                  } else {
                    if (0 >= param1.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$10 = var7.append("/s=");
                      StringBuilder discarded$11 = var7.append(param1);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var6 < var5_ref.length()) {
                    StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L8;
                  } else {
                    StringBuilder discarded$13 = var7.append('/');
                    break L8;
                  }
                }
                try {
                  L9: {
                    stackOut_37_0 = new java.net.URL(param0, var7.toString());
                    stackIn_38_0 = stackOut_37_0;
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_39_0 = (java.net.URL) param0;
                  stackIn_40_0 = stackOut_39_0;
                  return stackIn_40_0;
                }
                return stackIn_38_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_41_0 = (RuntimeException) var5;
                stackOut_41_1 = new StringBuilder().append("rt.A(");
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                if (param0 == null) {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "null";
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L10;
                } else {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "{...}";
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  break L10;
                }
              }
              L11: {
                stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param1 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L11;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L11;
                }
              }
              L12: {
                stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(-1).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param3 == null) {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L12;
                } else {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L12;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + false + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_G = null;
        if (param0 != 25996) {
            rt.b(-32, 113, 1);
        }
        field_F = null;
        field_K = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Kickabout.field_G;
          super.a((byte) -70, param1, param2);
          ((rt) this).field_L.field_J = 95 + param2;
          ((rt) this).field_L.field_s = param1 + 180;
          ((rt) this).field_L.b(0, true);
          iw.a(-65, c.field_b);
          on.b();
          ((rt) this).field_I.a(1200, 0, on.field_g >> 1, on.field_f + -10, (byte) -68);
          if (param0 < -11) {
            break L0;
          } else {
            ((rt) this).field_P = 5;
            break L0;
          }
        }
        ta.e(123);
        c.field_b.f(40 + param1, param2 - -80);
        pb.field_C.d(((rt) this).field_J.d(100), param1 + 90, param2 + 190, 16777215, -1);
        eo.a(param1 + 40, 200 + param2, ((rt) this).field_J.field_r, 3, true, 0);
        var4 = 0;
        L1: while (true) {
          if (var4 >= 3) {
            return;
          } else {
            L2: {
              var5 = ((rt) this).field_O[var4].field_F;
              var6 = ((rt) this).field_O[var4].field_T;
              var7 = ((rt) this).field_O[var4].field_q;
              var8 = ((rt) this).field_O[var4].field_mb;
              if (~var4 != ~((rt) this).field_H) {
                if (!((rt) this).field_O[var4].field_gb) {
                  if (((rt) this).field_M[var4] >= 100) {
                    q.field_d.a(ne.field_L, 123 + var5, var6 - -19, 13382451, 65793);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  on.f(var5, var6, var7, var8, 8, 4473924);
                  q.field_d.a("+1%", 123 + var5, var6 - -19, 5592405, -1);
                  break L2;
                }
              } else {
                on.a(var5, var6, var7, var8, 8, 65793, 128);
                on.f(var5, var6, var7, var8, 8, 10066329);
                q.field_d.a("+1%", 123 + var5, 19 + var6, 16777215, 65793);
                break L2;
              }
            }
            L3: {
              var9 = 0;
              if (0 == var4) {
                var9 = ((rt) this).field_J.c(true, oi.b(-79));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 != 1) {
                break L4;
              } else {
                var9 = ((rt) this).field_J.a(5205, oi.b(-79));
                break L4;
              }
            }
            L5: {
              if (var4 == 2) {
                var9 = ((rt) this).field_J.b((byte) 120, oi.b(27));
                break L5;
              } else {
                break L5;
              }
            }
            eo.a(16 + var5, 9 + var6, ((rt) this).field_M[var4], var4, true, var9);
            var4++;
            continue L1;
          }
        }
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            rt.g(-26);
        }
        return 370;
    }

    final static void b(int param0, int param1, int param2) {
        hn var3 = null;
        int var4 = Kickabout.field_G;
        try {
            var3 = (hn) (Object) da.field_h.g(24009);
            while (var3 != null) {
                if (8 == var3.field_i) {
                    var3.c((byte) -109);
                }
                var3 = (hn) (Object) da.field_h.c(33);
            }
            if (param1 <= 32) {
                field_F = null;
            }
            var3 = new hn(8, new int[2]);
            ii.a(var3, 76);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "rt.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_K = "Achievements are awarded during games of Kickabout. Some will only be awarded in <col=ffff00>rated</col> games or Tournaments with at least 8 starting players. No achievements are awarded in <col=ffff00>Exhibition</col> games.";
    }
}
