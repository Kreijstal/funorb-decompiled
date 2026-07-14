/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu implements bo {
    static ht field_a;
    static int field_c;
    private int field_b;

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_c = 33;
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        } else {
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        }
    }

    final static void a(int param0, byte param1, byte[] param2, java.math.BigInteger param3, uia param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var7 = mt.a(param0, 0);
          if (pb.field_n != null) {
            break L0;
          } else {
            pb.field_n = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        if (param1 == -81) {
          var9 = 0;
          L1: while (true) {
            if (-5 >= (var9 ^ -1)) {
              if (null == hf.field_d) {
                hf.field_d = new uia(var7);
                hf.field_d.field_h = 0;
                hf.field_d.a(param6, param2, param0, 61);
                hf.field_d.b(716148936, var7);
                hf.field_d.a((byte) -48, var15);
                if (ola.field_Bb == null) {
                  ola.field_Bb = new uia(100);
                  ola.field_Bb.field_h = 0;
                  ola.field_Bb.i(10, param1 + 81);
                  var11 = 0;
                  var9 = var11;
                  L2: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      ola.field_Bb.f(-1477662136, param0);
                      ola.field_Bb.a(102, param3, param5);
                      param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                      param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                      return;
                    } else {
                      ola.field_Bb.a(var15[var11], (byte) 78);
                      var11++;
                      continue L2;
                    }
                  }
                } else {
                  L3: {
                    if (100 <= ola.field_Bb.field_g.length) {
                      ola.field_Bb.field_h = 0;
                      ola.field_Bb.i(10, param1 + 81);
                      var11 = 0;
                      var9 = var11;
                      break L3;
                    } else {
                      ola.field_Bb = new uia(100);
                      ola.field_Bb.field_h = 0;
                      ola.field_Bb.i(10, param1 + 81);
                      var11 = 0;
                      var9 = var11;
                      break L3;
                    }
                  }
                  L4: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      ola.field_Bb.f(-1477662136, param0);
                      ola.field_Bb.a(102, param3, param5);
                      param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                      param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                      return;
                    } else {
                      ola.field_Bb.a(var15[var11], (byte) 78);
                      var11++;
                      continue L4;
                    }
                  }
                }
              } else {
                if (hf.field_d.field_g.length >= var7) {
                  hf.field_d.field_h = 0;
                  hf.field_d.a(param6, param2, param0, 61);
                  hf.field_d.b(716148936, var7);
                  hf.field_d.a((byte) -48, var15);
                  if (ola.field_Bb == null) {
                    ola.field_Bb = new uia(100);
                    ola.field_Bb.field_h = 0;
                    ola.field_Bb.i(10, param1 + 81);
                    var11 = 0;
                    var9 = var11;
                    L5: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ola.field_Bb.f(-1477662136, param0);
                        ola.field_Bb.a(102, param3, param5);
                        param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                        param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                        return;
                      } else {
                        ola.field_Bb.a(var15[var11], (byte) 78);
                        var11++;
                        continue L5;
                      }
                    }
                  } else {
                    L6: {
                      if (100 <= ola.field_Bb.field_g.length) {
                        break L6;
                      } else {
                        ola.field_Bb = new uia(100);
                        break L6;
                      }
                    }
                    ola.field_Bb.field_h = 0;
                    ola.field_Bb.i(10, param1 + 81);
                    var11 = 0;
                    var9 = var11;
                    L7: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ola.field_Bb.f(-1477662136, param0);
                        ola.field_Bb.a(102, param3, param5);
                        param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                        param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                        return;
                      } else {
                        ola.field_Bb.a(var15[var11], (byte) 78);
                        var11++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  hf.field_d = new uia(var7);
                  hf.field_d.field_h = 0;
                  hf.field_d.a(param6, param2, param0, 61);
                  hf.field_d.b(716148936, var7);
                  hf.field_d.a((byte) -48, var15);
                  if (ola.field_Bb != null) {
                    if (100 <= ola.field_Bb.field_g.length) {
                      ola.field_Bb.field_h = 0;
                      ola.field_Bb.i(10, param1 + 81);
                      var11 = 0;
                      var9 = var11;
                      L8: while (true) {
                        if (-5 >= (var11 ^ -1)) {
                          ola.field_Bb.f(-1477662136, param0);
                          ola.field_Bb.a(102, param3, param5);
                          param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                          param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                          return;
                        } else {
                          ola.field_Bb.a(var15[var11], (byte) 78);
                          var11++;
                          continue L8;
                        }
                      }
                    } else {
                      ola.field_Bb = new uia(100);
                      ola.field_Bb.field_h = 0;
                      ola.field_Bb.i(10, param1 + 81);
                      var11 = 0;
                      var9 = var11;
                      L9: while (true) {
                        if (-5 >= (var11 ^ -1)) {
                          ola.field_Bb.f(-1477662136, param0);
                          ola.field_Bb.a(102, param3, param5);
                          param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                          param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                          return;
                        } else {
                          ola.field_Bb.a(var15[var11], (byte) 78);
                          var11++;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    ola.field_Bb = new uia(100);
                    ola.field_Bb.field_h = 0;
                    ola.field_Bb.i(10, param1 + 81);
                    var11 = 0;
                    var9 = var11;
                    L10: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        ola.field_Bb.f(-1477662136, param0);
                        ola.field_Bb.a(102, param3, param5);
                        param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                        param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                        return;
                      } else {
                        ola.field_Bb.a(var15[var11], (byte) 78);
                        var11++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            } else {
              var8[var9] = pb.field_n.nextInt();
              var9++;
              continue L1;
            }
          }
        } else {
          uu.a(25);
          var9 = 0;
          L11: while (true) {
            if (-5 >= (var9 ^ -1)) {
              L12: {
                if (null == hf.field_d) {
                  hf.field_d = new uia(var7);
                  break L12;
                } else {
                  if (hf.field_d.field_g.length >= var7) {
                    break L12;
                  } else {
                    hf.field_d = new uia(var7);
                    break L12;
                  }
                }
              }
              L13: {
                L14: {
                  hf.field_d.field_h = 0;
                  hf.field_d.a(param6, param2, param0, 61);
                  hf.field_d.b(716148936, var7);
                  hf.field_d.a((byte) -48, var15);
                  if (ola.field_Bb == null) {
                    break L14;
                  } else {
                    if (100 <= ola.field_Bb.field_g.length) {
                      ola.field_Bb.field_h = 0;
                      ola.field_Bb.i(10, param1 + 81);
                      var11 = 0;
                      var9 = var11;
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                ola.field_Bb = new uia(100);
                ola.field_Bb.field_h = 0;
                ola.field_Bb.i(10, param1 + 81);
                var11 = 0;
                var9 = var11;
                break L13;
              }
              L15: while (true) {
                if (-5 >= (var11 ^ -1)) {
                  ola.field_Bb.f(-1477662136, param0);
                  ola.field_Bb.a(102, param3, param5);
                  param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                  param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                  return;
                } else {
                  ola.field_Bb.a(var15[var11], (byte) 78);
                  var11++;
                  continue L15;
                }
              }
            } else {
              var8[var9] = pb.field_n.nextInt();
              var9++;
              continue L11;
            }
          }
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 122);
        if (param1 != -19) {
          ((uu) this).field_b = 121;
          ((uu) this).field_b = param0.b((byte) 44, 2);
          param0.i((byte) 98);
          return;
        } else {
          ((uu) this).field_b = param0.b((byte) 44, 2);
          param0.i((byte) 98);
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param0 <= 2) {
            return;
        }
        ((uu) this).field_b = param1;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 >= -56) {
            return false;
        }
        return pca.b(param1, 113, param0) & ag.b(-1, param0, param1);
    }

    final static void b(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            if (param0 == 12475) {
              try {
                Object discarded$1 = lb.a(-96, "resizing", di.a(111), new Object[1]);
              } catch (java.lang.Throwable decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              var2 = decompiledCaughtException;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, kh param1) {
        Object var4 = null;
        if (param0 != 200) {
          var4 = null;
          ((uu) this).a((kh) null, (byte) 46);
          param1.i(8);
          param1.a((byte) -125, ((uu) this).field_b, 2);
          param1.k(param0 ^ -1826190742);
          return;
        } else {
          param1.i(8);
          param1.a((byte) -125, ((uu) this).field_b, 2);
          param1.k(param0 ^ -1826190742);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param1 != 2507) {
          field_c = -64;
          var5 = 0;
          L0: while (true) {
            if (c.field_g.length <= var5) {
              return;
            } else {
              param3 = c.field_g[var5];
              var6 = var5 << -1185002268;
              L1: while (true) {
                param3--;
                if (param3 == 0) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6++;
                  param0 = aia.field_t[var6];
                  param4[param2[param0]] = param4[param2[param0]] + 1;
                  aia.field_t[param4[param2[param0]]] = param0;
                  continue L1;
                }
              }
            }
          }
        } else {
          var5 = 0;
          L2: while (true) {
            if (c.field_g.length <= var5) {
              return;
            } else {
              param3 = c.field_g[var5];
              var6 = var5 << -1185002268;
              L3: while (true) {
                param3--;
                if (param3 == 0) {
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  var6++;
                  param0 = aia.field_t[var6];
                  param4[param2[param0]] = param4[param2[param0]] + 1;
                  aia.field_t[param4[param2[param0]]] = param0;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
    }
}
