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
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2_int = 0;
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        wb.field_a = ad.field_b.b(te.field_I[12]);
                        var1_int = ad.field_b.b(te.field_I[13]);
                        if (var1_int > wb.field_a) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        wb.field_a = var1_int;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fj.a(32, new int[]{0, 3, 12, 13, 4, 2, 14, 11}, 460, (byte) -127, 150, 0, 180);
                        fj.a(32, new int[]{1, 12, 13, 3, 7}, 288, (byte) 95, 155, 1, 50);
                        fj.a(37, new int[]{15, 5}, 440, (byte) 23, 0, 2, 200);
                        fj.a(37, new int[]{15, 5}, 512, (byte) -128, 406, 3, 260);
                        fj.a(37, new int[]{6}, 468, (byte) 1, 430, 4, 30);
                        fj.a(37, new int[]{17}, 440, (byte) -128, 370, 5, 200);
                        fj.a(37, new int[]{18}, 440, (byte) -127, 200, 6, 200);
                        fj.a(37, new int[]{2, 5}, 498, (byte) -127, 400, 7, 260);
                        fj.a(28, new int[]{15, 16}, 446, (byte) 98, 200, 8, 194);
                        fj.a(28, new int[]{19, 5}, 288, (byte) -128, 400, 9, 50);
                        var2_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (gg.field_f.length <= var2_int) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        gg.field_f[var2_int] = false;
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == -1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_b = (o) null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        gg.field_f[1] = true;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2 = gg.field_f;
                        var2[0] = true;
                        var3 = ad.field_b.field_s + (ad.field_b.field_m + 4);
                        ah.field_i[8] = ad.field_b.field_s + dd.field_b - (-ad.field_b.field_F - var3);
                        si.field_F[8] = 37 - -(var3 * 2);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) runtimeException), "jh.H(" + param0 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        gb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new gb(param0);
              if (param1 == 6) {
                break L1;
              } else {
                field_b = (o) null;
                break L1;
              }
            }
            L2: {
              var3 = var9.j(param1 + 249);
              var4 = var9.e(true);
              if (-1 < (var4 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (0 == jb.field_f) {
                    break L3;
                  } else {
                    if (var4 <= jb.field_f) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var9.e(true);
                    if (-1 < (var5 ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == (jb.field_f ^ -1)) {
                          break L5;
                        } else {
                          if (jb.field_f < var5) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          var13 = new byte[var5];
                          var11 = var13;
                          var6 = var11;
                          if (-2 != (var3 ^ -1)) {
                            break L7;
                          } else {
                            gi.a(var13, var5, param0, var4, 9);
                            if (!SolKnight.field_L) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7 = g.field_k;
                        synchronized (var7) {
                          L8: {
                            g.field_k.a((byte) 97, var9, var13);
                            break L8;
                          }
                        }
                        break L6;
                      }
                      stackIn_24_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(var4, 0, -123, var12);
                  stackIn_9_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("jh.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_24_0;
        }
    }

    final ec a(byte param0) {
        ec var2;
        ec var3;
        int var4;
        Object stackIn_9_0 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == -9) {
          if (this.field_c != null) {
            var2 = this.field_d[(int)(this.field_e & (long)(-1 + this.field_a))];
            L0: while (true) {
              if (this.field_c != var2) {
                stackIn_9_0 = this;

                if (var4 == 0) {
                  if (((jh) (this)).field_c.field_l != this.field_e) {
                    this.field_c = this.field_c.field_i;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      this.field_c = null;
                      return null;
                    }
                  } else {
                    var3 = this.field_c;
                    this.field_c = this.field_c.field_i;
                    return var3;
                  }
                } else {
                  ((jh) (this)).field_c = null;
                  return null;
                }
              } else {
                this.field_c = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return (ec) null;
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable throwable = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                fd.a(-4476, ia.g(-115), "resizing", new Object[]{new Integer(param0)});
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param1 <= 44) {
              field_g = (mg) null;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ec a(long param0, boolean param1) {
        Object stackIn_7_0 = null;
        Object stackIn_17_0 = null;
        ec var4;
        ec var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        this.field_e = param0;
        if (param1) {
          var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_a))];
          this.field_c = var4.field_i;
          L0: while (true) {
            if (var4 != this.field_c) {
              stackIn_7_0 = this;

              if (var6 == 0) {
                if (((jh) (this)).field_c.field_l == param0) {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_i;
                  return var5;
                } else {
                  this.field_c = this.field_c.field_i;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_c = null;
                    return null;
                  }
                }
              } else {
                ((jh) (this)).field_c = null;
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        } else {
          jh.a(-76, -128);
          var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_a))];
          this.field_c = var4.field_i;
          L1: while (true) {
            if (var4 != this.field_c) {
              stackIn_17_0 = this;

              if (var6 == 0) {
                if (((jh) (this)).field_c.field_l == param0) {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_i;
                  return var5;
                } else {
                  this.field_c = this.field_c.field_i;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_c = null;
                    return null;
                  }
                }
              } else {
                ((jh) (this)).field_c = null;
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        }
    }

    final void a(long param0, byte param1, ec param2) {
        ec var5 = null;
        ec var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
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
              var5 = this.field_d[(int)(param0 & (long)(-1 + this.field_a))];
              param2.field_k = var5.field_k;
              param2.field_i = var5;
              param2.field_k.field_i = param2;
              param2.field_l = param0;
              param2.field_i.field_k = param2;
              if (param1 == -109) {
                break L2;
              } else {
                var6 = (ec) null;
                this.a(-128L, (byte) -79, (ec) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("jh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void b(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ee.field_j;
        synchronized (var1) {
          L0: {
            L1: {
              wb.field_c = u.field_d;
              if (param0 == 406) {
                break L1;
              } else {
                field_g = (mg) null;
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
        int var1 = -126 / ((-14 - param0) / 43);
    }

    jh(int param0) {
        ec dupTemp$1 = null;
        int var2 = 0;
        ec var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    this.field_d = new ec[param0];
                    this.field_a = param0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= param0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$1 = new ec();
                    var3 = dupTemp$1;
                    this.field_d[var2] = dupTemp$1;
                    var3.field_i = var3;
                    var3.field_k = var3;
                    var2++;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        var3 = ad.field_h;
        if (param0 == 126) {
          if (var3 >= 5) {
            if ((var3 ^ -1) <= -106) {
              if (-121 >= (var3 ^ -1)) {
                L0: {
                  var4 = 1;
                  var5 = 0;
                  if (-2 != (param1 ^ -1)) {
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
                  if (-5 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((param1 ^ -1) == -6) {
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
                if (-8 != (param1 ^ -1)) {
                  if (-9 == (param1 ^ -1)) {
                    L5: {
                      var5 = -1;
                      var4 = -1;
                      if (11 == param1) {
                        var4 = -1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (12 == param1) {
                        var4 = -1;
                        var5 = -1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (-14 == (param1 ^ -1)) {
                        var4 = 1;
                        var5 = -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((param1 ^ -1) == -15) {
                        var4 = -1;
                        var5 = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((param1 ^ -1) != -16) {
                        break L9;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L9;
                      }
                    }
                    qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                    return;
                  } else {
                    L10: {
                      if (11 == param1) {
                        var4 = -1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (12 == param1) {
                        var4 = -1;
                        var5 = -1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (-14 == (param1 ^ -1)) {
                        var4 = 1;
                        var5 = -1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if ((param1 ^ -1) == -15) {
                        var4 = -1;
                        var5 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if ((param1 ^ -1) != -16) {
                        break L14;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L14;
                      }
                    }
                    qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                    return;
                  }
                } else {
                  L15: {
                    var5 = -1;
                    var4 = -1;
                    if (11 == param1) {
                      var4 = -1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (12 == param1) {
                      var4 = -1;
                      var5 = -1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-14 == (param1 ^ -1)) {
                      var4 = 1;
                      var5 = -1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((param1 ^ -1) == -15) {
                      var4 = -1;
                      var5 = 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if ((param1 ^ -1) != -16) {
                      break L19;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L19;
                    }
                  }
                  qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                  return;
                }
              } else {
                L20: {
                  var3 = 120 - var3;
                  var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                  if (var6 == 0) {
                    break L20;
                  } else {
                    var2 = (-40960 + var3 * 16384) / 220;
                    var2 = var3 * var3 * 8192 / 1100;
                    break L20;
                  }
                }
                L21: {
                  var4 = 1;
                  var5 = 0;
                  if (-2 != (param1 ^ -1)) {
                    break L21;
                  } else {
                    var5 = 1;
                    break L21;
                  }
                }
                L22: {
                  if (param1 == 3) {
                    var4 = -1;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-5 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((param1 ^ -1) == -6) {
                    var5 = 1;
                    var4 = -1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1 == 6) {
                    var5 = -1;
                    var4 = 1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    if (-8 == (param1 ^ -1)) {
                      break L27;
                    } else {
                      if (-9 == (param1 ^ -1)) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L26;
                }
                L28: {
                  if (11 == param1) {
                    var4 = -1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (12 == param1) {
                    var4 = -1;
                    var5 = -1;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-14 == (param1 ^ -1)) {
                    var4 = 1;
                    var5 = -1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if ((param1 ^ -1) == -15) {
                    var4 = -1;
                    var5 = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if ((param1 ^ -1) != -16) {
                    break L32;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L32;
                  }
                }
                qf.field_e = pk.a(var2 * var4, false, var5 * var2);
                return;
              }
            } else {
              L33: {
                var2 = (-40960 + var3 * 16384) / 220;
                if (var6 == 0) {
                  break L33;
                } else {
                  var2 = var3 * var3 * 8192 / 1100;
                  break L33;
                }
              }
              L34: {
                var4 = 1;
                var5 = 0;
                if (-2 != (param1 ^ -1)) {
                  break L34;
                } else {
                  var5 = 1;
                  break L34;
                }
              }
              L35: {
                if (param1 == 3) {
                  var4 = -1;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (-5 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = 1;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if ((param1 ^ -1) == -6) {
                  var5 = 1;
                  var4 = -1;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (param1 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                L40: {
                  if (-8 == (param1 ^ -1)) {
                    break L40;
                  } else {
                    if (-9 == (param1 ^ -1)) {
                      break L40;
                    } else {
                      break L39;
                    }
                  }
                }
                var5 = -1;
                var4 = -1;
                break L39;
              }
              L41: {
                if (11 == param1) {
                  var4 = -1;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (12 == param1) {
                  var4 = -1;
                  var5 = -1;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (-14 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = -1;
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                if ((param1 ^ -1) == -15) {
                  var4 = -1;
                  var5 = 1;
                  break L44;
                } else {
                  break L44;
                }
              }
              L45: {
                if ((param1 ^ -1) != -16) {
                  break L45;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L45;
                }
              }
              qf.field_e = pk.a(var2 * var4, false, var5 * var2);
              return;
            }
          } else {
            L46: {
              var2 = var3 * var3 * 8192 / 1100;
              var4 = 1;
              var5 = 0;
              if (-2 != (param1 ^ -1)) {
                break L46;
              } else {
                var5 = 1;
                break L46;
              }
            }
            L47: {
              if (param1 == 3) {
                var4 = -1;
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              if (-5 == (param1 ^ -1)) {
                var4 = 1;
                var5 = 1;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if ((param1 ^ -1) == -6) {
                var5 = 1;
                var4 = -1;
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              if (param1 == 6) {
                var5 = -1;
                var4 = 1;
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              L52: {
                if (-8 == (param1 ^ -1)) {
                  break L52;
                } else {
                  if (-9 == (param1 ^ -1)) {
                    break L52;
                  } else {
                    break L51;
                  }
                }
              }
              var5 = -1;
              var4 = -1;
              break L51;
            }
            L53: {
              if (11 == param1) {
                var4 = -1;
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              if (12 == param1) {
                var4 = -1;
                var5 = -1;
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              if (-14 == (param1 ^ -1)) {
                var4 = 1;
                var5 = -1;
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              if ((param1 ^ -1) == -15) {
                var4 = -1;
                var5 = 1;
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              if ((param1 ^ -1) != -16) {
                break L57;
              } else {
                var4 = 1;
                var5 = 1;
                break L57;
              }
            }
            qf.field_e = pk.a(var2 * var4, false, var5 * var2);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
