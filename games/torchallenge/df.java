/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

class df extends ng {
    static int field_Q;
    static int field_R;
    private String[] field_U;
    private sl field_T;
    private ia field_S;
    static boolean field_O;
    static String field_P;

    void a(ee param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, (byte) -105, param3);
              ((df) this).field_S = null;
              if (((df) this).field_w) {
                var5_int = -((df) this).field_m + kc.field_u - param1;
                var6 = -((df) this).field_i + (ph.field_d + -param3);
                ((df) this).field_S = this.b(var6, var5_int, 59);
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
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("df.U(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + -103 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((df) this).field_m + param2;
        int var6 = -((df) this).field_i + param0;
        ia var7 = this.b(var6, var5, 91);
        if (var7 != null) {
            if (!(null == ((df) this).field_k)) {
                ((tl) (Object) ((df) this).field_k).a((df) this, var7.field_s, param3, true);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 2) {
            ((df) this).d(false);
        }
        ((df) this).a((byte) 122, param3, ((gd) (Object) ((df) this).field_q).b((ee) this, (byte) -117), param2, param0);
    }

    void a(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param2) {
            Object var9 = null;
            String discarded$0 = df.a((String) null, '￢', (String) null, (byte) -27);
        }
        if (0 != param3) {
            return;
        }
        gd var10 = (gd) (Object) ((df) this).field_q;
        ia var6 = ((df) this).field_S;
        if (var6 != null) {
            var7 = var10.a(param1, (ee) this, false);
            var8 = var10.a((ee) this, 3, param0);
            do {
                jc.a((byte) -128, -2 + (var7 + var6.field_r), var6.field_m - -2, var6.field_n + 2, -2 + var6.field_o + var8);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    final static int c() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            uf var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_33_0 = 0;
            if (gb.field_d.field_h < 4) {
              try {
                L0: {
                  L1: {
                    if (nh.field_jb == 0) {
                      n.field_cb = rc.field_t.a(wb.field_d, mc.field_o, 431890200);
                      nh.field_jb = nh.field_jb + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (nh.field_jb != 1) {
                      break L2;
                    } else {
                      if (n.field_cb.field_d == 2) {
                        stackOut_13_0 = je.a(-1, true);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (n.field_cb.field_d != 1) {
                          break L2;
                        } else {
                          nh.field_jb = nh.field_jb + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (nh.field_jb == 2) {
                      bl.field_V = new wb((java.net.Socket) n.field_cb.field_g, rc.field_t);
                      var2 = new uf(13);
                      hl.a(var2, 12, vk.field_j, vf.field_d, vb.field_r);
                      var2.d(15, (byte) 122);
                      var2.a(mg.field_e, false);
                      bl.field_V.a(13, 0, (byte) 120, var2.field_m);
                      nh.field_jb = nh.field_jb + 1;
                      il.field_m = 30000L + ol.a(256);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (nh.field_jb != 3) {
                      break L4;
                    } else {
                      if (bl.field_V.a(0) > 0) {
                        var1_int = bl.field_V.c(0);
                        if (var1_int == 0) {
                          nh.field_jb = nh.field_jb + 1;
                          break L4;
                        } else {
                          stackOut_28_0 = je.a(var1_int, true);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      } else {
                        if (il.field_m < ol.a(256)) {
                          stackOut_25_0 = je.a(-2, true);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (nh.field_jb == 4) {
                    gb.field_d.a(md.field_f, (Object) (Object) bl.field_V, (byte) 115);
                    bl.field_V = null;
                    nh.field_jb = 0;
                    n.field_cb = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return je.a(-3, true);
              }
              return stackIn_34_0;
            } else {
              if (gb.field_d.field_b == -1) {
                return 3;
              } else {
                if (gb.field_d.field_b == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, char param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param0.indexOf((int) param1, var8_int);
                  if (var8_int < 0) {
                    break L1;
                  } else {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param3 >= 124) {
                break L3;
              } else {
                var12 = null;
                String discarded$8 = df.a(-50, true, (CharSequence) null);
                break L3;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (0 > var10) {
                StringBuilder discarded$9 = var8.append(param0.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                StringBuilder discarded$10 = var8.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$11 = var8.append(param2);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("df.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
        return stackIn_12_0;
    }

    private final ia b(int param0, int param1, int param2) {
        ia var4 = null;
        ia var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param2 > 46) {
          var4 = (ia) (Object) ((df) this).field_T.c((byte) -19);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (ia) (Object) ((df) this).field_T.c(-270);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_r > param1) {
                      break L2;
                    } else {
                      if (param0 < var5.field_o) {
                        break L2;
                      } else {
                        if (param1 >= var5.field_n + var5.field_r) {
                          break L2;
                        } else {
                          if (var5.field_m + var5.field_o < param0) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_k;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) 104, param1, param2, param3, param4);
        if (param0 < 100) {
            return;
        }
        ((df) this).d(false);
    }

    boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("df.RA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    df(String param0, j param1) {
        super(param0, (gg) null);
        ((df) this).field_S = null;
        try {
            ((df) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "df.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -2184) {
              break L0;
            } else {
              field_R = -55;
              break L0;
            }
          }
          var3 = ug.a(param2, param1, -107);
          if (var3 == null) {
            var4 = 0;
            L1: while (true) {
              if (var4 < param2.length()) {
                if (bc.a(param0 ^ -2283, param2.charAt(var4))) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_10_0 = ed.field_h;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_4_0 = (String) var3;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("df.O(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        gd var3 = null;
        lg var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        qi var12 = null;
        int var13 = 0;
        int var14 = 0;
        ia var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = TorChallenge.field_F ? 1 : 0;
          ((df) this).field_T = new sl();
          if (!param0) {
            break L0;
          } else {
            field_P = null;
            break L0;
          }
        }
        var2 = 0;
        var3 = (gd) (Object) ((df) this).field_q;
        var4 = var3.a(-97, (ee) this);
        L1: while (true) {
          var5 = ((df) this).field_v.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((df) this).field_v.indexOf(">", var5);
            var6 = ((df) this).field_v.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((df) this).field_v.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 7, var5);
            var9 = var4.a((byte) 7, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_a[var11];
                  if (var8 == var11) {
                    stackOut_8_0 = var4.a(-117, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_g[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var12.field_g[var12.field_g.length - 1];
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = var4.a(-120, var2);
                    stackIn_14_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new ia(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(-1), var12.field_e + -var12.field_d));
                  if (var10 != null) {
                    ((ia) var10).field_k = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((df) this).field_T.a((da) (Object) var15, -63);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    public static void a() {
        field_P = null;
    }

    final static boolean a(CharSequence param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            int discarded$13 = -125;
            int discarded$14 = 0;
            if (bk.a(param0)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param0.length()) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (bc.a(105, param0.charAt(var3_int))) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("df.I(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 44 + 0 + 41);
        }
        return stackIn_11_0 != 0;
    }

    String b(boolean param0) {
        if (null == ((df) this).field_S) {
            return null;
        }
        if (null == ((df) this).field_U) {
            return null;
        }
        if (param0) {
            ((df) this).b(94, 108, -21, -91);
        }
        if (((df) this).field_U.length <= ((df) this).field_S.field_s) {
            return null;
        }
        return ((df) this).field_U[((df) this).field_S.field_s];
    }

    final void a(int param0, boolean param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((df) this).field_U) {
                  break L2;
                } else {
                  if (param0 >= ((df) this).field_U.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param0];
                var8 = var7;
                var4 = var8;
                if (null != ((df) this).field_U) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((df) this).field_U.length) {
                      break L3;
                    } else {
                      var7[var5] = ((df) this).field_U[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((df) this).field_U = var8;
              break L1;
            }
            if (!param1) {
              ((df) this).field_U[param0] = param2;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("df.J(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = false;
        field_Q = 0;
        field_P = "Your character will only collect a health potion when he/she is injured.";
    }
}
