/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej {
    private int field_a;
    static int field_m;
    static String field_f;
    private byte[] field_k;
    private int field_b;
    private long field_g;
    private ra field_c;
    private long field_h;
    static String field_j;
    private long field_d;
    private long field_l;
    private long field_n;
    private long field_i;
    private byte[] field_o;
    static int field_e;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (((long)param1 + this.field_d ^ -1L) < (this.field_h ^ -1L)) {
                    this.field_h = this.field_d - -(long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0L == (this.field_n ^ -1L)) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_n > this.field_d) {
                        break L4;
                      } else {
                        if (this.field_n + (long)this.field_b < this.field_d) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.e(-117);
                    break L3;
                  }
                }
                L5: {
                  if (0L == (this.field_n ^ -1L)) {
                    break L5;
                  } else {
                    if (this.field_d - -(long)param1 <= (long)this.field_o.length + this.field_n) {
                      break L5;
                    } else {
                      var5_int = (int)((long)this.field_o.length - -this.field_n - this.field_d);
                      ps.a(param3, param2, this.field_o, (int)(-this.field_n + this.field_d), var5_int);
                      this.field_d = this.field_d + (long)var5_int;
                      param1 = param1 - var5_int;
                      param2 = param2 + var5_int;
                      this.field_b = this.field_o.length;
                      this.e(-117);
                      break L5;
                    }
                  }
                }
                var5_int = -125 % ((32 - param0) / 43);
                if ((this.field_o.length ^ -1) <= (param1 ^ -1)) {
                  if (-1 <= (param1 ^ -1)) {
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    L6: {
                      if (-1L != this.field_n) {
                        break L6;
                      } else {
                        this.field_n = this.field_d;
                        break L6;
                      }
                    }
                    L7: {
                      ps.a(param3, param2, this.field_o, (int)(-this.field_n + this.field_d), param1);
                      this.field_d = this.field_d + (long)param1;
                      if ((long)this.field_b < this.field_d + -this.field_n) {
                        this.field_b = (int)(-this.field_n + this.field_d);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  L8: {
                    if (this.field_g != this.field_d) {
                      this.field_c.a(this.field_d, (byte) 59);
                      this.field_g = this.field_d;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    this.field_c.a(param3, param1, (byte) 11, param2);
                    this.field_g = this.field_g + (long)param1;
                    if ((this.field_g ^ -1L) >= (this.field_l ^ -1L)) {
                      break L9;
                    } else {
                      this.field_l = this.field_g;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var6 = -1L;
                      if ((this.field_d ^ -1L) > (this.field_i ^ -1L)) {
                        break L11;
                      } else {
                        if (this.field_d >= this.field_i - -(long)this.field_a) {
                          break L11;
                        } else {
                          var6 = this.field_d;
                          if (var11 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if ((this.field_i ^ -1L) > (this.field_d ^ -1L)) {
                      break L10;
                    } else {
                      if (this.field_i >= this.field_d - -(long)param1) {
                        break L10;
                      } else {
                        var6 = this.field_i;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    L13: {
                      L14: {
                        var8 = -1L;
                        if (this.field_d + (long)param1 <= this.field_i) {
                          break L14;
                        } else {
                          if ((long)this.field_a + this.field_i >= this.field_d + (long)param1) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (this.field_i - -(long)this.field_a <= this.field_d) {
                        break L12;
                      } else {
                        if ((this.field_d + (long)param1 ^ -1L) <= ((long)this.field_a + this.field_i ^ -1L)) {
                          var8 = (long)this.field_a + this.field_i;
                          if (var11 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    var8 = (long)param1 + this.field_d;
                    break L12;
                  }
                  L15: {
                    if (0L <= (var6 ^ -1L)) {
                      break L15;
                    } else {
                      if (var6 < var8) {
                        var10 = (int)(var8 + -var6);
                        ps.a(param3, (int)(var6 + (long)param2 - this.field_d), this.field_k, (int)(var6 + -this.field_i), var10);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  this.field_d = this.field_d + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_g = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var5_ref);

            stackIn_82_1 = new StringBuilder().append("ej.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L16;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L16;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_f = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ej.C(" + param0 + ')');
        }
    }

    private final void a(int param0) throws IOException {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_a = 0;
              if ((this.field_d ^ -1L) == (this.field_g ^ -1L)) {
                break L1;
              } else {
                this.field_c.a(this.field_d, (byte) 98);
                this.field_g = this.field_d;
                break L1;
              }
            }
            if (param0 < -107) {
              this.field_i = this.field_d;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((this.field_k.length ^ -1) >= (this.field_a ^ -1)) {
                      break L4;
                    } else {
                      var2_int = this.field_k.length - this.field_a;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if ((var2_int ^ -1) >= -200000001) {
                            break L5;
                          } else {
                            var2_int = 200000000;
                            break L5;
                          }
                        }
                        var3 = this.field_c.a(var2_int, this.field_a, 0, this.field_k);
                        if ((var3 ^ -1) == 0) {
                          break L4;
                        } else {
                          this.field_a = this.field_a + var3;
                          this.field_g = this.field_g + (long)var3;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ej.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        hd var1 = null;
        int var2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (cb.field_h == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var1 = (hd) ((Object) cb.field_h.d(0));
                if (var1 != null) {
                  L2: {
                    fieldTemp$1 = var1.field_h + 1;
                    var1.field_h = var1.field_h + 1;
                    if (-301 != (fieldTemp$1 ^ -1)) {
                      break L2;
                    } else {
                      ra.field_e = ra.field_e + (float)var1.field_i.field_w;
                      var1.b((byte) -63);
                      break L2;
                    }
                  }
                  var1 = (hd) ((Object) cb.field_h.a((byte) -71));
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var1) {
                      break L5;
                    } else {
                      fieldTemp$2 = var1.field_h + 1;
                      var1.field_h = var1.field_h + 1;
                      stackIn_20_0 = fieldTemp$2;

                      stackIn_20_1 = 75;

                      if (var2 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_20_0 <= stackIn_20_1) {
                            break L6;
                          } else {
                            var1.field_h = 75;
                            break L6;
                          }
                        }
                        var1 = (hd) ((Object) cb.field_h.a((byte) -71));
                        if (var2 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackIn_20_0 = param0;
                  stackIn_20_1 = -126;
                  break L4;
                }
                L7: {
                  if (stackIn_20_0 <= stackIn_20_1) {
                    break L7;
                  } else {
                    field_m = 62;
                    break L7;
                  }
                }
                L8: {
                  if (0.0f < ra.field_e) {
                    ra.field_e = ra.field_e * 0.8999999761581421f;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ej.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.length >= param0 + param3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param0));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0L == (this.field_n ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_d < this.field_n) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((long)this.field_b + this.field_n ^ -1L) > (this.field_d + (long)param0 ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ps.a(this.field_o, (int)(-this.field_n + this.field_d), param1, param3, param0);
                        this.field_d = this.field_d + (long)param0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var5_long = this.field_d;
                        var7 = param3;
                        var8 = param0;
                        if (this.field_i > this.field_d) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((long)this.field_a + this.field_i <= this.field_d) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = (int)((long)this.field_a + (-this.field_d + this.field_i));
                        if ((param0 ^ -1) <= (var9 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = param0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ps.a(this.field_k, (int)(this.field_d + -this.field_i), param1, param3, var9);
                        this.field_d = this.field_d + (long)var9;
                        param0 = param0 - var9;
                        param3 = param3 + var9;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = 87 % ((param2 - 2) / 39);
                        if (param0 > this.field_k.length) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 38;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.a(-110);
                        var10_int = param0;
                        if (var10_int <= this.field_a) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10_int = this.field_a;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ps.a(this.field_k, 0, param1, param3, var10_int);
                        this.field_d = this.field_d + (long)var10_int;
                        param0 = param0 - var10_int;
                        param3 = param3 + var10_int;
                        if (var15 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_c.a(this.field_d, (byte) 108);
                        this.field_g = this.field_d;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10_int = this.field_c.a(param0, param3, 0, param1);
                        stackIn_91_0 = 0;
                        stackIn_31_0 = stackIn_91_0;
                        stackIn_91_1 = var10_int ^ -1;
                        stackIn_31_1 = stackIn_91_1;
                        if (var15 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var15 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        param0 = param0 - var10_int;
                        this.field_g = this.field_g + (long)var10_int;
                        this.field_d = this.field_d + (long)var10_int;
                        param3 = param3 + var10_int;
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (this.field_n == -1L) {
                            statePc = 88;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (this.field_n <= this.field_d) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((param0 ^ -1) < -1) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = ((Object) stateCaught_43 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10_int = (int)(-this.field_d + this.field_n) + param3;
                        if ((param0 + param3 ^ -1) <= (var10_int ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = ((Object) stateCaught_47 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10_int = param0 + param3;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = ((Object) stateCaught_48 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var10_int <= param3) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = ((Object) stateCaught_49 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param0--;
                        incrementValue$0 = param3;
                        param3++;
                        param1[incrementValue$0] = (byte) 0;
                        this.field_d = this.field_d + 1L;
                        if (var15 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var15 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10 = -1L;
                        if (this.field_n < var5_long) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (this.field_n >= var5_long + (long)var8) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10 = this.field_n;
                        if (var15 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((this.field_n ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 68;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = ((Object) stateCaught_59 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = ((Object) stateCaught_60 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (((long)this.field_b + this.field_n ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = ((Object) stateCaught_62 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = ((Object) stateCaught_63 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = ((Object) stateCaught_65 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10 = var5_long;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = ((Object) stateCaught_67 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12 = -1L;
                        if (((long)this.field_b + this.field_n ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = ((Object) stateCaught_68 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (this.field_n - -(long)this.field_b <= (long)var8 + var5_long) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = ((Object) stateCaught_69 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = ((Object) stateCaught_70 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((this.field_n ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 80;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = ((Object) stateCaught_72 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = ((Object) stateCaught_73 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((long)var8 + var5_long > this.field_n + (long)this.field_b) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = ((Object) stateCaught_75 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = ((Object) stateCaught_76 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12 = var5_long - -(long)var8;
                        if (var15 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = ((Object) stateCaught_78 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var12 = this.field_n + (long)this.field_b;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = ((Object) stateCaught_79 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-1L >= var10) {
                            statePc = 88;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = ((Object) stateCaught_80 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((var10 ^ -1L) <= (var12 ^ -1L)) {
                            statePc = 88;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = ((Object) stateCaught_81 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = ((Object) stateCaught_82 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var14 = (int)(var12 - var10);
                        ps.a(this.field_o, (int)(var10 - this.field_n), param1, var7 - -(int)(var10 - var5_long), var14);
                        if (this.field_d < var12) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = ((Object) stateCaught_84 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = ((Object) stateCaught_85 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        param0 = (int)((long)param0 - (var12 + -this.field_d));
                        this.field_d = var12;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = ((Object) stateCaught_87 instanceof IOException ? 89 : 95);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var5 = (IOException) ((Object) caughtException);
                        this.field_g = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_91_0 = param0 ^ -1;
                        stackIn_91_1 = -1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (stackIn_91_0 >= stackIn_91_1) {
                            statePc = 100;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_98_0 = (RuntimeException) (var5_ref);
                    stackIn_96_0 = stackIn_98_0;
                    stackIn_98_1 = new StringBuilder().append("ej.L(").append(param0).append(',');
                    stackIn_96_1 = stackIn_98_1;
                    if (param1 == null) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackIn_99_0 = (RuntimeException) ((Object) stackIn_96_0);
                    stackIn_99_1 = (StringBuilder) ((Object) stackIn_96_1);
                    stackIn_99_2 = "{...}";
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
                    stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
                    stackIn_99_2 = "null";
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    throw r.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 100: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, boolean param1) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              this.a(param0.length, param0, (byte) -83, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ej.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            if (bj.field_K == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                hs.a(bj.field_K, (byte) 9);
                bj.field_K.a(fa.field_W, -17115);
                bj.field_K = null;
                if (null != bh.field_p) {
                  bh.field_p.c(-119);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  field_j = (String) null;
                  break L2;
                }
              }
              tm.field_i.requestFocus();
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ej.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -65) {
                break L1;
              } else {
                this.field_g = -112L;
                break L1;
              }
            }
            stackIn_4_0 = this.field_h;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "ej.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, long param1) throws IOException {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 25 % ((param0 - 26) / 38);
            if (-1L < (param1 ^ -1L)) {
              throw new IOException();
            } else {
              this.field_d = param1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ej.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        try {
            this.e(85);
            int var2_int = 115 % ((param0 - 72) / 44);
            this.field_c.c(10);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ej.I(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        sl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        rk var4 = null;
        aq var5_ref_aq = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = sa.field_a;
                        if (param0 == -523) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2 = var1.j(-78);
                        var3 = var1.j(-127);
                        if ((var2 ^ -1) == -1) {
                            statePc = 27;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1 != var2) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4_int = var1.d((byte) -122);
                        var5_ref_aq = (aq) ((Object) dc.field_E.d(0));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5_ref_aq == null) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_21_0 = var5_ref_aq.field_m;
                        stackIn_10_0 = stackIn_21_0;
                        stackIn_21_1 = var3;
                        stackIn_10_1 = stackIn_21_1;
                        if (var8 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != stackIn_10_1) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var5_ref_aq.field_l ^ -1) == (var4_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5_ref_aq = (aq) ((Object) dc.field_E.a((byte) -71));
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == var5_ref_aq) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = param0;
                        stackIn_21_1 = 611;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        q.g(stackIn_21_0 ^ stackIn_21_1);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        var5_ref_aq.b((byte) -119);
                        if (var8 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        jq.a(-29901, (Throwable) null, "LR1: " + w.a(16738));
                        q.g(-113);
                        if (var8 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4 = (rk) ((Object) na.field_J.d(0));
                        if (var4 == null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        q.g(-108);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        var5 = rr.field_t - var1.field_j;
                        var6 = var4.field_i;
                        if (var5 > var6.length << -128158270) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = var6.length << -1941591678;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var5 ^ -1) >= (var7 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6[var7 >> -774035742] = var6[var7 >> -774035742] + (var1.j(-106) << (we.a(3, var7) << 1022333384));
                        var7++;
                        if (var8 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var8 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var4.b((byte) -86);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw r.a((Throwable) ((Object) var1_ref), "ej.M(" + param0 + ')');
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) throws IOException {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -106 / ((-62 - param0) / 53);
              if (0L != (this.field_n ^ -1L)) {
                L2: {
                  if ((this.field_g ^ -1L) != (this.field_n ^ -1L)) {
                    this.field_c.a(this.field_n, (byte) 33);
                    this.field_g = this.field_n;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  this.field_c.a(this.field_o, this.field_b, (byte) 11, 0);
                  this.field_g = this.field_g + (long)this.field_b;
                  if ((this.field_l ^ -1L) <= (this.field_g ^ -1L)) {
                    break L3;
                  } else {
                    this.field_l = this.field_g;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = -1L;
                    if (this.field_i > this.field_n) {
                      break L5;
                    } else {
                      if (this.field_n >= (long)this.field_a + this.field_i) {
                        break L5;
                      } else {
                        var3 = this.field_n;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (this.field_n > this.field_i) {
                    break L4;
                  } else {
                    if ((this.field_n + (long)this.field_b ^ -1L) >= (this.field_i ^ -1L)) {
                      break L4;
                    } else {
                      var3 = this.field_i;
                      break L4;
                    }
                  }
                }
                L6: {
                  L7: {
                    var5 = -1L;
                    if ((this.field_i ^ -1L) <= (this.field_n - -(long)this.field_b ^ -1L)) {
                      break L7;
                    } else {
                      if ((this.field_i - -(long)this.field_a ^ -1L) > (this.field_n - -(long)this.field_b ^ -1L)) {
                        break L7;
                      } else {
                        var5 = (long)this.field_b + this.field_n;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (((long)this.field_a + this.field_i ^ -1L) >= (this.field_n ^ -1L)) {
                    break L6;
                  } else {
                    if (((long)this.field_b + this.field_n ^ -1L) > (this.field_i - -(long)this.field_a ^ -1L)) {
                      break L6;
                    } else {
                      var5 = this.field_i - -(long)this.field_a;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (-1L >= var3) {
                    break L8;
                  } else {
                    if ((var5 ^ -1L) >= (var3 ^ -1L)) {
                      break L8;
                    } else {
                      var7 = (int)(var5 + -var3);
                      ps.a(this.field_o, (int)(-this.field_n + var3), this.field_k, (int)(var3 - this.field_i), var7);
                      break L8;
                    }
                  }
                }
                this.field_b = 0;
                this.field_n = -1L;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "ej.D(" + param0 + ')');
        }
    }

    ej(ra param0, int param1, int param2) throws IOException {
        long dupTemp$2 = 0L;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_b = 0;
        this.field_i = -1L;
        this.field_n = -1L;
        try {
          L0: {
            this.field_c = param0;
            dupTemp$2 = param0.b(3);
            this.field_l = dupTemp$2;
            this.field_h = dupTemp$2;
            this.field_o = new byte[param2];
            this.field_k = new byte[param1];
            this.field_d = 0L;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ej.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, sr param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        boolean stackOut_9_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = rj.c(param0 ^ -85, (param4 - param3) * 3);
                        var6 = 3 * param3;
                        ah.g((byte) 111);
                        var7 = -10 + var5_int;
                        if ((param2.field_o ^ -1) >= -1) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param2.field_p) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        mf.e(param0 ^ -97);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qj.field_e = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var8 ^ -1) <= (param2.field_u ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param2.field_s[var8];
                        var10 = param2.field_i[var8];
                        var11 = param2.field_B[var8];
                        stackOut_9_0 = param1;
                        stackIn_41_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = ul.field_Cb[var9];
                        var13 = he.field_i[var9];
                        var14 = -var12 + ul.field_Cb[var10];
                        var15 = -var12 + ul.field_Cb[var11];
                        var16 = he.field_i[var10] - var13;
                        var17 = -var13 + he.field_i[var11];
                        if (-1 >= (var17 * var14 + -(var16 * var15) ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = no.field_c[var9];
                        if (2147483647 == (var12 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13 = no.field_c[var10];
                        if ((var13 ^ -1) == 2147483647) {
                            statePc = 39;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var14 = no.field_c[var11];
                        if (var14 == -2147483648) {
                            statePc = 39;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var15 = var13 + var12 - (-var14 - -var6);
                        if (var7 >= 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_21_0 = var15 << -var7;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var15 >> var7;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var16 = -stackIn_21_0 + -1 + gd.field_b.length;
                        var17 = gd.field_b[var16];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-1 == (var17 >> 207627044 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var16--;
                        stackIn_32_0 = var16;
                        stackIn_24_0 = stackIn_32_0;
                        if (var19 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= 0) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var17 = gd.field_b[var16];
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = (var16 << -930331132) - -var17;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18 = stackIn_32_0;
                        jl.field_M[var18] = var8;
                        gd.field_b[var16] = var17 - -1;
                        if (-1 <= (param2.field_o ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param2.field_p == null) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        dupTemp$0 = param2.field_p[var8];
                        uo.field_h[dupTemp$0] = uo.field_h[dupTemp$0] + 1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        qj.field_e = qj.field_e + 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = param2.field_o ^ -1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 >= -1) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param2.field_p == null) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (uo.field_h.length <= var9) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10 = uo.field_h[var9];
                        uo.field_h[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var19 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (param0 == -27) {
                            statePc = 60;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        field_j = (String) null;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_58_0 = (RuntimeException) (var5);
                    stackIn_56_0 = stackIn_58_0;
                    stackIn_58_1 = new StringBuilder().append("ej.H(").append(param0).append(',').append(param1).append(',');
                    stackIn_56_1 = stackIn_58_1;
                    if (param2 == null) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_59_2 = "{...}";
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_59_2 = "null";
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    throw r.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = "Reject <%0> from this game";
        field_j = ".";
        field_e = -1;
    }
}
