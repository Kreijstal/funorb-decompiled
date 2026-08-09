/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_l;
    static boolean field_a;
    static int field_j;
    static String field_k;
    static int field_i;
    static int field_b;
    static int field_h;
    private boolean field_g;
    static String field_d;
    static qh field_c;
    static ie field_f;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 == 2) {
          if (wo.field_b != null) {
            if (null == wo.field_b.g(-113)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_h = 108;
          if (wo.field_b != null) {
            if (null == wo.field_b.g(-113)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!rk.a((byte) -125, param1)) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    m.a(-100);
                    break L1;
                  }
                }
                var6 = ce.field_f;
                var2 = var6;
                var3 = 0;
                L2: while (true) {
                  if (var6.length <= var3) {
                    var2 = si.field_n;
                    var3 = 0;
                    L3: while (true) {
                      if (var2.length <= var3) {
                        stackIn_24_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L3;
                        } else {
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if ((param1 ^ -1) == (var4 ^ -1)) {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "m.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_24_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ld.field_s) {
              L1: {
                if (ng.field_b != 2) {
                  break L1;
                } else {
                  if (kb.field_Qb == null) {
                    break L1;
                  } else {
                    var3 = (CharSequence) ((Object) param1);
                    if (!kb.field_Qb.equals(gb.a(var3, param0 + -13073))) {
                      break L1;
                    } else {
                      if (param0 == 13134) {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        field_e = (String) null;
                        return true;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("m.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    m(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_d = null;
        field_k = null;
        if (param0 != 2) {
          m.c(1);
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final String b(int param0) {
        if (param0 != 2) {
            field_k = (String) null;
            return this.field_l;
        }
        return this.field_l;
    }

    final boolean a(byte param0) {
        if (param0 <= 24) {
            field_k = (String) null;
            return this.field_g;
        }
        return this.field_g;
    }

    m(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_l = param0;
              if (null != this.field_l) {
                break L1;
              } else {
                this.field_l = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((m) (this)).field_g = stackIn_6_1 != 0;
            if (this.field_l.length() == 0) {
              this.field_g = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("m.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_i = 0;
        field_k = "Loading fonts";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Visit the Account Management section on the main site to view.";
        field_c = new qh();
    }
}
