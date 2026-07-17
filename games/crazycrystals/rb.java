/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ue {
    static db field_k;
    static String field_e;
    private re field_f;
    static String field_i;
    static am field_g;
    static int field_h;
    static String field_j;

    public static void c(byte param0) {
        field_k = null;
        field_e = null;
        field_j = null;
        if (param0 != 100) {
          field_g = null;
          field_i = null;
          field_g = null;
          return;
        } else {
          field_i = null;
          field_g = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
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
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (ck.a((byte) -29, var3) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("rb.C(");
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 126 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rb(re param0, boolean param1) {
        super(0);
        try {
            ((rb) this).field_f = param0;
            ip.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "rb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0) {
        dl var3 = null;
        if (null != ga.field_L) {
          L0: {
            if (tf.field_c) {
              break L0;
            } else {
              if (ga.field_L.a(param0 ^ -20410, "benefits")) {
                wb.a(0, wl.a("main", ga.field_L, param0 + 2, "benefits"), ei.field_G);
                sj.a(wl.a("crystal", ga.field_L, 10, "benefits"), -2, 17, 10, 107, 71, 40, 2500, (byte) 113);
                var3 = new dl(ee.field_m.field_n / 3 + 6, 6 + ee.field_m.field_o / 3);
                var3.a();
                ee.field_m.d(3, 3, ee.field_m.field_n / 3, ee.field_m.field_o / 3);
                dk.field_o.a(6945);
                hb.a(3, var3.field_o, 0, var3.field_n, var3, -126, 1, 0);
                fo.a(param0 ^ -12, var3);
                tf.field_c = true;
                vp.a(107);
                break L0;
              } else {
                if (!ob.field_o) {
                  L1: {
                    if (ga.field_L.a(param0 ^ -20410, "screenshots")) {
                      bm.a(6437, bf.a(-1, "screenshots", "screenshots", ga.field_L));
                      ob.field_o = true;
                      vp.a(127);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (!tf.field_c) {
                      break L2;
                    } else {
                      if (ob.field_o) {
                        ga.field_L = null;
                        break L2;
                      } else {
                        ((rb) this).field_f.b(param0);
                        if (-1 != ((rb) this).field_f.field_f) {
                          return;
                        } else {
                          la.b(-79);
                          return;
                        }
                      }
                    }
                  }
                  ((rb) this).field_f.b(param0);
                  if (-1 != ((rb) this).field_f.field_f) {
                    return;
                  } else {
                    la.b(-79);
                    return;
                  }
                } else {
                  L3: {
                    if (!tf.field_c) {
                      break L3;
                    } else {
                      if (ob.field_o) {
                        ga.field_L = null;
                        break L3;
                      } else {
                        ((rb) this).field_f.b(param0);
                        if (-1 != ((rb) this).field_f.field_f) {
                          return;
                        } else {
                          la.b(-79);
                          return;
                        }
                      }
                    }
                  }
                  ((rb) this).field_f.b(param0);
                  if (-1 != ((rb) this).field_f.field_f) {
                    return;
                  } else {
                    la.b(-79);
                    return;
                  }
                }
              }
            }
          }
          L4: {
            if (ob.field_o) {
              break L4;
            } else {
              if (ga.field_L.a(param0 ^ -20410, "screenshots")) {
                bm.a(6437, bf.a(-1, "screenshots", "screenshots", ga.field_L));
                ob.field_o = true;
                vp.a(127);
                break L4;
              } else {
                L5: {
                  if (!tf.field_c) {
                    break L5;
                  } else {
                    if (ob.field_o) {
                      ga.field_L = null;
                      break L5;
                    } else {
                      ((rb) this).field_f.b(param0);
                      if (-1 != ((rb) this).field_f.field_f) {
                        return;
                      } else {
                        la.b(-79);
                        return;
                      }
                    }
                  }
                }
                ((rb) this).field_f.b(param0);
                if (-1 != ((rb) this).field_f.field_f) {
                  return;
                } else {
                  la.b(-79);
                  return;
                }
              }
            }
          }
          L6: {
            if (!tf.field_c) {
              break L6;
            } else {
              if (ob.field_o) {
                ga.field_L = null;
                break L6;
              } else {
                ((rb) this).field_f.b(param0);
                if (-1 != ((rb) this).field_f.field_f) {
                  return;
                } else {
                  la.b(-79);
                  return;
                }
              }
            }
          }
          ((rb) this).field_f.b(param0);
          if (-1 == ((rb) this).field_f.field_f) {
            la.b(-79);
            return;
          } else {
            return;
          }
        } else {
          ((rb) this).field_f.b(param0);
          if (((rb) this).field_f.field_f != 0) {
            return;
          } else {
            la.b(-79);
            return;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 < 99) {
            return true;
        }
        return false;
    }

    final void a(boolean param0) {
        int var2 = 0;
        ((rb) this).field_f.c(-1);
        if (0 == ((rb) this).field_f.field_f) {
          var2 = da.a(true, true);
          if (3 != var2) {
            if (var2 != 1) {
              if (var2 != 2) {
                if (!param0) {
                  return;
                } else {
                  boolean discarded$9 = ((rb) this).a(96);
                  return;
                }
              } else {
                a.field_b = (ue) (Object) ((rb) this).field_f;
                ((rb) this).field_f.a(true, -13880);
                if (param0) {
                  boolean discarded$10 = ((rb) this).a(96);
                  return;
                } else {
                  return;
                }
              }
            } else {
              a.field_b = (ue) (Object) ((rb) this).field_f;
              ((rb) this).field_f.a(false, -13880);
              if (var2 != 2) {
                if (param0) {
                  boolean discarded$11 = ((rb) this).a(96);
                  return;
                } else {
                  return;
                }
              } else {
                a.field_b = (ue) (Object) ((rb) this).field_f;
                ((rb) this).field_f.a(true, -13880);
                if (param0) {
                  boolean discarded$12 = ((rb) this).a(96);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            q.a(param0);
            on.a(95, le.b((byte) -20));
            if (var2 == 1) {
              a.field_b = (ue) (Object) ((rb) this).field_f;
              ((rb) this).field_f.a(false, -13880);
              if (var2 != 2) {
                if (param0) {
                  boolean discarded$13 = ((rb) this).a(96);
                  return;
                } else {
                  return;
                }
              } else {
                a.field_b = (ue) (Object) ((rb) this).field_f;
                ((rb) this).field_f.a(true, -13880);
                if (param0) {
                  boolean discarded$14 = ((rb) this).a(96);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (var2 == 2) {
                a.field_b = (ue) (Object) ((rb) this).field_f;
                ((rb) this).field_f.a(true, -13880);
                if (!param0) {
                  return;
                } else {
                  boolean discarded$15 = ((rb) this).a(96);
                  return;
                }
              } else {
                if (param0) {
                  boolean discarded$16 = ((rb) this).a(96);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0) {
            boolean discarded$17 = ((rb) this).a(96);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Bouncy Ball";
        field_i = "... otherwise this crystal will be trapped!";
        field_j = "This is a safe.<br><br>Look for a key. Safes<br>open when you collect a<br>matching key. The safes<br>usually contain crystals,<br>so you'll probably need to open them to complete the level.";
    }
}
