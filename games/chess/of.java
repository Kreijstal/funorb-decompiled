/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    int field_f;
    static String field_b;
    private int field_d;
    static int field_g;
    private int field_l;
    private int field_a;
    int field_h;
    static int field_k;
    private int field_j;
    private int field_c;
    static ci field_i;
    boolean field_e;

    final void b(byte param0) {
        ((of) this).field_a = 0;
        if (param0 > -2) {
            return;
        }
        ((of) this).field_l = 0;
        ((of) this).field_j = 0;
        if (!(0 != ((of) this).field_c)) {
            ((of) this).field_j = vg.field_a;
        }
    }

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 84) {
            break L0;
          } else {
            ((of) this).a(61, -108, 32);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((((of) this).field_l ^ -1) == -2) {
              break L2;
            } else {
              if ((((of) this).field_j ^ -1) == -98) {
                break L2;
              } else {
                if (((of) this).field_j == 84) {
                  break L2;
                } else {
                  if (-84 != (((of) this).field_j ^ -1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        if ((param2 ^ -1) > (((of) this).field_f ^ -1)) {
          if (((of) this).field_f <= param0) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              if (param1 == 99) {
                break L0;
              } else {
                boolean discarded$1 = ((of) this).b(false);
                break L0;
              }
            }
            L1: {
              ((of) this).field_l = 0;
              ((of) this).field_a = 0;
              ((of) this).field_j = 0;
              if (-1 == (th.field_d ^ -1)) {
                break L1;
              } else {
                ((of) this).field_e = true;
                ((of) this).field_d = ji.field_R;
                ((of) this).field_l = th.field_d;
                ((of) this).field_a = th.field_d;
                ((of) this).field_h = param0;
                ((of) this).field_c = th.field_d;
                break L1;
              }
            }
            L2: {
              if ((((of) this).field_c ^ -1) == -1) {
                break L2;
              } else {
                if (0 != wh.field_f) {
                  L3: {
                    if (-1 > (((of) this).field_d ^ -1)) {
                      break L3;
                    } else {
                      ((of) this).field_d = jh.field_f;
                      ((of) this).field_l = ((of) this).field_c;
                      break L3;
                    }
                  }
                  ((of) this).field_d = ((of) this).field_d - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (-1 != (th.field_d ^ -1)) {
                break L4;
              } else {
                if (0 != wh.field_f) {
                  break L4;
                } else {
                  ((of) this).field_c = 0;
                  break L4;
                }
              }
            }
            L5: {
              if (((of) this).field_c != 0) {
                break L5;
              } else {
                L6: {
                  if (((of) this).field_e) {
                    break L6;
                  } else {
                    if (lf.field_O) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((param2 ^ -1) > -1) {
                  if (((of) this).field_e) {
                    ((of) this).field_h = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  L7: {
                    if ((param2 ^ -1) == (((of) this).field_h ^ -1)) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((of) this).field_h = param2;
                  ((of) this).field_e = true;
                  break L5;
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.a(-1, param4, param2, param1, rf.field_b, hn.field_k, param3);
        int var7 = this.a(param0 + -62, param4, param2, param1, ag.field_f, re.field_m, param3);
        if (param0 != 61) {
            ((of) this).a(-57, 37, false, 100);
        }
        ((of) this).a(var7, 99, var6);
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if ((((of) this).field_l ^ -1) == -3) {
                break L1;
              } else {
                if (((of) this).field_j != 96) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 97) {
            ((of) this).field_e = false;
        }
        return ((of) this).field_j == 97 ? true : false;
    }

    final static String a(String param0, int param1, String param2, int param3) {
        CharSequence var8 = (CharSequence) (Object) param2;
        if (!ed.a(var8, 21257)) {
            return qj.field_a;
        }
        if (!(2 == ld.field_g)) {
            return vf.field_e;
        }
        ve var7 = hh.a(param3 + -15023, param0);
        if (!(var7 != null)) {
            return oc.a(tl.field_Ib, new String[1], (byte) -90);
        }
        var7.c(-2193);
        var7.d(param3);
        wc.field_v = wc.field_v - 1;
        nk var5 = qn.field_U;
        var5.f(param1, -123);
        var5.field_l = var5.field_l + 1;
        int var6 = var5.field_l;
        var5.c(3, (byte) -112);
        var5.a(-120, param2);
        var5.a(var5.field_l + -var6, -1);
        return null;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -1) {
            boolean discarded$0 = ((of) this).c(-39);
        }
        if (param3 <= param5) {
            if (param5 < param2) {
                if (param4 >= param1) {
                    if (!(param6 * ((of) this).field_f + param1 <= param4)) {
                        return (-param1 + param4) / param6;
                    }
                }
            }
        }
        return -1;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        ((of) this).field_c = param3;
        ((of) this).field_e = param2 ? true : false;
        if (!((of) this).field_e) {
            ((of) this).field_h = param0;
        } else {
            ((of) this).field_h = param1;
        }
    }

    final void c(byte param0) {
        int var2 = -119 % ((param0 - 78) / 32);
        ((of) this).field_l = 0;
        ((of) this).field_j = 0;
        ((of) this).field_a = 0;
        if (-1 == (((of) this).field_c ^ -1)) {
            if (vg.field_a == 98) {
                if (((of) this).field_h <= 0) {
                    ((of) this).field_h = ((of) this).field_f;
                }
                ((of) this).field_e = false;
                ((of) this).field_h = ((of) this).field_h - 1;
            }
        }
        if (!(-1 != (((of) this).field_c ^ -1))) {
            ((of) this).field_j = vg.field_a;
        }
        if (((of) this).field_c == 0) {
            if (!(99 != vg.field_a)) {
                ((of) this).field_h = ((of) this).field_h + 1;
                if (!(((of) this).field_h < ((of) this).field_f)) {
                    ((of) this).field_h = 0;
                }
                ((of) this).field_e = false;
            }
        }
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = Chess.field_G;
            if (ih.field_U) {
              return true;
            } else {
              try {
                L0: {
                  L1: {
                    if (param1 > 61) {
                      break L1;
                    } else {
                      var8 = null;
                      String discarded$2 = of.a((String) null, 68, (String) null, 35);
                      break L1;
                    }
                  }
                  var2 = "tuhstatbut";
                  var3 = (String) u.a(true, "getcookies", param0);
                  var4 = gl.a((byte) -118, ';', var3);
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (0 > var6) {
                          break L3;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            break L3;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (null == param0.getParameter("tuhstatbut")) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 94) {
            return false;
        }
        return -103 == (((of) this).field_j ^ -1) ? true : false;
    }

    final static void d(int param0) {
        uk.field_e = false;
        ei.field_u = 0;
        eg.field_j = null;
        if (param0 != -103) {
            return;
        }
        vn.field_Db = -1;
        fm.field_S = -1;
    }

    final boolean b(boolean param0) {
        if (param0) {
            return true;
        }
        return (((of) this).field_c ^ -1) != -1 ? true : false;
    }

    final boolean d(byte param0) {
        Object var3 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 > 31) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = of.a((java.applet.Applet) null, (byte) -89);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((of) this).field_a) {
              break L2;
            } else {
              if (-85 == (((of) this).field_j ^ -1)) {
                break L2;
              } else {
                if (83 != ((of) this).field_j) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public static void c(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_i = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = -11 % ((-59 - param1) / 63);
        cf.a(83, true, param0);
    }

    final boolean a(int param0) {
        if (param0 != -97) {
            ((of) this).field_e = false;
        }
        return (((of) this).field_j ^ -1) == -97 ? true : false;
    }

    final static String a(int param0, int param1, String param2) {
        Object var4 = null;
        if (1 == param0) {
          return oc.a(ch.field_eb, new String[1], (byte) -93);
        } else {
          if ((param0 ^ -1) != -3) {
            if (param0 != 3) {
              L0: {
                if (param1 == -26564) {
                  break L0;
                } else {
                  var4 = null;
                  boolean discarded$1 = of.a((java.applet.Applet) null, (byte) 31);
                  break L0;
                }
              }
              if ((param0 ^ -1) != -5) {
                if (5 == param0) {
                  return oc.a(dl.field_h, new String[1], (byte) -56);
                } else {
                  if ((param0 ^ -1) != -7) {
                    if (7 == param0) {
                      return oc.a(ih.field_V, new String[1], (byte) -64);
                    } else {
                      if ((param0 ^ -1) != -9) {
                        if (11 == param0) {
                          return oc.a(sk.field_o, new String[1], (byte) -64);
                        } else {
                          if (param0 == 12) {
                            return oc.a(he.field_Lb, new String[1], (byte) -85);
                          } else {
                            if (param0 == 13) {
                              return oc.a(gf.field_c, new String[1], (byte) -121);
                            } else {
                              return null;
                            }
                          }
                        }
                      } else {
                        return oc.a(n.field_a, new String[1], (byte) -47);
                      }
                    }
                  } else {
                    return oc.a(wc.field_y, new String[1], (byte) -93);
                  }
                }
              } else {
                return oc.a(bl.field_b, new String[1], (byte) -79);
              }
            } else {
              return oc.a(ng.field_a, new String[1], (byte) -121);
            }
          } else {
            return oc.a(ii.field_S, new String[1], (byte) -83);
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return 103 == ((of) this).field_j ? true : false;
    }

    of(int param0) {
        ((of) this).field_h = 0;
        ((of) this).field_e = false;
        ((of) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You need a rating of <%1> to play with the current options.";
    }
}
