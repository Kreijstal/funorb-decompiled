/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends qb {
    private vh field_z;
    ug field_A;
    private int field_p;
    static int[] field_w;
    private int[] field_s;
    private vh field_o;
    private boolean field_n;
    private int field_r;
    static String field_u;
    private int[] field_y;
    private vh field_x;
    private boolean field_q;
    private ug field_C;
    static int[] field_m;
    ug field_B;
    private int field_t;
    private int field_v;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -12) {
            return;
        }
        field_w = null;
        field_u = null;
    }

    private final void a(ug param0, int param1, int param2, int param3) {
        try {
            param0.a(param1, param3, (byte) -82);
            param0.b(param2, 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "tc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final qb c() {
        return null;
    }

    final qb d() {
        return null;
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
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            if (0 < ((tc) this).field_t) {
              L1: {
                if (((tc) this).field_n) {
                  L2: {
                    if (((tc) this).field_p <= 0) {
                      break L2;
                    } else {
                      if (!((tc) this).field_A.b((byte) -126)) {
                        ((tc) this).field_o = null;
                        ((tc) this).field_n = false;
                        ((tc) this).field_p = -((tc) this).field_p;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((tc) this).field_p >= 0) {
                    break L1;
                  } else {
                    if (!((tc) this).field_B.b((byte) -123)) {
                      ((tc) this).field_x = null;
                      ((tc) this).field_p = -((tc) this).field_p;
                      ((tc) this).field_n = false;
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
                var4_int = (((tc) this).field_v >> 12) * ((tc) this).field_t / 256;
                var5 = ((tc) this).field_t - var4_int;
                if (((tc) this).field_p != 0) {
                  ((tc) this).field_v = ((tc) this).field_v + ((tc) this).field_p * param2;
                  if (((tc) this).field_v < 1048576) {
                    if (((tc) this).field_v <= 0) {
                      ((tc) this).field_v = 0;
                      if (((tc) this).field_n) {
                        break L3;
                      } else {
                        ((tc) this).field_p = 0;
                        if (!((tc) this).field_q) {
                          L4: {
                            if (((tc) this).field_o == null) {
                              break L4;
                            } else {
                              ((tc) this).field_A.d(-87);
                              break L4;
                            }
                          }
                          ((tc) this).field_o = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ((tc) this).field_v = 1048576;
                    if (!((tc) this).field_n) {
                      ((tc) this).field_p = 0;
                      if (!((tc) this).field_q) {
                        L5: {
                          if (null == ((tc) this).field_x) {
                            break L5;
                          } else {
                            ((tc) this).field_B.d(-128);
                            break L5;
                          }
                        }
                        ((tc) this).field_x = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (vn.field_g) {
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
                if (256 > ((tc) this).field_r) {
                  L8: {
                    if (((tc) this).field_o != null) {
                      break L8;
                    } else {
                      if (null == ((tc) this).field_x) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((tc) this).field_A.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (((tc) this).field_s == null) {
                            break L10;
                          } else {
                            if (((tc) this).field_s.length >= var6) {
                              cj.a(((tc) this).field_s, 0, var6);
                              cj.a(((tc) this).field_y, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((tc) this).field_s = new int[var6];
                        ((tc) this).field_y = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((tc) this).field_A.b(((tc) this).field_s, 0, param2);
                        ((tc) this).field_B.b(((tc) this).field_y, 0, param2);
                        if (!vn.field_g) {
                          stackOut_50_0 = param1;
                          stackIn_51_0 = stackOut_50_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_49_0 = param1 << 1;
                          stackIn_51_0 = stackOut_49_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_51_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * ((tc) this).field_s[var8] + ((tc) this).field_y[var8] * var5 >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((tc) this).field_B.b(param0, param1, param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (null == ((tc) this).field_z) {
                    break L14;
                  } else {
                    if (((tc) this).field_r != 0) {
                      L15: {
                        L16: {
                          if (((tc) this).field_s == null) {
                            break L16;
                          } else {
                            if (~((tc) this).field_s.length <= ~var6) {
                              cj.a(((tc) this).field_s, 0, var6);
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((tc) this).field_y = new int[var6];
                        ((tc) this).field_s = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((tc) this).field_C.b(((tc) this).field_s, 0, param2);
                        if (!vn.field_g) {
                          stackOut_65_0 = param1;
                          stackIn_66_0 = stackOut_65_0;
                          break L17;
                        } else {
                          param1 = param1 << 1;
                          stackOut_64_0 = param1 << 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L17;
                        }
                      }
                      var7 = stackIn_66_0;
                      var8 = ((tc) this).field_t * ((tc) this).field_r / 256;
                      var9 = ((tc) this).field_t - var8;
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= var6) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = var8 * ((tc) this).field_s[var10] + param0[var7 - -var10] * var9 >> 8;
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
            } else {
              ((tc) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var4;
            stackOut_70_1 = new StringBuilder().append("tc.F(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L19;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, int param1, int param2, vh param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        ug stackIn_39_0 = null;
        vh stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        ug stackIn_40_0 = null;
        vh stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        ug stackIn_41_0 = null;
        vh stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        ug stackIn_48_0 = null;
        vh stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        ug stackIn_49_0 = null;
        vh stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        ug stackIn_50_0 = null;
        vh stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        ug stackOut_47_0 = null;
        vh stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        ug stackOut_49_0 = null;
        vh stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        ug stackOut_48_0 = null;
        vh stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        ug stackOut_38_0 = null;
        vh stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        ug stackOut_40_0 = null;
        vh stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        ug stackOut_39_0 = null;
        vh stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!((tc) this).field_n) {
                break L1;
              } else {
                if (param5) {
                  L2: {
                    if (((tc) this).field_p > 0) {
                      L3: {
                        if (null != ((tc) this).field_o) {
                          ((tc) this).field_A.d(-82);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((tc) this).field_o = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        ((tc) this).field_A.a(param3, param0 ^ 1917, false);
                        this.a(((tc) this).field_A, param4, param1, param0 ^ -22200);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((tc) this).field_x != null) {
                          ((tc) this).field_B.d(-79);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((tc) this).field_x = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        ((tc) this).field_B.a(param3, param0 ^ 1917, false);
                        this.a(((tc) this).field_B, param4, param1, param0 ^ -22200);
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
              if (!param5) {
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
            ((tc) this).field_n = stackIn_19_1 != 0;
            if (((tc) this).field_o != param3) {
              if (((tc) this).field_x != param3) {
                L6: {
                  if (((tc) this).field_o == null) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (((tc) this).field_x == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (((tc) this).field_v >= 524288) {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L7;
                        } else {
                          stackOut_28_0 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_30_0;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var7_int == 0) {
                    L9: {
                      if (((tc) this).field_x != null) {
                        ((tc) this).field_B.d(-83);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      ((tc) this).field_x = param3;
                      if (param3 == null) {
                        break L10;
                      } else {
                        L11: {
                          stackOut_47_0 = ((tc) this).field_B;
                          stackOut_47_1 = (vh) param3;
                          stackOut_47_2 = 20938;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_49_2 = stackOut_47_2;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          stackIn_48_2 = stackOut_47_2;
                          if (param5) {
                            stackOut_49_0 = (ug) (Object) stackIn_49_0;
                            stackOut_49_1 = (vh) (Object) stackIn_49_1;
                            stackOut_49_2 = stackIn_49_2;
                            stackOut_49_3 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            stackIn_50_2 = stackOut_49_2;
                            stackIn_50_3 = stackOut_49_3;
                            break L11;
                          } else {
                            stackOut_48_0 = (ug) (Object) stackIn_48_0;
                            stackOut_48_1 = (vh) (Object) stackIn_48_1;
                            stackOut_48_2 = stackIn_48_2;
                            stackOut_48_3 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            stackIn_50_1 = stackOut_48_1;
                            stackIn_50_2 = stackOut_48_2;
                            stackIn_50_3 = stackOut_48_3;
                            break L11;
                          }
                        }
                        ((ug) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0);
                        this.a(((tc) this).field_B, param4, param1, -1);
                        break L10;
                      }
                    }
                    ((tc) this).field_p = -param2;
                    break L8;
                  } else {
                    L12: {
                      if (null == ((tc) this).field_o) {
                        break L12;
                      } else {
                        ((tc) this).field_A.d(-80);
                        break L12;
                      }
                    }
                    L13: {
                      ((tc) this).field_o = param3;
                      if (param3 != null) {
                        L14: {
                          stackOut_38_0 = ((tc) this).field_A;
                          stackOut_38_1 = (vh) param3;
                          stackOut_38_2 = param0 + -1261;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          if (param5) {
                            stackOut_40_0 = (ug) (Object) stackIn_40_0;
                            stackOut_40_1 = (vh) (Object) stackIn_40_1;
                            stackOut_40_2 = stackIn_40_2;
                            stackOut_40_3 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            stackIn_41_3 = stackOut_40_3;
                            break L14;
                          } else {
                            stackOut_39_0 = (ug) (Object) stackIn_39_0;
                            stackOut_39_1 = (vh) (Object) stackIn_39_1;
                            stackOut_39_2 = stackIn_39_2;
                            stackOut_39_3 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            stackIn_41_3 = stackOut_39_3;
                            break L14;
                          }
                        }
                        ((ug) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0);
                        this.a(((tc) this).field_A, param4, param1, -1);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ((tc) this).field_p = param2;
                    break L8;
                  }
                }
                L15: {
                  if (param0 == 22199) {
                    break L15;
                  } else {
                    tc.a((byte) -5);
                    break L15;
                  }
                }
                break L0;
              } else {
                ((tc) this).field_p = -param2;
                this.a(((tc) this).field_B, param4, param1, -1);
                return;
              }
            } else {
              ((tc) this).field_p = param2;
              this.a(((tc) this).field_A, param4, param1, -1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("tc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L16;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 256) {
            qb discarded$0 = ((tc) this).c();
        }
        ((tc) this).field_t = param0;
    }

    private final void a(boolean param0, ug param1, ug param2) {
        try {
            ((tc) this).field_B = param2;
            ((tc) this).field_v = 1048576;
            ((tc) this).field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "tc.G(" + true + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          if (0 >= ((tc) this).field_v) {
            break L0;
          } else {
            if (((tc) this).field_o == null) {
              break L0;
            } else {
              ((tc) this).field_A.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if (((tc) this).field_v >= 1048576) {
            break L1;
          } else {
            if (null != ((tc) this).field_x) {
              ((tc) this).field_B.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (0 >= ((tc) this).field_r) {
            break L2;
          } else {
            if (((tc) this).field_z != null) {
              ((tc) this).field_C.a(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!((tc) this).field_n) {
            break L3;
          } else {
            if (0 < ((tc) this).field_p) {
              if (!((tc) this).field_A.b((byte) -127)) {
                ((tc) this).field_o = null;
                ((tc) this).field_n = false;
                ((tc) this).field_p = -((tc) this).field_p;
                break L3;
              } else {
                if (((tc) this).field_p >= 0) {
                  break L3;
                } else {
                  if (((tc) this).field_B.b((byte) -121)) {
                    break L3;
                  } else {
                    ((tc) this).field_x = null;
                    ((tc) this).field_p = -((tc) this).field_p;
                    ((tc) this).field_n = false;
                    break L3;
                  }
                }
              }
            } else {
              if (((tc) this).field_p >= 0) {
                break L3;
              } else {
                if (((tc) this).field_B.b((byte) -121)) {
                  break L3;
                } else {
                  ((tc) this).field_x = null;
                  ((tc) this).field_p = -((tc) this).field_p;
                  ((tc) this).field_n = false;
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if (((tc) this).field_p == 0) {
            break L4;
          } else {
            ((tc) this).field_v = ((tc) this).field_v + param0 * ((tc) this).field_p;
            if (((tc) this).field_v < 1048576) {
              if (((tc) this).field_v <= 0) {
                ((tc) this).field_v = 0;
                if (!((tc) this).field_n) {
                  ((tc) this).field_p = 0;
                  if (!((tc) this).field_q) {
                    L5: {
                      if (((tc) this).field_o == null) {
                        break L5;
                      } else {
                        ((tc) this).field_A.d(-86);
                        break L5;
                      }
                    }
                    ((tc) this).field_o = null;
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
              ((tc) this).field_v = 1048576;
              if (((tc) this).field_n) {
                break L4;
              } else {
                ((tc) this).field_p = 0;
                if (!((tc) this).field_q) {
                  L6: {
                    if (((tc) this).field_x == null) {
                      break L6;
                    } else {
                      ((tc) this).field_B.d(-117);
                      break L6;
                    }
                  }
                  ((tc) this).field_x = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final void b(byte param0) {
        if (null != ((tc) this).field_o) {
            ((tc) this).field_A.d(param0 + -131);
        }
        if (null != ((tc) this).field_x) {
            ((tc) this).field_B.d(-96);
        }
        ((tc) this).field_o = null;
        if (param0 != 52) {
            ((tc) this).b((byte) 51);
        }
        ((tc) this).field_x = null;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        pm var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var4 = (pm) (Object) li.field_a.e(-24172);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$8 = 124;
                int discarded$9 = 7;
                ro.a(var4);
                var4 = (pm) (Object) li.field_a.a(4);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "tc.L(" + 7 + ',' + -112 + ')');
        }
    }

    public tc() {
        ((tc) this).field_q = false;
        ((tc) this).field_r = 0;
        ((tc) this).field_t = 256;
        ug var1 = new ug();
        this.a(true, var1, new ug(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
    }
}
