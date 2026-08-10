/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends qb {
    static String field_u;
    static boolean field_s;
    static String field_r;
    static ja field_t;
    private ej field_q;

    private final void a(boolean param0, boolean param1) {
        try {
            k stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            k stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            IOException var3 = null;
            Exception var4 = null;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_j = 0;
                    stackIn_5_0 = this.field_b;

                    stackIn_5_1 = 122;

                    if (param0) {
                      stackIn_6_0 = (k) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 2;
                      break L1;
                    } else {
                      stackIn_6_0 = (k) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 3;
                      break L1;
                    }
                  }
                  L2: {
                    ((k) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                    this.field_b.b(0L, param1);
                    this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                    if (param1) {
                      break L2;
                    } else {
                      this.a(false, false);
                      break L2;
                    }
                  }
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_q.c(93);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_n = this.field_n + 1;
                  this.field_q = null;
                  this.field_p = -2;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ul param0, byte param1, fm param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ob var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        Throwable var11 = null;
        Throwable var12 = null;
        fm var13 = null;
        int[] var17 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = p.field_e;
            rp.field_l = new cj(0L, (cj) null);
            var4 = 97 / ((param1 - 46) / 63);
            if (param0 != null) {
              param0.field_j = false;
              param0.field_b = 0;
              ok.field_p = new ig(var3_int, param0, param0);
              bd.field_c = new an(var3_int, param0, param0, new dd());
              var5 = ha.b(false);
              if (var5 == null) {
                var12 = (Throwable) null;
                bd.a("QC2", (Throwable) null, false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                fb.a(var5, (byte) -19);
                var13 = (fm) null;
                tg.field_d = qd.a(1127256, (fm) null, 65793, 1513239, 8947848, 4020342, 65793, (byte) 123, 0, 2245737, 65793, 1513239, 5138823);
                bb.field_k = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 127, 16764006, 0, 0, 0, 0);
                kb.field_x = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 122, 16777215, 0, 0, 0, 0);
                var6 = oo.field_b;
                var7 = oo.field_l;
                var17 = oo.field_i;
                tb.field_v = new ja(10, 14);
                tb.field_v.a();
                var9 = 2;
                L1: while (true) {
                  if (7 <= var9) {
                    oo.a(var17, var6, var7);
                    tl.field_t = eh.a(false, tg.field_d, bb.field_k, kb.field_x, var5);
                    rp.field_l.field_Cb = new th();
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    oo.g(var9, var9 + 1, 14 + -(var9 << -1210809887), 16777215);
                    var9++;
                    continue L1;
                  }
                }
              }
            } else {
              var11 = (Throwable) null;
              bd.a("QC1", (Throwable) null, false);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ap.M(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(byte param0) {
        try {
            int stackIn_49_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            tn var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            tn var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = ZombieDawnMulti.field_E ? 1 : 0;
              if (this.field_q == null) {
                break L0;
              } else {
                L1: {
                  var2_long = bl.a((byte) 115);
                  var4 = (int)(var2_long - this.field_f);
                  if (-201 > (var4 ^ -1)) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_f = var2_long;
                this.field_d = this.field_d + var4;
                if (this.field_d > 30000) {
                  try {
                    L2: {
                      this.field_q.c(99);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_q = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == this.field_q) {
              if (this.a(0) == 0) {
                if (0 == this.d(20)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              try {
                L4: {
                  this.field_q.b(-26844);
                  var2 = (tn) ((Object) this.field_g.c((byte) 111));
                  L5: while (true) {
                    if (var2 == null) {
                      var2 = (tn) ((Object) this.field_c.c((byte) 124));
                      L6: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (-101 >= (var2_int ^ -1)) {
                                break L8;
                              } else {
                                var3_int = this.field_q.a(-79);
                                if (var3_int >= 0) {
                                  if (0 == var3_int) {
                                    break L8;
                                  } else {
                                    L9: {
                                      this.field_d = 0;
                                      var4 = 0;
                                      if (null == this.field_m) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (this.field_m.field_D == 0) {
                                          var4 = 1;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if ((var4 ^ -1) >= -1) {
                                        L11: {
                                          var5 = this.field_m.field_y.field_m.length - this.field_m.field_B;
                                          var6 = -this.field_m.field_D + 512;
                                          if (var6 <= -this.field_m.field_y.field_j + var5) {
                                            break L11;
                                          } else {
                                            var6 = -this.field_m.field_y.field_j + var5;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var3_int >= var6) {
                                            break L12;
                                          } else {
                                            var6 = var3_int;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          this.field_q.a(var6, this.field_m.field_y.field_j, this.field_m.field_y.field_m, 117);
                                          if (0 != this.field_i) {
                                            var7 = 0;
                                            L14: while (true) {
                                              if (var6 <= var7) {
                                                break L13;
                                              } else {
                                                this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j] = (byte)vg.a((int) this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j], (int) this.field_i);
                                                var7++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        this.field_m.field_y.field_j = this.field_m.field_y.field_j + var6;
                                        this.field_m.field_D = this.field_m.field_D + var6;
                                        if (this.field_m.field_y.field_j != var5) {
                                          if (-513 == (this.field_m.field_D ^ -1)) {
                                            this.field_m.field_D = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          this.field_m.a(-4564);
                                          this.field_m.field_t = false;
                                          this.field_m = null;
                                          break L10;
                                        }
                                      } else {
                                        L15: {
                                          var5 = -this.field_k.field_j + var4;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          this.field_q.a(var5, this.field_k.field_j, this.field_k.field_m, 108);
                                          if (this.field_i != 0) {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var5 <= var6) {
                                                break L16;
                                              } else {
                                                this.field_k.field_m[var6 + this.field_k.field_j] = (byte)vg.a((int) this.field_k.field_m[var6 + this.field_k.field_j], (int) this.field_i);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                        this.field_k.field_j = this.field_k.field_j + var5;
                                        if (var4 <= this.field_k.field_j) {
                                          if (this.field_m != null) {
                                            if (-1 == (this.field_m.field_D ^ -1)) {
                                              if ((this.field_k.field_m[0] ^ -1) == 0) {
                                                this.field_m.field_D = 1;
                                                this.field_k.field_j = 0;
                                                break L10;
                                              } else {
                                                this.field_m = null;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L18: {
                                              this.field_k.field_j = 0;
                                              var6 = this.field_k.g(31365);
                                              var7 = this.field_k.i(-1478490344);
                                              var8 = this.field_k.g(31365);
                                              var9 = this.field_k.i(-1478490344);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackIn_49_0 = 0;
                                                break L18;
                                              } else {
                                                stackIn_49_0 = 1;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_49_0;
                                              var12 = (long)var7 + ((long)var6 << -827722592);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (tn) ((Object) this.field_j.c((byte) 96));
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if ((var12 ^ -1L) != (var14_ref.field_l ^ -1L)) {
                                                      var14_ref = (tn) ((Object) this.field_j.b((byte) 123));
                                                      continue L20;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (tn) ((Object) this.field_l.c((byte) 110));
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if ((var14_ref.field_l ^ -1L) != (var12 ^ -1L)) {
                                                      var14_ref = (tn) ((Object) this.field_l.b((byte) 122));
                                                      continue L21;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L22: {
                                                if (var10 != 0) {
                                                  stackIn_66_0 = 9;
                                                  break L22;
                                                } else {
                                                  stackIn_66_0 = 5;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              this.field_m = var14_ref;
                                              this.field_m.field_y = new k(var15 + (var9 + this.field_m.field_B));
                                              this.field_m.field_y.a(125, var10);
                                              this.field_m.field_y.b(42, var9);
                                              this.field_m.field_D = 10;
                                              this.field_k.field_j = 0;
                                              break L10;
                                            }
                                          }
                                        } else {
                                          var2_int++;
                                          continue L7;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            var2_int = -121 % ((44 - param0) / 45);
                            stackIn_89_0 = 1;
                            break L4;
                          }
                        } else {
                          this.field_b.field_j = 0;
                          this.field_b.a(-20, 0);
                          this.field_b.b(var2.field_l, true);
                          this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                          this.field_l.a(29664, var2);
                          var2 = (tn) ((Object) this.field_c.b((byte) 102));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_b.field_j = 0;
                      this.field_b.a(-112, 1);
                      this.field_b.b(var2.field_l, true);
                      this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                      this.field_j.a(29664, var2);
                      var2 = (tn) ((Object) this.field_g.b((byte) 97));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_q.c(82);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                this.field_q = null;
                this.field_n = this.field_n + 1;
                this.field_p = -2;
                if (0 == this.a(0)) {
                  if (0 == this.d(20)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_89_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sl a(ul param0, ul param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sl stackIn_2_0 = null;
        sl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 4) {
              var5_int = param0.a(param2, (byte) 123);
              var6 = param0.a(param4, var5_int, -1);
              stackIn_4_0 = pm.a(param1, var6, var5_int, param0, -29435);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ap.Q(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_b.field_j = param0;
                  this.field_b.a(124, 6);
                  this.field_b.d(3, -8593);
                  this.field_b.a(0, (byte) -55);
                  this.field_q.a(0, param0 + -100, this.field_b.field_m.length, this.field_b.field_m);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_q.c(116);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_p = -2;
                  this.field_q = null;
                  this.field_n = this.field_n + 1;
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ap() {
    }

    final void a(byte param0) {
        try {
            int var2_int = 0 / ((param0 - 53) / 41);
            this.field_q.c(-101);
        } catch (Exception exception) {
        }
        this.field_n = this.field_n + 1;
        this.field_p = -1;
        this.field_q = null;
        this.field_i = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final void f(int param0) {
        if (param0 != 31) {
            this.a(false, true);
        }
        if (!(this.field_q == null)) {
            this.field_q.c(88);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            tn var4_ref = null;
            IOException var4_ref2 = null;
            int var4_int = 0;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_q != null) {
                    try {
                      L2: {
                        this.field_q.c(-90);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_q = (ej) (param1);
                this.g(0);
                this.a(param0, true);
                this.field_m = null;
                this.field_k.field_j = 0;
                L4: while (true) {
                  var4_ref = (tn) ((Object) this.field_j.a(11356));
                  if (var4_ref == null) {
                    L5: while (true) {
                      var4_ref = (tn) ((Object) this.field_l.a(11356));
                      if (var4_ref == null) {
                        L6: {
                          if (0 == this.field_i) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_b.field_j = 0;
                                this.field_b.a(126, 4);
                                this.field_b.a(125, (int) this.field_i);
                                this.field_b.b(-103, 0);
                                this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_q.c(-53);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_q = null;
                                this.field_n = this.field_n + 1;
                                this.field_p = -2;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        var4_int = 12 % ((param2 - 63) / 33);
                        this.field_d = 0;
                        this.field_f = bl.a((byte) 110);
                        break L0;
                      } else {
                        this.field_c.a(29664, var4_ref);
                        continue L5;
                      }
                    }
                  } else {
                    this.field_g.a(29664, var4_ref);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_24_0 = (RuntimeException) (var4_ref3);

                stackIn_24_1 = new StringBuilder().append("ap.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "null";
                  break L11;
                } else {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "{...}";
                  break L11;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        if (param0 != 16682) {
            field_s = false;
        }
        field_r = null;
        field_u = null;
        field_t = null;
    }

    static {
        field_s = false;
        field_u = "Spectate";
        field_r = "<%0> has not yet unlocked this option for use.";
    }
}
