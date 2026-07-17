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
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (((jt) this).field_l <= 0) {
            break L0;
          } else {
            if (null != ((jt) this).field_v) {
              ((jt) this).field_n.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((jt) this).field_l >= 1048576) {
            if (-1 >= ((jt) this).field_j) {
              break L1;
            } else {
              if (((jt) this).field_k == null) {
                break L1;
              } else {
                ((jt) this).field_y.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= ((jt) this).field_j) {
              break L1;
            } else {
              if (((jt) this).field_k == null) {
                break L1;
              } else {
                ((jt) this).field_y.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (!((jt) this).field_m) {
            break L2;
          } else {
            L3: {
              if (0 >= ((jt) this).field_u) {
                break L3;
              } else {
                if (!((jt) this).field_n.f(32119)) {
                  ((jt) this).field_u = -((jt) this).field_u;
                  ((jt) this).field_m = false;
                  ((jt) this).field_v = null;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((jt) this).field_u >= 0) {
              break L2;
            } else {
              if (((jt) this).field_p.f(32119)) {
                break L2;
              } else {
                ((jt) this).field_u = -((jt) this).field_u;
                ((jt) this).field_r = null;
                ((jt) this).field_m = false;
                break L2;
              }
            }
          }
        }
        L4: {
          if (((jt) this).field_u == 0) {
            break L4;
          } else {
            ((jt) this).field_l = ((jt) this).field_l + param0 * ((jt) this).field_u;
            if (((jt) this).field_l < 1048576) {
              if (((jt) this).field_l <= 0) {
                ((jt) this).field_l = 0;
                if (!((jt) this).field_m) {
                  ((jt) this).field_u = 0;
                  if (!((jt) this).field_w) {
                    L5: {
                      if (null != ((jt) this).field_v) {
                        ((jt) this).field_n.d(-127);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((jt) this).field_v = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              ((jt) this).field_l = 1048576;
              if (!((jt) this).field_m) {
                ((jt) this).field_u = 0;
                if (((jt) this).field_w) {
                  break L4;
                } else {
                  L6: {
                    if (null == ((jt) this).field_r) {
                      break L6;
                    } else {
                      ((jt) this).field_p.d(-127);
                      break L6;
                    }
                  }
                  ((jt) this).field_r = null;
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    private final void a(int param0, hk param1, int param2) {
        RuntimeException var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((jt) this).field_s = param1;
            param1.a((byte) -124, param2, -1);
            param1.a(param0, -107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("jt.F(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 44 + 30121 + 41);
        }
    }

    private final void a(hk param0, int param1, hk param2) {
        try {
            ((jt) this).field_p = param0;
            ((jt) this).field_n = param2;
            ((jt) this).field_s = ((jt) this).field_n;
            ((jt) this).field_l = 1048576;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jt.E(" + (param0 != null ? "{...}" : "null") + 44 + 9649 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (((jt) this).field_q <= 0) {
              ((jt) this).a(param2);
              return;
            } else {
              L1: {
                if (((jt) this).field_m) {
                  L2: {
                    if (((jt) this).field_u <= 0) {
                      break L2;
                    } else {
                      if (((jt) this).field_n.f(32119)) {
                        break L2;
                      } else {
                        ((jt) this).field_m = false;
                        ((jt) this).field_u = -((jt) this).field_u;
                        ((jt) this).field_v = null;
                        break L1;
                      }
                    }
                  }
                  if (0 <= ((jt) this).field_u) {
                    break L1;
                  } else {
                    if (!((jt) this).field_p.f(32119)) {
                      ((jt) this).field_r = null;
                      ((jt) this).field_m = false;
                      ((jt) this).field_u = -((jt) this).field_u;
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
                var4_int = ((jt) this).field_q * (((jt) this).field_l >> 12) / 256;
                var5 = ((jt) this).field_q - var4_int;
                if (((jt) this).field_u == 0) {
                  break L3;
                } else {
                  ((jt) this).field_l = ((jt) this).field_l + ((jt) this).field_u * param2;
                  if (((jt) this).field_l < 1048576) {
                    if (((jt) this).field_l <= 0) {
                      ((jt) this).field_l = 0;
                      if (((jt) this).field_m) {
                        break L3;
                      } else {
                        ((jt) this).field_u = 0;
                        if (((jt) this).field_w) {
                          break L3;
                        } else {
                          L4: {
                            if (null != ((jt) this).field_v) {
                              ((jt) this).field_n.d(-128);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((jt) this).field_v = null;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ((jt) this).field_l = 1048576;
                    if (((jt) this).field_m) {
                      break L3;
                    } else {
                      ((jt) this).field_u = 0;
                      if (!((jt) this).field_w) {
                        L5: {
                          if (null != ((jt) this).field_r) {
                            ((jt) this).field_p.d(-127);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((jt) this).field_r = null;
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
                  stackOut_33_0 = param2 << 1;
                  stackIn_34_0 = stackOut_33_0;
                  break L6;
                } else {
                  stackOut_32_0 = param2;
                  stackIn_34_0 = stackOut_32_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_34_0;
                if (((jt) this).field_j < 256) {
                  L8: {
                    if (((jt) this).field_v != null) {
                      break L8;
                    } else {
                      if (null != ((jt) this).field_r) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((jt) this).field_n.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == ((jt) this).field_i) {
                            break L10;
                          } else {
                            if (~((jt) this).field_i.length > ~var6) {
                              break L10;
                            } else {
                              au.a(((jt) this).field_i, 0, var6);
                              au.a(((jt) this).field_o, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((jt) this).field_i = new int[var6];
                        ((jt) this).field_o = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((jt) this).field_n.b(((jt) this).field_i, 0, param2);
                        ((jt) this).field_p.b(((jt) this).field_o, 0, param2);
                        if (tk.field_r) {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          stackOut_47_0 = param1;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * ((jt) this).field_i[var8] - -(var5 * ((jt) this).field_o[var8]) >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((jt) this).field_p.b(param0, param1, param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (((jt) this).field_k == null) {
                    break L14;
                  } else {
                    if (0 != ((jt) this).field_j) {
                      L15: {
                        L16: {
                          if (((jt) this).field_i == null) {
                            break L16;
                          } else {
                            if (var6 <= ((jt) this).field_i.length) {
                              au.a(((jt) this).field_i, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((jt) this).field_o = new int[var6];
                        ((jt) this).field_i = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((jt) this).field_y.b(((jt) this).field_i, 0, param2);
                        if (tk.field_r) {
                          param1 = param1 << 1;
                          stackOut_63_0 = param1 << 1;
                          stackIn_64_0 = stackOut_63_0;
                          break L17;
                        } else {
                          stackOut_62_0 = param1;
                          stackIn_64_0 = stackOut_62_0;
                          break L17;
                        }
                      }
                      var7 = stackIn_64_0;
                      var8 = ((jt) this).field_j * ((jt) this).field_q / 256;
                      var9 = ((jt) this).field_q + -var8;
                      var10 = 0;
                      L18: while (true) {
                        if (~var10 <= ~var6) {
                          break L14;
                        } else {
                          param0[var7 + var10] = ((jt) this).field_i[var10] * var8 + param0[var7 + var10] * var9 >> 8;
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var4;
            stackOut_68_1 = new StringBuilder().append("jt.M(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L19;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(String param0, String param1, long param2, java.applet.Applet param3) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
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
                      if (param2 < 0L) {
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
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("jt.D(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param1 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param3 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 0 + 41);
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
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        hk stackIn_41_0 = null;
        hk stackIn_42_0 = null;
        hk stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        hk stackIn_50_0 = null;
        hk stackIn_51_0 = null;
        hk stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        hk stackOut_49_0 = null;
        hk stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        hk stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        hk stackOut_40_0 = null;
        hk stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        hk stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((jt) this).field_m) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    if (((jt) this).field_u > 0) {
                      L3: {
                        if (null != ((jt) this).field_v) {
                          ((jt) this).field_n.d(-127);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((jt) this).field_v = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        ((jt) this).field_n.a(false, -2029711608, param4);
                        int discarded$6 = 30121;
                        this.a(param5, ((jt) this).field_n, param3);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null != ((jt) this).field_r) {
                          ((jt) this).field_p.d(-126);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((jt) this).field_r = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        ((jt) this).field_p.a(false, -2029711608, param4);
                        int discarded$7 = 30121;
                        this.a(param5, ((jt) this).field_p, param3);
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param0 < -22) {
              L5: {
                stackOut_17_0 = this;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (!param2) {
                  stackOut_19_0 = this;
                  stackOut_19_1 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L5;
                } else {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L5;
                }
              }
              ((jt) this).field_m = stackIn_20_1 != 0;
              if (param4 == ((jt) this).field_v) {
                ((jt) this).field_u = param1;
                int discarded$8 = 30121;
                this.a(param5, ((jt) this).field_n, param3);
                return;
              } else {
                if (((jt) this).field_r == param4) {
                  ((jt) this).field_u = -param1;
                  int discarded$9 = 30121;
                  this.a(param5, ((jt) this).field_p, param3);
                  return;
                } else {
                  L6: {
                    if (((jt) this).field_v != null) {
                      if (((jt) this).field_r == null) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if (((jt) this).field_l >= 524288) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            break L7;
                          } else {
                            stackOut_31_0 = 1;
                            stackIn_33_0 = stackOut_31_0;
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
                        if (((jt) this).field_v != null) {
                          ((jt) this).field_n.d(-128);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        ((jt) this).field_v = param4;
                        if (param4 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackOut_49_0 = ((jt) this).field_n;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            if (param2) {
                              stackOut_51_0 = (hk) (Object) stackIn_51_0;
                              stackOut_51_1 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              break L11;
                            } else {
                              stackOut_50_0 = (hk) (Object) stackIn_50_0;
                              stackOut_50_1 = 1;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_52_1 = stackOut_50_1;
                              break L11;
                            }
                          }
                          ((hk) (Object) stackIn_52_0).a(stackIn_52_1 != 0, -2029711608, param4);
                          int discarded$10 = 30121;
                          this.a(param5, ((jt) this).field_n, param3);
                          break L10;
                        }
                      }
                      ((jt) this).field_u = param1;
                      break L8;
                    } else {
                      L12: {
                        if (null != ((jt) this).field_r) {
                          ((jt) this).field_p.d(-128);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        ((jt) this).field_r = param4;
                        if (param4 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackOut_40_0 = ((jt) this).field_p;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (param2) {
                              stackOut_42_0 = (hk) (Object) stackIn_42_0;
                              stackOut_42_1 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              break L14;
                            } else {
                              stackOut_41_0 = (hk) (Object) stackIn_41_0;
                              stackOut_41_1 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              break L14;
                            }
                          }
                          ((hk) (Object) stackIn_43_0).a(stackIn_43_1 != 0, -2029711608, param4);
                          int discarded$11 = 30121;
                          this.a(param5, ((jt) this).field_p, param3);
                          break L13;
                        }
                      }
                      ((jt) this).field_u = -param1;
                      break L8;
                    }
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("jt.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param4 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 44 + param5 + 41);
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 125) {
            ((jt) this).field_i = null;
        }
        ((jt) this).field_q = param1;
    }

    final rf b() {
        return null;
    }

    jt(hk param0, hk param1) {
        ((jt) this).field_q = 256;
        ((jt) this).field_j = 0;
        ((jt) this).field_w = false;
        try {
            this.a(param1, 9649, param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0;
    }
}
