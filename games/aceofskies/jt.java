/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt extends rf {
    private ap field_k;
    private int field_l;
    private int field_q;
    hk field_s;
    private hk field_y;
    hk field_p;
    private int[] field_o;
    private int field_u;
    private int[] field_i;
    private ap field_r;
    static int field_x;
    private int field_j;
    private ap field_v;
    static int field_t;
    private boolean field_m;
    private boolean field_w;
    hk field_n;

    final rf a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (this.field_l <= 0) {
            break L0;
          } else {
            if (null != this.field_v) {
              this.field_n.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (this.field_l < 1048576) {
            L2: {
              if (null != this.field_r) {
                this.field_p.a(param0);
                break L2;
              } else {
                break L2;
              }
            }
            if (-1 <= (this.field_j ^ -1)) {
              break L1;
            } else {
              if (this.field_k == null) {
                break L1;
              } else {
                this.field_y.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= (this.field_j ^ -1)) {
              break L1;
            } else {
              if (this.field_k == null) {
                break L1;
              } else {
                this.field_y.a(param0);
                break L1;
              }
            }
          }
        }
        L3: {
          if (!this.field_m) {
            break L3;
          } else {
            L4: {
              if (0 >= this.field_u) {
                break L4;
              } else {
                if (!this.field_n.f(32119)) {
                  this.field_u = -this.field_u;
                  this.field_m = false;
                  this.field_v = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (this.field_u >= 0) {
              break L3;
            } else {
              if (this.field_p.f(32119)) {
                break L3;
              } else {
                this.field_u = -this.field_u;
                this.field_r = null;
                this.field_m = false;
                break L3;
              }
            }
          }
        }
        L5: {
          if (this.field_u == 0) {
            break L5;
          } else {
            this.field_l = this.field_l + param0 * this.field_u;
            if (this.field_l < 1048576) {
              if (this.field_l <= 0) {
                this.field_l = 0;
                if (!this.field_m) {
                  this.field_u = 0;
                  if (!this.field_w) {
                    L6: {
                      if (null != this.field_v) {
                        this.field_n.d(-127);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    this.field_v = null;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            } else {
              this.field_l = 1048576;
              if (!this.field_m) {
                this.field_u = 0;
                if (this.field_w) {
                  break L5;
                } else {
                  L7: {
                    if (null == this.field_r) {
                      break L7;
                    } else {
                      this.field_p.d(-127);
                      break L7;
                    }
                  }
                  this.field_r = null;
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
        }
    }

    private final void a(int param0, hk param1, int param2, int param3) {
        try {
            this.field_s = param1;
            param1.a((byte) -124, param2, -1);
            param1.a(param0, -107);
            if (param3 != 30121) {
                hk var6 = (hk) null;
                this.a((hk) null, 88, (hk) null);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jt.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(hk param0, int param1, hk param2) {
        try {
            if (param1 != 9649) {
                this.b();
            }
            this.field_p = param0;
            this.field_n = param2;
            this.field_s = this.field_n;
            this.field_l = 1048576;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jt.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
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
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_q <= 0) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_m) {
                  L2: {
                    if (-1 <= (this.field_u ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_n.f(32119)) {
                        break L2;
                      } else {
                        this.field_m = false;
                        this.field_u = -this.field_u;
                        this.field_v = null;
                        break L1;
                      }
                    }
                  }
                  if (0 <= this.field_u) {
                    break L1;
                  } else {
                    if (!this.field_p.f(32119)) {
                      this.field_r = null;
                      this.field_m = false;
                      this.field_u = -this.field_u;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = this.field_q * (this.field_l >> 2035520588) / 256;
                var5 = this.field_q - var4_int;
                if (this.field_u == 0) {
                  break L3;
                } else {
                  this.field_l = this.field_l + this.field_u * param2;
                  if (-1048577 < (this.field_l ^ -1)) {
                    if (this.field_l <= 0) {
                      this.field_l = 0;
                      if (this.field_m) {
                        break L3;
                      } else {
                        this.field_u = 0;
                        if (this.field_w) {
                          break L3;
                        } else {
                          L4: {
                            if (null != this.field_v) {
                              this.field_n.d(-128);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_v = null;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_l = 1048576;
                    if (this.field_m) {
                      break L3;
                    } else {
                      this.field_u = 0;
                      if (!this.field_w) {
                        L5: {
                          if (null != this.field_r) {
                            this.field_p.d(-127);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_r = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (tk.field_r) {
                  stackIn_34_0 = param2 << 1482037729;
                  break L6;
                } else {
                  stackIn_34_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_34_0;
                if (-257 < (this.field_j ^ -1)) {
                  L8: {
                    if (this.field_v != null) {
                      break L8;
                    } else {
                      if (null != this.field_r) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if ((var4_int ^ -1) == -257) {
                    this.field_n.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (-257 != (var5 ^ -1)) {
                      L9: {
                        L10: {
                          if (null == this.field_i) {
                            break L10;
                          } else {
                            if (this.field_i.length < var6) {
                              break L10;
                            } else {
                              au.a(this.field_i, 0, var6);
                              au.a(this.field_o, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_i = new int[var6];
                        this.field_o = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_n.b(this.field_i, 0, param2);
                        this.field_p.b(this.field_o, 0, param2);
                        if (tk.field_r) {
                          param1 = param1 << 1;
                          stackIn_49_0 = param1 << 1;
                          break L11;
                        } else {
                          stackIn_49_0 = param1;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_i[var8] - -(var5 * this.field_o[var8]) >> 472394152);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_p.b(param0, param1, param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (this.field_k == null) {
                    break L14;
                  } else {
                    if (0 != this.field_j) {
                      L15: {
                        L16: {
                          if (this.field_i == null) {
                            break L16;
                          } else {
                            if (var6 <= this.field_i.length) {
                              au.a(this.field_i, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_o = new int[var6];
                        this.field_i = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_y.b(this.field_i, 0, param2);
                        if (tk.field_r) {
                          param1 = param1 << 1;
                          stackIn_64_0 = param1 << 1;
                          break L17;
                        } else {
                          stackIn_64_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_64_0;
                      var8 = this.field_j * this.field_q / 256;
                      var9 = this.field_q + -var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var7 + var10] = this.field_i[var10] * var8 + param0[var7 + var10] * var9 >> 1813645320;
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
            stackIn_70_0 = (RuntimeException) (var4);

            stackIn_70_1 = new StringBuilder().append("jt.M(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L19;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L19;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, String param1, long param2, java.applet.Applet param3, int param4) {
        try {
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param3.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param0 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param2 < (long)param4) {
                        var7 = var9 + "; Discard;";
                        break L2;
                      } else {
                        var7 = var9 + "; Expires=" + bt.a(false, 1000L * param2 + kh.a(-83)) + "; Max-Age=" + param2;
                        break L2;
                      }
                    }
                    fe.a(param3, -7012, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var6_ref);

                stackIn_9_1 = new StringBuilder().append("jt.D(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

                if (param1 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L5;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized int d() {
        return 2;
    }

    final synchronized void a(byte param0, int param1, boolean param2, int param3, ap param4, int param5) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        hk stackIn_42_0 = null;
        hk stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        hk stackIn_51_0 = null;
        hk stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_m) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    if (-1 > (this.field_u ^ -1)) {
                      L3: {
                        if (null != this.field_v) {
                          this.field_n.d(-127);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_v = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        this.field_n.a(false, -2029711608, param4);
                        this.a(param5, this.field_n, param3, 30121);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null != this.field_r) {
                          this.field_p.d(-126);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_r = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        this.field_p.a(false, -2029711608, param4);
                        this.a(param5, this.field_p, param3, 30121);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0 < -22) {
              L5: {
                stackIn_19_0 = this;

                if (!param2) {
                  stackIn_20_0 = this;
                  stackIn_20_1 = 0;
                  break L5;
                } else {
                  stackIn_20_0 = this;
                  stackIn_20_1 = 1;
                  break L5;
                }
              }
              ((jt) (this)).field_m = stackIn_20_1 != 0;
              if (param4 == this.field_v) {
                this.field_u = param1;
                this.a(param5, this.field_n, param3, 30121);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (this.field_r == param4) {
                  this.field_u = -param1;
                  this.a(param5, this.field_p, param3, 30121);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L6: {
                    if (this.field_v != null) {
                      if (this.field_r == null) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if (-524289 >= (this.field_l ^ -1)) {
                            stackIn_33_0 = 0;
                            break L7;
                          } else {
                            stackIn_33_0 = 1;
                            break L7;
                          }
                        }
                        var7_int = stackIn_33_0;
                        break L6;
                      }
                    } else {
                      var7_int = 1;
                      break L6;
                    }
                  }
                  L8: {
                    if (var7_int != 0) {
                      L9: {
                        if (this.field_v != null) {
                          this.field_n.d(-128);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        this.field_v = param4;
                        if (param4 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackIn_51_0 = this.field_n;

                            if (param2) {
                              stackIn_52_0 = (hk) ((Object) stackIn_51_0);
                              stackIn_52_1 = 0;
                              break L11;
                            } else {
                              stackIn_52_0 = (hk) ((Object) stackIn_51_0);
                              stackIn_52_1 = 1;
                              break L11;
                            }
                          }
                          ((hk) (Object) stackIn_52_0).a(stackIn_52_1 != 0, -2029711608, param4);
                          this.a(param5, this.field_n, param3, 30121);
                          break L10;
                        }
                      }
                      this.field_u = param1;
                      break L8;
                    } else {
                      L12: {
                        if (null != this.field_r) {
                          this.field_p.d(-128);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        this.field_r = param4;
                        if (param4 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackIn_42_0 = this.field_p;

                            if (param2) {
                              stackIn_43_0 = (hk) ((Object) stackIn_42_0);
                              stackIn_43_1 = 0;
                              break L14;
                            } else {
                              stackIn_43_0 = (hk) ((Object) stackIn_42_0);
                              stackIn_43_1 = 1;
                              break L14;
                            }
                          }
                          ((hk) (Object) stackIn_43_0).a(stackIn_43_1 != 0, -2029711608, param4);
                          this.a(param5, this.field_p, param3, 30121);
                          break L13;
                        }
                      }
                      this.field_u = -param1;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("jt.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L15;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L15;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 125) {
            this.field_i = (int[]) null;
        }
        this.field_q = param1;
    }

    final rf b() {
        return null;
    }

    jt(hk param0, hk param1) {
        this.field_q = 256;
        this.field_j = 0;
        this.field_w = false;
        try {
            this.a(param1, 9649, param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = 0;
    }
}
