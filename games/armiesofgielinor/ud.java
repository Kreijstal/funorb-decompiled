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
          field_X = null;
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
        fw var4 = new fw(param0, param1);
        var4.field_k = (kh) (Object) new nu();
        int var5 = ((ud) this).field_w + -6;
        ((ud) this).field_w = ((ud) this).field_w + 38;
        var4.a(15, -16 + (-14 + ((ud) this).field_l), var5, 8192, 30);
        ((ud) this).a((byte) 10, (kb) (Object) var4);
        ((ud) this).e(0);
        int var6 = -126 / ((-6 - param2) / 40);
        return var4;
    }

    ud(gk param0, jl param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        kb var6 = null;
        Object var7 = null;
        kb var8 = null;
        String var9 = null;
        kb var10 = null;
        kb var11 = null;
        var7 = null;
        if (param1 != hm.field_h) {
          if (mp.field_Mb == param1) {
            L0: {
              ((ud) this).field_w = ((ud) this).field_w + 10;
              var3 = am.field_y;
              if (!pr.b(-108)) {
                break L0;
              } else {
                ((ud) this).field_w = ((ud) this).field_w + 20;
                var3 = field_W;
                break L0;
              }
            }
            var11 = new kb(var3, (qo) null);
            var11.field_B = 0;
            var11.field_p = 50;
            var11.field_l = ((ud) this).field_l;
            var11.field_w = 80;
            var11.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ud) this).a((byte) 10, var11);
            ((ud) this).field_bb = this.a(pd.field_f, (qo) this, 93);
          } else {
            if (param1 == tn.field_cb) {
              ((ud) this).field_w = ((ud) this).field_w + 30;
              var9 = hb.field_a;
              var3 = var9;
              var3 = var9;
              var10 = new kb(var9, (qo) null);
              var10.field_B = 0;
              var10.field_p = 50;
              var10.field_l = ((ud) this).field_l;
              var10.field_w = 80;
              var10.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ud) this).a((byte) 10, var10);
              ((ud) this).field_bb = this.a(pd.field_f, (qo) this, 93);
            } else {
              var8 = new kb((String) var7, (qo) null);
              var8.field_B = 0;
              var8.field_p = 50;
              var8.field_l = ((ud) this).field_l;
              var8.field_w = 80;
              var8.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ud) this).a((byte) 10, var8);
              ((ud) this).field_bb = this.a(pd.field_f, (qo) this, 93);
            }
          }
        } else {
          var5 = tl.field_a;
          var6 = new kb(var5, (qo) null);
          var6.field_B = 0;
          var6.field_p = 50;
          var6.field_l = ((ud) this).field_l;
          var6.field_w = 80;
          var6.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ud) this).a((byte) 10, var6);
          ((ud) this).field_bb = this.a(pd.field_f, (qo) this, 93);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (param1 == 11) {
          if (param4 == ((ud) this).field_bb) {
            this.i((byte) 60);
            return;
          } else {
            return;
          }
        } else {
          field_Z = null;
          if (param4 != ((ud) this).field_bb) {
            return;
          } else {
            this.i((byte) 60);
            return;
          }
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
            if (!(((ud) this).field_L)) {
                return;
            }
            ((ud) this).field_L = false;
            return;
        }
        if (!(((ud) this).field_L)) {
            return;
        }
        ((ud) this).field_L = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = "This unit has an attack range of <%0>";
        field_Z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_W = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_ab = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
