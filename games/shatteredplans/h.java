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
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -23) {
                break L1;
              } else {
                var4 = null;
                this.a((ga) null, (byte) 55, (ga) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == ((h) this).field_z) {
                  break L3;
                } else {
                  if (((h) this).field_E != param0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("h.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_35_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((h) this).field_B <= 0) {
              ((h) this).a(param2);
              return;
            } else {
              L1: {
                if (((h) this).field_C) {
                  L2: {
                    if (((h) this).field_l <= 0) {
                      break L2;
                    } else {
                      if (!((h) this).field_u.h(5309)) {
                        ((h) this).field_C = false;
                        ((h) this).field_l = -((h) this).field_l;
                        ((h) this).field_z = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((h) this).field_l >= 0) {
                    break L1;
                  } else {
                    if (!((h) this).field_r.h(5309)) {
                      ((h) this).field_E = null;
                      ((h) this).field_C = false;
                      ((h) this).field_l = -((h) this).field_l;
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
                var4_int = (((h) this).field_n >> 12) * ((h) this).field_B / 256;
                var5 = ((h) this).field_B - var4_int;
                if (((h) this).field_l == 0) {
                  break L3;
                } else {
                  ((h) this).field_n = ((h) this).field_n + ((h) this).field_l * param2;
                  if (((h) this).field_n < 1048576) {
                    if (((h) this).field_n <= 0) {
                      ((h) this).field_n = 0;
                      if (((h) this).field_C) {
                        break L3;
                      } else {
                        ((h) this).field_l = 0;
                        if (!((h) this).field_A) {
                          L4: {
                            if (((h) this).field_z != null) {
                              ((h) this).field_u.e(15);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((h) this).field_z = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ((h) this).field_n = 1048576;
                    if (((h) this).field_C) {
                      break L3;
                    } else {
                      ((h) this).field_l = 0;
                      if (!((h) this).field_A) {
                        L5: {
                          if (null == ((h) this).field_E) {
                            break L5;
                          } else {
                            ((h) this).field_r.e(15);
                            break L5;
                          }
                        }
                        ((h) this).field_E = null;
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
                  stackOut_34_0 = param2 << 1;
                  stackIn_35_0 = stackOut_34_0;
                  break L6;
                } else {
                  stackOut_33_0 = param2;
                  stackIn_35_0 = stackOut_33_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_35_0;
                if (((h) this).field_y < 256) {
                  L8: {
                    if (null != ((h) this).field_z) {
                      break L8;
                    } else {
                      if (null == ((h) this).field_E) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (256 != var4_int) {
                    if (var5 == 256) {
                      ((h) this).field_r.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((h) this).field_D == null) {
                            break L10;
                          } else {
                            if (~((h) this).field_D.length > ~var6) {
                              break L10;
                            } else {
                              ps.a(((h) this).field_D, 0, var6);
                              ps.a(((h) this).field_p, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((h) this).field_p = new int[var6];
                        ((h) this).field_D = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((h) this).field_u.b(((h) this).field_D, 0, param2);
                        ((h) this).field_r.b(((h) this).field_p, 0, param2);
                        if (!ap.field_h) {
                          stackOut_49_0 = param1;
                          stackIn_50_0 = stackOut_49_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (((h) this).field_p[var8] * var5 + ((h) this).field_D[var8] * var4_int >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((h) this).field_u.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (((h) this).field_o == null) {
                    break L14;
                  } else {
                    if (((h) this).field_y != 0) {
                      L15: {
                        L16: {
                          if (null == ((h) this).field_D) {
                            break L16;
                          } else {
                            if (((h) this).field_D.length < var6) {
                              break L16;
                            } else {
                              ps.a(((h) this).field_D, 0, var6);
                              break L15;
                            }
                          }
                        }
                        ((h) this).field_p = new int[var6];
                        ((h) this).field_D = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((h) this).field_m.b(((h) this).field_D, 0, param2);
                        if (ap.field_h) {
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
                      var8 = ((h) this).field_y * ((h) this).field_B / 256;
                      var9 = -var8 + ((h) this).field_B;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var7 + var10] = var8 * ((h) this).field_D[var10] + param0[var10 + var7] * var9 >> 8;
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
            stackOut_68_1 = new StringBuilder().append("h.G(");
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
          throw r.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((h) this).field_n > 0) {
            if (((h) this).field_z != null) {
              ((h) this).field_u.a(param0);
              if (((h) this).field_n >= 1048576) {
                break L0;
              } else {
                if (((h) this).field_E == null) {
                  break L0;
                } else {
                  ((h) this).field_r.a(param0);
                  break L0;
                }
              }
            } else {
              if (((h) this).field_n >= 1048576) {
                break L0;
              } else {
                if (((h) this).field_E == null) {
                  break L0;
                } else {
                  ((h) this).field_r.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (((h) this).field_n >= 1048576) {
              break L0;
            } else {
              if (((h) this).field_E == null) {
                break L0;
              } else {
                ((h) this).field_r.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (((h) this).field_y <= 0) {
            break L1;
          } else {
            if (((h) this).field_o == null) {
              break L1;
            } else {
              ((h) this).field_m.a(param0);
              break L1;
            }
          }
        }
        L2: {
          if (((h) this).field_C) {
            L3: {
              if (((h) this).field_l <= 0) {
                break L3;
              } else {
                if (!((h) this).field_u.h(5309)) {
                  ((h) this).field_C = false;
                  ((h) this).field_z = null;
                  ((h) this).field_l = -((h) this).field_l;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= ((h) this).field_l) {
              break L2;
            } else {
              if (((h) this).field_r.h(5309)) {
                break L2;
              } else {
                ((h) this).field_C = false;
                ((h) this).field_l = -((h) this).field_l;
                ((h) this).field_E = null;
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (((h) this).field_l != 0) {
            ((h) this).field_n = ((h) this).field_n + ((h) this).field_l * param0;
            if (1048576 > ((h) this).field_n) {
              if (((h) this).field_n <= 0) {
                ((h) this).field_n = 0;
                if (((h) this).field_C) {
                  break L4;
                } else {
                  ((h) this).field_l = 0;
                  if (!((h) this).field_A) {
                    L5: {
                      if (((h) this).field_z == null) {
                        break L5;
                      } else {
                        ((h) this).field_u.e(15);
                        break L5;
                      }
                    }
                    ((h) this).field_z = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            } else {
              ((h) this).field_n = 1048576;
              if (((h) this).field_C) {
                break L4;
              } else {
                ((h) this).field_l = 0;
                if (((h) this).field_A) {
                  break L4;
                } else {
                  L6: {
                    if (((h) this).field_E != null) {
                      ((h) this).field_r.e(15);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((h) this).field_E = null;
                  break L4;
                }
              }
            }
          } else {
            break L4;
          }
        }
    }

    private final void a(int param0, int param1, ga param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param2.a((byte) -78, -1, param0);
              param2.c(param1, false);
              if (param3 <= -93) {
                break L1;
              } else {
                h.d(-81);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("h.F(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = jg.a(param1, false, var4).getFile();
                    Object discarded$6 = ll.a(param1, "updatelinks", new Object[2], -95);
                    Object discarded$7 = ll.a(param1, "updatelinks", new Object[2], -65);
                    Object discarded$8 = ll.a(param1, "updatelinks", new Object[2], -88);
                    Object discarded$9 = ll.a(param1, "updatelinks", new Object[2], -118);
                    Object discarded$10 = ll.a(param1, "updatelinks", new Object[2], -82);
                    Object discarded$11 = ll.a(param1, "updatelinks", new Object[2], -104);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("h.C(").append(-1).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
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
        ((h) this).field_u = param0;
        if (param1 != 17) {
            return;
        }
        try {
            ((h) this).field_r = param2;
            ((h) this).field_n = 1048576;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "h.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            boolean discarded$0 = ((h) this).a((gh) null, (byte) -108);
        }
        ((h) this).field_B = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final tn b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, boolean param3, int param4, gh param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_35_0 = 0;
        ga stackIn_41_0 = null;
        gh stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        ga stackIn_42_0 = null;
        gh stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        ga stackIn_43_0 = null;
        gh stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        ga stackIn_50_0 = null;
        gh stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        ga stackIn_51_0 = null;
        gh stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        ga stackIn_52_0 = null;
        gh stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
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
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        ga stackOut_49_0 = null;
        gh stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        ga stackOut_51_0 = null;
        gh stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        ga stackOut_50_0 = null;
        gh stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        ga stackOut_40_0 = null;
        gh stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        ga stackOut_42_0 = null;
        gh stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        ga stackOut_41_0 = null;
        gh stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((h) this).field_C) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if (((h) this).field_l <= 0) {
                      L3: {
                        if (null != ((h) this).field_E) {
                          ((h) this).field_r.e(15);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((h) this).field_E = param5;
                      if (param5 != null) {
                        ((h) this).field_r.a(param5, (byte) 101, false);
                        this.a(param1, param0, ((h) this).field_r, -108);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == ((h) this).field_z) {
                          break L4;
                        } else {
                          ((h) this).field_u.e(15);
                          break L4;
                        }
                      }
                      ((h) this).field_z = param5;
                      if (param5 != null) {
                        ((h) this).field_u.a(param5, (byte) 101, false);
                        this.a(param1, param0, ((h) this).field_u, -119);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param3) {
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
            ((h) this).field_C = stackIn_20_1 != 0;
            if (((h) this).field_z != param5) {
              if (param5 != ((h) this).field_E) {
                if (param2 < -94) {
                  L6: {
                    if (null != ((h) this).field_z) {
                      if (null != ((h) this).field_E) {
                        L7: {
                          if (((h) this).field_n >= 524288) {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            break L7;
                          } else {
                            stackOut_33_0 = 1;
                            stackIn_35_0 = stackOut_33_0;
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
                        if (((h) this).field_E != null) {
                          ((h) this).field_r.e(15);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        ((h) this).field_E = param5;
                        if (param5 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackOut_49_0 = ((h) this).field_r;
                            stackOut_49_1 = (gh) param5;
                            stackOut_49_2 = 101;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            stackIn_50_2 = stackOut_49_2;
                            if (param3) {
                              stackOut_51_0 = (ga) (Object) stackIn_51_0;
                              stackOut_51_1 = (gh) (Object) stackIn_51_1;
                              stackOut_51_2 = stackIn_51_2;
                              stackOut_51_3 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              stackIn_52_2 = stackOut_51_2;
                              stackIn_52_3 = stackOut_51_3;
                              break L11;
                            } else {
                              stackOut_50_0 = (ga) (Object) stackIn_50_0;
                              stackOut_50_1 = (gh) (Object) stackIn_50_1;
                              stackOut_50_2 = stackIn_50_2;
                              stackOut_50_3 = 1;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_52_1 = stackOut_50_1;
                              stackIn_52_2 = stackOut_50_2;
                              stackIn_52_3 = stackOut_50_3;
                              break L11;
                            }
                          }
                          ((ga) (Object) stackIn_52_0).a(stackIn_52_1, (byte) stackIn_52_2, stackIn_52_3 != 0);
                          this.a(param1, param0, ((h) this).field_r, -94);
                          break L10;
                        }
                      }
                      ((h) this).field_l = -param4;
                      break L8;
                    } else {
                      L12: {
                        if (((h) this).field_z == null) {
                          break L12;
                        } else {
                          ((h) this).field_u.e(15);
                          break L12;
                        }
                      }
                      L13: {
                        ((h) this).field_z = param5;
                        if (param5 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackOut_40_0 = ((h) this).field_u;
                            stackOut_40_1 = (gh) param5;
                            stackOut_40_2 = 101;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            if (param3) {
                              stackOut_42_0 = (ga) (Object) stackIn_42_0;
                              stackOut_42_1 = (gh) (Object) stackIn_42_1;
                              stackOut_42_2 = stackIn_42_2;
                              stackOut_42_3 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              stackIn_43_2 = stackOut_42_2;
                              stackIn_43_3 = stackOut_42_3;
                              break L14;
                            } else {
                              stackOut_41_0 = (ga) (Object) stackIn_41_0;
                              stackOut_41_1 = (gh) (Object) stackIn_41_1;
                              stackOut_41_2 = stackIn_41_2;
                              stackOut_41_3 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              stackIn_43_2 = stackOut_41_2;
                              stackIn_43_3 = stackOut_41_3;
                              break L14;
                            }
                          }
                          ((ga) (Object) stackIn_43_0).a(stackIn_43_1, (byte) stackIn_43_2, stackIn_43_3 != 0);
                          this.a(param1, param0, ((h) this).field_u, -103);
                          break L13;
                        }
                      }
                      ((h) this).field_l = param4;
                      break L8;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                ((h) this).field_l = -param4;
                this.a(param1, param0, ((h) this).field_r, -97);
                return;
              }
            } else {
              ((h) this).field_l = param4;
              this.a(param1, param0, ((h) this).field_u, -94);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("h.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param5 == null) {
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
          throw r.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 41);
        }
    }

    public h() {
        ((h) this).field_y = 0;
        ((h) this).field_A = false;
        ((h) this).field_B = 256;
        ga var1 = new ga();
        this.a(var1, (byte) 17, new ga(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_x = new String[]{"Metal", "Biomass", "Energy", "Exotics"};
        field_t = new int[8192];
        field_s = new int[]{-14671840, -12566464, -10461088, -8355712, -6250336, -4144960, -2039584, -1};
    }
}
