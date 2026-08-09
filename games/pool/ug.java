/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends no {
    static ml field_v;
    static vh field_x;
    static int field_u;
    private vb field_w;

    private final void f(int param0) {
        try {
            IOException iOException = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (null != this.field_w) {
              try {
                L0: {
                  this.field_r.field_v = 0;
                  this.field_r.a(6, false);
                  if (param0 < -36) {
                    this.field_r.b(3, 99);
                    this.field_r.a((byte) -81, 0);
                    this.field_w.a(this.field_r.field_t, (byte) -105, this.field_r.field_t.length, 0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_w.c(-114);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_a = -2;
                  this.field_e = this.field_e + 1;
                  this.field_w = null;
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              } else {
                return;
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

    final void a(byte param0) {
        try {
            this.field_w.c(-98);
        } catch (Exception exception) {
        }
        this.field_a = -1;
        if (param0 >= -4) {
            this.field_w = (vb) null;
        }
        this.field_e = this.field_e + 1;
        this.field_w = null;
        this.field_c = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static ko a(int[] param0, int param1, String param2, int param3, lr param4, boolean param5, int param6) {
        ko stackIn_2_0 = null;
        ko stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String[] var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        gi var19 = null;
        gi var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        ko var26 = null;
        try {
          L0: {
            var26 = new ko();
            var8 = new String[100];
            if (param5) {
              var9 = param4.a(param2, new int[]{param1}, var8);
              var10 = param2.toLowerCase();
              var11 = 0;
              L1: while (true) {
                if (var11 >= lb.field_P.length) {
                  stackIn_42_0 = (ko) (var26);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var12 = lb.field_P[var11];
                  var13 = 0;
                  L2: while (true) {
                    if (var12.length <= var13) {
                      var11++;
                      continue L1;
                    } else {
                      L3: {
                        var14 = var12[var13];
                        if (var14 == null) {
                          break L3;
                        } else {
                          var15 = var14.length();
                          if (var15 == 0) {
                            break L3;
                          } else {
                            var16 = var10.indexOf(var14);
                            L4: while (true) {
                              if (-1 == var16) {
                                break L3;
                              } else {
                                L5: {
                                  L6: {
                                    if (var16 <= 0) {
                                      break L6;
                                    } else {
                                      if (vq.a(var10.charAt(-1 + var16), 22987)) {
                                        break L5;
                                      } else {
                                        if (35 != var10.charAt(-1 + var16)) {
                                          break L6;
                                        } else {
                                          var16 = var10.indexOf(var14, var16 - -1);
                                          continue L4;
                                        }
                                      }
                                    }
                                  }
                                  L7: {
                                    if (var10.length() <= var15 + var16) {
                                      break L7;
                                    } else {
                                      if (!vq.a(var10.charAt(var16 - -var15), 22987)) {
                                        break L7;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var17 = var15 + var16;
                                  var18 = 0;
                                  var19 = new gi(var11);
                                  var20 = var19;
                                  var21 = 0;
                                  var22 = param3;
                                  L8: while (true) {
                                    L9: {
                                      if (var21 >= var9) {
                                        break L9;
                                      } else {
                                        L10: {
                                          L11: {
                                            var23 = var8[var21].length();
                                            var24 = param0[(-1 + (var21 - -param0.length)) % param0.length];
                                            if (var18 > var16) {
                                              break L11;
                                            } else {
                                              if (var18 + var23 <= var16) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  var25 = param4.b(var8[var21].substring(0, var16 + -var18));
                                                  var20.field_r = 1 + param4.field_C - -param4.field_w;
                                                  var20.field_m = param6 + var25;
                                                  var20.field_q = var22;
                                                  if (var17 < var18) {
                                                    break L12;
                                                  } else {
                                                    if (var23 + var18 < var17) {
                                                      break L12;
                                                    } else {
                                                      var20.field_l = param4.b(var8[var21].substring(-var18 + var16, var17 - var18));
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                var20.field_l = param4.b(var8[var21].substring(var16 - var18));
                                                var20.field_s = new gi(var20.field_p);
                                                var20 = var20.field_s;
                                                break L10;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (var18 > var17) {
                                              break L13;
                                            } else {
                                              if (var17 < var23 + var18) {
                                                var25 = param4.b(var8[var21].substring(0, -var18 + var17));
                                                var20.field_m = param6;
                                                var20.field_l = var25;
                                                var20.field_q = var22;
                                                var20.field_r = var24;
                                                break L9;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          if (var16 >= var18) {
                                            break L10;
                                          } else {
                                            if (var18 + var23 >= var17) {
                                              break L10;
                                            } else {
                                              var20.field_l = param1;
                                              var20.field_m = param6;
                                              var20.field_r = var24;
                                              var20.field_q = var22;
                                              var20.field_s = new gi(var20.field_p);
                                              var20 = var20.field_s;
                                              break L10;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var8[var21].endsWith("<br>")) {
                                            var18 = var18 + var23;
                                            break L14;
                                          } else {
                                            var18 = var18 + (var23 + 1);
                                            break L14;
                                          }
                                        }
                                        var21++;
                                        var22 = var22 + param0[var21 % param0.length];
                                        continue L8;
                                      }
                                    }
                                    var26.b((byte) 116, var19);
                                    break L5;
                                  }
                                }
                                var16 = var10.indexOf(var14, var16 - -1);
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      var13++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = (ko) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var7);

            stackIn_45_1 = new StringBuilder().append("ug.G(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L15;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L16;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L17;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L17;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_46_0), stackIn_52_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_42_0;
        }
    }

    final static kb e(int param0) {
        if (param0 != 0) {
            return (kb) null;
        }
        return (kb) ((Object) new hk());
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            ge stackIn_6_0 = null;
            ge stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_w != null) {
              try {
                L0: {
                  L1: {
                    this.field_r.field_v = 0;
                    if (param0 == 72) {
                      break L1;
                    } else {
                      this.a((byte) 2, true);
                      break L1;
                    }
                  }
                  L2: {
                    stackIn_6_0 = this.field_r;

                    if (!param1) {
                      stackIn_7_0 = (ge) ((Object) stackIn_6_0);
                      stackIn_7_1 = 3;
                      break L2;
                    } else {
                      stackIn_7_0 = (ge) ((Object) stackIn_6_0);
                      stackIn_7_1 = 2;
                      break L2;
                    }
                  }
                  ((ge) (Object) stackIn_7_0).a(stackIn_7_1, false);
                  this.field_r.b(0L, 24136);
                  this.field_w.a(this.field_r.field_t, (byte) -102, this.field_r.field_t.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_w.c(-83);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_a = -2;
                  this.field_w = null;
                  this.field_e = this.field_e + 1;
                  break L3;
                }
              }
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            sp var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = Pool.field_O;
            try {
              L0: {
                L1: {
                  if (this.field_w == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_w.c(-112);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_w = null;
                    break L1;
                  }
                }
                this.field_w = (vb) (param2);
                this.f(-55);
                this.a((byte) 72, param1);
                this.field_p.field_v = 0;
                this.field_i = null;
                L4: while (true) {
                  var4_ref = (sp) ((Object) this.field_f.a(0));
                  if (var4_ref == null) {
                    L5: while (true) {
                      var4_ref = (sp) ((Object) this.field_o.a(0));
                      if (var4_ref == null) {
                        L6: {
                          if (-1 == (this.field_c ^ -1)) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_r.field_v = 0;
                                this.field_r.a(4, false);
                                this.field_r.a((int) this.field_c, false);
                                this.field_r.a(true, 0);
                                this.field_w.a(this.field_r.field_t, (byte) -102, this.field_r.field_t.length, 0);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_w.c(-127);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_a = -2;
                                this.field_w = null;
                                this.field_e = this.field_e + 1;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        this.field_m = 0;
                        if (param0 > 8) {
                          this.field_d = rl.a((byte) -117);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        this.field_t.a(var4_ref, false);
                        continue L5;
                      }
                    }
                  } else {
                    this.field_j.a(var4_ref, false);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_25_0 = (RuntimeException) (var4_ref3);

                stackIn_25_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "null";
                  break L11;
                } else {
                  stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "{...}";
                  break L11;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    public static void h(int param0) {
        if (param0 > -60) {
            return;
        }
        field_x = null;
        field_v = null;
    }

    final boolean d(int param0) {
        try {
            int stackIn_46_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            sp var2 = null;
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
            sp var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            lr var17 = null;
            L0: {
              var16 = Pool.field_O;
              if (null == this.field_w) {
                break L0;
              } else {
                L1: {
                  var2_long = rl.a((byte) -126);
                  var4 = (int)(-this.field_d + var2_long);
                  this.field_d = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_m = this.field_m + var4;
                if (this.field_m > 30000) {
                  try {
                    L2: {
                      this.field_w.c(-100);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_w = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_w != null) {
              try {
                L4: {
                  this.field_w.e(0);
                  var2 = (sp) ((Object) this.field_j.a((byte) -22));
                  L5: while (true) {
                    if (var2 == null) {
                      var2 = (sp) ((Object) this.field_t.a((byte) 117));
                      L6: while (true) {
                        if (var2 == null) {
                          L7: {
                            if (param0 == -2147483648) {
                              break L7;
                            } else {
                              var17 = (lr) null;
                              ug.a((int[]) null, 69, (String) null, 35, (lr) null, true, -63);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (100 <= var2_int) {
                                break L9;
                              } else {
                                var3_int = this.field_w.d(75);
                                if (0 <= var3_int) {
                                  if (var3_int == 0) {
                                    break L9;
                                  } else {
                                    L10: {
                                      this.field_m = 0;
                                      var4 = 0;
                                      if (null == this.field_i) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (this.field_i.field_J == 0) {
                                          var4 = 1;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var4 <= 0) {
                                        L12: {
                                          var5 = -this.field_i.field_L + this.field_i.field_K.field_t.length;
                                          var6 = -this.field_i.field_J + 512;
                                          if (var5 + -this.field_i.field_K.field_v >= var6) {
                                            break L12;
                                          } else {
                                            var6 = -this.field_i.field_K.field_v + var5;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var3_int >= var6) {
                                            break L13;
                                          } else {
                                            var6 = var3_int;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          this.field_w.a(var6, param0 + -2147483648, this.field_i.field_K.field_v, this.field_i.field_K.field_t);
                                          if (this.field_c != 0) {
                                            var7 = 0;
                                            L15: while (true) {
                                              if (var7 >= var6) {
                                                break L14;
                                              } else {
                                                this.field_i.field_K.field_t[var7 + this.field_i.field_K.field_v] = (byte)cq.a((int) this.field_i.field_K.field_t[var7 + this.field_i.field_K.field_v], (int) this.field_c);
                                                var7++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        this.field_i.field_K.field_v = this.field_i.field_K.field_v + var6;
                                        this.field_i.field_J = this.field_i.field_J + var6;
                                        if (this.field_i.field_K.field_v == var5) {
                                          this.field_i.a(false);
                                          this.field_i.field_F = false;
                                          this.field_i = null;
                                          break L11;
                                        } else {
                                          if (this.field_i.field_J != 512) {
                                            break L11;
                                          } else {
                                            this.field_i.field_J = 0;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        L16: {
                                          var5 = -this.field_p.field_v + var4;
                                          if (var3_int >= var5) {
                                            break L16;
                                          } else {
                                            var5 = var3_int;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          this.field_w.a(var5, 0, this.field_p.field_v, this.field_p.field_t);
                                          if (this.field_c == 0) {
                                            break L17;
                                          } else {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var5 <= var6) {
                                                break L17;
                                              } else {
                                                this.field_p.field_t[this.field_p.field_v - -var6] = (byte)cq.a((int) this.field_p.field_t[this.field_p.field_v + var6], (int) this.field_c);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          }
                                        }
                                        this.field_p.field_v = this.field_p.field_v + var5;
                                        if (this.field_p.field_v >= var4) {
                                          if (this.field_i != null) {
                                            if (this.field_i.field_J == 0) {
                                              if (this.field_p.field_t[0] == -1) {
                                                this.field_i.field_J = 1;
                                                this.field_p.field_v = 0;
                                                break L11;
                                              } else {
                                                this.field_i = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L19: {
                                              this.field_p.field_v = 0;
                                              var6 = this.field_p.g(param0 + 2147483550);
                                              var7 = this.field_p.b(true);
                                              var8 = this.field_p.g(param0 + 2147483525);
                                              var9 = this.field_p.b(true);
                                              var10 = var8 & 127;
                                              if (0 == (128 & var8)) {
                                                stackIn_46_0 = 0;
                                                break L19;
                                              } else {
                                                stackIn_46_0 = 1;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_46_0;
                                              var12 = (long)var7 + ((long)var6 << 1122941088);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (sp) ((Object) this.field_f.a((byte) -113));
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if ((var12 ^ -1L) != (var14_ref.field_m ^ -1L)) {
                                                      var14_ref = (sp) ((Object) this.field_f.b((byte) -87));
                                                      continue L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (sp) ((Object) this.field_o.a((byte) 96));
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var12 != var14_ref.field_m) {
                                                      var14_ref = (sp) ((Object) this.field_o.b((byte) -99));
                                                      continue L22;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L23: {
                                                if (-1 != (var10 ^ -1)) {
                                                  stackIn_62_0 = 9;
                                                  break L23;
                                                } else {
                                                  stackIn_62_0 = 5;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_62_0;
                                              this.field_i = var14_ref;
                                              this.field_i.field_K = new ge(var15 + (var9 + this.field_i.field_L));
                                              this.field_i.field_K.a(var10, false);
                                              this.field_i.field_K.a(true, var9);
                                              this.field_p.field_v = 0;
                                              this.field_i.field_J = 10;
                                              break L11;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            stackIn_84_0 = 1;
                            break L4;
                          }
                        } else {
                          this.field_r.field_v = 0;
                          this.field_r.a(0, false);
                          this.field_r.b(var2.field_m, 24136);
                          this.field_w.a(this.field_r.field_t, (byte) 55, this.field_r.field_t.length, 0);
                          this.field_o.a(var2, false);
                          var2 = (sp) ((Object) this.field_t.b((byte) -112));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_r.field_v = 0;
                      this.field_r.a(1, false);
                      this.field_r.b(var2.field_m, 24136);
                      this.field_w.a(this.field_r.field_t, (byte) -97, this.field_r.field_t.length, 0);
                      this.field_f.a(var2, false);
                      var2 = (sp) ((Object) this.field_j.b((byte) -116));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_w.c(-128);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  this.field_e = this.field_e + 1;
                  this.field_w = null;
                  this.field_a = -2;
                  if (this.c(4609) != 0) {
                    break L26;
                  } else {
                    if (this.a(false) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_84_0 != 0;
            } else {
              L27: {
                if (0 != this.c(4609)) {
                  break L27;
                } else {
                  if (this.a(false) != 0) {
                    break L27;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(byte param0) {
        if (null != this.field_w) {
            this.field_w.c(-102);
        }
        if (param0 >= -24) {
            this.field_w = (vb) null;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          L0: {
            var4_int = param2.length();
            var5 = param0.length();
            var6 = param1.length();
            if (-1 != (var5 ^ -1)) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (param3 != (var8 ^ -1)) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param2.indexOf(param0, var9_int);
                    if (0 <= var9_int) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param2.indexOf(param0, var10);
                if (var11 >= 0) {
                  discarded$0 = var9.append(param2.substring(var10, var11));
                  var10 = var11 - -var5;
                  discarded$1 = var9.append(param1);
                  continue L3;
                } else {
                  discarded$2 = var9.append(param2.substring(var10));
                  stackIn_14_0 = var9.toString();
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ug.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    public ug() {
    }

    final static int g(int param0) {
        try {
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            ge var2 = null;
            if (-5 < (sq.field_c.field_e ^ -1)) {
              try {
                L0: {
                  L1: {
                    if (rl.field_e == 0) {
                      mq.field_c = fe.field_M.a(nr.field_X, na.field_a, 0);
                      rl.field_e = rl.field_e + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (rl.field_e != 1) {
                      break L2;
                    } else {
                      if (mq.field_c.field_f == 2) {
                        stackIn_14_0 = sd.a(false, -1);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (mq.field_c.field_f == 1) {
                          rl.field_e = rl.field_e + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (2 != rl.field_e) {
                      break L3;
                    } else {
                      dq.field_h = new vb((java.net.Socket) (mq.field_c.field_e), fe.field_M);
                      var2 = new ge(13);
                      fm.a(var2, true, ci.field_k, om.field_v, ei.field_B);
                      var2.a(15, false);
                      var2.a(true, qf.field_f);
                      dq.field_h.a(var2.field_t, (byte) 72, 13, 0);
                      rl.field_e = rl.field_e + 1;
                      ae.field_d = rl.a((byte) -105) - -30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (-4 != (rl.field_e ^ -1)) {
                      break L4;
                    } else {
                      if (0 < dq.field_h.d(72)) {
                        var1_int = dq.field_h.a(14528);
                        if (-1 == (var1_int ^ -1)) {
                          rl.field_e = rl.field_e + 1;
                          break L4;
                        } else {
                          stackIn_27_0 = sd.a(false, var1_int);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (rl.a((byte) -110) <= ae.field_d) {
                          break L4;
                        } else {
                          stackIn_24_0 = sd.a(false, -2);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  if (rl.field_e != 4) {
                    if (param0 == -27108) {
                      stackIn_36_0 = -1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_34_0 = -29;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    sq.field_c.a(101, sa.field_k, dq.field_h);
                    mq.field_c = null;
                    rl.field_e = 0;
                    dq.field_h = null;
                    stackIn_31_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return sd.a(false, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_24_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_31_0;
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return stackIn_34_0;
                      } else {
                        return stackIn_36_0;
                      }
                    }
                  }
                }
              }
            } else {
              if (-1 == sq.field_c.field_a) {
                return 3;
              } else {
                if (-2 != sq.field_c.field_a) {
                  return 1;
                } else {
                  return 4;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_v = new ml("usename");
    }
}
