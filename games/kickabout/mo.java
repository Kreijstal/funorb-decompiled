/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class mo {
    private int field_c;
    int field_b;
    static String field_d;
    static String field_a;
    int field_e;

    private final void a(mo param0, int param1) {
        if (param1 != 0) {
            return;
        }
        ((mo) this).field_e = param0.field_e;
        ((mo) this).field_b = param0.field_b;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -3) {
            Object var2 = null;
            String discarded$0 = mo.a(86, (CharSequence) null);
        }
        field_a = null;
    }

    final boolean a(int param0, mo param1, int param2, int param3) {
        if (!gk.field_e) {
            if (-65 < (((mo) this).field_c ^ -1)) {
                if (param1.field_b > ((mo) this).field_b) {
                    if (param3 == ((mo) this).field_e) {
                        if (!(((mo) this).field_b >= param2)) {
                            ((mo) this).field_c = ((mo) this).field_c + 1;
                            return true;
                        }
                    }
                }
                if (param1.field_b < ((mo) this).field_b) {
                    if (param1.field_e == param3) {
                        if (!(param2 <= param1.field_b)) {
                            ((mo) this).field_c = ((mo) this).field_c + 1;
                            return true;
                        }
                    }
                }
            }
        }
        ((mo) this).field_c = 0;
        if (param0 >= -82) {
            return false;
        }
        return false;
    }

    final void a(mo param0, boolean param1) {
        ((mo) this).a((byte) -105, param0);
        if (param1) {
            ((mo) this).field_c = -29;
        }
        this.a(param0, 0);
    }

    final static ut b(int param0) {
        int var4_int = 0;
        int var5 = Kickabout.field_G;
        int var1 = ku.field_c[0] * lo.field_j[0];
        byte[] var2 = pq.field_O[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = lt.field_a[qj.b(255, (int) var2[var4_int])];
        }
        ut var4 = new ut(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[param0], ku.field_c[0], lo.field_j[0], var3);
        tk.h((byte) -81);
        return var4;
    }

    void a(mo param0, byte param1) {
        ((mo) this).field_b = 0;
        if (param1 != 84) {
            Object var4 = null;
            ((mo) this).a((mo) null, (byte) 91);
        }
        ((mo) this).field_e = param0.field_e;
    }

    final static void a(ml param0, int param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            si var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            si var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            Throwable decompiledCaughtException = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = Kickabout.field_G;
            var13 = (si) (Object) nv.field_N.g(24009);
            var17 = var13;
            if (var17 == null) {
              return;
            } else {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var17.field_n) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var4 = param0.field_n;
                    param0.b(-82, var17.field_p);
                    var5 = param1;
                    L1: while (true) {
                      if (var5 >= var17.field_n) {
                        int discarded$1 = param0.a(var4, false);
                        var17.c((byte) -109);
                        return;
                      } else {
                        L2: {
                          if (-1 != (var17.field_m[var5] ^ -1)) {
                            param0.a(109, var17.field_m[var5]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                L4: {
                                  var6_int = var17.field_h[var5];
                                  if (0 != var6_int) {
                                    if (-2 == (var6_int ^ -1)) {
                                      var16_ref = (java.lang.reflect.Field) var17.field_f[var5].field_b;
                                      var20 = var16_ref;
                                      var20.setInt((Object) null, var17.field_o[var5]);
                                      param0.a(113, 0);
                                      break L4;
                                    } else {
                                      if ((var6_int ^ -1) != -3) {
                                        break L4;
                                      } else {
                                        var28 = (java.lang.reflect.Field) var17.field_f[var5].field_b;
                                        var8 = var28.getModifiers();
                                        param0.a(118, 0);
                                        param0.b(param1 ^ -120, var8);
                                        break L4;
                                      }
                                    }
                                  } else {
                                    var27 = (java.lang.reflect.Field) var17.field_f[var5].field_b;
                                    var8 = var27.getInt((Object) null);
                                    param0.a(114, 0);
                                    param0.b(-110, var8);
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (-4 != (var6_int ^ -1)) {
                                    if (-5 != (var6_int ^ -1)) {
                                      break L5;
                                    } else {
                                      var30 = (java.lang.reflect.Method) var17.field_e[var5].field_b;
                                      var8 = var30.getModifiers();
                                      param0.a(115, 0);
                                      param0.b(param1 + -114, var8);
                                      break L5;
                                    }
                                  } else {
                                    var29 = (java.lang.reflect.Method) var17.field_e[var5].field_b;
                                    var26 = var17.field_l[var5];
                                    var9 = new Object[var26.length];
                                    var10_int = 0;
                                    L6: while (true) {
                                      if (var10_int >= var26.length) {
                                        var10 = var29.invoke((Object) null, var9);
                                        if (var10 != null) {
                                          if (var10 instanceof Number) {
                                            param0.a(110, 1);
                                            param0.a(((Number) var10).longValue(), param1 + -1781890008);
                                            break L5;
                                          } else {
                                            if (!(var10 instanceof String)) {
                                              param0.a(109, 4);
                                              break L5;
                                            } else {
                                              param0.a(102, 2);
                                              param0.a(param1 ^ 14190, (String) var10);
                                              break L5;
                                            }
                                          }
                                        } else {
                                          param0.a(106, 0);
                                          break L5;
                                        }
                                      } else {
                                        var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                        var9[var10_int] = var11.readObject();
                                        var10_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                                break L3;
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                              decompiledCaughtException = decompiledCaughtParameter5;
                              L12: {
                                var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                param0.a(120, -15);
                                break L12;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter8) {
                              decompiledCaughtException = decompiledCaughtParameter8;
                              L15: {
                                var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                param0.a(111, -18);
                                break L15;
                              }
                            } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                              decompiledCaughtException = decompiledCaughtParameter9;
                              L16: {
                                var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                param0.a(105, -19);
                                break L16;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter10) {
                              decompiledCaughtException = decompiledCaughtParameter10;
                              L17: {
                                var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                param0.a(106, -20);
                                break L17;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter11) {
                              decompiledCaughtException = decompiledCaughtParameter11;
                              L18: {
                                var6_ref11 = decompiledCaughtException;
                                param0.a(param1 + 106, -21);
                                break L18;
                              }
                            }
                            break L2;
                          }
                        }
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  L19: {
                    if (var13.field_f[var4] != null) {
                      L20: {
                        if (var13.field_f[var4].field_a == 2) {
                          var13.field_m[var4] = -5;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      if (-1 != (var13.field_f[var4].field_a ^ -1)) {
                        break L19;
                      } else {
                        var3 = 1;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  if (var13.field_e[var4] != null) {
                    L21: {
                      if (var13.field_e[var4].field_a == 2) {
                        var13.field_m[var4] = -6;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    if (0 == var13.field_e[var4].field_a) {
                      var3 = 1;
                      var4++;
                      continue L0;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(byte param0, mo param1);

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        if (param1 != null) {
          var2 = param0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!ca.a(false, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!ca.a(false, param1.charAt(-1 + var3))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if ((var4 ^ -1) <= -2) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L4: while (true) {
                    if (var6 >= var3) {
                      if (-1 != (var5.length() ^ -1)) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (ws.a((char) var7, (byte) 121)) {
                        var8 = vf.a((byte) -67, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L4;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    void a(mo param0, int param1, int param2, int param3) {
        if (param3 <= 38) {
            ((mo) this).field_e = -23;
        }
        if (((mo) this).a(-86, param0, param2, param1)) {
            return;
        }
        ((mo) this).a(param0, false);
    }

    final void b(ml param0, int param1) {
        if (param1 != 4) {
            Object var4 = null;
            ((mo) this).a((byte) 17, (mo) null);
        }
        ((mo) this).field_b = -hq.a(22531, 6, param0, 0) + 64;
        if (mu.a(param0, (byte) -39)) {
            ((mo) this).field_e = param0.l(4, param1 + 55) - 1;
        }
    }

    mo() {
        ((mo) this).field_e = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Month";
        field_a = "in the Quarter-Finals";
    }
}
