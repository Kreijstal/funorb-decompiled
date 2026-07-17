/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends hn {
    static int field_z;
    private ih field_r;
    private boolean field_F;
    private int field_x;
    private int field_C;
    ih field_y;
    private boolean field_B;
    static int field_o;
    static String field_u;
    ih field_w;
    ih field_D;
    private int[] field_E;
    private um field_p;
    private um field_q;
    private int[] field_t;
    static kl field_s;
    private int field_v;
    private int field_G;
    private um field_A;

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
        int stackIn_32_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((nm) this).field_x <= 0) {
              ((nm) this).a(param2);
              return;
            } else {
              L1: {
                if (((nm) this).field_F) {
                  L2: {
                    if (((nm) this).field_C <= 0) {
                      break L2;
                    } else {
                      if (((nm) this).field_w.g(11899)) {
                        break L2;
                      } else {
                        ((nm) this).field_F = false;
                        ((nm) this).field_p = null;
                        ((nm) this).field_C = -((nm) this).field_C;
                        break L1;
                      }
                    }
                  }
                  if (((nm) this).field_C >= 0) {
                    break L1;
                  } else {
                    if (((nm) this).field_D.g(11899)) {
                      break L1;
                    } else {
                      ((nm) this).field_F = false;
                      ((nm) this).field_C = -((nm) this).field_C;
                      ((nm) this).field_A = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (((nm) this).field_G >> 12) * ((nm) this).field_x / 256;
                var5 = -var4_int + ((nm) this).field_x;
                if (((nm) this).field_C == 0) {
                  break L3;
                } else {
                  ((nm) this).field_G = ((nm) this).field_G + param2 * ((nm) this).field_C;
                  if (1048576 > ((nm) this).field_G) {
                    if (((nm) this).field_G > 0) {
                      break L3;
                    } else {
                      ((nm) this).field_G = 0;
                      if (((nm) this).field_F) {
                        break L3;
                      } else {
                        ((nm) this).field_C = 0;
                        if (!((nm) this).field_B) {
                          L4: {
                            if (((nm) this).field_p == null) {
                              break L4;
                            } else {
                              ((nm) this).field_w.j(7);
                              break L4;
                            }
                          }
                          ((nm) this).field_p = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    ((nm) this).field_G = 1048576;
                    if (((nm) this).field_F) {
                      break L3;
                    } else {
                      ((nm) this).field_C = 0;
                      if (!((nm) this).field_B) {
                        L5: {
                          if (null != ((nm) this).field_A) {
                            ((nm) this).field_D.j(7);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((nm) this).field_A = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (!rc.field_q) {
                  stackOut_31_0 = param2;
                  stackIn_32_0 = stackOut_31_0;
                  break L6;
                } else {
                  stackOut_30_0 = param2 << 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (((nm) this).field_v < 256) {
                  L8: {
                    if (((nm) this).field_p != null) {
                      break L8;
                    } else {
                      if (null == ((nm) this).field_A) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 == 256) {
                      ((nm) this).field_D.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (null == ((nm) this).field_t) {
                            break L10;
                          } else {
                            if (var6 <= ((nm) this).field_t.length) {
                              vm.a(((nm) this).field_t, 0, var6);
                              vm.a(((nm) this).field_E, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((nm) this).field_t = new int[var6];
                        ((nm) this).field_E = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((nm) this).field_w.b(((nm) this).field_t, 0, param2);
                        ((nm) this).field_D.b(((nm) this).field_E, 0, param2);
                        if (!rc.field_q) {
                          stackOut_47_0 = param1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (var5 * ((nm) this).field_E[var8] + var4_int * ((nm) this).field_t[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((nm) this).field_w.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (((nm) this).field_q == null) {
                    break L14;
                  } else {
                    if (((nm) this).field_v != 0) {
                      L15: {
                        L16: {
                          if (((nm) this).field_t == null) {
                            break L16;
                          } else {
                            if (var6 > ((nm) this).field_t.length) {
                              break L16;
                            } else {
                              vm.a(((nm) this).field_t, 0, var6);
                              break L15;
                            }
                          }
                        }
                        ((nm) this).field_E = new int[var6];
                        ((nm) this).field_t = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((nm) this).field_r.b(((nm) this).field_t, 0, param2);
                        if (!rc.field_q) {
                          stackOut_61_0 = param1;
                          stackIn_62_0 = stackOut_61_0;
                          break L17;
                        } else {
                          param1 = param1 << 1;
                          stackOut_60_0 = param1 << 1;
                          stackIn_62_0 = stackOut_60_0;
                          break L17;
                        }
                      }
                      var7 = stackIn_62_0;
                      var8 = ((nm) this).field_x * ((nm) this).field_v / 256;
                      var9 = -var8 + ((nm) this).field_x;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var10 + var7] = param0[var10 + var7] * var9 - -(var8 * ((nm) this).field_t[var10]) >> 8;
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
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("nm.E(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(um param0) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (lk.field_e == null) {
                break L1;
              } else {
                bk.a(256, 1048576, param0, 20607, true);
                break L1;
              }
            }
            L2: {
              if (null != au.field_Kb) {
                var4 = (Object) (Object) l.field_a;
                synchronized (var4) {
                  L3: {
                    au.field_Kb.a(256, -1, (byte) -91);
                    if (lo.field_u == param0) {
                      return;
                    } else {
                      L4: {
                        au.field_Kb.j(7);
                        l.field_a.c();
                        lo.field_u = param0;
                        if (lo.field_u == null) {
                          break L4;
                        } else {
                          au.field_Kb.a(2, true, lo.field_u);
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("nm.N(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 1 + 44 + 256 + 44 + 41 + 41);
        }
    }

    final hn a() {
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        return param0 >= 0;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((nm) this).field_G <= 0) {
            break L0;
          } else {
            if (((nm) this).field_p != null) {
              ((nm) this).field_w.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((nm) this).field_G >= 1048576) {
            break L1;
          } else {
            if (((nm) this).field_A != null) {
              ((nm) this).field_D.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((nm) this).field_v <= 0) {
            break L2;
          } else {
            if (null == ((nm) this).field_q) {
              break L2;
            } else {
              ((nm) this).field_r.a(param0);
              break L2;
            }
          }
        }
        L3: {
          if (!((nm) this).field_F) {
            break L3;
          } else {
            L4: {
              if (((nm) this).field_C <= 0) {
                break L4;
              } else {
                if (((nm) this).field_w.g(11899)) {
                  break L4;
                } else {
                  ((nm) this).field_F = false;
                  ((nm) this).field_C = -((nm) this).field_C;
                  ((nm) this).field_p = null;
                  break L3;
                }
              }
            }
            if (((nm) this).field_C >= 0) {
              break L3;
            } else {
              if (((nm) this).field_D.g(11899)) {
                break L3;
              } else {
                ((nm) this).field_F = false;
                ((nm) this).field_C = -((nm) this).field_C;
                ((nm) this).field_A = null;
                break L3;
              }
            }
          }
        }
        L5: {
          if (((nm) this).field_C != 0) {
            ((nm) this).field_G = ((nm) this).field_G + ((nm) this).field_C * param0;
            if (((nm) this).field_G < 1048576) {
              if (((nm) this).field_G <= 0) {
                ((nm) this).field_G = 0;
                if (((nm) this).field_F) {
                  break L5;
                } else {
                  ((nm) this).field_C = 0;
                  if (((nm) this).field_B) {
                    break L5;
                  } else {
                    L6: {
                      if (null != ((nm) this).field_p) {
                        ((nm) this).field_w.j(7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((nm) this).field_p = null;
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            } else {
              ((nm) this).field_G = 1048576;
              if (!((nm) this).field_F) {
                ((nm) this).field_C = 0;
                if (!((nm) this).field_B) {
                  L7: {
                    if (((nm) this).field_A != null) {
                      ((nm) this).field_D.j(7);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((nm) this).field_A = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          } else {
            break L5;
          }
        }
    }

    final synchronized void a(int param0, boolean param1, um param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_33_0 = 0;
        ih stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        ih stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ih stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        ih stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        ih stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        ih stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        ih stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        ih stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        ih stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        ih stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        ih stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        ih stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((nm) this).field_F) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (((nm) this).field_C <= 0) {
                      L3: {
                        if (null != ((nm) this).field_A) {
                          ((nm) this).field_D.j(7);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((nm) this).field_A = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        ((nm) this).field_D.a(2, false, param2);
                        this.a(-1, ((nm) this).field_D, param5, param0);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((nm) this).field_p != null) {
                          ((nm) this).field_w.j(7);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((nm) this).field_p = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        ((nm) this).field_w.a(2, false, param2);
                        this.a(-1, ((nm) this).field_w, param5, param0);
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
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param1) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L5;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
            ((nm) this).field_F = stackIn_19_1 != 0;
            if (param2 == ((nm) this).field_p) {
              ((nm) this).field_C = param4;
              this.a(-1, ((nm) this).field_w, param5, param0);
              return;
            } else {
              if (param2 == ((nm) this).field_A) {
                ((nm) this).field_C = -param4;
                this.a(-1, ((nm) this).field_D, param5, param0);
                return;
              } else {
                L6: {
                  if (param3 == -1) {
                    break L6;
                  } else {
                    var9 = null;
                    this.a(-25, (ih) null, 43, -18);
                    break L6;
                  }
                }
                L7: {
                  if (((nm) this).field_p == null) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (null == ((nm) this).field_A) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (((nm) this).field_G >= 524288) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L8;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (((nm) this).field_p == null) {
                        break L10;
                      } else {
                        ((nm) this).field_w.j(7);
                        break L10;
                      }
                    }
                    L11: {
                      ((nm) this).field_p = param2;
                      if (param2 != null) {
                        L12: {
                          stackOut_50_0 = ((nm) this).field_w;
                          stackOut_50_1 = 2;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          if (param1) {
                            stackOut_52_0 = (ih) (Object) stackIn_52_0;
                            stackOut_52_1 = stackIn_52_1;
                            stackOut_52_2 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            break L12;
                          } else {
                            stackOut_51_0 = (ih) (Object) stackIn_51_0;
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            stackIn_53_2 = stackOut_51_2;
                            break L12;
                          }
                        }
                        ((ih) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2 != 0, param2);
                        this.a(param3, ((nm) this).field_w, param5, param0);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((nm) this).field_C = param4;
                    break L9;
                  } else {
                    L13: {
                      if (null == ((nm) this).field_A) {
                        break L13;
                      } else {
                        ((nm) this).field_D.j(7);
                        break L13;
                      }
                    }
                    L14: {
                      ((nm) this).field_A = param2;
                      if (param2 != null) {
                        L15: {
                          stackOut_41_0 = ((nm) this).field_D;
                          stackOut_41_1 = param3 + 3;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          if (param1) {
                            stackOut_43_0 = (ih) (Object) stackIn_43_0;
                            stackOut_43_1 = stackIn_43_1;
                            stackOut_43_2 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            stackIn_44_2 = stackOut_43_2;
                            break L15;
                          } else {
                            stackOut_42_0 = (ih) (Object) stackIn_42_0;
                            stackOut_42_1 = stackIn_42_1;
                            stackOut_42_2 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            stackIn_44_2 = stackOut_42_2;
                            break L15;
                          }
                        }
                        ((ih) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2 != 0, param2);
                        this.a(param3, ((nm) this).field_D, param5, param0);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((nm) this).field_C = -param4;
                    break L9;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var7;
            stackOut_56_1 = new StringBuilder().append("nm.J(").append(param0).append(44).append(param1).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param2 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L16;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final hn b() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        ((nm) this).field_x = param0;
        int var3 = 74 % ((param1 - -65) / 46);
    }

    final synchronized int c() {
        return 2;
    }

    private final void a(int param0, ih param1, ih param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((nm) this).field_D = param2;
              ((nm) this).field_w = param1;
              ((nm) this).field_G = 1048576;
              ((nm) this).field_y = ((nm) this).field_w;
              if (param0 >= 36) {
                break L1;
              } else {
                var5 = null;
                this.a(-114, (ih) null, (ih) null);
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
            stackOut_3_1 = new StringBuilder().append("nm.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void e() {
        field_u = null;
        field_s = null;
    }

    private final void a(int param0, ih param1, int param2, int param3) {
        try {
            ((nm) this).field_y = param1;
            param1.a(param3, param0, (byte) -55);
            param1.c(param2, param0 ^ 34);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "nm.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(byte param0, boolean param1) {
        je stackIn_4_0 = null;
        je stackIn_5_0 = null;
        je stackIn_6_0 = null;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_8_0 = null;
        je stackIn_9_0 = null;
        je stackIn_10_0 = null;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackIn_19_0 = null;
        je stackIn_20_0 = null;
        je stackIn_21_0 = null;
        je stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        je stackIn_23_0 = null;
        je stackIn_24_0 = null;
        je stackIn_25_0 = null;
        je stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        je stackOut_3_0 = null;
        je stackOut_4_0 = null;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        je stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        je stackOut_7_0 = null;
        je stackOut_8_0 = null;
        je stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        je stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        je stackOut_18_0 = null;
        je stackOut_19_0 = null;
        je stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        je stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        je stackOut_22_0 = null;
        je stackOut_23_0 = null;
        je stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        je stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        L0: {
          id.a(-640 + qn.field_l >> 1, 640 + qn.field_l >> 1, qn.field_g, 0, (byte) 91);
          if (gk.field_J <= 0) {
            break L0;
          } else {
            L1: {
              if (null == dh.field_k) {
                break L1;
              } else {
                dh.field_k.f(no.field_T.field_S, 0);
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_3_0 = no.field_T;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_4_0 = (je) (Object) stackIn_4_0;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (bw.field_g) {
                    break L3;
                  } else {
                    stackOut_5_0 = (je) (Object) stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = (je) (Object) stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L2;
            }
            L4: {
              L5: {
                ((je) (Object) stackIn_7_0).b(stackIn_7_1 != 0, 20);
                stackOut_7_0 = ov.field_i;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_8_0 = (je) (Object) stackIn_8_0;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (bw.field_g) {
                    break L5;
                  } else {
                    stackOut_9_0 = (je) (Object) stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L4;
                  }
                }
              }
              stackOut_10_0 = (je) (Object) stackIn_10_0;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L4;
            }
            ((je) (Object) stackIn_11_0).b(stackIn_11_1 != 0, 20);
            break L0;
          }
        }
        L6: {
          L7: {
            if (0 < bd.field_r) {
              break L7;
            } else {
              if (rk.field_D > 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (dh.field_k != null) {
              dh.field_k.f(lk.field_a.field_S, 0);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            L10: {
              stackOut_18_0 = lk.field_a;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (!param1) {
                break L10;
              } else {
                stackOut_19_0 = (je) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (vk.field_f) {
                  break L10;
                } else {
                  stackOut_20_0 = (je) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L9;
                }
              }
            }
            stackOut_21_0 = (je) (Object) stackIn_21_0;
            stackOut_21_1 = 0;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L9;
          }
          L11: {
            L12: {
              ((je) (Object) stackIn_22_0).b(stackIn_22_1 != 0, 20);
              stackOut_22_0 = pd.field_c;
              stackIn_25_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!param1) {
                break L12;
              } else {
                stackOut_23_0 = (je) (Object) stackIn_23_0;
                stackIn_25_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (vk.field_f) {
                  break L12;
                } else {
                  stackOut_24_0 = (je) (Object) stackIn_24_0;
                  stackOut_24_1 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L11;
                }
              }
            }
            stackOut_25_0 = (je) (Object) stackIn_25_0;
            stackOut_25_1 = 0;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            break L11;
          }
          ((je) (Object) stackIn_26_0).b(stackIn_26_1 != 0, 20);
          break L6;
        }
        rf.b(-18862);
    }

    final static li a(int param0, int param1, byte[] param2) {
        li var3 = null;
        RuntimeException var3_ref = null;
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
          var3 = new li(param2);
          s.field_e.a((byte) -119, (tc) (Object) var3);
          int discarded$2 = 25522;
          hp.a(var3, 6);
          return var3;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("nm.M(").append(0).append(44).append(6).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    nm(ih param0, ih param1) {
        ((nm) this).field_B = false;
        ((nm) this).field_x = 256;
        ((nm) this).field_v = 0;
        try {
            this.a(121, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "nm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "The following settings need to be changed:  ";
        field_o = -1;
    }
}
