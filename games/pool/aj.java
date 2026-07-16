/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends vh {
    private int field_Lb;
    private vh field_Qb;
    private StringBuilder field_Nb;
    private vh field_Pb;
    static int[][][] field_Ob;
    static String field_Tb;
    static String field_Rb;
    static ao field_Mb;
    static String field_Sb;

    final static dd f(byte param0) {
        int var4_int = 0;
        int var5 = Pool.field_O;
        int var1 = rc.field_f[0] * pd.field_a[0];
        byte[] var2 = v.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ma.field_h[rb.b((int) var2[var4_int], 255)];
        }
        dd var4 = new dd(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var3);
        if (param0 != 89) {
            dd discarded$0 = aj.f((byte) 30);
        }
        sh.h(-1);
        return var4;
    }

    aj(int param0, int param1, int param2, int param3, String param4, vh param5, vh param6, vh param7) {
        super(0L, param5);
        ((aj) this).field_Lb = 0;
        ((aj) this).field_Pb = new vh(0L, param6, param4);
        ((aj) this).a(117, ((aj) this).field_Pb);
        ((aj) this).field_Qb = new vh(0L, param7);
        ((aj) this).field_Qb.field_N = 16764006;
        ((aj) this).a(-126, ((aj) this).field_Qb);
        ((aj) this).field_Qb.field_kb = "|";
        ((aj) this).field_Nb = new StringBuilder(12);
        int var9 = ((aj) this).field_Pb.b(true);
        ((aj) this).field_Pb.b(3, 2147483647, 5, var9, ad.field_x);
        ((aj) this).field_Qb.b(ad.field_x + 3, 2147483647, 5, var9, ad.field_x);
        int var10 = 5 + (5 - -var9);
        int var11 = 3 + (2 * ad.field_x + 3);
        int var12 = de.a(var10, param2, param0, 0);
        int var13 = sh.a(var11, param1, -1, param3);
        ((aj) this).b(var13, 2147483647, var12, var10, var11);
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_Ob = null;
        field_Sb = null;
        field_Mb = null;
        field_Rb = null;
        field_Tb = null;
    }

    final static int a(boolean param0, int param1, int param2) {
        if (!param0) {
            return -93;
        }
        int var3 = param2 >> -199715233 & -1 + param1;
        return (param2 - -(param2 >>> -6253281)) % param1 - -var3;
    }

    final static dd[] a(int param0, String param1, di param2, String param3) {
        int var4 = param2.b(param1, param0 + -1);
        int var5 = param2.a(var4, param0, param3);
        return ln.a(var4, (byte) 110, param2, var5);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            om.field_y = param2;
            try {
                if (param1 != -18788) {
                    field_Sb = null;
                }
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (param2.length() == 0) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                mo.a("document.cookie=\"" + var5 + "\"", param0, (byte) 35);
            } catch (Throwable throwable) {
            }
            uk.a(558370049, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean f(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (((aj) this).field_Lb != 0) {
          return false;
        } else {
          L0: {
            if (param0 == 20628) {
              break L0;
            } else {
              var3 = null;
              ml discarded$8 = aj.a((java.applet.Applet) null, 1);
              break L0;
            }
          }
          L1: {
            if (85 != qi.field_a) {
              break L1;
            } else {
              if (-1 > (((aj) this).field_Nb.length() ^ -1)) {
                StringBuilder discarded$9 = cj.a(' ', ((aj) this).field_Nb.length() + -1, -2790, ((aj) this).field_Nb);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((aj) this).field_Nb.length() >= 12) {
              break L2;
            } else {
              L3: {
                var2 = Character.toLowerCase(ml.field_b);
                if (var2 == 32) {
                  var2 = 95;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var2 != 95) {
                  break L4;
                } else {
                  if (-1 > (((aj) this).field_Nb.length() ^ -1)) {
                    StringBuilder discarded$10 = ((aj) this).field_Nb.append(var2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (vq.a((char) var2, 22987)) {
                  break L5;
                } else {
                  if (!kh.a((char) var2, (byte) 85)) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              StringBuilder discarded$11 = ((aj) this).field_Nb.append(var2);
              break L2;
            }
          }
          L6: {
            if ((qi.field_a ^ -1) != -85) {
              break L6;
            } else {
              if ((((aj) this).field_Nb.length() ^ -1) >= -1) {
                ((aj) this).field_Lb = 1;
                break L6;
              } else {
                ((aj) this).field_nb = ((aj) this).field_Nb.toString();
                ((aj) this).field_Lb = 2;
                break L6;
              }
            }
          }
          if (13 == qi.field_a) {
            ((aj) this).field_Lb = 1;
            return true;
          } else {
            return true;
          }
        }
    }

    final static ml a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        ml var5 = null;
        String var2 = re.a(-21721, "jagex-last-login-method", param0);
        if (param1 != 5137) {
            int discarded$0 = aj.a(-103, false, 80);
        }
        if (var2 == null) {
            return ve.field_l;
        }
        ml[] var3 = to.a((byte) -66);
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, (byte) 49)) {
                return var5;
            }
        }
        return ve.field_l;
    }

    final static int a(int param0, boolean param1, int param2) {
        long var3 = 0L;
        Object var5 = null;
        L0: {
          L1: {
            var3 = (long)param2 * (long)param0;
            if (-1L == (255L & var3 >> -368575697 ^ -1L)) {
              break L1;
            } else {
              if (255L == (255L & var3 >> 1895179567)) {
                break L1;
              } else {
                var3 = ((long)param2 >> 610604360) * ((long)param0 >> 1532572424);
                break L0;
              }
            }
          }
          var3 = var3 >> 16;
          break L0;
        }
        L2: {
          if (!param1) {
            break L2;
          } else {
            var5 = null;
            dd[] discarded$1 = aj.a(23, (String) null, (di) null, (String) null);
            break L2;
          }
        }
        L3: {
          if (0 <= param2) {
            break L3;
          } else {
            if (0 <= param0) {
              break L3;
            } else {
              if (var3 >= 0L) {
                break L3;
              } else {
                throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param2 + "[" + pf.b(126, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(126, param0) + ", " + Integer.toString(param0, 16) + "]) and got a negative number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
              }
            }
          }
        }
        L4: {
          L5: {
            L6: {
              if (0 >= param2) {
                break L6;
              } else {
                if (0 > param0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (-1 >= (param2 ^ -1)) {
              break L4;
            } else {
              if ((param0 ^ -1) >= -1) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if ((var3 ^ -1L) >= -1L) {
            break L4;
          } else {
            throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param2 + "[" + pf.b(127, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(126, param0) + ", " + Integer.toString(param0, 16) + "]) and got a positive number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
          }
        }
        L7: {
          if (param2 <= 0) {
            break L7;
          } else {
            if (0 >= param0) {
              break L7;
            } else {
              if (-1L < (var3 ^ -1L)) {
                throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param2 + "[" + pf.b(126, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(127, param0) + ", " + Integer.toString(param0, 16) + "]) and got a negative number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
              } else {
                break L7;
              }
            }
          }
        }
        return (int)var3;
    }

    final int a(boolean param0, byte param1) {
        int var4 = 0;
        var4 = Pool.field_O;
        ((aj) this).a(param0, false);
        if (param1 < -74) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              L1: while (true) {
                if (!n.h(127)) {
                  break L0;
                } else {
                  L2: {
                    if (85 != qi.field_a) {
                      break L2;
                    } else {
                      if ((((aj) this).field_Nb.length() ^ -1) < -1) {
                        StringBuilder discarded$4 = cj.a(' ', -1 + ((aj) this).field_Nb.length(), -2790, ((aj) this).field_Nb);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (he.a(ml.field_b, (CharSequence) (Object) ((aj) this).field_Nb, 15692)) {
                        break L4;
                      } else {
                        L5: {
                          if ((((aj) this).field_Nb.length() ^ -1) != -1) {
                            break L5;
                          } else {
                            if (ml.field_b == 91) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (1 != ((aj) this).field_Nb.length()) {
                            break L6;
                          } else {
                            if (ml.field_b == 35) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (ml.field_b != 93) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    StringBuilder discarded$5 = ((aj) this).field_Nb.append(ml.field_b);
                    break L3;
                  }
                  if ((qi.field_a ^ -1) == -85) {
                    if (-1 <= (((aj) this).field_Nb.length() ^ -1)) {
                      return 1;
                    } else {
                      ((aj) this).field_nb = ((aj) this).field_Nb.toString();
                      return 2;
                    }
                  } else {
                    if (13 != qi.field_a) {
                      continue L1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          }
          L7: {
            ((aj) this).field_Qb.field_nb = ((aj) this).field_Nb.toString();
            if (!param0) {
              break L7;
            } else {
              if (0 == ne.field_s) {
                break L7;
              } else {
                if (-1 == (((aj) this).field_R ^ -1)) {
                  ((aj) this).field_Lb = 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          }
          return ((aj) this).field_Lb;
        } else {
          return -46;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_Tb = "Next";
        field_Rb = "You do not have a suitable number of players for the current options.";
        field_Ob = new int[5][][];
        field_Ob[0] = new int[10][];
        field_Ob[1] = new int[10][];
        field_Ob[3] = new int[10][];
        field_Ob[2] = new int[10][];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -6) {
            field_Sb = "Waiting for music";
            return;
          } else {
            if (field_Ob[var0] == null) {
              field_Ob[var0] = field_Ob[0];
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
