/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    private ec[] field_d;
    private long field_e;
    private int field_a;
    static mg field_g;
    private ec field_c;
    static o field_b;
    static int field_f;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2_int = 0;
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              wb.field_a = ad.field_b.b(te.field_I[12]);
              var1_int = ad.field_b.b(te.field_I[13]);
              if (var1_int > wb.field_a) {
                wb.field_a = var1_int;
                break L1;
              } else {
                break L1;
              }
            }
            fj.a(32, new int[8], 460, (byte) -127, 150, 0, 180);
            fj.a(32, new int[5], 288, (byte) 95, 155, 1, 50);
            fj.a(37, new int[2], 440, (byte) 23, 0, 2, 200);
            fj.a(37, new int[2], 512, (byte) -128, 406, 3, 260);
            fj.a(37, new int[1], 468, (byte) 1, 430, 4, 30);
            fj.a(37, new int[1], 440, (byte) -128, 370, 5, 200);
            fj.a(37, new int[1], 440, (byte) -127, 200, 6, 200);
            fj.a(37, new int[2], 498, (byte) -127, 400, 7, 260);
            fj.a(28, new int[2], 446, (byte) 98, 200, 8, 194);
            fj.a(28, new int[2], 288, (byte) -128, 400, 9, 50);
            var2_int = 0;
            L2: while (true) {
              if (gg.field_f.length <= var2_int) {
                gg.field_f[1] = true;
                var2 = gg.field_f;
                var2[0] = true;
                var3 = ad.field_b.field_s + (ad.field_b.field_m + 4);
                ah.field_i[8] = ad.field_b.field_s + dd.field_b - (-ad.field_b.field_F - var3);
                si.field_F[8] = 37 - -(var3 * 2);
                break L0;
              } else {
                gg.field_f[var2_int] = false;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "jh.H(" + -1 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        gb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new gb(param0);
              var3 = var9.j(255);
              var4 = var9.e(true);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (0 == jb.field_f) {
                    break L2;
                  } else {
                    if (var4 <= jb.field_f) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.e(true);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (jb.field_f == 0) {
                          break L4;
                        } else {
                          if (~jb.field_f > ~var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (var3 != 1) {
                          var7 = (Object) (Object) g.field_k;
                          synchronized (var7) {
                            L6: {
                              g.field_k.a((byte) 97, var9, var17);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$1 = gi.a(var17, var5, param0, var4, 9);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var16 = new byte[var4];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(var4, 0, -123, var16);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("jh.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 6 + ')');
        }
        return stackIn_21_0;
    }

    final ec a(byte param0) {
        ec var3 = null;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -9) {
            return null;
        }
        if (((jh) this).field_c == null) {
            return null;
        }
        ec var2 = ((jh) this).field_d[(int)(((jh) this).field_e & (long)(-1 + ((jh) this).field_a))];
        while (((jh) this).field_c != var2) {
            if (((jh) this).field_c.field_l == ((jh) this).field_e) {
                var3 = ((jh) this).field_c;
                ((jh) this).field_c = ((jh) this).field_c.field_i;
                return var3;
            }
            ((jh) this).field_c = ((jh) this).field_c.field_i;
        }
        ((jh) this).field_c = null;
        return null;
    }

    final static void a(int param0, int param1) {
        try {
            try {
                Object discarded$0 = fd.a(-4476, ia.g(-115), "resizing", new Object[1]);
            } catch (Throwable throwable) {
            }
            if (param1 <= 44) {
                field_g = null;
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ec a(long param0, boolean param1) {
        ec var4 = null;
        ec var5 = null;
        int var6 = 0;
        ec var7 = null;
        ec var8 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        ((jh) this).field_e = param0;
        if (param1) {
          var7 = ((jh) this).field_d[(int)(param0 & (long)(-1 + ((jh) this).field_a))];
          var4 = var7;
          ((jh) this).field_c = var7.field_i;
          L0: while (true) {
            if (var4 == ((jh) this).field_c) {
              ((jh) this).field_c = null;
              return null;
            } else {
              if (((jh) this).field_c.field_l == param0) {
                var5 = ((jh) this).field_c;
                ((jh) this).field_c = ((jh) this).field_c.field_i;
                return var5;
              } else {
                ((jh) this).field_c = ((jh) this).field_c.field_i;
                continue L0;
              }
            }
          }
        } else {
          jh.a(-76, -128);
          var8 = ((jh) this).field_d[(int)(param0 & (long)(-1 + ((jh) this).field_a))];
          var4 = var8;
          ((jh) this).field_c = var8.field_i;
          L1: while (true) {
            if (var4 == ((jh) this).field_c) {
              ((jh) this).field_c = null;
              return null;
            } else {
              if (((jh) this).field_c.field_l == param0) {
                var5 = ((jh) this).field_c;
                ((jh) this).field_c = ((jh) this).field_c.field_i;
                return var5;
              } else {
                ((jh) this).field_c = ((jh) this).field_c.field_i;
                continue L1;
              }
            }
          }
        }
    }

    final void a(long param0, byte param1, ec param2) {
        ec var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2.field_k == null) {
                break L1;
              } else {
                param2.a(97);
                break L1;
              }
            }
            L2: {
              var5 = ((jh) this).field_d[(int)(param0 & (long)(-1 + ((jh) this).field_a))];
              param2.field_k = var5.field_k;
              param2.field_i = var5;
              param2.field_k.field_i = param2;
              param2.field_l = param0;
              param2.field_i.field_k = param2;
              if (param1 == -109) {
                break L2;
              } else {
                var6 = null;
                ((jh) this).a(-128L, (byte) -79, (ec) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("jh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) ee.field_j;
        synchronized (var1) {
          L0: {
            L1: {
              wb.field_c = u.field_d;
              if (param0 == 406) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            cf.field_e = cf.field_e + 1;
            gb.field_j = le.field_f;
            ad.field_m = c.field_J;
            ne.field_d = pe.field_n;
            pe.field_n = false;
            hg.field_F = SolKnight.field_G;
            db.field_o = ug.field_a;
            s.field_gb = wd.field_d;
            SolKnight.field_G = 0;
            break L0;
          }
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_g = null;
        int var1 = -126;
    }

    jh(int param0) {
        int var2 = 0;
        ec var3 = null;
        ((jh) this).field_d = new ec[param0];
        ((jh) this).field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            ec dupTemp$0 = new ec();
            var3 = dupTemp$0;
            ((jh) this).field_d[var2] = dupTemp$0;
            var3.field_i = var3;
            var3.field_k = var3;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        var3 = ad.field_h;
        if (var3 < 5) {
          L0: {
            var2 = var3 * var3 * 8192 / 1100;
            var4 = 1;
            var5 = 0;
            if (param1 != 1) {
              break L0;
            } else {
              var5 = 1;
              break L0;
            }
          }
          L1: {
            if (param1 == 3) {
              var4 = -1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 == 4) {
              var4 = 1;
              var5 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param1 == 5) {
              var5 = 1;
              var4 = -1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param1 == 6) {
              var5 = -1;
              var4 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (param1 == 7) {
                break L6;
              } else {
                if (param1 == 8) {
                  break L6;
                } else {
                  break L5;
                }
              }
            }
            var5 = -1;
            var4 = -1;
            break L5;
          }
          L7: {
            if (11 == param1) {
              var4 = -1;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (12 == param1) {
              var4 = -1;
              var5 = -1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (param1 == 13) {
              var4 = 1;
              var5 = -1;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 == 14) {
              var4 = -1;
              var5 = 1;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (param1 != 15) {
              break L11;
            } else {
              var4 = 1;
              var5 = 1;
              break L11;
            }
          }
          qf.field_e = pk.a(var2 * var4, false, var5 * var2);
          return;
        } else {
          if (var3 < 105) {
            L12: {
              var2 = (-40960 + var3 * 16384) / 220;
              var4 = 1;
              var5 = 0;
              if (param1 != 1) {
                break L12;
              } else {
                var5 = 1;
                break L12;
              }
            }
            L13: {
              if (param1 == 3) {
                var4 = -1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (param1 == 4) {
                var4 = 1;
                var5 = 1;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (param1 == 5) {
                var5 = 1;
                var4 = -1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1 == 6) {
                var5 = -1;
                var4 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              L18: {
                if (param1 == 7) {
                  break L18;
                } else {
                  if (param1 == 8) {
                    break L18;
                  } else {
                    break L17;
                  }
                }
              }
              var5 = -1;
              var4 = -1;
              break L17;
            }
            L19: {
              if (11 == param1) {
                var4 = -1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (12 == param1) {
                var4 = -1;
                var5 = -1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param1 == 13) {
                var4 = 1;
                var5 = -1;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param1 == 14) {
                var4 = -1;
                var5 = 1;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (param1 != 15) {
                break L23;
              } else {
                var4 = 1;
                var5 = 1;
                break L23;
              }
            }
            qf.field_e = pk.a(var2 * var4, false, var5 * var2);
            return;
          } else {
            if (var3 < 120) {
              L24: {
                var3 = 120 - var3;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                var4 = 1;
                var5 = 0;
                if (param1 != 1) {
                  break L24;
                } else {
                  var5 = 1;
                  break L24;
                }
              }
              L25: {
                if (param1 == 3) {
                  var4 = -1;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (param1 == 4) {
                  var4 = 1;
                  var5 = 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param1 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param1 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L28;
                } else {
                  break L28;
                }
              }
              if (param1 != 7) {
                if (param1 != 8) {
                  L29: {
                    if (11 == param1) {
                      var4 = -1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (12 == param1) {
                      var4 = -1;
                      var5 = -1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 == 13) {
                      var4 = 1;
                      var5 = -1;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if (param1 == 14) {
                      var4 = -1;
                      var5 = 1;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L33: {
                    if (param1 != 15) {
                      break L33;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L33;
                    }
                  }
                  qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                  return;
                } else {
                  L34: {
                    var5 = -1;
                    var4 = -1;
                    if (11 == param1) {
                      var4 = -1;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (12 == param1) {
                      var4 = -1;
                      var5 = -1;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (param1 == 13) {
                      var4 = 1;
                      var5 = -1;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (param1 == 14) {
                      var4 = -1;
                      var5 = 1;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    if (param1 != 15) {
                      break L38;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L38;
                    }
                  }
                  qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                  return;
                }
              } else {
                L39: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param1) {
                    var4 = -1;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (12 == param1) {
                    var4 = -1;
                    var5 = -1;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (param1 == 13) {
                    var4 = 1;
                    var5 = -1;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (param1 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (param1 != 15) {
                    break L43;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L43;
                  }
                }
                qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                return;
              }
            } else {
              L44: {
                var4 = 1;
                var5 = 0;
                if (param1 != 1) {
                  break L44;
                } else {
                  var5 = 1;
                  break L44;
                }
              }
              L45: {
                if (param1 == 3) {
                  var4 = -1;
                  break L45;
                } else {
                  break L45;
                }
              }
              L46: {
                if (param1 == 4) {
                  var4 = 1;
                  var5 = 1;
                  break L46;
                } else {
                  break L46;
                }
              }
              L47: {
                if (param1 == 5) {
                  var5 = 1;
                  var4 = -1;
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (param1 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L48;
                } else {
                  break L48;
                }
              }
              if (param1 != 7) {
                if (param1 != 8) {
                  L49: {
                    if (11 == param1) {
                      var4 = -1;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  L50: {
                    if (12 == param1) {
                      var4 = -1;
                      var5 = -1;
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  L51: {
                    if (param1 == 13) {
                      var4 = 1;
                      var5 = -1;
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == 14) {
                      var4 = -1;
                      var5 = 1;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  L53: {
                    if (param1 != 15) {
                      break L53;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L53;
                    }
                  }
                  qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                  return;
                } else {
                  L54: {
                    var5 = -1;
                    var4 = -1;
                    if (11 == param1) {
                      var4 = -1;
                      break L54;
                    } else {
                      break L54;
                    }
                  }
                  L55: {
                    if (12 == param1) {
                      var4 = -1;
                      var5 = -1;
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                  L56: {
                    if (param1 == 13) {
                      var4 = 1;
                      var5 = -1;
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                  L57: {
                    if (param1 == 14) {
                      var4 = -1;
                      var5 = 1;
                      break L57;
                    } else {
                      break L57;
                    }
                  }
                  L58: {
                    if (param1 != 15) {
                      break L58;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L58;
                    }
                  }
                  qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                  return;
                }
              } else {
                L59: {
                  var5 = -1;
                  var4 = -1;
                  if (11 == param1) {
                    var4 = -1;
                    break L59;
                  } else {
                    break L59;
                  }
                }
                L60: {
                  if (12 == param1) {
                    var4 = -1;
                    var5 = -1;
                    break L60;
                  } else {
                    break L60;
                  }
                }
                L61: {
                  if (param1 == 13) {
                    var4 = 1;
                    var5 = -1;
                    break L61;
                  } else {
                    break L61;
                  }
                }
                L62: {
                  if (param1 == 14) {
                    var4 = -1;
                    var5 = 1;
                    break L62;
                  } else {
                    break L62;
                  }
                }
                L63: {
                  if (param1 != 15) {
                    break L63;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L63;
                  }
                }
                qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                return;
              }
            }
          }
        }
    }

    static {
    }
}
