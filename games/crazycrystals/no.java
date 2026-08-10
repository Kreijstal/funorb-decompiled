/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends se {
    static String field_i;
    static int field_m;
    private boolean field_j;
    static int field_k;
    private String field_l;

    public static void b(boolean param0) {
        if (!param0) {
            no.b(true);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void d(int param0) {
        if (param0 != -31626) {
            field_m = -99;
            this.field_l = null;
            return;
        }
        this.field_l = null;
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        si var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 15 % ((41 - param1) / 49);
            var6 = (CharSequence) ((Object) param0);
            var4 = rf.a(var6, -63);
            if (var4 == null) {
              L1: {
                if (param0.equals(this.field_l)) {
                  break L1;
                } else {
                  var5 = aj.a(-112, param0);
                  if (var5 != null) {
                    if (var5.field_h == null) {
                      this.field_l = param0;
                      this.field_j = var5.field_b;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_j) {
                stackIn_14_0 = ao.field_c;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = db.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("no.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, f[][] param3) {
        try {
            ja.a(param0, param3, param2, false, 1);
            if (param1 != -8383) {
                no.e((byte) -125);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "no.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    no(ga param0) {
        super(param0);
        this.field_j = false;
    }

    final oi a(String param0, byte param1) {
        si var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        oi stackIn_5_0 = null;
        oi stackIn_12_0 = null;
        oi stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -122) {
                break L1;
              } else {
                this.d(70);
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            if (!a.a(-30, var4)) {
              stackIn_5_0 = rk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0.equals(this.field_l)) {
                  L3: {
                    var3 = aj.a(-114, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null != var3.field_h) {
                        break L3;
                      } else {
                        this.field_j = var3.field_b;
                        this.field_l = param0;
                        break L2;
                      }
                    }
                  }
                  stackIn_12_0 = ec.field_h;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!this.field_j) {
                  stackIn_17_0 = rk.field_c;
                  break L4;
                } else {
                  stackIn_17_0 = ih.field_b;
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

            stackIn_20_1 = new StringBuilder().append("no.G(");

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
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static void e(byte param0) {
        if (ph.field_E != null) {
          fq.a(-32, ph.field_E);
          ph.field_E.a(te.field_a, (byte) -92);
          ph.field_E = null;
          if (ne.field_f == null) {
            if (param0 != -23) {
              field_i = (String) null;
              jd.field_D.requestFocus();
              return;
            } else {
              jd.field_D.requestFocus();
              return;
            }
          } else {
            ne.field_f.a((byte) 96);
            if (param0 == -23) {
              jd.field_D.requestFocus();
              return;
            } else {
              field_i = (String) null;
              jd.field_D.requestFocus();
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_m = 2;
        field_i = "Logging in...";
    }
}
