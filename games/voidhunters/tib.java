/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tib extends eca {
    private String field_f;
    private boolean field_g;
    static mma field_h;
    static byte[] field_i;

    tib(uf param0) {
        super(param0);
        this.field_g = false;
    }

    final qrb a(String param0, int param1) {
        tpa var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qrb stackIn_3_0 = null;
        qrb stackIn_12_0 = null;
        qrb stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!oc.a(var4, 0)) {
              stackIn_3_0 = cca.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 16384) {
                  break L1;
                } else {
                  field_i = (byte[]) null;
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_f)) {
                  L3: {
                    var3 = qua.a(false, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null != var3.field_f) {
                        break L3;
                      } else {
                        this.field_f = param0;
                        this.field_g = var3.field_g;
                        break L2;
                      }
                    }
                  }
                  stackIn_12_0 = dsa.field_q;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (this.field_g) {
                  stackIn_17_0 = lea.field_o;
                  break L4;
                } else {
                  stackIn_17_0 = cca.field_o;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("tib.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final void d(byte param0) {
        this.field_f = null;
        if (param0 < 7) {
            field_h = (mma) null;
        }
    }

    final String b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        tpa var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        Object stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              var5 = (CharSequence) ((Object) param0);
              var3 = igb.a(var5, (byte) 119);
              if (var3 != null) {
                stackIn_6_0 = (String) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (!param0.equals(this.field_f)) {
                    var4 = qua.a(false, param0);
                    if (var4 != null) {
                      if (null == var4.field_f) {
                        this.field_g = var4.field_g;
                        this.field_f = param0;
                        break L1;
                      } else {
                        stackIn_13_0 = null;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (this.field_g) {
                  stackIn_19_0 = uc.field_a;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_17_0 = ks.field_p;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("tib.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_13_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_19_0;
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          if (li.field_i) {
            return de.a(param1, 300).field_c;
          } else {
            return ita.a(param1, 7988).field_k;
          }
        } else {
          field_h = (mma) null;
          if (li.field_i) {
            return de.a(param1, 300).field_c;
          } else {
            return ita.a(param1, 7988).field_k;
          }
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -596) {
                break L1;
              } else {
                field_h = (mma) null;
                break L1;
              }
            }
            stackIn_3_0 = ua.a(true, param1, true, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("tib.N(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void f(int param0) {
        CharSequence var2;
        if (param0 != 6312) {
          var2 = (CharSequence) null;
          tib.a(46, (CharSequence) null, 2);
          field_i = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          return;
        }
    }

    static {
        field_h = new mma();
    }
}
