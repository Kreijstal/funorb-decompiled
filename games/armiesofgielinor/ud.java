/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends sf implements he {
    static String field_Y;
    static String field_Z;
    static String field_W;
    static wk[] field_X;
    static String field_ab;
    private fw field_bb;

    final static void b(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          L0: {
            if (param2 != 0) {
              break L0;
            } else {
              if (param0 != ol.field_B) {
                ol.field_B = param0;
                kr.field_J = true;
                ae.a(896, param3);
                break L0;
              } else {
                L1: {
                  if (param2 != 1) {
                    break L1;
                  } else {
                    if (va.field_D != param0) {
                      va.field_D = param0;
                      kr.field_J = true;
                      ae.a(896, param3);
                      break L1;
                    } else {
                      if (2 == param2) {
                        if (cd.field_c != param0) {
                          cd.field_c = param0;
                          kr.field_J = true;
                          ae.a(896, param3);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (2 == param2) {
                  if (cd.field_c == param0) {
                    return;
                  } else {
                    cd.field_c = param0;
                    kr.field_J = true;
                    ae.a(896, param3);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L2: {
            if (param2 != 1) {
              break L2;
            } else {
              if (va.field_D != param0) {
                va.field_D = param0;
                kr.field_J = true;
                ae.a(896, param3);
                break L2;
              } else {
                if (2 == param2) {
                  if (cd.field_c == param0) {
                    return;
                  } else {
                    cd.field_c = param0;
                    kr.field_J = true;
                    ae.a(896, param3);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (2 == param2) {
            if (cd.field_c != param0) {
              cd.field_c = param0;
              kr.field_J = true;
              ae.a(896, param3);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_X = (wk[]) null;
          if (param2 == 0) {
            L3: {
              if (param0 != ol.field_B) {
                ol.field_B = param0;
                kr.field_J = true;
                ae.a(896, param3);
                break L3;
              } else {
                break L3;
              }
            }
            if (param2 == 1) {
              L4: {
                if (va.field_D != param0) {
                  va.field_D = param0;
                  kr.field_J = true;
                  ae.a(896, param3);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (2 == param2) {
                if (cd.field_c != param0) {
                  cd.field_c = param0;
                  kr.field_J = true;
                  ae.a(896, param3);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (2 == param2) {
                if (cd.field_c != param0) {
                  cd.field_c = param0;
                  kr.field_J = true;
                  ae.a(896, param3);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L5: {
              if (param2 != 1) {
                break L5;
              } else {
                if (va.field_D != param0) {
                  va.field_D = param0;
                  kr.field_J = true;
                  ae.a(896, param3);
                  break L5;
                } else {
                  L6: {
                    if (2 != param2) {
                      break L6;
                    } else {
                      if (cd.field_c == param0) {
                        break L6;
                      } else {
                        cd.field_c = param0;
                        kr.field_J = true;
                        ae.a(896, param3);
                        break L6;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (2 == param2) {
              if (cd.field_c == param0) {
                return;
              } else {
                cd.field_c = param0;
                kr.field_J = true;
                ae.a(896, param3);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final fw a(String param0, qo param1, int param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fw(param0, param1);
            var4.field_k = (kh) ((Object) new nu());
            var5 = this.field_w + -6;
            this.field_w = this.field_w + 38;
            var4.a(15, -16 + (-14 + this.field_l), var5, 8192, 30);
            this.a((byte) 10, (kb) (var4));
            this.e(0);
            var6 = -126 / ((-6 - param2) / 40);
            stackIn_1_0 = (fw) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ud.E(");

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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    ud(gk param0, jl param1) {
        super(param0, 200, 150);
        Object var3 = null;
        kb var4 = null;
        try {
            var3 = null;
            if (param1 == hm.field_h) {
                var3 = tl.field_a;
            } else {
                if (mp.field_Mb == param1 || param1 == tn.field_cb) {
                    this.field_w = this.field_w + 10;
                    var3 = am.field_y;
                    if (pr.b(-108)) {
                        this.field_w = this.field_w + 20;
                        var3 = field_W;
                    }
                }
            }
            var4 = new kb((String) (var3), (qo) null);
            var4.field_B = 0;
            var4.field_p = 50;
            var4.field_l = this.field_l;
            var4.field_w = 80;
            var4.field_k = (kh) ((Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a((byte) 10, var4);
            this.field_bb = this.a(pd.field_f, (qo) (this), 93);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                field_Z = (String) null;
                break L1;
              }
            }
            if (param4 != this.field_bb) {
              break L0;
            } else {
              this.i((byte) 60);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ud.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != 12213) {
          ud.n(4);
          field_X = null;
          field_Y = null;
          field_Z = null;
          field_W = null;
          field_ab = null;
          return;
        } else {
          field_X = null;
          field_Y = null;
          field_Z = null;
          field_W = null;
          field_ab = null;
          return;
        }
    }

    private final void i(byte param0) {
        if (param0 != 60) {
            ud.n(-98);
            if (!(this.field_L)) {
                return;
            }
            this.field_L = false;
            return;
        }
        if (!(this.field_L)) {
            return;
        }
        this.field_L = false;
    }

    static {
        field_Y = "This unit has an attack range of <%0>";
        field_Z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_W = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_ab = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
