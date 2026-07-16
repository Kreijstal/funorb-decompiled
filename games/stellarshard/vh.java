/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private rk field_j;
    private ph field_f;
    private ka field_d;
    private java.math.BigInteger field_b;
    private wc[] field_a;
    static int field_i;
    static int[] field_h;
    static int field_e;
    private java.math.BigInteger field_c;
    private fb field_g;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = stellarshard.field_B;
        if (null != ((vh) this).field_a) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((vh) this).field_a.length) {
              L1: {
                if (param0 == -123) {
                  break L1;
                } else {
                  ((vh) this).field_f = null;
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((vh) this).field_a.length) {
                  return;
                } else {
                  if (((vh) this).field_a[var4] != null) {
                    ((vh) this).field_a[var4].b(false);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((vh) this).field_a[var2]) {
                ((vh) this).field_a[var2].c(13596);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            String var9 = null;
            int stackIn_7_0 = 0;
            int stackIn_16_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_14_0 = 0;
            var7 = stellarshard.field_B;
            if (!sl.field_c) {
              try {
                L0: {
                  var9 = "tuhstatbut";
                  var3 = (String) sh.a("getcookies", param1, (byte) 78);
                  var4 = qj.a(';', var3, 10287);
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      L2: {
                        if (param0) {
                          break L2;
                        } else {
                          var8 = null;
                          short[] discarded$2 = vh.a((byte) 94, (short[]) null, -37, (ha) null);
                          break L2;
                        }
                      }
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (-1 < (var6 ^ -1)) {
                          break L3;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var9)) {
                            break L3;
                          } else {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            return stackIn_7_0 != 0;
                          }
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2 = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (null == param1.getParameter("tuhstatbut")) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L5;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L5;
                }
              }
              return stackIn_16_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wc a(int param0, gi param1, gi param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        wc var9 = null;
        byte[] var11 = null;
        if (((vh) this).field_d != null) {
          L0: {
            if (0 > param4) {
              break L0;
            } else {
              if (((vh) this).field_a.length <= param4) {
                break L0;
              } else {
                if (((vh) this).field_a[param4] == null) {
                  ((vh) this).field_d.field_k = 6 + 72 * param4;
                  var6 = ((vh) this).field_d.b(false);
                  var7 = ((vh) this).field_d.b(false);
                  var11 = new byte[param0];
                  ((vh) this).field_d.a(0, (byte) -101, 64, var11);
                  var9 = new wc(param4, param1, param2, ((vh) this).field_g, ((vh) this).field_j, var6, var11, var7, param3);
                  ((vh) this).field_a[param4] = var9;
                  return var9;
                } else {
                  return ((vh) this).field_a[param4];
                }
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    final static short[] a(byte param0, short[] param1, int param2, ha param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = stellarshard.field_B;
          if (param0 >= 21) {
            break L0;
          } else {
            field_e = -63;
            break L0;
          }
        }
        var4 = param3.e(param2, 8);
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param1 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param3.e(4, 8);
            var6 = (short)param3.e(16, 8);
            if (0 < var5) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (short)(var6 + param3.e(var5, 8));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    vh(fb param0, rk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void b(byte param0) {
        if (param0 != 48) {
            field_i = 87;
        }
        field_h = null;
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var6_ref_java_math_BigInteger = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        ka var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var9 = stellarshard.field_B;
        if (null == ((vh) this).field_d) {
          L0: {
            if (((vh) this).field_f != null) {
              break L0;
            } else {
              if (((vh) this).field_g.d(2)) {
                return false;
              } else {
                ((vh) this).field_f = ((vh) this).field_g.a((byte) 0, 255, true, 255, true);
                break L0;
              }
            }
          }
          if (((vh) this).field_f.field_w) {
            return false;
          } else {
            L1: {
              L2: {
                var11 = new ka(((vh) this).field_f.g(-27203));
                var11.field_k = 5;
                var3 = var11.f(4);
                var11.field_k = var11.field_k + 72 * var3;
                var17 = new byte[-var11.field_k + var11.field_r.length];
                var15 = var17;
                var14 = var15;
                var12 = var14;
                var4 = var12;
                var11.a(0, (byte) -124, var17.length, var17);
                if (null == ((vh) this).field_c) {
                  break L2;
                } else {
                  if (null == ((vh) this).field_b) {
                    break L2;
                  } else {
                    var6_ref_java_math_BigInteger = new java.math.BigInteger(var17);
                    var13 = var6_ref_java_math_BigInteger.modPow(((vh) this).field_c, ((vh) this).field_b);
                    var5 = var13.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              var6 = -19 % ((param0 - 54) / 60);
              var18 = bc.a(0, 5, -5 + (-var17.length + var11.field_k), var11.field_r);
              var8 = 0;
              L3: while (true) {
                if (-65 >= (var8 ^ -1)) {
                  ((vh) this).field_d = var11;
                  ((vh) this).field_a = new wc[var3];
                  return true;
                } else {
                  if (var18[var8] == var5[1 + var8]) {
                    var8++;
                    continue L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return true;
        }
    }

    private vh(fb param0, rk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((vh) this).field_g = param0;
        ((vh) this).field_j = param1;
        ((vh) this).field_b = param3;
        ((vh) this).field_c = param2;
        if (!((vh) this).field_g.d(2)) {
            ((vh) this).field_f = ((vh) this).field_g.a((byte) 0, 255, true, 255, true);
        }
    }

    static {
    }
}
