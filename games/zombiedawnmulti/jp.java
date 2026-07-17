/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static th field_c;
    static String field_a;
    static int field_d;
    static int field_e;
    static int field_f;
    static cj field_b;

    final static String a(byte param0) {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_67_0 = null;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_66_0 = null;
        String stackOut_64_0 = null;
        Object stackOut_103_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -104) {
                break L1;
              } else {
                field_d = 67;
                break L1;
              }
            }
            L2: {
              var1 = null;
              var2 = null;
              if (va.field_a != 0) {
                break L2;
              } else {
                if (ej.field_n == null) {
                  break L2;
                } else {
                  var2 = (Object) (Object) bc.field_d;
                  break L2;
                }
              }
            }
            L3: {
              if (va.field_a != 2) {
                break L3;
              } else {
                if (!tl.d((byte) -20)) {
                  L4: {
                    L5: {
                      if (kj.a((byte) -94, ql.field_a)) {
                        break L5;
                      } else {
                        var2 = (Object) (Object) vl.a(ta.field_jb, new String[1], 2);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2 = (Object) (Object) vl.a(hn.field_k, new String[1], 2);
                    break L4;
                  }
                  if (ee.field_b) {
                    vm.a((String) null, 0, (String) null, (String) var2, 2, 0);
                    ub.n(33423425);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (var2 != null) {
                break L6;
              } else {
                if (sp.field_h) {
                  break L6;
                } else {
                  if (null == lj.field_v) {
                    var2 = (Object) (Object) ch.field_a;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              L8: {
                if (var2 == null) {
                  break L8;
                } else {
                  wh.a(6, wj.field_g, 0, (String) var2, (String) null);
                  if (var10 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                L10: {
                  var3 = ta.field_lb;
                  var3 = nh.a(2, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = va.field_a;
                  var7 = 0;
                  if (var6 != 2) {
                    break L10;
                  } else {
                    L11: {
                      var4 = vl.a(v.field_c, new String[1], 2);
                      var8 = vl.a(lc.field_n, new String[1], param0 + 106);
                      var7 = -485 + ua.field_E.field_zb + (ec.field_b.field_zb - (-w.field_A.a(var8) + w.field_A.a(var4)));
                      if (var7 < 0) {
                        var7 = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (var10 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  if (var6 != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (mh.field_c != null) {
                        break L13;
                      } else {
                        if (sn.field_Hb) {
                          var4 = "[" + ne.field_vb + "] ";
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (null != mh.field_c) {
                      L14: {
                        var6 = 1;
                        if (!wa.field_k) {
                          break L14;
                        } else {
                          if (null == bp.field_t) {
                            break L14;
                          } else {
                            var4 = "[" + bp.field_t + "] ";
                            if (var10 == 0) {
                              break L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var4 = "[" + vl.a(ae.field_g, new String[1], 2) + "] ";
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (!lq.b(param0 + 104)) {
                    stackOut_66_0 = "<img=3>: ";
                    stackIn_67_0 = stackOut_66_0;
                    break L15;
                  } else {
                    stackOut_64_0 = ": ";
                    stackIn_67_0 = stackOut_64_0;
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    var8 = stackIn_67_0;
                    var4 = var4 + var3 + var8;
                    if (!nh.field_m) {
                      break L17;
                    } else {
                      var4 = "<col=999999>" + var4 + t.field_a + "</col>";
                      var5 = "";
                      if (var10 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (sh.field_L) {
                    var4 = "<col=999999>" + var4 + cf.field_v + "</col>";
                    var5 = "";
                    break L16;
                  } else {
                    break L16;
                  }
                }
                var9 = w.field_A.a(var4);
                if (lq.b(0)) {
                  break L9;
                } else {
                  L18: {
                    if (!ec.field_b.field_L) {
                      break L18;
                    } else {
                      if (~var9 >= ~(-ec.field_b.field_w + bd.field_g)) {
                        break L18;
                      } else {
                        if (nh.field_m) {
                          var1 = (Object) (Object) "Broken!";
                          break L18;
                        } else {
                          var1 = (Object) (Object) cf.field_v;
                          break L18;
                        }
                      }
                    }
                  }
                  if (ec.field_b.field_T == 0) {
                    break L9;
                  } else {
                    if (ec.field_b.field_U < var9) {
                      if (nh.field_m) {
                        break L9;
                      } else {
                        q.a(13151);
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L19: {
                wh.a(6, pq.field_m[var6], var7, var4 + fm.c(rm.field_a.toString()), var5);
                if (sq.field_N) {
                  break L19;
                } else {
                  ua.field_E.field_L = false;
                  break L19;
                }
              }
              if (ua.field_E.field_L) {
                var1 = (Object) (Object) vl.a(jg.field_b, new String[2], param0 + 106);
                break L7;
              } else {
                break L7;
              }
            }
            stackOut_103_0 = var1;
            stackIn_104_0 = stackOut_103_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw fa.a((Throwable) var1, "jp.B(" + param0 + 41);
        }
        return (String) (Object) stackIn_104_0;
    }

    public static void b(byte param0) {
        try {
            field_a = null;
            int var1_int = 80 % ((56 - param0) / 61);
            field_b = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "jp.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new th();
        field_a = "Best";
        field_e = -1;
    }
}
