/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends tn {
    static qr field_v;
    private int[] field_D;
    private gh field_E;
    static String[] field_w;
    private int field_l;
    static String[] field_x;
    private int field_y;
    private int field_n;
    ga field_r;
    static boolean field_q;
    private gh field_z;
    private gh field_o;
    ga field_u;
    static int[] field_t;
    private int[] field_p;
    private int field_B;
    private ga field_m;
    static int[] field_s;
    static bi field_F;
    private boolean field_A;
    private boolean field_C;

    final boolean a(gh param0, byte param1) {
        ga var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == -23) {
                break L1;
              } else {
                var4 = (ga) null;
                this.a((ga) null, (byte) 55, (ga) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == this.field_z) {
                  break L3;
                } else {
                  if (this.field_E != param0) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("h.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        field_v = null;
        field_s = null;
        field_F = null;
        field_w = null;
        if (param0 != -1) {
            h.d(22);
        }
        field_x = null;
        field_t = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_35_0 = 0;
        int stackIn_50_0 = 0;
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_B <= 0) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_C) {
                  L2: {
                    if ((this.field_l ^ -1) >= -1) {
                      break L2;
                    } else {
                      if (!this.field_u.h(5309)) {
                        this.field_C = false;
                        this.field_l = -this.field_l;
                        this.field_z = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (-1 >= (this.field_l ^ -1)) {
                    break L1;
                  } else {
                    if (!this.field_r.h(5309)) {
                      this.field_E = null;
                      this.field_C = false;
                      this.field_l = -this.field_l;
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
                var4_int = (this.field_n >> -1141386388) * this.field_B / 256;
                var5 = this.field_B - var4_int;
                if (this.field_l == 0) {
                  break L3;
                } else {
                  this.field_n = this.field_n + this.field_l * param2;
                  if ((this.field_n ^ -1) > -1048577) {
                    if ((this.field_n ^ -1) >= -1) {
                      this.field_n = 0;
                      if (this.field_C) {
                        break L3;
                      } else {
                        this.field_l = 0;
                        if (!this.field_A) {
                          L4: {
                            if (this.field_z != null) {
                              this.field_u.e(15);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_z = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_n = 1048576;
                    if (this.field_C) {
                      break L3;
                    } else {
                      this.field_l = 0;
                      if (!this.field_A) {
                        L5: {
                          if (null == this.field_E) {
                            break L5;
                          } else {
                            this.field_r.e(15);
                            break L5;
                          }
                        }
                        this.field_E = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (ap.field_h) {
                  stackIn_35_0 = param2 << -1720716415;
                  break L6;
                } else {
                  stackIn_35_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_35_0;
                if (this.field_y < 256) {
                  L8: {
                    if (null != this.field_z) {
                      break L8;
                    } else {
                      if (null == this.field_E) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (256 != var4_int) {
                    if (-257 == (var5 ^ -1)) {
                      this.field_r.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_D == null) {
                            break L10;
                          } else {
                            if (this.field_D.length < var6) {
                              break L10;
                            } else {
                              ps.a(this.field_D, 0, var6);
                              ps.a(this.field_p, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_p = new int[var6];
                        this.field_D = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_u.b(this.field_D, 0, param2);
                        this.field_r.b(this.field_p, 0, param2);
                        if (!ap.field_h) {
                          stackIn_50_0 = param1;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackIn_50_0 = param1 << 1;
                          break L11;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (this.field_p[var8] * var5 + this.field_D[var8] * var4_int >> -1115320280);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_u.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (this.field_o == null) {
                    break L14;
                  } else {
                    if (this.field_y != 0) {
                      L15: {
                        L16: {
                          if (null == this.field_D) {
                            break L16;
                          } else {
                            if (this.field_D.length < var6) {
                              break L16;
                            } else {
                              ps.a(this.field_D, 0, var6);
                              break L15;
                            }
                          }
                        }
                        this.field_p = new int[var6];
                        this.field_D = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_m.b(this.field_D, 0, param2);
                        if (ap.field_h) {
                          param1 = param1 << 1;
                          stackIn_64_0 = param1 << 1;
                          break L17;
                        } else {
                          stackIn_64_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_64_0;
                      var8 = this.field_y * this.field_B / 256;
                      var9 = -var8 + this.field_B;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var7 + var10] = var8 * this.field_D[var10] + param0[var10 + var7] * var9 >> 1682057032;
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

            stackIn_70_1 = new StringBuilder().append("h.G(");

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
          throw r.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((this.field_n ^ -1) < -1) {
            if (this.field_z != null) {
              this.field_u.a(param0);
              if (this.field_n < 1048576) {
                if (this.field_E != null) {
                  this.field_r.a(param0);
                  if (-1 <= (this.field_y ^ -1)) {
                    break L0;
                  } else {
                    if (this.field_o == null) {
                      break L0;
                    } else {
                      this.field_m.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (-1 <= (this.field_y ^ -1)) {
                    break L0;
                  } else {
                    if (this.field_o == null) {
                      break L0;
                    } else {
                      this.field_m.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (-1 <= (this.field_y ^ -1)) {
                  break L0;
                } else {
                  if (this.field_o == null) {
                    break L0;
                  } else {
                    this.field_m.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (this.field_n < 1048576) {
                if (this.field_E != null) {
                  this.field_r.a(param0);
                  if (-1 <= (this.field_y ^ -1)) {
                    break L0;
                  } else {
                    if (this.field_o == null) {
                      break L0;
                    } else {
                      this.field_m.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (-1 <= (this.field_y ^ -1)) {
                    break L0;
                  } else {
                    if (this.field_o == null) {
                      break L0;
                    } else {
                      this.field_m.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (-1 <= (this.field_y ^ -1)) {
                  break L0;
                } else {
                  if (this.field_o == null) {
                    break L0;
                  } else {
                    this.field_m.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (this.field_n < 1048576) {
              if (this.field_E != null) {
                this.field_r.a(param0);
                if (-1 <= (this.field_y ^ -1)) {
                  break L0;
                } else {
                  if (this.field_o == null) {
                    break L0;
                  } else {
                    this.field_m.a(param0);
                    break L0;
                  }
                }
              } else {
                if (-1 <= (this.field_y ^ -1)) {
                  break L0;
                } else {
                  if (this.field_o == null) {
                    break L0;
                  } else {
                    this.field_m.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1 <= (this.field_y ^ -1)) {
                break L0;
              } else {
                if (this.field_o == null) {
                  break L0;
                } else {
                  this.field_m.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (this.field_C) {
            if ((this.field_l ^ -1) >= -1) {
              if (0 <= this.field_l) {
                break L1;
              } else {
                if (this.field_r.h(5309)) {
                  break L1;
                } else {
                  this.field_C = false;
                  this.field_l = -this.field_l;
                  this.field_E = null;
                  break L1;
                }
              }
            } else {
              if (!this.field_u.h(5309)) {
                this.field_C = false;
                this.field_z = null;
                this.field_l = -this.field_l;
                break L1;
              } else {
                if (0 <= this.field_l) {
                  break L1;
                } else {
                  if (this.field_r.h(5309)) {
                    break L1;
                  } else {
                    this.field_C = false;
                    this.field_l = -this.field_l;
                    this.field_E = null;
                    break L1;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (this.field_l != 0) {
            this.field_n = this.field_n + this.field_l * param0;
            if (1048576 > this.field_n) {
              if (-1 <= (this.field_n ^ -1)) {
                this.field_n = 0;
                if (this.field_C) {
                  break L2;
                } else {
                  this.field_l = 0;
                  if (!this.field_A) {
                    L3: {
                      if (this.field_z == null) {
                        break L3;
                      } else {
                        this.field_u.e(15);
                        break L3;
                      }
                    }
                    this.field_z = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            } else {
              this.field_n = 1048576;
              if (this.field_C) {
                break L2;
              } else {
                this.field_l = 0;
                if (this.field_A) {
                  break L2;
                } else {
                  L4: {
                    if (this.field_E != null) {
                      this.field_r.e(15);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_E = null;
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, ga param2, int param3) {
        try {
            param2.a((byte) -78, -1, param0);
            param2.c(param1, false);
            if (param3 > -93) {
                h.d(-81);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "h.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = jg.a(param1, false, var4).getFile();
                      ll.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, -95);
                      ll.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, -65);
                      ll.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, -88);
                      ll.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, -118);
                      ll.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param0 ^ 81);
                      if (param0 == -1) {
                        break L2;
                      } else {
                        field_w = (String[]) null;
                        break L2;
                      }
                    }
                    ll.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, -104);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("h.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final tn d() {
        return null;
    }

    private final void a(ga param0, byte param1, ga param2) {
        this.field_u = param0;
        if (param1 != 17) {
            return;
        }
        try {
            this.field_r = param2;
            this.field_n = 1048576;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "h.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 0) {
            gh var4 = (gh) null;
            this.a((gh) null, (byte) -108);
        }
        this.field_B = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final tn b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, boolean param3, int param4, gh param5) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_35_0 = 0;
        ga stackIn_42_0 = null;
        gh stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        ga stackIn_43_0;
        gh stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        ga stackIn_51_0 = null;
        gh stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        ga stackIn_52_0;
        gh stackIn_52_1;
        int stackIn_52_2;
        int stackIn_52_3;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_C) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if ((this.field_l ^ -1) >= -1) {
                      L3: {
                        if (null != this.field_E) {
                          this.field_r.e(15);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_E = param5;
                      if (param5 != null) {
                        this.field_r.a(param5, (byte) 101, false);
                        this.a(param1, param0, this.field_r, -108);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == this.field_z) {
                          break L4;
                        } else {
                          this.field_u.e(15);
                          break L4;
                        }
                      }
                      this.field_z = param5;
                      if (param5 != null) {
                        this.field_u.a(param5, (byte) 101, false);
                        this.a(param1, param0, this.field_u, -119);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackIn_19_0 = this;

              if (!param3) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L5;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L5;
              }
            }
            ((h) (this)).field_C = stackIn_20_1 != 0;
            if (this.field_z != param5) {
              if (param5 != this.field_E) {
                if (param2 < -94) {
                  L6: {
                    if (null != this.field_z) {
                      if (null != this.field_E) {
                        L7: {
                          if ((this.field_n ^ -1) <= -524289) {
                            stackIn_35_0 = 0;
                            break L7;
                          } else {
                            stackIn_35_0 = 1;
                            break L7;
                          }
                        }
                        var7_int = stackIn_35_0;
                        break L6;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    } else {
                      var7_int = 1;
                      break L6;
                    }
                  }
                  L8: {
                    if (var7_int == 0) {
                      L9: {
                        if (this.field_E != null) {
                          this.field_r.e(15);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        this.field_E = param5;
                        if (param5 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackIn_51_0 = this.field_r;

                            stackIn_51_1 = (gh) (param5);

                            stackIn_51_2 = 101;

                            if (param3) {
                              stackIn_52_0 = (ga) ((Object) stackIn_51_0);
                              stackIn_52_1 = (gh) ((Object) stackIn_51_1);
                              stackIn_52_2 = stackIn_51_2;
                              stackIn_52_3 = 0;
                              break L11;
                            } else {
                              stackIn_52_0 = (ga) ((Object) stackIn_51_0);
                              stackIn_52_1 = (gh) ((Object) stackIn_51_1);
                              stackIn_52_2 = stackIn_51_2;
                              stackIn_52_3 = 1;
                              break L11;
                            }
                          }
                          ((ga) (Object) stackIn_52_0).a(stackIn_52_1, (byte) stackIn_52_2, stackIn_52_3 != 0);
                          this.a(param1, param0, this.field_r, -94);
                          break L10;
                        }
                      }
                      this.field_l = -param4;
                      break L8;
                    } else {
                      L12: {
                        if (this.field_z == null) {
                          break L12;
                        } else {
                          this.field_u.e(15);
                          break L12;
                        }
                      }
                      L13: {
                        this.field_z = param5;
                        if (param5 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackIn_42_0 = this.field_u;

                            stackIn_42_1 = (gh) (param5);

                            stackIn_42_2 = 101;

                            if (param3) {
                              stackIn_43_0 = (ga) ((Object) stackIn_42_0);
                              stackIn_43_1 = (gh) ((Object) stackIn_42_1);
                              stackIn_43_2 = stackIn_42_2;
                              stackIn_43_3 = 0;
                              break L14;
                            } else {
                              stackIn_43_0 = (ga) ((Object) stackIn_42_0);
                              stackIn_43_1 = (gh) ((Object) stackIn_42_1);
                              stackIn_43_2 = stackIn_42_2;
                              stackIn_43_3 = 1;
                              break L14;
                            }
                          }
                          ((ga) (Object) stackIn_43_0).a(stackIn_43_1, (byte) stackIn_43_2, stackIn_43_3 != 0);
                          this.a(param1, param0, this.field_u, -103);
                          break L13;
                        }
                      }
                      this.field_l = param4;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                this.field_l = -param4;
                this.a(param1, param0, this.field_r, -97);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_l = param4;
              this.a(param1, param0, this.field_u, -94);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("h.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
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

    public h() {
        this.field_y = 0;
        this.field_A = false;
        this.field_B = 256;
        ga var1 = new ga();
        this.a(var1, (byte) 17, new ga(var1));
    }

    static {
        field_w = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_x = new String[]{"Metal", "Biomass", "Energy", "Exotics"};
        field_t = new int[8192];
        field_s = new int[]{-14671840, -12566464, -10461088, -8355712, -6250336, -4144960, -2039584, -1};
    }
}
