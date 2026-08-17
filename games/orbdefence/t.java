/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends di {
    private boolean field_o;
    private fj field_w;
    private fj field_l;
    private int field_n;
    static im field_q;
    private fj field_z;
    private int field_m;
    private lj field_t;
    private int[] field_y;
    static String field_k;
    private lj field_s;
    private boolean field_p;
    private int[] field_u;
    private int field_x;
    private int field_r;
    static hj field_j;
    private lj field_v;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15136) {
                break L1;
              } else {
                field_j = (hj) null;
                break L1;
              }
            }
            stackIn_3_0 = ak.field_y.a(param1, 1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("t.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_20_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if ((var6_int ^ -1) <= -1) {
                var5 = var6_int - -2;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!hm.a(-20625, param2.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(var6_int + 2, var5);
                  if (tk.a(10, (CharSequence) ((Object) var7_ref_String))) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) == 62) {
                        var5++;
                        var8 = th.a(116, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (param1[var8].length() - -var6_int - var5);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                L4: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  if (param0 == -415993727) {
                    break L4;
                  } else {
                    field_k = (String) null;
                    break L4;
                  }
                }
                L5: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  if (0 <= var8) {
                    stackIn_20_0 = var8 + 2;
                    var5 = stackIn_20_0;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!hm.a(-20625, param2.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param2.substring(2 + var8, var5);
                      if (!tk.a(10, (CharSequence) ((Object) var9))) {
                        continue L5;
                      } else {
                        if (var5 >= var3_int) {
                          continue L5;
                        } else {
                          if (param2.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = th.a(113, (CharSequence) ((Object) var9));
                            discarded$0 = var6.append(param2.substring(var7, var8));
                            discarded$1 = var6.append(param1[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param2.substring(var7));
                    stackIn_29_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("t.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        return stackIn_29_0;
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
            field_j = (hj) null;
        }
        field_k = null;
        field_q = null;
    }

    final synchronized int c() {
        return 2;
    }

    final static hj[] a(String param0, ki param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a(param0, 0);
              if (param3 <= -59) {
                break L1;
              } else {
                field_q = (im) null;
                break L1;
              }
            }
            var5 = param1.a(param2, 5187, var4_int);
            stackIn_3_0 = ua.a(param1, var4_int, 91, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("t.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final di d() {
        return null;
    }

    final di a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
            this.field_u = (int[]) null;
        }
        this.field_n = param1;
    }

    final synchronized void c(int param0) {
        int var3;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (-1 <= (this.field_r ^ -1)) {
            break L0;
          } else {
            if (null == this.field_z) {
              break L0;
            } else {
              this.field_s.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if ((this.field_r ^ -1) <= -1048577) {
            break L1;
          } else {
            if (this.field_l != null) {
              this.field_v.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (-1 <= (this.field_m ^ -1)) {
            break L2;
          } else {
            if (this.field_w != null) {
              this.field_t.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_p) {
            L4: {
              if (0 >= this.field_x) {
                break L4;
              } else {
                if (!this.field_s.f(-75)) {
                  this.field_x = -this.field_x;
                  this.field_p = false;
                  this.field_z = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (this.field_x >= 0) {
              break L3;
            } else {
              if (!this.field_v.f(-63)) {
                this.field_p = false;
                this.field_x = -this.field_x;
                this.field_l = null;
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (-1 != (this.field_x ^ -1)) {
            this.field_r = this.field_r + param0 * this.field_x;
            if (1048576 <= this.field_r) {
              this.field_r = 1048576;
              if (!this.field_p) {
                this.field_x = 0;
                if (!this.field_o) {
                  L6: {
                    if (null == this.field_l) {
                      break L6;
                    } else {
                      this.field_v.e(70);
                      break L6;
                    }
                  }
                  this.field_l = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            } else {
              if ((this.field_r ^ -1) < -1) {
                break L5;
              } else {
                this.field_r = 0;
                if (!this.field_p) {
                  this.field_x = 0;
                  if (!this.field_o) {
                    L7: {
                      if (null != this.field_z) {
                        this.field_s.e(98);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_z = null;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
          } else {
            break L5;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if ((this.field_n ^ -1) >= -1) {
              this.c(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_p) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= this.field_x) {
                      break L2;
                    } else {
                      if (!this.field_s.f(-49)) {
                        this.field_x = -this.field_x;
                        this.field_p = false;
                        this.field_z = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (0 <= this.field_x) {
                    break L1;
                  } else {
                    if (this.field_v.f(-98)) {
                      break L1;
                    } else {
                      this.field_l = null;
                      this.field_p = false;
                      this.field_x = -this.field_x;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = this.field_n * (this.field_r >> -1832225012) / 256;
                var5 = -var4_int + this.field_n;
                if (this.field_x == 0) {
                  break L3;
                } else {
                  this.field_r = this.field_r + param2 * this.field_x;
                  if ((this.field_r ^ -1) <= -1048577) {
                    this.field_r = 1048576;
                    if (this.field_p) {
                      break L3;
                    } else {
                      this.field_x = 0;
                      if (!this.field_o) {
                        L4: {
                          if (this.field_l != null) {
                            this.field_v.e(114);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_l = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (this.field_r > 0) {
                      break L3;
                    } else {
                      this.field_r = 0;
                      if (this.field_p) {
                        break L3;
                      } else {
                        this.field_x = 0;
                        if (!this.field_o) {
                          L5: {
                            if (this.field_z != null) {
                              this.field_s.e(89);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_z = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (la.field_g) {
                  stackIn_33_0 = param2 << -415993727;
                  break L6;
                } else {
                  stackIn_33_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (256 > this.field_m) {
                  L8: {
                    if (this.field_z != null) {
                      break L8;
                    } else {
                      if (null != this.field_l) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if ((var4_int ^ -1) != -257) {
                    if ((var5 ^ -1) != -257) {
                      L9: {
                        L10: {
                          if (null == this.field_y) {
                            break L10;
                          } else {
                            if (var6 <= this.field_y.length) {
                              mk.a(this.field_y, 0, var6);
                              mk.a(this.field_u, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_u = new int[var6];
                        this.field_y = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_s.b(this.field_y, 0, param2);
                        this.field_v.b(this.field_u, 0, param2);
                        if (!la.field_g) {
                          stackIn_50_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_50_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_u[var8] * var5 + this.field_y[var8] * var4_int >> 1062620552);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_v.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    this.field_s.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (this.field_w == null) {
                    break L14;
                  } else {
                    if (this.field_m != 0) {
                      L15: {
                        L16: {
                          if (this.field_y == null) {
                            break L16;
                          } else {
                            if (this.field_y.length < var6) {
                              break L16;
                            } else {
                              mk.a(this.field_y, 0, var6);
                              break L15;
                            }
                          }
                        }
                        this.field_y = new int[var6];
                        this.field_u = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_t.b(this.field_y, 0, param2);
                        if (la.field_g) {
                          localTemp$1 = param1 << 1;
                          param1 = localTemp$1;
                          stackIn_63_0 = localTemp$1;
                          break L17;
                        } else {
                          stackIn_63_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_63_0;
                      var8 = this.field_m * this.field_n / 256;
                      var9 = this.field_n - var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var6 <= var10) {
                          break L14;
                        } else {
                          param0[var10 + var7] = var8 * this.field_y[var10] + param0[var7 + var10] * var9 >> -185286200;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var4);

            stackIn_69_1 = new StringBuilder().append("t.B(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L19;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param2) {
            ul.d();
        } else {
            ul.d(0, 0, ul.field_f, ul.field_l, 0, 192);
        }
        m.a(param2, 0);
        if (!param1) {
            field_q = (im) null;
        }
    }

    static {
        field_k = "Ice";
    }
}
