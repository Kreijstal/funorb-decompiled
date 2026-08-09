/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends aba {
    static boolean field_g;
    private lka field_j;
    static String field_h;
    private lka field_k;
    static sna[] field_i;

    final jg a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_6_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_13_0 = null;
        jg stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_j.field_w.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 == var4.length()) {
              stackIn_3_0 = jt.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (bq.a(var4, 20133, var3)) {
                if (this.a(true, param0)) {
                  stackIn_10_0 = jt.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param1) {
                    stackIn_15_0 = cm.field_u;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_13_0 = (jg) null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = jt.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("wg.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_15_0;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        if (!qo.field_c) {
            throw new IllegalStateException();
        }
        if (param0) {
            return;
        }
        lia.field_i = true;
        gq.a(true, 19626);
        jv.field_j = 0;
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 22753) {
            field_i = (sna[]) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_j.field_w.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (eha.a(15, var5)) {
                stackIn_6_0 = fd.field_E;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (kaa.a(var5, (byte) 63)) {
                  stackIn_10_0 = sh.field_D;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 24 / ((param0 - -8) / 45);
                  if (!tfa.a(-124, var5)) {
                    if (!this.a(true, param1)) {
                      if (0 >= var7.length()) {
                        stackIn_31_0 = nw.field_q;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        if (vs.a(-62, var7, var5)) {
                          stackIn_21_0 = me.field_s;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (cw.a(var5, var7, true)) {
                            stackIn_25_0 = pka.field_a;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (db.a(var7, var5, false)) {
                              stackIn_29_0 = me.field_s;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              return fd.field_E;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = um.field_b;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = uv.field_k;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("wg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L1;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_29_0;
                    } else {
                      return stackIn_31_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                wg.a(true);
                break L1;
              }
            }
            L2: {
              var3 = this.field_k.field_w.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if ((var4.length() ^ -1) < -1) {
                  var5 = var3.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    if (-1 + var3.length() <= var5) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (0 > var4.indexOf(var6)) {
                        if (0 > var4.indexOf(var7)) {
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_14_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("wg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static int a(int param0, byte param1) {
        String var2 = null;
        if (param1 != 83) {
            wg.a(false, -62);
            var2 = lka.field_E[param0][19];
            var2 = var2.trim();
            if (!(!var2.equals(""))) {
                return -1;
            }
            return ((ji) ((Object) pga.field_b.a(true, (long)var2.hashCode()))).field_h;
        }
        var2 = lka.field_E[param0][19];
        var2 = var2.trim();
        if (!(!var2.equals(""))) {
            return -1;
        }
        return ((ji) ((Object) pga.field_b.a(true, (long)var2.hashCode()))).field_h;
    }

    wg(lka param0, lka param1, lka param2) {
        super(param0);
        try {
            this.field_k = param2;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -21) {
            return;
        }
        if (jea.field_c != null) {
            if (!jea.field_c.a(param0, (byte) -113)) {
                return;
            }
            jea.field_c = null;
        }
    }

    static {
        field_h = "This is your shopping list. You can click this to be taken to groceout.com, where you can spend your ill-gotten gains on more food!";
        field_g = false;
    }
}
