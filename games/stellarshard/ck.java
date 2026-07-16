/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ck extends wl implements oi {
    static boolean field_db;
    private boolean field_eb;
    static int field_hb;
    private boolean field_fb;
    private nc field_cb;
    private bd field_jb;
    static byte[][] field_ib;
    private boolean field_kb;
    private boolean field_gb;

    ck(ei param0, bd param1, String param2, boolean param3, boolean param4) {
        super(param0, (rj) (Object) new vf((ck) null, param1, param2), 77, 10, 10);
        ((ck) this).field_jb = param1;
        ((ck) this).field_kb = false;
        ((ck) this).field_fb = false;
        ((ck) this).field_gb = param4 ? true : false;
        ((ck) this).field_eb = param3 ? true : false;
        ((ck) this).field_cb = new nc(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ck) this).field_cb.field_B = true;
        ((ck) this).b(4, (rj) (Object) ((ck) this).field_cb);
    }

    final void a(String param0, int param1, int param2) {
        vf var4 = null;
        int var5 = 0;
        vf var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        vf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        vf stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        vf stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        String stackIn_11_3 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        vf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        vf stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_10_3 = null;
        vf stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        String stackOut_9_3 = null;
        var5 = stellarshard.field_B;
        if (!((ck) this).field_kb) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (256 != param1) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((ck) this).field_fb = stackIn_5_1 != 0;
          ((ck) this).field_kb = true;
          ((ck) this).field_cb.c(65280, 4210752, 8405024);
          var6 = new vf((ck) this, ((ck) this).field_jb, param0);
          var4 = var6;
          if (5 != param1) {
            if (param1 == 256) {
              ig discarded$4 = var6.a((lf) this, qb.field_l, (byte) -69);
              if (param2 == 77) {
                if (param1 != 3) {
                  if (param1 != 4) {
                    if (param1 != 6) {
                      if ((param1 ^ -1) == -10) {
                        ig discarded$5 = var6.a((lf) this, eg.field_c, (byte) 72);
                        ((ck) this).b((rj) (Object) var6, param2 + 23066);
                        return;
                      } else {
                        ((ck) this).b((rj) (Object) var6, param2 + 23066);
                        return;
                      }
                    } else {
                      var6.a(param2 + -31882, 9, a.field_d);
                      ((ck) this).b((rj) (Object) var6, param2 + 23066);
                      return;
                    }
                  } else {
                    var6.a(param2 ^ -31858, 8, ra.field_a);
                    ((ck) this).b((rj) (Object) var6, param2 + 23066);
                    return;
                  }
                } else {
                  var6.a(-31805, 7, gh.field_a);
                  ((ck) this).b((rj) (Object) var6, param2 + 23066);
                  return;
                }
              } else {
                return;
              }
            } else {
              L1: {
                stackOut_8_0 = (vf) var6;
                stackOut_8_1 = -31805;
                stackOut_8_2 = -1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                if (((ck) this).field_eb) {
                  stackOut_10_0 = (vf) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = qb.field_l;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  break L1;
                } else {
                  stackOut_9_0 = (vf) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = bk.field_e;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  break L1;
                }
              }
              ((vf) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_11_3);
              if (param2 == 77) {
                if (param1 != 3) {
                  if (param1 != 4) {
                    if (param1 != 6) {
                      if ((param1 ^ -1) != -10) {
                        ((ck) this).b((rj) (Object) var6, param2 + 23066);
                        return;
                      } else {
                        ig discarded$6 = var6.a((lf) this, eg.field_c, (byte) 72);
                        ((ck) this).b((rj) (Object) var6, param2 + 23066);
                        return;
                      }
                    } else {
                      var6.a(param2 + -31882, 9, a.field_d);
                      ((ck) this).b((rj) (Object) var6, param2 + 23066);
                      return;
                    }
                  } else {
                    var6.a(param2 ^ -31858, 8, ra.field_a);
                    ((ck) this).b((rj) (Object) var6, param2 + 23066);
                    return;
                  }
                } else {
                  var6.a(-31805, 7, gh.field_a);
                  ((ck) this).b((rj) (Object) var6, param2 + 23066);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var6.a(-31805, 11, gj.field_s);
            var6.a(-31805, 17, wc.field_z);
            if (param2 == 77) {
              if (param1 != 3) {
                if (param1 != 4) {
                  if (param1 != 6) {
                    if ((param1 ^ -1) != -10) {
                      ((ck) this).b((rj) (Object) var6, param2 + 23066);
                      return;
                    } else {
                      ig discarded$7 = var6.a((lf) this, eg.field_c, (byte) 72);
                      ((ck) this).b((rj) (Object) var6, param2 + 23066);
                      return;
                    }
                  } else {
                    var6.a(param2 + -31882, 9, a.field_d);
                    ((ck) this).b((rj) (Object) var6, param2 + 23066);
                    return;
                  }
                } else {
                  var6.a(param2 ^ -31858, 8, ra.field_a);
                  ((ck) this).b((rj) (Object) var6, param2 + 23066);
                  return;
                }
              } else {
                var6.a(-31805, 7, gh.field_a);
                ((ck) this).b((rj) (Object) var6, param2 + 23066);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (param0 == 29657) {
          if (param1 == 13) {
            ((ck) this).o(3);
            return true;
          } else {
            return super.a(29657, param1, param2, param3);
          }
        } else {
          int discarded$10 = ck.a(-53, 99, true, false);
          if (param1 == 13) {
            ((ck) this).o(3);
            return true;
          } else {
            return super.a(29657, param1, param2, param3);
          }
        }
    }

    public static void m(int param0) {
        field_ib = null;
        if (param0 > -100) {
            fe discarded$0 = ck.n(-17);
        }
    }

    final static fe n(int param0) {
        try {
            Throwable var1 = null;
            fe stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            fe stackOut_2_0 = null;
            L0: {
              if (param0 == 2113632) {
                break L0;
              } else {
                field_db = true;
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (fe) Class.forName("hb").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(byte param0) {
        vf var2 = null;
        ((ck) this).field_cb.c(65280, 4210752, 2121792);
        if (param0 != 52) {
          ck.m(-107);
          var2 = new vf((ck) this, ((ck) this).field_jb, kb.field_e);
          var2.a(-31805, 15, vg.field_q);
          ((ck) this).b((rj) (Object) var2, 23143);
          return;
        } else {
          var2 = new vf((ck) this, ((ck) this).field_jb, kb.field_e);
          var2.a(-31805, 15, vg.field_q);
          ((ck) this).b((rj) (Object) var2, 23143);
          return;
        }
    }

    public void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (!param3) {
          if (((ck) this).field_fb) {
            rh.a(3, (byte) -72);
            ((ck) this).o(3);
            return;
          } else {
            gf.a(hf.a((byte) -6), "tochangedisplayname.ws", 16729);
            return;
          }
        } else {
          ((ck) this).field_eb = true;
          if (((ck) this).field_fb) {
            rh.a(3, (byte) -72);
            ((ck) this).o(3);
            return;
          } else {
            gf.a(hf.a((byte) -6), "tochangedisplayname.ws", 16729);
            return;
          }
        }
    }

    final void o(int param0) {
        Object var3 = null;
        if (!((ck) this).field_G) {
          return;
        } else {
          ((ck) this).field_G = false;
          if (!((ck) this).field_eb) {
            if (((ck) this).field_gb) {
              sb.a(91);
              if (param0 != 3) {
                var3 = null;
                ((ck) this).a(-54, 36, (ig) null, false, -76);
                return;
              } else {
                return;
              }
            } else {
              if (param0 == 3) {
                return;
              } else {
                var3 = null;
                ((ck) this).a(-54, 36, (ig) null, false, -76);
                return;
              }
            }
          } else {
            tk.a(param0 ^ -16);
            if (param0 == 3) {
              return;
            } else {
              var3 = null;
              ((ck) this).a(-54, 36, (ig) null, false, -76);
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (param3) {
            ck.m(-106);
            return td.a((byte) -103);
        }
        return td.a((byte) -103);
    }

    final static fd a(boolean param0, String param1) {
        Object var3 = null;
        fd var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = stellarshard.field_B;
        if (param0) {
          if (ac.field_k != null) {
            if (param1 != null) {
              if (0 != param1.length()) {
                var12 = (CharSequence) (Object) param1;
                var8 = nh.a(var12, false);
                if (var8 != null) {
                  var3_ref = (fd) (Object) ac.field_k.a((long)var8.hashCode(), -119);
                  L0: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_rb;
                      var9 = nh.a(var13, false);
                      if (var9.equals((Object) (Object) var8)) {
                        return var3_ref;
                      } else {
                        var3_ref = (fd) (Object) ac.field_k.a(true);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_ib = null;
          if (ac.field_k != null) {
            if (param1 != null) {
              if (0 != param1.length()) {
                var10 = (CharSequence) (Object) param1;
                var6 = nh.a(var10, false);
                if (var6 != null) {
                  var3_ref = (fd) (Object) ac.field_k.a((long)var6.hashCode(), -119);
                  L1: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_rb;
                      var7 = nh.a(var11, false);
                      if (var7.equals((Object) (Object) var6)) {
                        return var3_ref;
                      } else {
                        var3_ref = (fd) (Object) ac.field_k.a(true);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = false;
        field_ib = new byte[1000][];
    }
}
