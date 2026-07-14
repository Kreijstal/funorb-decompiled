/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    private l field_d;
    static String field_c;
    static String field_a;
    private l field_e;
    static km[] field_i;
    private l[] field_b;
    private int field_h;
    static int field_g;
    private int field_f;

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (param1 != 104) {
            Object var5 = null;
            ln.a(68, -61, (pd) null, (jc) null);
        }
        if (null != md.field_e) {
            if (md.field_e.b(param1 ^ 21)) {
                ch.a(true);
                return true;
            }
        }
        if (km.field_yb != null) {
            if (km.field_yb.d(false)) {
                km.field_yb = null;
                ch.a(true);
                return true;
            }
        }
        if (!(!s.b((byte) -109))) {
            return true;
        }
        if (cb.a(-13079, param2, param3, param0)) {
            return true;
        }
        return false;
    }

    final l a(byte param0) {
        ((ln) this).field_h = 0;
        if (param0 != 19) {
            return null;
        }
        return ((ln) this).a(110);
    }

    final static boolean a(byte param0, eh param1, eh param2, eh param3) {
        Object var5 = null;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          if (!param2.c(0)) {
            break L0;
          } else {
            if (!param2.a((byte) -102, "commonui")) {
              break L0;
            } else {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  var5 = null;
                  ln.a((cj) null, -22);
                  break L1;
                }
              }
              if (!param1.c(0)) {
                return false;
              } else {
                if (param1.a((byte) -102, "commonui")) {
                  L2: {
                    L3: {
                      if (!param3.c(param0 ^ 127)) {
                        break L3;
                      } else {
                        if (!param3.a((byte) -102, "button.gif")) {
                          break L3;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  }
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final l a(long param0, int param1) {
        l var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        l var4 = ((ln) this).field_b[(int)(param0 & (long)(((ln) this).field_f - 1))];
        ((ln) this).field_d = var4.field_f;
        while (var4 != ((ln) this).field_d) {
            if (param0 == ((ln) this).field_d.field_d) {
                var5 = ((ln) this).field_d;
                ((ln) this).field_d = ((ln) this).field_d.field_f;
                return var5;
            }
            ((ln) this).field_d = ((ln) this).field_d.field_f;
        }
        ((ln) this).field_d = null;
        if (param1 == -14905) {
            return null;
        }
        return null;
    }

    final static void a(cj param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= qh.field_K) {
                hf.field_D[param0.b(-6761)] = hf.field_D[param0.b(-6761)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= qh.field_K) {
                    L3: {
                      if (param1 > 88) {
                        break L3;
                      } else {
                        field_a = null;
                        break L3;
                      }
                    }
                    qh.field_K = var2;
                    qh.field_K = qh.field_K + 1;
                    el.field_s[qh.field_K] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_n == el.field_s[var3].field_n) {
                        var4 = el.field_s[var3].b(-6761);
                        if (nb.field_s < hf.field_D[var4]) {
                          hf.field_D[var4] = hf.field_D[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    el.field_s[var2] = el.field_s[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param0.field_n == el.field_s[var2].field_n) {
                  hf.field_D[el.field_s[var2].b(-6761)] = hf.field_D[el.field_s[var2].b(-6761)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            hf.field_D[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, pd param2, jc param3) {
        try {
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            int var13_int = 0;
            Class[] var13 = null;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            bf var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            Throwable decompiledCaughtException = null;
            var15 = Virogrid.field_F ? 1 : 0;
            var19 = new bf();
            var19.field_n = param3.g(11132);
            var19.field_h = param3.d((byte) 112);
            var19.field_g = new int[var19.field_n];
            var19.field_l = new int[var19.field_n];
            var19.field_j = new byte[var19.field_n][][];
            var19.field_r = new un[var19.field_n];
            var19.field_q = new un[var19.field_n];
            var19.field_u = new int[var19.field_n];
            var5 = 42 / ((-62 - param0) / 56);
            var6 = 0;
            L0: while (true) {
              if (var6 >= var19.field_n) {
                var7_ref4 = decompiledCaughtException;
                var19.field_l[var6] = -5;
                var6++;
              } else {
                try {
                  L1: {
                    L2: {
                      var7_int = param3.g(11132);
                      if (0 == var7_int) {
                        break L2;
                      } else {
                        if (var7_int == 1) {
                          break L2;
                        } else {
                          if (var7_int != 2) {
                            L3: {
                              if (var7_int == 3) {
                                break L3;
                              } else {
                                if ((var7_int ^ -1) == -5) {
                                  break L3;
                                } else {
                                  var6++;
                                  break L1;
                                }
                              }
                            }
                            var21 = param3.h(-117);
                            var22 = param3.h(-117);
                            var10 = param3.g(11132);
                            var11 = new String[var10];
                            var12_int = 0;
                            L4: while (true) {
                              if (var12_int >= var10) {
                                L5: {
                                  var25 = new byte[var10][];
                                  var24 = var25;
                                  var23 = var24;
                                  var20 = var23;
                                  var12 = var20;
                                  if ((var7_int ^ -1) == -4) {
                                    var13_int = 0;
                                    L6: while (true) {
                                      if (var10 <= var13_int) {
                                        break L5;
                                      } else {
                                        var14 = param3.d((byte) 124);
                                        var12[var13_int] = new byte[var14];
                                        param3.a(0, var14, true, var25[var13_int]);
                                        var13_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                                var19.field_g[var6] = var7_int;
                                var13 = new Class[var10];
                                var18 = 0;
                                var14 = var18;
                                L7: while (true) {
                                  if (var18 >= var10) {
                                    var19.field_r[var6] = param2.a(cj.a(-109, var21), var13, true, var22);
                                    var19.field_j[var6] = var25;
                                    break L1;
                                  } else {
                                    var13[var18] = cj.a(-99, var11[var18]);
                                    var18++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var11[var12_int] = param3.h(-117);
                                var12_int++;
                                continue L4;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L8: {
                      var16 = param3.h(-122);
                      var8 = var16;
                      var17 = param3.h(-118);
                      var9 = var17;
                      var10 = 0;
                      if (1 != var7_int) {
                        break L8;
                      } else {
                        var10 = param3.d((byte) 95);
                        break L8;
                      }
                    }
                    var19.field_g[var6] = var7_int;
                    var19.field_u[var6] = var10;
                    var19.field_q[var6] = param2.a(cj.a(71, var16), var17, true);
                    var6++;
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var19.field_l[var6] = -3;
                  var6++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var7_ref3 = (Exception) (Object) decompiledCaughtException;
                  var19.field_l[var6] = -4;
                  var6++;
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final l a(int param0) {
        l var2_ref = null;
        int var2 = 0;
        int var3 = 0;
        l var4 = null;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (0 >= ((ln) this).field_h) {
            break L0;
          } else {
            if (((ln) this).field_e != ((ln) this).field_b[((ln) this).field_h + -1]) {
              var2_ref = ((ln) this).field_e;
              ((ln) this).field_e = var2_ref.field_f;
              return var2_ref;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((ln) this).field_h >= ((ln) this).field_f) {
            var2 = 49 / ((-32 - param0) / 46);
            return null;
          } else {
            ((ln) this).field_h = ((ln) this).field_h + 1;
            var4 = ((ln) this).field_b[((ln) this).field_h].field_f;
            var2_ref = var4;
            if (var4 != ((ln) this).field_b[-1 + ((ln) this).field_h]) {
              ((ln) this).field_e = var2_ref.field_f;
              return var2_ref;
            } else {
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            ln.a(false);
        }
        field_i = null;
        field_a = null;
        field_c = null;
    }

    final void a(l param0, byte param1, long param2) {
        if (param0.field_a != null) {
            param0.a(false);
        }
        l var5 = ((ln) this).field_b[(int)((long)(-1 + ((ln) this).field_f) & param2)];
        param0.field_f = var5;
        param0.field_a = var5.field_a;
        if (param1 < 0) {
            Object var6 = null;
            ln.a(-57, -4, (pd) null, (jc) null);
        }
        param0.field_a.field_f = param0;
        param0.field_d = param2;
        param0.field_f.field_a = param0;
    }

    ln(int param0) {
        int var2 = 0;
        l var3 = null;
        ((ln) this).field_h = 0;
        ((ln) this).field_b = new l[param0];
        ((ln) this).field_f = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new l();
            ((ln) this).field_b[var2] = new l();
            var3.field_a = var3;
            var3.field_f = var3;
        }
    }

    final static boolean b(int param0) {
        int var1 = -31 / ((param0 - 7) / 57);
        return null != ul.field_a ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> must play <%1> more rated games before playing with the current options.";
        field_a = "Offline";
    }
}
