/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ba implements nb {
    static um field_f;
    static String field_e;
    private long field_a;
    static wl field_b;
    static int field_d;
    static boolean field_c;

    public final void c(byte param0) {
        if (param0 != -51) {
            ((ba) this).field_a = -32L;
        }
        ((ba) this).field_a = ik.a(param0 + 55);
    }

    final static boolean a(ji param0, int param1) {
        if (param1 != -2147483648) {
            field_f = null;
        }
        return param0.a(false);
    }

    abstract String e(byte param0);

    public static void d(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 < 70) {
            return;
        }
        field_b = null;
    }

    public final String b(byte param0) {
        if (((ba) this).a((byte) -101)) {
            return null;
        }
        if (param0 < 52) {
            return null;
        }
        if ((ik.a(4) ^ -1L) > (350L + ((ba) this).field_a ^ -1L)) {
            return null;
        }
        return ((ba) this).e((byte) 49);
    }

    abstract tb b(int param0);

    final static void a(int param0, uf param1) {
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
            kl var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            kl var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            Throwable decompiledCaughtException = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = client.field_A ? 1 : 0;
            var13 = (kl) (Object) aa.field_f.c((byte) -54);
            var17 = var13;
            if (var17 == null) {
              return;
            } else {
              var3 = 0;
              if (param0 == -32141) {
                var4 = 0;
                L0: while (true) {
                  if (var17.field_o <= var4) {
                    if (var3 != 0) {
                      return;
                    } else {
                      var4 = param1.field_n;
                      param1.a(var17.field_C, false);
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= var17.field_o) {
                          int discarded$1 = param1.a((byte) -15, var4);
                          var17.b((byte) 103);
                          return;
                        } else {
                          L2: {
                            if (0 == var17.field_A[var5]) {
                              try {
                                L3: {
                                  L4: {
                                    var6_int = var17.field_u[var5];
                                    if (var6_int == 0) {
                                      var15 = (java.lang.reflect.Field) var17.field_y[var5].field_b;
                                      var8 = var15.getInt((Object) null);
                                      param1.a(true, 0);
                                      param1.a(var8, false);
                                      break L4;
                                    } else {
                                      if (-2 == var6_int) {
                                        var16_ref = (java.lang.reflect.Field) var17.field_y[var5].field_b;
                                        var19 = var16_ref;
                                        var19.setInt((Object) null, var17.field_q[var5]);
                                        param1.a(true, 0);
                                        break L4;
                                      } else {
                                        if (-3 != var6_int) {
                                          break L4;
                                        } else {
                                          var26 = (java.lang.reflect.Field) var17.field_y[var5].field_b;
                                          var8 = var26.getModifiers();
                                          param1.a(true, 0);
                                          param1.a(var8, false);
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                  L5: {
                                    if (3 != var6_int) {
                                      if (4 == var6_int) {
                                        var28 = (java.lang.reflect.Method) var17.field_t[var5].field_b;
                                        var8 = var28.getModifiers();
                                        param1.a(true, 0);
                                        param1.a(var8, false);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    } else {
                                      var27 = (java.lang.reflect.Method) var17.field_t[var5].field_b;
                                      var25 = var17.field_s[var5];
                                      var9 = new Object[var25.length];
                                      var10_int = 0;
                                      L6: while (true) {
                                        if (var10_int >= var25.length) {
                                          var10 = var27.invoke((Object) null, var9);
                                          if (var10 == null) {
                                            param1.a(true, 0);
                                            break L5;
                                          } else {
                                            if (var10 instanceof Number) {
                                              param1.a(true, 1);
                                              param1.a(((Number) var10).longValue(), (byte) 0);
                                              break L5;
                                            } else {
                                              if (!(var10 instanceof String)) {
                                                param1.a(true, 4);
                                                break L5;
                                              } else {
                                                param1.a(true, 2);
                                                param1.a(0, (String) var10);
                                                break L5;
                                              }
                                            }
                                          }
                                        } else {
                                          var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
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
                                  param1.a(true, -15);
                                  break L12;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter8) {
                                decompiledCaughtException = decompiledCaughtParameter8;
                                L15: {
                                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                  param1.a(true, -18);
                                  break L15;
                                }
                              } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                decompiledCaughtException = decompiledCaughtParameter9;
                                L16: {
                                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                  param1.a(true, -19);
                                  break L16;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter10) {
                                decompiledCaughtException = decompiledCaughtParameter10;
                                L17: {
                                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                  param1.a(true, -20);
                                  break L17;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                decompiledCaughtException = decompiledCaughtParameter11;
                                L18: {
                                  var6_ref11 = decompiledCaughtException;
                                  param1.a(true, -21);
                                  break L18;
                                }
                              }
                              break L2;
                            } else {
                              param1.a(true, var17.field_A[var5]);
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
                      if (var13.field_y[var4] == null) {
                        break L19;
                      } else {
                        L20: {
                          if (-3 != (var13.field_y[var4].field_c ^ -1)) {
                            break L20;
                          } else {
                            var13.field_A[var4] = -5;
                            break L20;
                          }
                        }
                        if (var13.field_y[var4].field_c == 0) {
                          var3 = 1;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (var13.field_t[var4] != null) {
                      L21: {
                        if (var13.field_t[var4].field_c == -3) {
                          var13.field_A[var4] = -6;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      if (-1 == var13.field_t[var4].field_c) {
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
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final tb a(int param0) {
        if (!(!((ba) this).a((byte) 119))) {
            return ki.field_t;
        }
        if (param0 != 20350) {
            ba.a(-21, -85, -33);
        }
        if (!(ik.a(4) >= ((ba) this).field_a + 350L)) {
            return le.field_o;
        }
        return ((ba) this).b(param0 + -25870);
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == db.field_b) {
              break L1;
            } else {
              if (db.field_b.length >= param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          db.field_b = new int[2 * param1];
          break L0;
        }
        L2: {
          L3: {
            if (ad.field_i == null) {
              break L3;
            } else {
              if (ad.field_i.length < param1) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          ad.field_i = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (oa.field_e == null) {
              break L5;
            } else {
              if (oa.field_e.length < param1) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          oa.field_e = new int[2 * param1];
          break L4;
        }
        L6: {
          L7: {
            if (ln.field_a == null) {
              break L7;
            } else {
              if (param1 > ln.field_a.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          ln.field_a = new int[2 * param1];
          break L6;
        }
        L8: {
          L9: {
            if (null == mk.field_b) {
              break L9;
            } else {
              if (param1 > mk.field_b.length) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          mk.field_b = new int[2 * param1];
          break L8;
        }
        L10: {
          L11: {
            if (null == cc.field_h) {
              break L11;
            } else {
              if (cc.field_h.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          cc.field_h = new int[param1 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (null == ch.field_a) {
              break L13;
            } else {
              if (ch.field_a.length < param1 - -param2) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          ch.field_a = new int[(param2 + param1) * 2];
          break L12;
        }
        L14: {
          L15: {
            if (null == oe.field_L) {
              break L15;
            } else {
              if (oe.field_L.length < param1) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          oe.field_L = new boolean[2 * param1];
          break L14;
        }
        ge.field_b = 2147483647;
        bg.field_d = -2147483648;
        og.field_eb = 0;
        mf.field_Q = param0;
        rf.field_g = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Players";
        field_f = new um();
    }
}
