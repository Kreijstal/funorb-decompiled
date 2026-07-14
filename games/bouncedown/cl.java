/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends al {
    static tg[] field_p;
    static int field_q;
    private String field_j;
    static int[] field_n;
    static volatile boolean field_o;
    private bd field_l;
    static int field_m;
    private boolean field_k;

    final vf b(String param0, byte param1) {
        qh var3 = null;
        vf stackIn_7_0 = null;
        vf stackIn_12_0 = null;
        vf stackOut_11_0 = null;
        vf stackOut_10_0 = null;
        vf stackOut_6_0 = null;
        vf stackOut_5_0 = null;
        if (((cl) this).field_l.b(param0, param1) == a.field_e) {
          return a.field_e;
        } else {
          if (!param0.equals((Object) (Object) ((cl) this).field_j)) {
            var3 = f.a(param0, param1 + -150);
            if (!var3.a(param1 ^ 990)) {
              return mi.field_c;
            } else {
              L0: {
                ((cl) this).field_j = param0;
                ((cl) this).field_k = var3.b(123);
                if (((cl) this).field_k) {
                  stackOut_11_0 = mc.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = a.field_e;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0;
            }
          } else {
            L1: {
              if (((cl) this).field_k) {
                stackOut_6_0 = mc.field_a;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = a.field_e;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        ee.field_c = false;
        if (param1) {
          L0: {
            ng.field_b = false;
            if (null == nk.field_a) {
              break L0;
            } else {
              if (!nk.field_a.field_D) {
                break L0;
              } else {
                L1: {
                  var3 = 1;
                  if (8 != param2) {
                    break L1;
                  } else {
                    L2: {
                      if (!fe.field_g) {
                        param0 = mc.field_c;
                        break L2;
                      } else {
                        param0 = q.field_J;
                        break L2;
                      }
                    }
                    param2 = 2;
                    vk.field_c.b(190, gi.field_b);
                    break L1;
                  }
                }
                L3: {
                  if ((param2 ^ -1) != -11) {
                    break L3;
                  } else {
                    qf.a(0);
                    var3 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (var3 != 0) {
                    L5: {
                      if (ee.field_c) {
                        param0 = jf.a(ta.field_b, new String[1], (byte) -126);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (va.field_f) {
                        param0 = pf.field_B;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    nk.field_a.a(param0, 4210752, param2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((param2 ^ -1) == -257) {
                  break L0;
                } else {
                  if (10 == param2) {
                    break L0;
                  } else {
                    if (!fe.field_g) {
                      vk.field_c.e((byte) -100);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = null;
          cl.a((String) null, false, -26);
          ng.field_b = false;
          if (null != nk.field_a) {
            if (nk.field_a.field_D) {
              L7: {
                var3 = 1;
                if (8 != param2) {
                  break L7;
                } else {
                  L8: {
                    if (!fe.field_g) {
                      param0 = mc.field_c;
                      break L8;
                    } else {
                      param0 = q.field_J;
                      break L8;
                    }
                  }
                  param2 = 2;
                  vk.field_c.b(190, gi.field_b);
                  break L7;
                }
              }
              L9: {
                if ((param2 ^ -1) != -11) {
                  break L9;
                } else {
                  qf.a(0);
                  var3 = 0;
                  break L9;
                }
              }
              L10: {
                if (var3 != 0) {
                  L11: {
                    if (ee.field_c) {
                      param0 = jf.a(ta.field_b, new String[1], (byte) -126);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (va.field_f) {
                      param0 = pf.field_B;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  nk.field_a.a(param0, 4210752, param2);
                  break L10;
                } else {
                  break L10;
                }
              }
              L13: {
                if ((param2 ^ -1) == -257) {
                  break L13;
                } else {
                  if (10 == param2) {
                    break L13;
                  } else {
                    if (!fe.field_g) {
                      vk.field_c.e((byte) -100);
                      break L13;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_n = null;
        field_p = null;
    }

    cl(ba param0, ba param1) {
        super(param0);
        ((cl) this).field_j = "";
        ((cl) this).field_k = false;
        ((cl) this).field_l = new bd(param0, param1);
    }

    final String a(String param0, byte param1) {
        if (param1 != -114) {
            Object var4 = null;
            String discarded$3 = ((cl) this).a((String) null, (byte) -81);
            if (((cl) this).field_l.b(param0, (byte) 54) == a.field_e) {
                return ((cl) this).field_l.a(param0, (byte) -114);
            }
            if (!(((cl) this).b(param0, (byte) 54) != a.field_e)) {
                return hb.field_C;
            }
            return ha.field_g;
        }
        if (((cl) this).field_l.b(param0, (byte) 54) == a.field_e) {
            return ((cl) this).field_l.a(param0, (byte) -114);
        }
        if (!(((cl) this).b(param0, (byte) 54) != a.field_e)) {
            return hb.field_C;
        }
        return ha.field_g;
    }

    final static void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        id var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jc var5_ref_jc = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ii var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = Bounce.field_N;
        var9 = jc.field_g;
        var2 = var9.d((byte) -118);
        var3 = var9.d((byte) -113);
        if (0 == var2) {
          var4 = (id) (Object) mf.field_d.a((byte) -105);
          if (var4 != null) {
            L0: {
              var5 = -var9.field_h + pe.field_d;
              var13 = var4.field_h;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var6 = var10;
              if (var5 > var13.length << -2034825918) {
                var5 = var13.length << -570147998;
                break L0;
              } else {
                break L0;
              }
            }
            var7 = 0;
            L1: while (true) {
              if (var5 <= var7) {
                var4.c(2);
                if (param0) {
                  field_n = null;
                  return;
                } else {
                  return;
                }
              } else {
                var6[var7 >> 1426473826] = var6[var7 >> 1426473826] + (var9.d((byte) -125) << da.b(768, var7 << 372978216));
                var7++;
                continue L1;
              }
            }
          } else {
            kc.a((byte) 18);
            return;
          }
        } else {
          if ((var2 ^ -1) != -2) {
            ti.a((Throwable) null, (byte) 100, "LR1: " + la.a(-114));
            kc.a((byte) 18);
            if (!param0) {
              return;
            } else {
              field_n = null;
              return;
            }
          } else {
            var4_int = var9.i(128);
            var5_ref_jc = (jc) (Object) m.field_e.a((byte) -53);
            L2: while (true) {
              if (var5_ref_jc == null) {
                if (var5_ref_jc == null) {
                  kc.a((byte) 18);
                  return;
                } else {
                  var5_ref_jc.c(2);
                  if (!param0) {
                    return;
                  } else {
                    field_n = null;
                    return;
                  }
                }
              } else {
                L3: {
                  if (var3 != var5_ref_jc.field_l) {
                    break L3;
                  } else {
                    if (var5_ref_jc.field_j != var4_int) {
                      break L3;
                    } else {
                      if (var5_ref_jc == null) {
                        kc.a((byte) 18);
                        return;
                      } else {
                        var5_ref_jc.c(2);
                        L4: {
                          if (!param0) {
                            break L4;
                          } else {
                            field_n = null;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                var5_ref_jc = (jc) (Object) m.field_e.d((byte) 90);
                continue L2;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
    }
}
