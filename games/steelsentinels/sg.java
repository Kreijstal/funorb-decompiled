/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg implements Runnable {
    static int field_e;
    static String field_b;
    private InputStream field_m;
    private boolean field_k;
    private byte[] field_p;
    private int field_n;
    static gh field_i;
    private int field_j;
    private java.net.Socket field_d;
    static String field_h;
    static int field_c;
    private OutputStream field_l;
    private int field_g;
    private wj field_o;
    private pn field_a;
    private boolean field_f;

    final void a(boolean param0) throws IOException {
        if (!this.field_f) {
          if (!this.field_k) {
            if (param0) {
              return;
            } else {
              sg.a((byte) -109, '`');
              return;
            }
          } else {
            this.field_k = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final static mg a(gh param0, mn param1, boolean param2, gh param3, gh param4) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        mg stackIn_12_0 = null;
        mg stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        mg[] var11 = null;
        int var12 = 0;
        mn var13_ref_mn = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ao var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (null != param1.field_C) {
                  stackIn_7_0 = param1.field_C.length;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (param1.field_A != null) {
                  stackIn_10_0 = param1.field_A.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              var7 = var6 + var5_int;
              var8 = new String[var7];
              var21 = new char[var7];
              var19 = var21;
              var9 = var19;
              var20 = new int[var7];
              var18 = var20;
              var10 = var18;
              if (!param2) {
                L3: {
                  var11 = new mg[var7];
                  if (param1.field_C != null) {
                    var12 = 0;
                    L4: while (true) {
                      if (param1.field_C.length <= var12) {
                        break L3;
                      } else {
                        var13_ref_mn = cd.field_e.a((byte) -13, param1.field_C[var12]);
                        var8[var12] = var13_ref_mn.field_D;
                        var9[var12] = param1.field_z[var12];
                        var11[var12] = sg.a(param0, var13_ref_mn, false, param3, param4);
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (null != param1.field_A) {
                    var12 = var5_int;
                    var13 = 49;
                    var14 = 0;
                    L6: while (true) {
                      if (param1.field_A.length <= var14) {
                        break L5;
                      } else {
                        L7: {
                          var15 = param1.field_A[var14];
                          if ((var15 ^ -1) == 0) {
                            var8[var14 + var12] = od.field_b;
                            var9[var12 + var14] = param1.field_F[var14];
                            var10[var12 - -var14] = param1.field_A[var14];
                            break L7;
                          } else {
                            L8: {
                              var16 = jl.field_w.a(var15, -118);
                              var8[var14 + var12] = var16.i(1);
                              var9[var14 + var12] = param1.field_F[var14];
                              if (var9[var14 + var12] > 0) {
                                break L8;
                              } else {
                                var13 = (char)(var13 + 1);
                                var9[var12 - -var14] = (char)var13;
                                break L8;
                              }
                            }
                            var10[var14 + var12] = param1.field_A[var14];
                            break L7;
                          }
                        }
                        var14++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_30_0 = new mg(0L, param0, param4, param3, var11, var20, var8, var21);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = (mg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("sg.J(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param4 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L12;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_34_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mg) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_30_0;
          }
        }
    }

    public static void a(byte param0) {
        gh var2;
        field_b = null;
        field_h = null;
        field_i = null;
        if (param0 <= -43) {
          return;
        } else {
          var2 = (gh) null;
          sg.a(30, -23, (gh) null, -70, 104, (gh) null, (byte[]) null, (byte) 72, (gh) null, 102);
          return;
        }
    }

    final void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            int var4 = 0;
            var4 = SteelSentinels.field_G;
            if (!this.field_f) {
              var2 = this;
              synchronized (var2) {
                L0: {
                  this.field_f = true;
                  this.notifyAll();
                  break L0;
                }
              }
              L1: {
                if (param0 == 12110) {
                  break L1;
                } else {
                  this.field_p = (byte[]) null;
                  break L1;
                }
              }
              if (null == this.field_o) {
                this.field_o = null;
                return;
              } else {
                L2: while (true) {
                  if (this.field_o.field_a != 0) {
                    if (-2 != (this.field_o.field_a ^ -1)) {
                      this.field_o = null;
                      return;
                    } else {
                      try {
                        L3: {
                          ((Thread) (this.field_o.field_c)).join();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_o = null;
                        return;
                      }
                      this.field_o = null;
                      return;
                    }
                  } else {
                    a.a((byte) 120, 1L);
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = SteelSentinels.field_G;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_g != this.field_n) {
                          break L3;
                        } else {
                          if (!this.field_f) {
                            try {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                var4 = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        }
                      }
                      L6: {
                        var2 = this.field_n;
                        if (this.field_g < this.field_n) {
                          var1_int = -this.field_n + this.field_j;
                          break L6;
                        } else {
                          var1_int = -this.field_n + this.field_g;
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (this.field_m != null) {
                            this.field_m.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_l != null) {
                            this.field_l.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_d) {
                            break L10;
                          } else {
                            this.field_d.close();
                            break L10;
                          }
                        }
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L11;
                      }
                    }
                    this.field_p = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_l.write(this.field_p, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_k = true;
                          break L13;
                        }
                      }
                      this.field_n = (var1_int + this.field_n) % this.field_j;
                      try {
                        L14: {
                          L15: {
                            if (this.field_g != this.field_n) {
                              break L15;
                            } else {
                              this.field_l.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_k = true;
                          break L16;
                        }
                      }
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                sj.a((String) null, -59, (Throwable) ((Object) var1_ref));
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (!this.field_f) {
              L1: while (true) {
                if (-1 <= (param1 ^ -1)) {
                  if (param3 == -256) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.b(76);
                    return;
                  }
                } else {
                  var5_int = this.field_m.read(param2, param0, param1);
                  if (0 >= var5_int) {
                    throw new EOFException();
                  } else {
                    param0 = param0 + var5_int;
                    param1 = param1 - var5_int;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, gh param2, int param3, int param4, gh param5, byte[] param6, byte param7, gh param8, int param9) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            nb.field_G = -1L;
            wb.field_j = param6;
            gl.field_v = param1;
            be.field_a = param6.length;
            ad.field_f = false;
            rb.field_i = new byte[(gl.field_v - -7) / 8];
            nf.field_b = null;
            ni.field_a = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (wb.field_j.length <= var11) {
                L2: {
                  var10_int = (var10_int - -7) / 8;
                  ti.field_s = new byte[var10_int];
                  if (null != param5.field_M) {
                    break L2;
                  } else {
                    param5.field_M = new ul();
                    break L2;
                  }
                }
                q.field_m = param5.field_M;
                q.field_m.g(6);
                t.field_c = new dk(param0);
                if (param7 < -10) {
                  L3: {
                    ba.field_b = -1;
                    ja.field_a = 0;
                    bj.field_j = 0;
                    ud.field_D = -1;
                    if (null != param8.field_M) {
                      break L3;
                    } else {
                      param8.field_M = new ul();
                      break L3;
                    }
                  }
                  L4: {
                    ci.field_e = param8.field_M;
                    ci.field_e.g(6);
                    fm.field_a = new dk(param3);
                    if (param2.field_M != null) {
                      break L4;
                    } else {
                      param2.field_M = new ul();
                      break L4;
                    }
                  }
                  o.field_d = param2.field_M;
                  o.field_d.g(6);
                  me.field_b = new dk(param4);
                  ka.field_R = 0L;
                  ta.field_l = param9;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var10_int = var10_int + (255 & wb.field_j[var11]);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var10);

            stackIn_16_1 = new StringBuilder().append("sg.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    sg(java.net.Socket param0, pn param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int b(byte param0) throws IOException {
        if (param0 == -94) {
          if (this.field_f) {
            return 0;
          } else {
            return this.field_m.read();
          }
        } else {
          field_c = 66;
          if (this.field_f) {
            return 0;
          } else {
            return this.field_m.read();
          }
        }
    }

    final int a(int param0) throws IOException {
        if (!(!this.field_f)) {
            return 0;
        }
        if (param0 > -112) {
            return 108;
        }
        return this.field_m.available();
    }

    protected final void finalize() {
        this.b(12110);
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.field_G;
        if (param0 == 115) {
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            if (160 != var2) {
              if (95 != var2) {
                if (var2 != 45) {
                  if (91 != var2) {
                    if (-94 != (var2 ^ -1)) {
                      if (var2 != 35) {
                        if (var2 != 224) {
                          if (-226 != (var2 ^ -1)) {
                            if (var2 != 226) {
                              if (-229 != (var2 ^ -1)) {
                                if (var2 != 227) {
                                  if (-193 != (var2 ^ -1)) {
                                    if ((var2 ^ -1) != -194) {
                                      if ((var2 ^ -1) != -195) {
                                        if (-197 != (var2 ^ -1)) {
                                          if (-196 != (var2 ^ -1)) {
                                            if (232 != var2) {
                                              if (233 != var2) {
                                                if (-235 != (var2 ^ -1)) {
                                                  if (-236 != (var2 ^ -1)) {
                                                    if (200 != var2) {
                                                      if ((var2 ^ -1) != -202) {
                                                        if (-203 != (var2 ^ -1)) {
                                                          if (203 != var2) {
                                                            if (-238 != (var2 ^ -1)) {
                                                              if (var2 != 238) {
                                                                if (var2 != 239) {
                                                                  if (var2 != 205) {
                                                                    if (-207 != (var2 ^ -1)) {
                                                                      if ((var2 ^ -1) != -208) {
                                                                        if (242 != var2) {
                                                                          if (var2 != 243) {
                                                                            if ((var2 ^ -1) != -245) {
                                                                              if (var2 != 246) {
                                                                                if (-246 != (var2 ^ -1)) {
                                                                                  if ((var2 ^ -1) != -211) {
                                                                                    if ((var2 ^ -1) != -212) {
                                                                                      if (-213 != (var2 ^ -1)) {
                                                                                        if (var2 != 214) {
                                                                                          if ((var2 ^ -1) != -214) {
                                                                                            if (var2 != 249) {
                                                                                              if ((var2 ^ -1) != -251) {
                                                                                                if (-252 != (var2 ^ -1)) {
                                                                                                  if (-253 != (var2 ^ -1)) {
                                                                                                    if (var2 != 217) {
                                                                                                      if (-219 != (var2 ^ -1)) {
                                                                                                        if (-220 != (var2 ^ -1)) {
                                                                                                          if (-221 != (var2 ^ -1)) {
                                                                                                            if (var2 != 231) {
                                                                                                              if ((var2 ^ -1) != -200) {
                                                                                                                if ((var2 ^ -1) != -256) {
                                                                                                                  if (-377 != (var2 ^ -1)) {
                                                                                                                    if (var2 != 241) {
                                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                                        if ((var2 ^ -1) == -224) {
                                                                                                                          return 'b';
                                                                                                                        } else {
                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'n';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            } else {
                                                                                              return 'u';
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        } else {
                                                                          return 'o';
                                                                        }
                                                                      } else {
                                                                        return 'i';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  } else {
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'e';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    } else {
                                                      return 'e';
                                                    }
                                                  } else {
                                                    return 'e';
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'a';
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return param1;
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    return param1;
                  }
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '\n';
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_f) {
              break L0;
            } else {
              if (!this.field_k) {
                L1: {
                  if (this.field_p == null) {
                    this.field_p = new byte[this.field_j];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = 0;
                    if (param2 == -100) {
                      L3: while (true) {
                        if (param0 <= var6) {
                          L4: {
                            if (null == this.field_o) {
                              this.field_o = this.field_a.a(2, 3, (Runnable) (this));
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_p[this.field_g] = param1[var6 + param3];
                          this.field_g = (1 + this.field_g) % this.field_j;
                          if (this.field_g == (-100 + this.field_n + this.field_j) % this.field_j) {
                            throw new IOException();
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                this.field_k = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5_ref);

            stackIn_28_1 = new StringBuilder().append("sg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private sg(java.net.Socket param0, pn param1, int param2) throws IOException {
        this.field_k = false;
        this.field_g = 0;
        this.field_n = 0;
        this.field_f = false;
        try {
            this.field_a = param1;
            this.field_d = param0;
            this.field_d.setSoTimeout(30000);
            this.field_d.setTcpNoDelay(true);
            this.field_m = this.field_d.getInputStream();
            this.field_l = this.field_d.getOutputStream();
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Press TAB to chat or F10 to open Quick Chat.";
        field_b = "Hide chat";
    }
}
