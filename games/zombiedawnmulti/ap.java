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
            IOException var3 = null;
            Exception var4 = null;
            k stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            k stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            k stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            k stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            k stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            k stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_j = 0;
                    stackOut_3_0 = this.field_b;
                    stackOut_3_1 = 122;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param0) {
                      stackOut_5_0 = (k) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (k) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
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
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                  L2: {
                    L3: {
                      if (7 <= var9) {
                        break L3;
                      } else {
                        oo.g(var9, var9 + 1, 14 + -(var9 << -1210809887), 16777215);
                        var9++;
                        if (var10 != 0) {
                          break L2;
                        } else {
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    oo.a(var17, var6, var7);
                    tl.field_t = eh.a(false, tg.field_d, bb.field_k, kb.field_x, var5);
                    rp.field_l.field_Cb = new th();
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("ap.M(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
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
            IOException var2 = null;
            long var2_long = 0L;
            tn var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
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
            int stackIn_29_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_105_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_28_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_104_0 = 0;
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
                  var2_ref = (tn) ((Object) this.field_g.c((byte) 111));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_b.field_j = 0;
                          this.field_b.a(-112, 1);
                          this.field_b.b(var2_ref.field_l, true);
                          this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                          this.field_j.a(29664, var2_ref);
                          var2_ref = (tn) ((Object) this.field_g.b((byte) 97));
                          if (var16 != 0) {
                            break L6;
                          } else {
                            if (var16 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var2_ref = (tn) ((Object) this.field_c.c((byte) 124));
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_b.field_j = 0;
                          this.field_b.a(-20, 0);
                          this.field_b.b(var2_ref.field_l, true);
                          this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                          this.field_l.a(29664, var2_ref);
                          var2_ref = (tn) ((Object) this.field_c.b((byte) 102));
                          if (var16 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var2_int = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (-101 >= (var2_int ^ -1)) {
                              break L12;
                            } else {
                              var3_int = this.field_q.a(-79);
                              stackOut_28_0 = var3_int;
                              stackIn_105_0 = stackOut_28_0;
                              stackIn_29_0 = stackOut_28_0;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_29_0 >= 0) {
                                  if (0 == var3_int) {
                                    break L12;
                                  } else {
                                    L13: {
                                      L14: {
                                        this.field_d = 0;
                                        var4 = 0;
                                        if (null == this.field_m) {
                                          break L14;
                                        } else {
                                          if (this.field_m.field_D == 0) {
                                            var4 = 1;
                                            if (var16 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var4 = 10;
                                      break L13;
                                    }
                                    L15: {
                                      if ((var4 ^ -1) >= -1) {
                                        L16: {
                                          var5 = this.field_m.field_y.field_m.length - this.field_m.field_B;
                                          var6 = -this.field_m.field_D + 512;
                                          if (var6 <= -this.field_m.field_y.field_j + var5) {
                                            break L16;
                                          } else {
                                            var6 = -this.field_m.field_y.field_j + var5;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var3_int >= var6) {
                                            break L17;
                                          } else {
                                            var6 = var3_int;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          L19: {
                                            this.field_q.a(var6, this.field_m.field_y.field_j, this.field_m.field_y.field_m, 117);
                                            if (0 != this.field_i) {
                                              var7 = 0;
                                              L20: while (true) {
                                                if (var6 <= var7) {
                                                  break L19;
                                                } else {
                                                  this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j] = (byte)vg.a((int) this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j], (int) this.field_i);
                                                  var7++;
                                                  if (var16 != 0) {
                                                    break L18;
                                                  } else {
                                                    continue L20;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L19;
                                            }
                                          }
                                          this.field_m.field_y.field_j = this.field_m.field_y.field_j + var6;
                                          this.field_m.field_D = this.field_m.field_D + var6;
                                          break L18;
                                        }
                                        L21: {
                                          if (this.field_m.field_y.field_j != var5) {
                                            break L21;
                                          } else {
                                            this.field_m.a(-4564);
                                            this.field_m.field_t = false;
                                            this.field_m = null;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        if (-513 == (this.field_m.field_D ^ -1)) {
                                          this.field_m.field_D = 0;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        L22: {
                                          var5 = -this.field_k.field_j + var4;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          L24: {
                                            this.field_q.a(var5, this.field_k.field_j, this.field_k.field_m, 108);
                                            if (this.field_i != 0) {
                                              var6 = 0;
                                              L25: while (true) {
                                                if (var5 <= var6) {
                                                  break L24;
                                                } else {
                                                  this.field_k.field_m[var6 + this.field_k.field_j] = (byte)vg.a((int) this.field_k.field_m[var6 + this.field_k.field_j], (int) this.field_i);
                                                  var6++;
                                                  if (var16 != 0) {
                                                    break L23;
                                                  } else {
                                                    continue L25;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L24;
                                            }
                                          }
                                          this.field_k.field_j = this.field_k.field_j + var5;
                                          break L23;
                                        }
                                        if (var4 > this.field_k.field_j) {
                                          break L15;
                                        } else {
                                          L26: {
                                            if (this.field_m != null) {
                                              break L26;
                                            } else {
                                              L27: {
                                                this.field_k.field_j = 0;
                                                var6 = this.field_k.g(31365);
                                                var7 = this.field_k.i(-1478490344);
                                                var8 = this.field_k.g(31365);
                                                var9 = this.field_k.i(-1478490344);
                                                var10 = 127 & var8;
                                                if ((var8 & 128) == 0) {
                                                  stackOut_53_0 = 0;
                                                  stackIn_54_0 = stackOut_53_0;
                                                  break L27;
                                                } else {
                                                  stackOut_52_0 = 1;
                                                  stackIn_54_0 = stackOut_52_0;
                                                  break L27;
                                                }
                                              }
                                              L28: {
                                                L29: {
                                                  var11 = stackIn_54_0;
                                                  var12 = (long)var7 + ((long)var6 << -827722592);
                                                  var14 = null;
                                                  if (var11 == 0) {
                                                    var14_ref = (tn) ((Object) this.field_j.c((byte) 96));
                                                    L30: while (true) {
                                                      if (var14_ref == null) {
                                                        break L29;
                                                      } else {
                                                        stackOut_64_0 = ((var12 ^ -1L) < (var14_ref.field_l ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_l ^ -1L) ? 0 : 1));
                                                        stackIn_73_0 = stackOut_64_0;
                                                        stackIn_65_0 = stackOut_64_0;
                                                        if (var16 != 0) {
                                                          break L28;
                                                        } else {
                                                          L31: {
                                                            if (stackIn_65_0 != 0) {
                                                              break L31;
                                                            } else {
                                                              if (var16 == 0) {
                                                                break L29;
                                                              } else {
                                                                break L31;
                                                              }
                                                            }
                                                          }
                                                          var14_ref = (tn) ((Object) this.field_j.b((byte) 123));
                                                          if (var16 == 0) {
                                                            continue L30;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var14_ref = (tn) ((Object) this.field_l.c((byte) 110));
                                                    L32: while (true) {
                                                      if (var14_ref == null) {
                                                        break L29;
                                                      } else {
                                                        stackOut_57_0 = ((var14_ref.field_l ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_l ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                        stackIn_73_0 = stackOut_57_0;
                                                        stackIn_58_0 = stackOut_57_0;
                                                        if (var16 != 0) {
                                                          break L28;
                                                        } else {
                                                          L33: {
                                                            if (stackIn_58_0 != 0) {
                                                              break L33;
                                                            } else {
                                                              if (var16 == 0) {
                                                                break L29;
                                                              } else {
                                                                break L33;
                                                              }
                                                            }
                                                          }
                                                          var14_ref = (tn) ((Object) this.field_l.b((byte) 122));
                                                          continue L32;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (var14_ref == null) {
                                                  throw new IOException();
                                                } else {
                                                  stackOut_72_0 = var10 ^ -1;
                                                  stackIn_73_0 = stackOut_72_0;
                                                  break L28;
                                                }
                                              }
                                              L34: {
                                                if (stackIn_73_0 != -1) {
                                                  stackOut_75_0 = 9;
                                                  stackIn_76_0 = stackOut_75_0;
                                                  break L34;
                                                } else {
                                                  stackOut_74_0 = 5;
                                                  stackIn_76_0 = stackOut_74_0;
                                                  break L34;
                                                }
                                              }
                                              var15 = stackIn_76_0;
                                              this.field_m = var14_ref;
                                              this.field_m.field_y = new k(var15 + (var9 + this.field_m.field_B));
                                              this.field_m.field_y.a(125, var10);
                                              this.field_m.field_y.b(42, var9);
                                              this.field_m.field_D = 10;
                                              this.field_k.field_j = 0;
                                              if (var16 == 0) {
                                                break L15;
                                              } else {
                                                break L26;
                                              }
                                            }
                                          }
                                          L35: {
                                            if (-1 == (this.field_m.field_D ^ -1)) {
                                              L36: {
                                                if ((this.field_k.field_m[0] ^ -1) == 0) {
                                                  break L36;
                                                } else {
                                                  this.field_m = null;
                                                  if (var16 == 0) {
                                                    break L15;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              this.field_m.field_D = 1;
                                              this.field_k.field_j = 0;
                                              if (var16 == 0) {
                                                break L15;
                                              } else {
                                                break L35;
                                              }
                                            } else {
                                              break L35;
                                            }
                                          }
                                          throw new IOException();
                                        }
                                      }
                                    }
                                    var2_int++;
                                    if (var16 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                          }
                          var2_int = -121 % ((44 - param0) / 45);
                          stackOut_104_0 = 1;
                          stackIn_105_0 = stackOut_104_0;
                          break L11;
                        }
                        break L4;
                      }
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L37: {
                    this.field_q.c(82);
                    break L37;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L38: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L38;
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
              return stackIn_105_0 != 0;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_3_0 = null;
        sl stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param3 == 4) {
              var5_int = param0.a(param2, (byte) 123);
              var6 = param0.a(param4, var5_int, -1);
              stackOut_3_0 = pm.a(param1, var6, var5_int, param0, -29435);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (sl) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ap.Q(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
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
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            int var4_int = 0;
            tn var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
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
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          var4_ref3 = (tn) ((Object) this.field_j.a(11356));
                          if (var4_ref3 == null) {
                            break L8;
                          } else {
                            this.field_g.a(29664, var4_ref3);
                            if (var6 != 0) {
                              L9: while (true) {
                                if (var4_ref3 == null) {
                                  break L6;
                                } else {
                                  this.field_c.a(29664, var4_ref3);
                                  if (var6 != 0) {
                                    break L5;
                                  } else {
                                    if (var6 == 0) {
                                      var4_ref3 = (tn) ((Object) this.field_l.a(11356));
                                      continue L9;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var6 == 0) {
                                continue L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        L10: while (true) {
                          var4_ref3 = (tn) ((Object) this.field_l.a(11356));
                          if (var4_ref3 == null) {
                            break L6;
                          } else {
                            this.field_c.a(29664, var4_ref3);
                            if (var6 != 0) {
                              break L5;
                            } else {
                              if (var6 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      break L6;
                    }
                    if (0 == this.field_i) {
                      break L5;
                    } else {
                      try {
                        L11: {
                          this.field_b.field_j = 0;
                          this.field_b.a(126, 4);
                          this.field_b.a(125, (int) this.field_i);
                          this.field_b.b(-103, 0);
                          this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                          break L11;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var4_ref = (IOException) (Object) decompiledCaughtException;
                          try {
                            L13: {
                              this.field_q.c(-53);
                              break L13;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            L14: {
                              var5 = (Exception) (Object) decompiledCaughtException;
                              break L14;
                            }
                          }
                          this.field_q = null;
                          this.field_n = this.field_n + 1;
                          this.field_p = -2;
                          break L12;
                        }
                      }
                      break L5;
                    }
                  }
                  var4_int = 12 % ((param2 - 63) / 33);
                  this.field_d = 0;
                  this.field_f = bl.a((byte) 110);
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L15: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) (var4_ref2);
                stackOut_27_1 = new StringBuilder().append("ap.F(").append(param0).append(',');
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param1 == null) {
                  stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L15;
                } else {
                  stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L15;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
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
