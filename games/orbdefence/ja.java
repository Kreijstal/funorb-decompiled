/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ja {
    private ml field_f;
    private int field_c;
    private int field_g;
    static String field_d;
    static String field_b;
    private int field_a;
    private int field_i;
    private int field_j;
    static boolean field_e;
    private int field_h;

    private final boolean e(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        try {
          L0: {
            L1: {
              var3_int = -15 % ((param1 - 65) / 58);
              if (((ja) this).field_a != 3) {
                break L1;
              } else {
                L2: {
                  if (param0 != 0) {
                    break L2;
                  } else {
                    if (na.field_a == 0) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param0 != 2) {
                  break L1;
                } else {
                  if (oa.field_i.length + -1 == na.field_a) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_19_0 = 1;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ja.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ob.field_K == 41) {
                cj.a(110);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ja) this).field_a != 2) {
                break L2;
              } else {
                if (!n.b((byte) -98)) {
                  L3: {
                    if (ob.field_K != 96) {
                      break L3;
                    } else {
                      L4: {
                        if (0 >= ((ja) this).field_f.field_h) {
                          break L4;
                        } else {
                          if (((ja) this).field_f.field_h != 3) {
                            ((ja) this).field_f.a(0, ((ja) this).field_f.field_h + -1);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((ja) this).field_f.a(0, 2);
                      break L3;
                    }
                  }
                  L5: {
                    if (97 == ob.field_K) {
                      L6: {
                        if (((ja) this).field_f.field_h < 2) {
                          break L6;
                        } else {
                          if (((ja) this).field_f.field_h == 2) {
                            ((ja) this).field_f.a(0, 0);
                            if (var3 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((ja) this).field_f.a(0, ((ja) this).field_f.field_h + 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (ob.field_K == 99) {
                      L8: {
                        L9: {
                          if (((ja) this).field_f.field_h < 0) {
                            break L9;
                          } else {
                            if (((ja) this).field_f.field_h <= 2) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((ja) this).field_f.a(0, dm.field_e);
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      ((ja) this).field_f.a(0, 3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L10: {
                    if (ob.field_K == 98) {
                      L11: {
                        if (((ja) this).field_f.field_h != 3) {
                          break L11;
                        } else {
                          ((ja) this).field_f.a(0, dm.field_e);
                          if (var3 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      ((ja) this).field_f.a(0, 3);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  ((ja) this).field_f.d(0);
                  return;
                } else {
                  break L2;
                }
              }
            }
            if (param0 >= 94) {
              if (((ja) this).field_a != 3) {
                if (((ja) this).field_a != 7) {
                  L12: {
                    L13: {
                      L14: {
                        ((ja) this).field_f.e((byte) -74);
                        if (ob.field_K == 98) {
                          break L14;
                        } else {
                          if (ob.field_K == 99) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: while (true) {
                        if (this.e(((ja) this).field_f.field_h, -30)) {
                          break L13;
                        } else {
                          ((ja) this).field_f.e((byte) -74);
                          if (var3 != 0) {
                            break L12;
                          } else {
                            if (var3 == 0) {
                              continue L15;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    break L12;
                  }
                  break L0;
                } else {
                  ((ja) this).field_f.d((byte) -114);
                  return;
                }
              } else {
                L16: {
                  L17: {
                    ((ja) this).field_f.d((byte) 101);
                    if (ob.field_K == 96) {
                      break L17;
                    } else {
                      if (97 != ob.field_K) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: while (true) {
                    if (this.e(((ja) this).field_f.field_h, -58)) {
                      break L16;
                    } else {
                      ((ja) this).field_f.d((byte) -123);
                      if (var3 == 0) {
                        continue L18;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ja.O(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hj stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        hj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        hj stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        hj stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        hj stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        hj stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        hj stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        hj stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        hj stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        hj stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        hj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        hj stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        hj stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        hj stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        hj stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        hj stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        hj stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        hj stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        hj stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        hj stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        hj stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        hj stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        hj stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        hj stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        hj stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        hj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        hj stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        hj stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        hj stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        hj stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        hj stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        hj stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        hj stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        hj stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        hj stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        hj stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        hj stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        hj stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        hj stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        hj stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        hj stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        hj stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        hj stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        hj stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        hj stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        hj stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        hj stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = this.a((byte) -12);
              var3 = 123;
              var4 = 123;
              var5 = 394;
              var6 = 284;
              var7 = 0;
              ul.d(var3 - -var7, var7 + var4, -(var7 * 2) + var5, -(2 * var7) + var6, var2_int);
              var7++;
              ul.d(var3 - -var7, var4 + var7, var5 - var7 * 2, -(2 * var7) + var6, var2_int);
              var7++;
              if (!param0) {
                break L1;
              } else {
                ((ja) this).b(false);
                break L1;
              }
            }
            ul.d(var7 + var3, var4 - -var7, var5 + -(var7 * 2), var6 + -(var7 * 2), 0);
            var7++;
            var8 = var7 + var4;
            L2: while (true) {
              L3: {
                L4: {
                  if (~(-var7 + (var4 + var6)) >= ~var8) {
                    break L4;
                  } else {
                    ul.a(var7 + var3, var8, var5 + -(var7 * 2), 2232627);
                    ul.f(var7 + var3, var8, var5 + -(var7 * 2), 0, 128);
                    var8++;
                    if (var11 != 0) {
                      break L3;
                    } else {
                      if (var11 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.a(-29253, lc.field_u);
                var8 = 100;
                break L3;
              }
              L5: {
                var9 = 60;
                var8 = var8 + (-20 + var9 * 3 / 2);
                if (((ja) this).field_f.field_h == 0) {
                  hi.field_g[0].e(340, var8, 255);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var10 = qb.b((byte) 123) ? 1 : 0;
                if (((ja) this).field_f.field_h == 1) {
                  L7: {
                    stackOut_18_0 = hi.field_g[1];
                    stackOut_18_1 = 340;
                    stackOut_18_2 = var8;
                    stackIn_21_0 = stackOut_18_0;
                    stackIn_21_1 = stackOut_18_1;
                    stackIn_21_2 = stackOut_18_2;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    if (var10 == 0) {
                      stackOut_21_0 = (hj) (Object) stackIn_21_0;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = 255;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      break L7;
                    } else {
                      stackOut_19_0 = (hj) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2;
                      stackOut_19_3 = 64;
                      stackIn_22_0 = stackOut_19_0;
                      stackIn_22_1 = stackOut_19_1;
                      stackIn_22_2 = stackOut_19_2;
                      stackIn_22_3 = stackOut_19_3;
                      break L7;
                    }
                  }
                  ((hj) (Object) stackIn_22_0).e(stackIn_22_1, stackIn_22_2, stackIn_22_3);
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if (((ja) this).field_f.field_h == 2) {
                  L9: {
                    stackOut_26_0 = hi.field_g[2];
                    stackOut_26_1 = 340;
                    stackOut_26_2 = var8;
                    stackIn_29_0 = stackOut_26_0;
                    stackIn_29_1 = stackOut_26_1;
                    stackIn_29_2 = stackOut_26_2;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    if (var10 == 0) {
                      stackOut_29_0 = (hj) (Object) stackIn_29_0;
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = stackIn_29_2;
                      stackOut_29_3 = 255;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      stackIn_30_2 = stackOut_29_2;
                      stackIn_30_3 = stackOut_29_3;
                      break L9;
                    } else {
                      stackOut_27_0 = (hj) (Object) stackIn_27_0;
                      stackOut_27_1 = stackIn_27_1;
                      stackOut_27_2 = stackIn_27_2;
                      stackOut_27_3 = 64;
                      stackIn_30_0 = stackOut_27_0;
                      stackIn_30_1 = stackOut_27_1;
                      stackIn_30_2 = stackOut_27_2;
                      stackIn_30_3 = stackOut_27_3;
                      break L9;
                    }
                  }
                  ((hj) (Object) stackIn_30_0).e(stackIn_30_1, stackIn_30_2, stackIn_30_3);
                  break L8;
                } else {
                  break L8;
                }
              }
              L10: {
                if (((ja) this).field_f.field_h != 3) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      stackOut_32_0 = hi.field_g[3];
                      stackOut_32_1 = 340;
                      stackOut_32_2 = var8;
                      stackIn_38_0 = stackOut_32_0;
                      stackIn_38_1 = stackOut_32_1;
                      stackIn_38_2 = stackOut_32_2;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      if ((8 & lb.field_g) == 0) {
                        break L12;
                      } else {
                        stackOut_33_0 = (hj) (Object) stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = stackIn_33_2;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_35_2 = stackOut_33_2;
                        stackOut_35_0 = (hj) (Object) stackIn_35_0;
                        stackOut_35_1 = stackIn_35_1;
                        stackOut_35_2 = stackIn_35_2;
                        stackIn_40_0 = stackOut_35_0;
                        stackIn_40_1 = stackOut_35_1;
                        stackIn_40_2 = stackOut_35_2;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        stackIn_36_2 = stackOut_35_2;
                        if (var10 == 0) {
                          stackOut_40_0 = (hj) (Object) stackIn_40_0;
                          stackOut_40_1 = stackIn_40_1;
                          stackOut_40_2 = stackIn_40_2;
                          stackOut_40_3 = 255;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          stackIn_41_3 = stackOut_40_3;
                          break L11;
                        } else {
                          stackOut_36_0 = (hj) (Object) stackIn_36_0;
                          stackOut_36_1 = stackIn_36_1;
                          stackOut_36_2 = stackIn_36_2;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_38_2 = stackOut_36_2;
                          break L12;
                        }
                      }
                    }
                    stackOut_38_0 = (hj) (Object) stackIn_38_0;
                    stackOut_38_1 = stackIn_38_1;
                    stackOut_38_2 = stackIn_38_2;
                    stackOut_38_3 = 64;
                    stackIn_41_0 = stackOut_38_0;
                    stackIn_41_1 = stackOut_38_1;
                    stackIn_41_2 = stackOut_38_2;
                    stackIn_41_3 = stackOut_38_3;
                    break L11;
                  }
                  ((hj) (Object) stackIn_41_0).e(stackIn_41_1, stackIn_41_2, stackIn_41_3);
                  break L10;
                }
              }
              L13: {
                if (((ja) this).field_f.field_h != 4) {
                  break L13;
                } else {
                  L14: {
                    L15: {
                      stackOut_43_0 = hi.field_g[4];
                      stackOut_43_1 = 340;
                      stackOut_43_2 = var8;
                      stackIn_51_0 = stackOut_43_0;
                      stackIn_51_1 = stackOut_43_1;
                      stackIn_51_2 = stackOut_43_2;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      if (0 == (4194304 & lb.field_g)) {
                        break L15;
                      } else {
                        stackOut_44_0 = (hj) (Object) stackIn_44_0;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = stackIn_44_2;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        stackOut_46_0 = (hj) (Object) stackIn_46_0;
                        stackOut_46_1 = stackIn_46_1;
                        stackOut_46_2 = stackIn_46_2;
                        stackIn_51_0 = stackOut_46_0;
                        stackIn_51_1 = stackOut_46_1;
                        stackIn_51_2 = stackOut_46_2;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        if (var10 != 0) {
                          break L15;
                        } else {
                          stackOut_47_0 = (hj) (Object) stackIn_47_0;
                          stackOut_47_1 = stackIn_47_1;
                          stackOut_47_2 = stackIn_47_2;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_49_2 = stackOut_47_2;
                          stackOut_49_0 = (hj) (Object) stackIn_49_0;
                          stackOut_49_1 = stackIn_49_1;
                          stackOut_49_2 = stackIn_49_2;
                          stackOut_49_3 = 255;
                          stackIn_52_0 = stackOut_49_0;
                          stackIn_52_1 = stackOut_49_1;
                          stackIn_52_2 = stackOut_49_2;
                          stackIn_52_3 = stackOut_49_3;
                          break L14;
                        }
                      }
                    }
                    stackOut_51_0 = (hj) (Object) stackIn_51_0;
                    stackOut_51_1 = stackIn_51_1;
                    stackOut_51_2 = stackIn_51_2;
                    stackOut_51_3 = 64;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    stackIn_52_3 = stackOut_51_3;
                    break L14;
                  }
                  ((hj) (Object) stackIn_52_0).e(stackIn_52_1, stackIn_52_2, stackIn_52_3);
                  break L13;
                }
              }
              L16: {
                if (((ja) this).field_f.field_h != 5) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      stackOut_54_0 = hi.field_g[5];
                      stackOut_54_1 = 340;
                      stackOut_54_2 = var8;
                      stackIn_62_0 = stackOut_54_0;
                      stackIn_62_1 = stackOut_54_1;
                      stackIn_62_2 = stackOut_54_2;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      stackIn_55_2 = stackOut_54_2;
                      if (0 == (4194304 & lb.field_g)) {
                        break L18;
                      } else {
                        stackOut_55_0 = (hj) (Object) stackIn_55_0;
                        stackOut_55_1 = stackIn_55_1;
                        stackOut_55_2 = stackIn_55_2;
                        stackIn_57_0 = stackOut_55_0;
                        stackIn_57_1 = stackOut_55_1;
                        stackIn_57_2 = stackOut_55_2;
                        stackOut_57_0 = (hj) (Object) stackIn_57_0;
                        stackOut_57_1 = stackIn_57_1;
                        stackOut_57_2 = stackIn_57_2;
                        stackIn_62_0 = stackOut_57_0;
                        stackIn_62_1 = stackOut_57_1;
                        stackIn_62_2 = stackOut_57_2;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        if (var10 != 0) {
                          break L18;
                        } else {
                          stackOut_58_0 = (hj) (Object) stackIn_58_0;
                          stackOut_58_1 = stackIn_58_1;
                          stackOut_58_2 = stackIn_58_2;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          stackIn_60_2 = stackOut_58_2;
                          stackOut_60_0 = (hj) (Object) stackIn_60_0;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = stackIn_60_2;
                          stackOut_60_3 = 255;
                          stackIn_63_0 = stackOut_60_0;
                          stackIn_63_1 = stackOut_60_1;
                          stackIn_63_2 = stackOut_60_2;
                          stackIn_63_3 = stackOut_60_3;
                          break L17;
                        }
                      }
                    }
                    stackOut_62_0 = (hj) (Object) stackIn_62_0;
                    stackOut_62_1 = stackIn_62_1;
                    stackOut_62_2 = stackIn_62_2;
                    stackOut_62_3 = 64;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    stackIn_63_2 = stackOut_62_2;
                    stackIn_63_3 = stackOut_62_3;
                    break L17;
                  }
                  ((hj) (Object) stackIn_63_0).e(stackIn_63_1, stackIn_63_2, stackIn_63_3);
                  break L16;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ja.N(" + param0 + ')');
        }
    }

    private final int b(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            L1: {
              if (((ja) this).field_a != 2) {
                break L1;
              } else {
                if (n.b((byte) -120)) {
                  break L1;
                } else {
                  if (param0 < 3) {
                    stackOut_9_0 = -6 + wd.field_o[((ja) this).field_a];
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    stackOut_11_0 = -6 + (wd.field_o[((ja) this).field_a] + ek.field_e[((ja) this).field_a]);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              }
            }
            L2: {
              if (2 != ((ja) this).field_a) {
                break L2;
              } else {
                if (!n.b((byte) 108)) {
                  break L2;
                } else {
                  stackOut_17_0 = -6 + (ek.field_e[((ja) this).field_a] * param0 + wd.field_o[((ja) this).field_a]);
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
            }
            if (((ja) this).field_a != 3) {
              L3: {
                if (4 == ((ja) this).field_a) {
                  break L3;
                } else {
                  if (((ja) this).field_a == 5) {
                    break L3;
                  } else {
                    L4: {
                      if (param1 >= 12) {
                        break L4;
                      } else {
                        field_e = false;
                        break L4;
                      }
                    }
                    L5: {
                      if (((ja) this).field_a != 8) {
                        break L5;
                      } else {
                        if (param0 == 0) {
                          stackOut_42_0 = 140;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0;
                        } else {
                          if (param0 == 1) {
                            stackOut_47_0 = 178;
                            stackIn_48_0 = stackOut_47_0;
                            return stackIn_48_0;
                          } else {
                            if (param0 != 2) {
                              if (param0 == 3) {
                                stackOut_55_0 = 254;
                                stackIn_56_0 = stackOut_55_0;
                                return stackIn_56_0;
                              } else {
                                if (4 != param0) {
                                  if (param0 != 5) {
                                    if (param0 != 6) {
                                      if (vh.field_q[((ja) this).field_a][param0] != 5) {
                                        break L5;
                                      } else {
                                        stackOut_67_0 = 415;
                                        stackIn_68_0 = stackOut_67_0;
                                        return stackIn_68_0;
                                      }
                                    } else {
                                      stackOut_64_0 = 368;
                                      stackIn_65_0 = stackOut_64_0;
                                      return stackIn_65_0;
                                    }
                                  } else {
                                    stackOut_61_0 = 330;
                                    stackIn_62_0 = stackOut_61_0;
                                    return stackIn_62_0;
                                  }
                                } else {
                                  stackOut_58_0 = 292;
                                  stackIn_59_0 = stackOut_58_0;
                                  return stackIn_59_0;
                                }
                              }
                            } else {
                              stackOut_50_0 = 216;
                              stackIn_51_0 = stackOut_50_0;
                              return stackIn_51_0;
                            }
                          }
                        }
                      }
                    }
                    stackOut_69_0 = wd.field_o[((ja) this).field_a] + param0 * ek.field_e[((ja) this).field_a];
                    stackIn_70_0 = stackOut_69_0;
                    break L0;
                  }
                }
              }
              if (vh.field_q[((ja) this).field_a].length <= 1) {
                stackOut_31_0 = -4 + (ek.field_e[((ja) this).field_a] * param0 + 430);
                stackIn_32_0 = stackOut_31_0;
                return stackIn_32_0;
              } else {
                stackOut_29_0 = 382 - (-((ek.field_e[((ja) this).field_a] + 12) * param0) - -4);
                stackIn_30_0 = stackOut_29_0;
                return stackIn_30_0;
              }
            } else {
              stackOut_20_0 = wd.field_o[((ja) this).field_a] + -32;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ja.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_70_0;
    }

    private final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 >= 105) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            stackOut_3_0 = 30;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ja.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ja) this).field_f.field_h != -1) {
                param1 = ((ja) this).field_f.field_h;
                break L1;
              } else {
                break L1;
              }
            }
            ((ja) this).field_f.a(param1, this.a(vl.field_d, -21016, ua.field_a), 0, param2);
            var4_int = 14 % ((param0 - -59) / 40);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "ja.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        try {
            field_b = null;
            field_d = null;
            int var1_int = 95 / ((param0 - -25) / 33);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ja.R(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              mj.c(-21108);
              if (!param0) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            L2: {
              if (((ja) this).field_j > 0) {
                ((ja) this).field_j = ((ja) this).field_j - 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (100 > lc.field_o) {
                lc.field_o = lc.field_o + 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (((ja) this).field_a == 7) {
              L4: {
                if (ki.d(-116)) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_19_0 = stackOut_16_0;
                  break L4;
                }
              }
              L5: {
                var2_int = wd.a(stackIn_19_0 != 0, false);
                if (var2_int == 3) {
                  L6: {
                    if (mg.field_k == null) {
                      break L6;
                    } else {
                      lb.a(true);
                      break L6;
                    }
                  }
                  tl.a((byte) -102, uj.b((byte) -120));
                  break L5;
                } else {
                  break L5;
                }
              }
              L7: {
                if (1 == var2_int) {
                  rh.a((byte) 119, 0, false);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var2_int != 2) {
                  break L8;
                } else {
                  rh.a((byte) -117, 0, true);
                  break L8;
                }
              }
              return;
            } else {
              L9: while (true) {
                L10: {
                  L11: {
                    if (!nf.e(32722)) {
                      break L11;
                    } else {
                      stackOut_35_0 = -14;
                      stackOut_35_1 = ~ob.field_K;
                      stackIn_56_0 = stackOut_35_0;
                      stackIn_56_1 = stackOut_35_1;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      if (var3 != 0) {
                        break L10;
                      } else {
                        L12: {
                          if (stackIn_36_0 != stackIn_36_1) {
                            break L12;
                          } else {
                            L13: {
                              if (((ja) this).field_a == 1) {
                                break L13;
                              } else {
                                if (((ja) this).field_a == 6) {
                                  continue L9;
                                } else {
                                  rh.a((byte) 111, bk.field_e, false);
                                  if (var3 == 0) {
                                    continue L9;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            L14: {
                              rh.a((byte) -74, -1, false);
                              hf discarded$1 = gk.a(mh.field_a[44], (byte) -11);
                              if (tc.field_b > 0) {
                                stackOut_49_0 = 0;
                                stackIn_50_0 = stackOut_49_0;
                                break L14;
                              } else {
                                stackOut_47_0 = 7;
                                stackIn_50_0 = stackOut_47_0;
                                break L14;
                              }
                            }
                            bk.field_e = stackIn_50_0;
                            if (var3 == 0) {
                              continue L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        this.c((byte) 126);
                        if (((ja) this).field_f.field_h != -1) {
                          this.a(((ja) this).field_f.field_h, false, false);
                          if (var3 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        } else {
                          continue L9;
                        }
                      }
                    }
                  }
                  ((ja) this).field_f.a(this.a(bg.field_c, -21016, ig.field_fb), -1, this.a(vl.field_d, -21016, ua.field_a));
                  stackOut_55_0 = ((ja) this).field_f.field_h;
                  stackOut_55_1 = -1;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  break L10;
                }
                L15: {
                  if (stackIn_56_0 != stackIn_56_1) {
                    this.a(((ja) this).field_f.field_h, param0, true);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (0 == gi.field_e) {
                    break L16;
                  } else {
                    ((ja) this).field_i = ig.field_fb;
                    ((ja) this).field_c = bg.field_c;
                    break L16;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ja.M(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            L1: {
              if (((ja) this).field_a != 2) {
                break L1;
              } else {
                if (!n.b((byte) -95)) {
                  if (3 <= param1) {
                    stackOut_9_0 = 200 + im.field_a[((ja) this).field_a];
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    stackOut_7_0 = im.field_a[((ja) this).field_a] + 200 * param1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((ja) this).field_a != 2) {
                break L2;
              } else {
                if (n.b((byte) 47)) {
                  stackOut_17_0 = im.field_a[((ja) this).field_a] + -100;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  break L2;
                }
              }
            }
            if (((ja) this).field_a != 3) {
              L3: {
                if (((ja) this).field_a == 4) {
                  break L3;
                } else {
                  if (5 != ((ja) this).field_a) {
                    L4: {
                      if (((ja) this).field_a == 8) {
                        if (param1 > 3) {
                          break L4;
                        } else {
                          stackOut_32_0 = im.field_a[((ja) this).field_a] + -100;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        }
                      } else {
                        break L4;
                      }
                    }
                    if (param0 == -29187) {
                      stackOut_37_0 = im.field_a[((ja) this).field_a];
                      stackIn_38_0 = stackOut_37_0;
                      break L0;
                    } else {
                      stackOut_35_0 = -35;
                      stackIn_36_0 = stackOut_35_0;
                      return stackIn_36_0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_26_0 = 120;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0;
            } else {
              stackOut_20_0 = 200 * param1 + 20;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ja.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_38_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                      param1.getAppletContext().showDocument(f.a(param1, var2, -114), "_top");
                      if (param0 <= -96) {
                        break L2;
                      } else {
                        ja.a(106, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ja.A(").append(param0).append(',');
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -21016) {
                break L1;
              } else {
                int discarded$2 = this.c(-111, -21);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var4_int <= ~vh.field_q[((ja) this).field_a].length) {
                    break L4;
                  } else {
                    var5 = this.b(var4_int, (byte) 53);
                    stackOut_6_0 = this.e(var4_int, 126);
                    stackIn_28_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_7_0) {
                          break L5;
                        } else {
                          if (this.c(-29187, var4_int) > param2) {
                            break L5;
                          } else {
                            if (~param2 <= ~this.d(param1 ^ 21067, var4_int)) {
                              break L5;
                            } else {
                              if (~param0 > ~var5) {
                                break L5;
                              } else {
                                if (param0 < this.a(var4_int, (byte) 117) + var5) {
                                  stackOut_24_0 = var4_int;
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_27_0 = -1;
                stackIn_28_0 = stackOut_27_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "ja.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_28_0;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_110_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_291_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_289_0 = 0;
        L0: {
          L1: {
            var9 = OrbDefence.field_D ? 1 : 0;
            var4_int = vh.field_q[((ja) this).field_a][param0];
            if (!((ja) this).field_f.a((byte) -1)) {
              break L1;
            } else {
              hf discarded$11 = gk.a(mh.field_a[0], (byte) -11);
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (~((ja) this).field_g != ~var4_int) {
            ((ja) this).field_g = var4_int;
            hf discarded$12 = gk.a(mh.field_a[30], (byte) -11);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          L3: {
            L4: {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            L20: {
                                              L21: {
                                                L22: {
                                                  L23: {
                                                    L24: {
                                                      var6 = var4_int;
                                                      if (var6 == 0) {
                                                        break L24;
                                                      } else {
                                                        L25: {
                                                          if (var6 != 19) {
                                                            break L25;
                                                          } else {
                                                            if (var9 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        if (20 == var6) {
                                                          break L23;
                                                        } else {
                                                          if (var6 == 21) {
                                                            break L23;
                                                          } else {
                                                            if (var6 == 22) {
                                                              break L23;
                                                            } else {
                                                              if (var6 == 23) {
                                                                break L23;
                                                              } else {
                                                                L26: {
                                                                  if (24 != var6) {
                                                                    break L26;
                                                                  } else {
                                                                    if (var9 == 0) {
                                                                      break L23;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                                if (var6 == 26) {
                                                                  break L22;
                                                                } else {
                                                                  L27: {
                                                                    if (var6 != 25) {
                                                                      break L27;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        break L21;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var6 == 1) {
                                                                    break L20;
                                                                  } else {
                                                                    L28: {
                                                                      if (5 != var6) {
                                                                        break L28;
                                                                      } else {
                                                                        if (var9 == 0) {
                                                                          break L19;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (var6 == 16) {
                                                                      break L18;
                                                                    } else {
                                                                      L29: {
                                                                        if (var6 != 14) {
                                                                          break L29;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L17;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      L30: {
                                                                        if (var6 != 3) {
                                                                          break L30;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L16;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        if (var6 != 6) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L15;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      L32: {
                                                                        if (2 != var6) {
                                                                          break L32;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L14;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var6 == 12) {
                                                                        break L13;
                                                                      } else {
                                                                        if (var6 == 13) {
                                                                          break L12;
                                                                        } else {
                                                                          if (var6 == 4) {
                                                                            break L11;
                                                                          } else {
                                                                            if (7 == var6) {
                                                                              break L10;
                                                                            } else {
                                                                              L33: {
                                                                                if (var6 != 8) {
                                                                                  break L33;
                                                                                } else {
                                                                                  if (var9 == 0) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (var6 == 9) {
                                                                                break L8;
                                                                              } else {
                                                                                if (var6 == 10) {
                                                                                  break L7;
                                                                                } else {
                                                                                  if (15 == var6) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if (var6 == 17) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      L34: {
                                                                                        if (var6 != 18) {
                                                                                          break L34;
                                                                                        } else {
                                                                                          if (var9 == 0) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            break L34;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (var6 != 11) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        if (var9 == 0) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          break L24;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (!((ja) this).field_f.a((byte) -1)) {
                                                      break L2;
                                                    } else {
                                                      rh.a((byte) -115, 8, param2);
                                                      bk.field_e = ((ja) this).field_a;
                                                      if (var9 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  if (!((ja) this).field_f.a((byte) -1)) {
                                                    break L2;
                                                  } else {
                                                    L35: {
                                                      L36: {
                                                        if (var4_int != 22) {
                                                          break L36;
                                                        } else {
                                                          if (0 != (lb.field_g & 8)) {
                                                            break L35;
                                                          } else {
                                                            if (var9 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L36;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L37: {
                                                        if (23 == var4_int) {
                                                          break L37;
                                                        } else {
                                                          if (var4_int != 24) {
                                                            break L35;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                      if (0 == (lb.field_g & 4194304)) {
                                                        break L2;
                                                      } else {
                                                        break L35;
                                                      }
                                                    }
                                                    L38: {
                                                      if (var4_int >= 20) {
                                                        if (0 < tc.field_b) {
                                                          break L38;
                                                        } else {
                                                          if (var9 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                    L39: {
                                                      hf discarded$13 = gk.a(mh.field_a[44], (byte) -11);
                                                      kj.field_x = null;
                                                      mm.field_A = null;
                                                      il.field_f = new nk(-19 + var4_int);
                                                      rh.a((byte) -79, -1, param2);
                                                      if (0 < tc.field_b) {
                                                        stackOut_109_0 = 0;
                                                        stackIn_110_0 = stackOut_109_0;
                                                        break L39;
                                                      } else {
                                                        stackOut_108_0 = 7;
                                                        stackIn_110_0 = stackOut_108_0;
                                                        break L39;
                                                      }
                                                    }
                                                    bk.field_e = stackIn_110_0;
                                                    if (var9 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                if (!((ja) this).field_f.a((byte) -1)) {
                                                  break L2;
                                                } else {
                                                  L40: {
                                                    hf discarded$14 = gk.a(mh.field_a[44], (byte) -11);
                                                    kj.field_x = null;
                                                    mm.field_A = null;
                                                    il.field_f = new nk(0);
                                                    rh.a((byte) 117, -1, param2);
                                                    if (tc.field_b > 0) {
                                                      stackOut_116_0 = 0;
                                                      stackIn_117_0 = stackOut_116_0;
                                                      break L40;
                                                    } else {
                                                      stackOut_115_0 = 7;
                                                      stackIn_117_0 = stackOut_115_0;
                                                      break L40;
                                                    }
                                                  }
                                                  bk.field_e = stackIn_117_0;
                                                  if (var9 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              if (!((ja) this).field_f.a((byte) -1)) {
                                                break L2;
                                              } else {
                                                L41: {
                                                  if (df.field_f) {
                                                    stackOut_123_0 = 0;
                                                    stackIn_124_0 = stackOut_123_0;
                                                    break L41;
                                                  } else {
                                                    stackOut_122_0 = 1;
                                                    stackIn_124_0 = stackOut_122_0;
                                                    break L41;
                                                  }
                                                }
                                                df.field_f = stackIn_124_0 != 0;
                                                if (var9 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            if (!((ja) this).field_f.a((byte) -1)) {
                                              break L2;
                                            } else {
                                              L42: {
                                                hf discarded$15 = gk.a(mh.field_a[44], (byte) -11);
                                                rh.a((byte) -24, -1, param2);
                                                if (tc.field_b <= 0) {
                                                  stackOut_130_0 = 7;
                                                  stackIn_131_0 = stackOut_130_0;
                                                  break L42;
                                                } else {
                                                  stackOut_129_0 = 0;
                                                  stackIn_131_0 = stackOut_129_0;
                                                  break L42;
                                                }
                                              }
                                              bk.field_e = stackIn_131_0;
                                              if (var9 == 0) {
                                                break L2;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L43: {
                                            var5 = 12;
                                            if (~var5 == ~bl.field_p) {
                                              break L43;
                                            } else {
                                              hi.a(ee.field_b[var5], 2, false, 1, true, 2);
                                              break L43;
                                            }
                                          }
                                          bl.field_p = var5;
                                          if (!((ja) this).field_f.a((byte) -1)) {
                                            break L2;
                                          } else {
                                            L44: {
                                              if (bk.field_e == 7) {
                                                break L44;
                                              } else {
                                                rh.a((byte) -128, 0, param2);
                                                if (var9 == 0) {
                                                  break L2;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                            rh.a((byte) 118, 7, param2);
                                            if (var9 == 0) {
                                              break L2;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        if (!((ja) this).field_f.a((byte) -1)) {
                                          break L2;
                                        } else {
                                          rh.a((byte) 114, 7, param2);
                                          dm.field_f = 0;
                                          lb.field_g = 0;
                                          pe.field_b.a(false);
                                          if (var9 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      if (((ja) this).field_f.a((byte) -1)) {
                                        rh.a((byte) 110, 4, param2);
                                        bk.field_e = ((ja) this).field_a;
                                        if (var9 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                    if (!((ja) this).field_f.a((byte) -1)) {
                                      break L2;
                                    } else {
                                      na.field_a = 0;
                                      rh.a((byte) 127, 3, param2);
                                      bk.field_e = ((ja) this).field_a;
                                      if (var9 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  if (!((ja) this).field_f.a((byte) -1)) {
                                    break L2;
                                  } else {
                                    rh.a((byte) -80, bk.field_e, param2);
                                    if (var9 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (((ja) this).field_f.a((byte) -1)) {
                                  rh.a((byte) -45, 2, param2);
                                  if (var9 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              L45: {
                                if (!((ja) this).field_f.c(-119)) {
                                  break L45;
                                } else {
                                  ce.a(0, (byte) -127);
                                  hf discarded$16 = gk.a(mh.field_a[0], (byte) -11);
                                  break L45;
                                }
                              }
                              L46: {
                                if (!((ja) this).field_f.b(false)) {
                                  break L46;
                                } else {
                                  ce.a(256, (byte) -119);
                                  hf discarded$17 = gk.a(mh.field_a[0], (byte) -11);
                                  break L46;
                                }
                              }
                              L47: {
                                if (!((ja) this).field_f.e(106)) {
                                  break L47;
                                } else {
                                  id.a(74);
                                  hf discarded$18 = gk.a(mh.field_a[0], (byte) -11);
                                  break L47;
                                }
                              }
                              L48: {
                                if (!((ja) this).field_f.b((byte) 127)) {
                                  break L48;
                                } else {
                                  L49: {
                                    if (param1) {
                                      stackOut_172_0 = 0;
                                      stackIn_173_0 = stackOut_172_0;
                                      break L49;
                                    } else {
                                      stackOut_171_0 = 1;
                                      stackIn_173_0 = stackOut_171_0;
                                      break L49;
                                    }
                                  }
                                  ph.b(stackIn_173_0 != 0);
                                  hf discarded$19 = gk.a(mh.field_a[0], (byte) -11);
                                  break L48;
                                }
                              }
                              if (((ja) this).field_f.c((byte) 126)) {
                                L50: {
                                  L51: {
                                    var6 = aa.field_c + 128 - -9;
                                    var7 = (-var6 + this.c(-29187, param0) - -this.d(-118, param0) >> 468737409) + (aa.field_c - -8);
                                    var8 = ua.field_a + -var7 << -2044743999;
                                    if (var8 > 0) {
                                      break L51;
                                    } else {
                                      ce.a(0, (byte) -118);
                                      if (var9 == 0) {
                                        break L50;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    if (var8 < 256) {
                                      break L52;
                                    } else {
                                      ce.a(256, (byte) -127);
                                      if (var9 == 0) {
                                        break L50;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  ce.a(var8, (byte) -118);
                                  break L50;
                                }
                                L53: {
                                  if (0 < ((ja) this).field_j) {
                                    break L53;
                                  } else {
                                    hf discarded$20 = gk.a(mh.field_a[0], (byte) -11);
                                    ((ja) this).field_j = 25;
                                    break L53;
                                  }
                                }
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L2;
                              }
                            }
                            L54: {
                              if (!((ja) this).field_f.c(-121)) {
                                break L54;
                              } else {
                                ia.b(0, -23235);
                                break L54;
                              }
                            }
                            L55: {
                              if (((ja) this).field_f.b(param1)) {
                                ia.b(256, -23235);
                                break L55;
                              } else {
                                break L55;
                              }
                            }
                            L56: {
                              if (((ja) this).field_f.e(100)) {
                                kj.i(117);
                                break L56;
                              } else {
                                break L56;
                              }
                            }
                            L57: {
                              if (((ja) this).field_f.b((byte) 125)) {
                                gk.b(2);
                                break L57;
                              } else {
                                break L57;
                              }
                            }
                            if (!((ja) this).field_f.c((byte) -21)) {
                              break L2;
                            } else {
                              L58: {
                                L59: {
                                  var6 = 9 + (aa.field_c - -128);
                                  var7 = 8 + (-var6 + (this.c(-29187, param0) + this.d(-95, param0)) >> 883338561) - -aa.field_c;
                                  var8 = ua.field_a - var7 << -313481247;
                                  if (var8 <= 0) {
                                    break L59;
                                  } else {
                                    L60: {
                                      if (var8 >= 256) {
                                        break L60;
                                      } else {
                                        ia.b(var8, -23235);
                                        if (var9 == 0) {
                                          break L58;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    ia.b(256, -23235);
                                    if (var9 == 0) {
                                      break L58;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                                ia.b(0, -23235);
                                break L58;
                              }
                              if (var9 == 0) {
                                break L2;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (((ja) this).field_f.a((byte) -1)) {
                            L61: {
                              if (null != mg.field_k) {
                                break L61;
                              } else {
                                var6 = param2 ? 1 : 0;
                                ud.a(8, bk.field_d, var6 != 0, ob.field_I.field_B + ob.field_I.field_E, 6, 6, (kc) (Object) ob.field_I, ob.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L61;
                                }
                              }
                            }
                            lb.a(true);
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          } else {
                            break L2;
                          }
                        }
                        L62: {
                          if (bl.field_p != 12) {
                            hi.a(ee.field_b[12], 2, false, 1, true, 2);
                            break L62;
                          } else {
                            break L62;
                          }
                        }
                        bl.field_p = 12;
                        if (((ja) this).field_f.a((byte) -1)) {
                          L63: {
                            L64: {
                              hf discarded$21 = gk.a(mh.field_a[45], (byte) -11);
                              if (n.b((byte) 73)) {
                                break L64;
                              } else {
                                L65: {
                                  il.field_f.c(-1);
                                  kj.field_x = null;
                                  if (dm.field_f != 0) {
                                    break L65;
                                  } else {
                                    rh.a((byte) -7, 2, param2);
                                    if (var9 == 0) {
                                      break L63;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                                rh.a((byte) 125, 5, param2);
                                if (var9 == 0) {
                                  break L63;
                                } else {
                                  break L64;
                                }
                              }
                            }
                            L66: {
                              if (wf.field_c.field_e[0].field_d <= 0) {
                                break L66;
                              } else {
                                rh.a((byte) 38, 6, param2);
                                if (var9 == 0) {
                                  break L63;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            rh.a((byte) -25, 0, param2);
                            break L63;
                          }
                          L67: {
                            if (tc.field_b > 0) {
                              stackOut_236_0 = 0;
                              stackIn_237_0 = stackOut_236_0;
                              break L67;
                            } else {
                              stackOut_235_0 = 7;
                              stackIn_237_0 = stackOut_235_0;
                              break L67;
                            }
                          }
                          bk.field_e = stackIn_237_0;
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        } else {
                          break L2;
                        }
                      }
                      if (!((ja) this).field_f.a((byte) -1)) {
                        break L2;
                      } else {
                        dm.field_e = 0;
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (!((ja) this).field_f.a((byte) -1)) {
                      break L2;
                    } else {
                      dm.field_e = 1;
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (((ja) this).field_f.a((byte) -1)) {
                    dm.field_e = 2;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  } else {
                    break L2;
                  }
                }
                if (((ja) this).field_f.a((byte) -1)) {
                  L68: {
                    L69: {
                      if (((ja) this).field_a == 4) {
                        break L69;
                      } else {
                        if (2 == ((ja) this).field_a) {
                          break L69;
                        } else {
                          if (((ja) this).field_a != 8) {
                            break L68;
                          } else {
                            break L69;
                          }
                        }
                      }
                    }
                    pi.a(((ja) this).field_a, 19741, ((ja) this).field_a);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L68;
                    }
                  }
                  if (6 != ((ja) this).field_a) {
                    break L2;
                  } else {
                    L70: {
                      if (dm.field_f == 0) {
                        stackOut_265_0 = 2;
                        stackIn_266_0 = stackOut_265_0;
                        break L70;
                      } else {
                        stackOut_264_0 = 5;
                        stackIn_266_0 = stackOut_264_0;
                        break L70;
                      }
                    }
                    pi.a(stackIn_266_0, 19741, 6);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (!((ja) this).field_f.a((byte) -1)) {
                break L2;
              } else {
                if (!this.e(param0, -114)) {
                  break L2;
                } else {
                  na.field_a = na.field_a - 1;
                  if (this.e(param0, -44)) {
                    break L2;
                  } else {
                    ((ja) this).field_f.field_h = 2;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            if (!((ja) this).field_f.a((byte) -1)) {
              break L2;
            } else {
              if (!this.e(param0, 126)) {
                break L2;
              } else {
                na.field_a = na.field_a + 1;
                if (!this.e(param0, 125)) {
                  ((ja) this).field_f.field_h = 0;
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          if (((ja) this).field_f.a((byte) -1)) {
            L71: {
              if (mg.field_k == null) {
                break L71;
              } else {
                L72: {
                  if (param1) {
                    stackOut_290_0 = 0;
                    stackIn_291_0 = stackOut_290_0;
                    break L72;
                  } else {
                    stackOut_289_0 = 1;
                    stackIn_291_0 = stackOut_289_0;
                    break L72;
                  }
                }
                lb.a(stackIn_291_0 != 0);
                break L71;
              }
            }
            ja.a(-99, uj.b((byte) -120));
            break L2;
          } else {
            break L2;
          }
        }
        L73: {
          if (!param1) {
            break L73;
          } else {
            ((ja) this).field_j = 123;
            break L73;
          }
        }
    }

    final void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 > 8) {
                break L1;
              } else {
                ((ja) this).field_f = null;
                break L1;
              }
            }
            L2: {
              if (7 == ((ja) this).field_a) {
                var3_int = -1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((ja) this).field_a != 0) {
                break L3;
              } else {
                if (((ja) this).field_f.field_h == -1) {
                  break L3;
                } else {
                  var3_int = ((ja) this).field_f.field_h;
                  break L3;
                }
              }
            }
            L4: {
              if (((ja) this).field_a != 1) {
                break L4;
              } else {
                if (((ja) this).field_f.field_h == -1) {
                  break L4;
                } else {
                  if (kf.field_c == -1) {
                    break L4;
                  } else {
                    var3_int = ((ja) this).field_f.field_h;
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (3 == ((ja) this).field_a) {
                var3_int = 2;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              ((ja) this).field_f.a(var3_int, this.a(vl.field_d, -21016, ua.field_a), 0, param0);
              ((ja) this).field_h = -1;
              if (((ja) this).field_a == 7) {
                vk.a(0, param0);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) (Object) runtimeException, "ja.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        sc var10_ref_sc = null;
        int var10 = 0;
        gj var11 = null;
        int var11_int = 0;
        String[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        String var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        String stackIn_110_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_109_0 = null;
        String stackOut_108_0 = null;
        L0: {
          var28 = OrbDefence.field_D ? 1 : 0;
          var3 = this.a((byte) -12);
          var4 = 123;
          var5 = 108;
          var6 = 394;
          if (wj.field_m != 2) {
            break L0;
          } else {
            var6 += 20;
            var4 -= 10;
            break L0;
          }
        }
        L1: {
          var7 = 280;
          if (wj.field_m != 3) {
            break L1;
          } else {
            var4 -= 10;
            var6 += 20;
            break L1;
          }
        }
        L2: {
          var2_int = 0;
          if (param0 > 34) {
            break L2;
          } else {
            ((ja) this).field_i = -11;
            break L2;
          }
        }
        ul.d(var2_int + var4, var2_int + var5, -(var2_int * 2) + var6, -(var2_int * 2) + var7, var3);
        var2_int++;
        ul.d(var4 + var2_int, var2_int + var5, -(var2_int * 2) + var6, var7 + -(var2_int * 2), var3);
        var2_int++;
        ul.d(var4 - -var2_int, var2_int + var5, -(2 * var2_int) + var6, -(2 * var2_int) + var7, 0);
        var2_int++;
        var8_int = var2_int + var5;
        L3: while (true) {
          L4: {
            if (var5 - (-var7 - -var2_int) <= var8_int) {
              break L4;
            } else {
              ul.f(var2_int + var4, var8_int, var6 - 2 * var2_int, 0, 128);
              var8_int++;
              if (var28 == 0) {
                continue L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            var8 = df.field_a;
            if (dm.field_e == 1) {
              var8 = hh.field_e;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (2 == dm.field_e) {
              var8 = bk.field_c;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            L8: {
              L9: {
                L10: {
                  L11: {
                    L12: {
                      this.a(-29253, var8);
                      if (n.b((byte) 67)) {
                        break L12;
                      } else {
                        var9_int = 0;
                        L13: while (true) {
                          if (var9_int >= 6) {
                            break L12;
                          } else {
                            var10 = 0;
                            var11_int = 0;
                            stackOut_18_0 = -1;
                            stackOut_18_1 = ~var9_int;
                            stackIn_59_0 = stackOut_18_0;
                            stackIn_59_1 = stackOut_18_1;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            if (var28 != 0) {
                              break L11;
                            } else {
                              L14: {
                                if (stackIn_19_0 != stackIn_19_1) {
                                  break L14;
                                } else {
                                  var11_int = 160;
                                  var10 = 75;
                                  break L14;
                                }
                              }
                              L15: {
                                if (var9_int == 1) {
                                  var11_int = 240;
                                  var10 = 75;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              L16: {
                                if (var9_int != 2) {
                                  break L16;
                                } else {
                                  var11_int = 320;
                                  var10 = 75;
                                  break L16;
                                }
                              }
                              L17: {
                                if (var9_int == 3) {
                                  var11_int = 160;
                                  var10 = 565;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (var9_int != 4) {
                                  break L18;
                                } else {
                                  var11_int = 240;
                                  var10 = 565;
                                  break L18;
                                }
                              }
                              L19: {
                                if (5 != var9_int) {
                                  break L19;
                                } else {
                                  var11_int = 320;
                                  var10 = 565;
                                  break L19;
                                }
                              }
                              L20: {
                                L21: {
                                  var11_int -= 30;
                                  var10 -= 40;
                                  if (n.b((byte) 74)) {
                                    break L21;
                                  } else {
                                    if (tc.field_b <= 0) {
                                      break L21;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if (var9_int <= 0) {
                                  break L20;
                                } else {
                                  me.field_n.d(var10 - -8, var11_int);
                                  break L20;
                                }
                              }
                              L22: {
                                L23: {
                                  if (~n.field_a == ~var9_int) {
                                    break L23;
                                  } else {
                                    hi.field_g[var9_int].e(var10, var11_int, 80, 60, 255);
                                    if (~var10 < ~ua.field_a) {
                                      break L22;
                                    } else {
                                      if (vl.field_d < var11_int) {
                                        break L22;
                                      } else {
                                        if (~ua.field_a <= ~(var10 + 80)) {
                                          break L22;
                                        } else {
                                          if (~(60 + var11_int) >= ~vl.field_d) {
                                            break L22;
                                          } else {
                                            if (of.field_G != 1) {
                                              break L22;
                                            } else {
                                              kj.field_x = null;
                                              n.field_a = var9_int;
                                              if (var28 == 0) {
                                                break L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                hg.field_ab.e(var10, var11_int + -5, 192);
                                hi.field_g[var9_int].e(var10, var11_int, 80, 60, 255);
                                break L22;
                              }
                              ob.field_I.c(gb.field_g[var9_int], 40 + var10, var11_int + 70, 16777215, 0);
                              var9_int++;
                              if (var28 == 0) {
                                continue L13;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (n.b((byte) -99)) {
                      break L9;
                    } else {
                      if (kj.field_x != null) {
                        break L10;
                      } else {
                        stackOut_58_0 = 1;
                        stackOut_58_1 = 3;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        break L11;
                      }
                    }
                  }
                  kj.field_x = fh.a(stackIn_59_0, stackIn_59_1, n.field_a, 10, (byte) -38);
                  break L10;
                }
                L24: {
                  L25: {
                    var10_ref_sc = ob.field_I;
                    var11 = kj.field_x;
                    if (var11.field_h) {
                      break L25;
                    } else {
                      var9 = ql.field_f;
                      if (var28 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (null != var11.field_i) {
                      break L26;
                    } else {
                      var9 = pg.field_b;
                      if (var28 == 0) {
                        break L24;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var9 = oa.field_a;
                    var12 = var11.field_i[dm.field_e];
                    var13 = var11.field_l[dm.field_e];
                    var14 = oc.a(dm.field_e, -1, mm.field_A, var11);
                    int discarded$1 = var10_ref_sc.a("10. ");
                    var15 = jd.field_c.field_H + 140;
                    var16 = 310;
                    var17 = 320;
                    var15 -= 20;
                    var18 = 128;
                    var19 = 512;
                    var20 = 28900 + -((jd.field_c.field_H / 2 + (240 - var15)) * (240 + (-var15 + jd.field_c.field_H / 2)));
                    var21 = 128;
                    if (var20 > 0) {
                      var21 = (int)Math.sqrt((double)var20);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    var18 = -var21 + var17;
                    var19 = 320 - -var21;
                    var22 = 16777215;
                    if (~var2_int != ~var14) {
                      break L28;
                    } else {
                      var22 = 16759807;
                      break L28;
                    }
                  }
                  var10_ref_sc.b(bg.field_d, var18, var15, var22, -1);
                  var10_ref_sc.c(nh.field_e, var16 + (var19 + -320) / 4, var15, var22, -1);
                  var10_ref_sc.a(we.field_F, var19, var15, var22, -1);
                  var15 += 20;
                  var2_int = 0;
                  L29: while (true) {
                    L30: {
                      if (var2_int >= 10) {
                        break L30;
                      } else {
                        var18 = 128;
                        var19 = 512;
                        var20 = 28900 + -((-var15 + 240 - -(jd.field_c.field_H / 2)) * (jd.field_c.field_H / 2 + (-var15 + 240)));
                        var21 = 128;
                        stackOut_72_0 = -1;
                        stackOut_72_1 = ~var20;
                        stackIn_107_0 = stackOut_72_0;
                        stackIn_107_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (var28 != 0) {
                          break L7;
                        } else {
                          L31: {
                            if (stackIn_73_0 > stackIn_73_1) {
                              var21 = (int)Math.sqrt((double)var20);
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            var18 = var17 + -var21;
                            var19 = 320 - -var21;
                            if (null != var12[var2_int]) {
                              L33: {
                                var22 = 16777215;
                                var23 = var13[var2_int];
                                var24 = var12[var2_int];
                                if (var2_int == var14) {
                                  ul.a(var18 - 30, -12 + var15, -var18 + (60 + var19), 16, 6, 16759807, 64);
                                  var22 = 16759807;
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  jd.field_c.a(1 + var2_int + ". ", var18 + -1, var15, 0, 0);
                                  jd.field_c.b(var24, var18 + -1, var15, 0, 0);
                                  jd.field_c.a(1 + var2_int + ". ", var18, -1 + var15, 0, 0);
                                  jd.field_c.b(var24, var18, var15 + -1, 0, 0);
                                  jd.field_c.a(var2_int - -1 + ". ", var18, var15, var22, -1);
                                  jd.field_c.b(var24, var18, var15, var22, -1);
                                  var25 = var23 % 105;
                                  if (var25 < 100) {
                                    break L35;
                                  } else {
                                    var26 = 0;
                                    L36: while (true) {
                                      L37: {
                                        L38: {
                                          if (~(var25 + -99) >= ~var26) {
                                            break L38;
                                          } else {
                                            hg.field_ab.a(-11 + var16 + ((var19 - 320) / 4 + (8 * (100 - (var25 - 2 * var26)) + (int)(Math.sin((double)var2_int + 0.005 * (double)ji.b(-78)) * 8.0))), var15 + -14);
                                            var26++;
                                            if (var28 != 0) {
                                              break L37;
                                            } else {
                                              if (var28 == 0) {
                                                continue L36;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                        }
                                        jd.field_c.c(this.b(var25, -70), (-320 + var19) / 4 + var16, var15 + -1, 0, 0);
                                        jd.field_c.c(this.b(var25, -86), var16 + ((var19 + -320) / 4 + -1), var15, 0, 0);
                                        jd.field_c.c(this.b(var25, -75), (var19 - 320) / 4 + var16, var15, var22, -1);
                                        break L37;
                                      }
                                      if (var28 == 0) {
                                        break L34;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                L39: {
                                  if (var25 >= 100) {
                                    break L39;
                                  } else {
                                    if (0 >= var25) {
                                      break L39;
                                    } else {
                                      var26 = 11 + (-1 + var25) / 11 * 11;
                                      var27 = jc.field_f[n.field_a][-1 + var26];
                                      ab.field_g[12 * var27].a(-11 + (var19 + -320) / 4 - (-var16 - (int)(8.0 * Math.sin(0.005 * (double)ji.b(122) + (double)var2_int))), var15 + -16);
                                      jd.field_c.c(this.b(var25, -114), var16 + (var19 - 320) / 4, var15 - 1, 0, 0);
                                      jd.field_c.c(this.b(var25, -124), -1 + var16 + (-320 + var19) / 4, var15, 0, 0);
                                      jd.field_c.c(this.b(var25, -81), var16 + (-320 + var19) / 4, var15, var22, -1);
                                      if (var28 == 0) {
                                        break L34;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                                jd.field_c.c(this.b(var25, -126), -1 + (var16 + (-320 + var19) / 4), var15, 0, 0);
                                jd.field_c.c(this.b(var25, -80), (-320 + var19) / 4 + var16, -1 + var15, 0, 0);
                                jd.field_c.c(this.b(var25, -75), var16 + (-320 + var19) / 4, var15, var22, -1);
                                break L34;
                              }
                              jd.field_c.a(this.a(var23 / 105, -1001), var19 + -1, var15, 0, 0);
                              jd.field_c.a(this.a(var23 / 105, -1001), var19, var15 + -1, 0, 0);
                              jd.field_c.a(this.a(var23 / 105, -1001), var19, var15, var22, -1);
                              var9 = "";
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          var15 += 20;
                          var2_int++;
                          if (var28 == 0) {
                            continue L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    if (il.field_f == null) {
                      break L24;
                    } else {
                      if (var14 != -1) {
                        break L24;
                      } else {
                        if (~n.field_a != ~il.field_f.field_b) {
                          break L24;
                        } else {
                          ul.a(148, var15 + -12, 344, 16, 6, 16759807, 64);
                          jd.field_c.b(gb.field_h, 168, var15, 16759807, -1);
                          jd.field_c.c(this.b(wf.field_c.field_x, -88), 348, var15, 16759807, -1);
                          jd.field_c.a(this.a(wf.field_c.field_e[0].field_d, -1001), 462, var15, 16759807, -1);
                          break L24;
                        }
                      }
                    }
                  }
                }
                if (var28 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              var9 = oa.field_a;
              break L8;
            }
            stackOut_106_0 = ob.field_I.field_H;
            stackOut_106_1 = 240;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            break L7;
          }
          L40: {
            var10 = stackIn_107_0 + stackIn_107_1;
            ob.field_I.c(var9, 320, var10, 16777215, -1);
            if (!n.b((byte) -92)) {
              stackOut_109_0 = h.field_L;
              stackIn_110_0 = stackOut_109_0;
              break L40;
            } else {
              stackOut_108_0 = qk.field_a;
              stackIn_110_0 = stackOut_108_0;
              break L40;
            }
          }
          var9 = stackIn_110_0;
          jd.field_c.c(var9, 320, 220 + ob.field_I.field_H + 140, 16777215, -1);
          return;
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_14_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_124_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        L0: {
          var19 = OrbDefence.field_D ? 1 : 0;
          if (param0 == 16) {
            break L0;
          } else {
            ((ja) this).a(true, (byte) 123);
            break L0;
          }
        }
        L1: {
          var4_int = this.b(param2, (byte) 24);
          var5 = this.c(param0 ^ -29203, param2);
          var6 = this.d(-97, param2);
          var7 = vh.field_q[((ja) this).field_a][param2];
          var8 = jg.field_n[var7];
          if (null == var8) {
            var8 = "ERROR: missing text";
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var9 = -var5 + this.d(param0 + -128, param2);
          var10 = this.a(param2, (byte) 123);
          if (param1) {
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var7 < 8) {
            break L3;
          } else {
            if (10 < var7) {
              break L3;
            } else {
              if (dm.field_e != param2) {
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L4: {
          if (param1) {
            stackOut_13_0 = 16759807;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = 16777215;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          L6: {
            var11 = stackIn_14_0;
            var12 = ob.field_I;
            var13 = -var12.field_B + (-bk.field_d[0].field_t + (var10 - bk.field_d[6].field_t)) - var12.field_H;
            var13 = -16;
            if (var7 == 12) {
              break L6;
            } else {
              if (var7 == 13) {
                break L6;
              } else {
                L7: {
                  var14 = 1;
                  if (var7 != 20) {
                    break L7;
                  } else {
                    L8: {
                      if (tc.field_b <= 0) {
                        break L8;
                      } else {
                        if (n.b((byte) 120)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var14 = 0;
                    break L7;
                  }
                }
                L9: {
                  if (var7 != 21) {
                    break L9;
                  } else {
                    L10: {
                      if (tc.field_b <= 0) {
                        break L10;
                      } else {
                        if (!n.b((byte) 49)) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var14 = 0;
                    break L9;
                  }
                }
                L11: {
                  if (22 != var7) {
                    break L11;
                  } else {
                    L12: {
                      if (0 == (lb.field_g & 8)) {
                        break L12;
                      } else {
                        if (tc.field_b <= 0) {
                          break L12;
                        } else {
                          if (n.b((byte) 118)) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    var14 = 0;
                    break L11;
                  }
                }
                L13: {
                  if (23 != var7) {
                    break L13;
                  } else {
                    L14: {
                      if ((4194304 & lb.field_g) == 0) {
                        break L14;
                      } else {
                        if (tc.field_b <= 0) {
                          break L14;
                        } else {
                          if (!n.b((byte) 59)) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    var14 = 0;
                    break L13;
                  }
                }
                L15: {
                  if (var7 != 24) {
                    break L15;
                  } else {
                    L16: {
                      if ((lb.field_g & 4194304) == 0) {
                        break L16;
                      } else {
                        if (tc.field_b <= 0) {
                          break L16;
                        } else {
                          if (!n.b((byte) 43)) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    var14 = 0;
                    break L15;
                  }
                }
                L17: {
                  L18: {
                    L19: {
                      var15 = 32;
                      if (var7 < 19) {
                        break L19;
                      } else {
                        if (var7 <= 24) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (16777215 != var11) {
                        break L20;
                      } else {
                        cb.field_a.a(param0 + -56);
                        cc.field_t.c(var8.toLowerCase(), (var9 >> -1530116191) + var5, bk.field_d[0].field_t + (var4_int + (cc.field_t.field_H + (var13 >> -1260199039))), 0, -1);
                        vj.field_b.d();
                        if (var19 == 0) {
                          break L17;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      L22: {
                        cc.field_t.c(var8.toLowerCase(), (var9 >> 1782696033) + var5, (var13 >> -1278988287) + (bk.field_d[0].field_t + (cc.field_t.field_H + var4_int)), 1, -1);
                        if (var11 != 16777215) {
                          break L22;
                        } else {
                          ul.e(2, 2, 10 + var5, var4_int - 1, var6 + (-var5 - 20), var15);
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      ul.e(10, 2, var5 + 10, var4_int + -1, -20 + -var5 + var6, var15);
                      break L21;
                    }
                    cb.field_a.a(param0 + -56);
                    cc.field_t.c(var8.toLowerCase(), (var9 >> -381262527) + var5, bk.field_d[0].field_t + (var4_int + (cc.field_t.field_H - -(var13 >> 1576298497))), 0, -1);
                    vj.field_b.d();
                    if (var19 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                  L23: {
                    var5 = 150;
                    if (var11 != 16777215) {
                      break L23;
                    } else {
                      cb.field_a.a(param0 ^ -56);
                      cc.field_t.b(var8.toLowerCase(), var5, (var13 >> -845978207) + bk.field_d[0].field_t + (var4_int + cc.field_t.field_H), 0, -1);
                      vj.field_b.d();
                      if (var19 == 0) {
                        break L17;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    L25: {
                      cc.field_t.b(var8.toLowerCase(), var5, (var13 >> 1711431265) + (cc.field_t.field_H + (var4_int - -bk.field_d[0].field_t)), 1, -1);
                      if (16777215 == var11) {
                        break L25;
                      } else {
                        ul.e(10, 2, -10 + var5, -1 + var4_int, -20 + (var6 + -var5), var15);
                        if (var19 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    ul.e(2, 2, -10 + var5, var4_int + -1, -20 + (-var5 + var6), var15);
                    break L24;
                  }
                  cb.field_a.a(-40);
                  cc.field_t.b(var8.toLowerCase(), var5, var4_int + cc.field_t.field_H - (-bk.field_d[0].field_t - (var13 >> -1537742111)), 0, -1);
                  vj.field_b.d();
                  break L17;
                }
                L26: {
                  if (var14 != 0) {
                    break L26;
                  } else {
                    L27: {
                      L28: {
                        if (tc.field_b <= 0) {
                          break L28;
                        } else {
                          if (!n.b((byte) -117)) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      me.field_n.a(8 + cc.field_t.a(var8.toLowerCase()) + var5, -4 + var4_int);
                      if (var11 == 16759807) {
                        int discarded$2 = jd.field_c.a(of.field_I, 340, 210, 160, 80, 16711680, 0, 1, 1, 18);
                        if (var19 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      } else {
                        break L26;
                      }
                    }
                    al.field_d.a(var5 + (cc.field_t.a(var8.toLowerCase()) + 8), var4_int - 4);
                    if (var11 == 16759807) {
                      L29: {
                        L30: {
                          var16 = 2;
                          if (var7 != 22) {
                            break L30;
                          } else {
                            var16 = 3;
                            if (var19 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        L31: {
                          if (var7 == 23) {
                            break L31;
                          } else {
                            if (24 == var7) {
                              break L31;
                            } else {
                              break L29;
                            }
                          }
                        }
                        var16 = 22;
                        break L29;
                      }
                      int discarded$3 = jd.field_c.a(t.a(-415993727, new String[1], wl.field_b), 340, 210, 160, 80, 16711680, -1, 1, 1, 18);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                if (var19 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
          }
          L32: {
            L33: {
              var5 -= 8;
              var14 = 128 + aa.field_c + 9;
              var15 = var5 - -(-var14 + var9 >> 1551441057);
              var16 = 32;
              if (var11 == 16777215) {
                break L33;
              } else {
                L34: {
                  L35: {
                    cc.field_t.a(var8.toLowerCase(), var5 + (var9 >> 150387329), (var13 >> 1012044801) + (var4_int + cc.field_t.field_H - -bk.field_d[0].field_t), 1, -1);
                    if (var11 != 16777215) {
                      break L35;
                    } else {
                      ul.e(2, 2, var5 - -10, -1 + var4_int, var6 + (-var5 + -20), var16);
                      if (var19 == 0) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  ul.e(10, 2, 10 + var5, -1 + var4_int, -20 + var6 + -var5, var16);
                  break L34;
                }
                cb.field_a.a(-40);
                cc.field_t.a(var8.toLowerCase(), (var9 >> 145931553) + var5, bk.field_d[0].field_t + cc.field_t.field_H + (var4_int + (var13 >> -2038612383)), 0, -1);
                vj.field_b.d();
                if (var19 == 0) {
                  break L32;
                } else {
                  break L33;
                }
              }
            }
            cb.field_a.a(param0 ^ -56);
            cc.field_t.a(var8.toLowerCase(), (var9 >> 596471969) + var5, bk.field_d[0].field_t + cc.field_t.field_H + (var4_int + (var13 >> 997790561)), 0, -1);
            vj.field_b.d();
            break L32;
          }
          var15 = var15 + (aa.field_c - -16);
          var17 = 0;
          var18 = var15;
          L36: while (true) {
            L37: {
              L38: {
                if (~var18 <= ~(128 + var15)) {
                  break L38;
                } else {
                  stackOut_109_0 = 0;
                  stackOut_109_1 = var17;
                  stackIn_121_0 = stackOut_109_0;
                  stackIn_121_1 = stackOut_109_1;
                  stackIn_110_0 = stackOut_109_0;
                  stackIn_110_1 = stackOut_109_1;
                  if (var19 != 0) {
                    break L37;
                  } else {
                    L39: {
                      L40: {
                        if (stackIn_110_0 != stackIn_110_1) {
                          break L40;
                        } else {
                          ul.h(-2 + var18, -var17 + -2 + -1 + (var4_int - -(var10 / 2)), 12, var17 * 2 + 6, 3351108);
                          if (var19 == 0) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      ul.h(var18, -1 + var4_int - -(var10 / 2) - 2 + -var17, 10, 6 - -(var17 * 2), 3351108);
                      break L39;
                    }
                    L41: {
                      L42: {
                        if (var17 != 3) {
                          break L42;
                        } else {
                          ul.h(var18 + 22, -var17 + -3 + (var4_int - -(var10 / 2)), 12, 2 * var17 + 6, 3351108);
                          if (var19 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      ul.h(var18 + 22, -var17 + -2 + (-1 + var10 / 2 + var4_int), 10, var17 * 2 + 6, 3351108);
                      break L41;
                    }
                    ul.h(var18, -var17 + var10 / 2 + (var4_int - 1), 8, 2 + var17 * 2, var11);
                    ul.h(var18 - -24, -var17 + (-1 + var4_int - -(var10 / 2)), 8, var17 * 2 + 2, var11);
                    ul.h(var18 - -12, -2 + (-1 + var10 / 2 + var4_int), 8, 6, 3351108);
                    ul.h(var18 - -14, var4_int + var10 / 2 - 1, 4, 2, var11);
                    var17++;
                    var18 += 32;
                    if (var19 == 0) {
                      continue L36;
                    } else {
                      break L38;
                    }
                  }
                }
              }
              stackOut_120_0 = var7;
              stackOut_120_1 = 12;
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              break L37;
            }
            L43: {
              if (stackIn_121_0 != stackIn_121_1) {
                stackOut_123_0 = ij.field_g;
                stackIn_124_0 = stackOut_123_0;
                break L43;
              } else {
                stackOut_122_0 = ck.field_f;
                stackIn_124_0 = stackOut_122_0;
                break L43;
              }
            }
            var18 = stackIn_124_0;
            ul.h(-2 + (var15 + (var18 >> 345332193)) - 2, 3 + (var4_int - 2), 8, 4 + (-6 + var10), 3351108);
            ul.h(var15 - (-(var18 >> -1480308543) - -2), 3 + var4_int, 4, -6 + var10, var11);
            break L5;
          }
        }
    }

    private final String a(int param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        String stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        String stackOut_18_0 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3 = "";
            L1: while (true) {
              L2: {
                L3: {
                  if (param0 < 1000) {
                    break L3;
                  } else {
                    var4 = param0 % 1000;
                    var3 = var4 + var3;
                    param0 = param0 / 1000;
                    stackOut_3_0 = 10;
                    stackOut_3_1 = var4;
                    stackIn_15_0 = stackOut_3_0;
                    stackIn_15_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 <= stackIn_4_1) {
                            break L5;
                          } else {
                            var3 = ck.field_k + "00" + var3;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (100 <= var4) {
                            break L6;
                          } else {
                            var3 = ck.field_k + "0" + var3;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 = ck.field_k + var3;
                        break L4;
                      }
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_14_0 = param1;
                stackOut_14_1 = -1001;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L2;
              }
              L7: {
                if (stackIn_15_0 == stackIn_15_1) {
                  break L7;
                } else {
                  ((ja) this).field_j = 107;
                  break L7;
                }
              }
              stackOut_18_0 = param0 + var3;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3_ref, "ja.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    private final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -92) {
                break L1;
              } else {
                ja.c(-40);
                break L1;
              }
            }
            L2: {
              if (((ja) this).field_a != 2) {
                break L2;
              } else {
                if (n.b((byte) 68)) {
                  break L2;
                } else {
                  stackOut_7_0 = this.c(-29187, param1) + 180;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            L3: {
              if (((ja) this).field_a != 2) {
                break L3;
              } else {
                if (!n.b((byte) 68)) {
                  break L3;
                } else {
                  stackOut_13_0 = vb.field_g[((ja) this).field_a] + 100;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
            }
            if (((ja) this).field_a != 3) {
              L4: {
                if (((ja) this).field_a == 4) {
                  break L4;
                } else {
                  if (((ja) this).field_a == 5) {
                    break L4;
                  } else {
                    stackOut_26_0 = vb.field_g[((ja) this).field_a];
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              }
              stackOut_24_0 = 400 + this.c(-29187, param1);
              stackIn_25_0 = stackOut_24_0;
              return stackIn_25_0;
            } else {
              stackOut_16_0 = this.c(-29187, param1) - -200;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ja.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    private final int a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        long var15 = 0L;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_60_0 = 0;
        var20 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 2228258;
              if (1 == ((ja) this).field_a) {
                break L1;
              } else {
                ul.h(0, 240, 640, 240, 4456516);
                var3 = 5;
                var4 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var4 >= 640) {
                        break L4;
                      } else {
                        ul.b(var4, 240, 240, var2_int);
                        var4 = var4 + var3;
                        if (var20 != 0) {
                          break L3;
                        } else {
                          if (var20 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4 = 240;
                    break L3;
                  }
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var4 >= 480) {
                          break L7;
                        } else {
                          ul.a(0, var4, 640, var2_int);
                          var4 = var4 + var3;
                          if (var20 != 0) {
                            break L6;
                          } else {
                            if (var20 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var4 = 240;
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var4 >= 480) {
                            break L10;
                          } else {
                            ul.f(0, var4, 640, 0, (480 + -var4) * 256 / 240);
                            var4++;
                            if (var20 != 0) {
                              break L9;
                            } else {
                              if (var20 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var4 = 0;
                        ul.d(var4, var4, -(var4 * 2) + 640, -(2 * var4) + 480, 9737364);
                        var4++;
                        ul.d(var4, var4, 640 - 2 * var4, -(2 * var4) + 480, 9737364);
                        var4++;
                        ul.d(var4, var4, -(var4 * 2) + 640, -(var4 * 2) + 480, 9737364);
                        var4++;
                        ul.d(var4, var4, -(var4 * 2) + 640, 480 - 2 * var4, 0);
                        var4++;
                        ul.d(var4, var4, -(2 * var4) + 640, -(2 * var4) + 480, 5789784);
                        var4++;
                        break L9;
                      }
                      ul.d(var4, var4, -(2 * var4) + 640, 480 - 2 * var4, 0);
                      break L1;
                    }
                  }
                }
              }
            }
            L11: {
              var3 = 4000;
              var3 = (4000 * lc.field_o + 3695 * (-lc.field_o + 100)) / 100;
              ul.f(320, 240, var3 * 215 / 4000, 0);
              ul.b(5112, 3832, var3, 256, ql.field_b);
              var4 = 300 * lc.field_o / 100 + 3200;
              if (param0 == -12) {
                break L11;
              } else {
                ((ja) this).field_i = -86;
                break L11;
              }
            }
            var5 = 320;
            var6 = 240;
            var7 = 120 * var4 / 3200;
            var8 = var4 * 100 / 3200;
            var9 = var4 * 3 / 4;
            var10 = var7 * var7;
            var11 = var8 * var8;
            var12 = var9 * var9 >>> 1691518056;
            var14 = 0;
            var15_int = -var7;
            L12: while (true) {
              L13: {
                L14: {
                  if (var15_int >= 0) {
                    break L14;
                  } else {
                    var13 = var14;
                    stackOut_29_0 = var12 * (var10 - (1 + var15_int) * (1 + var15_int));
                    stackIn_36_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (var20 != 0) {
                      break L13;
                    } else {
                      var16 = stackIn_30_0;
                      L15: while (true) {
                        L16: {
                          if (~(var10 * var14 * var14) <= ~var16) {
                            break L16;
                          } else {
                            var14++;
                            if (var20 != 0) {
                              continue L12;
                            } else {
                              if (var20 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        var17 = var15_int + (var7 + (10 + (var6 + -(var4 >> 732766884))));
                        var18 = -52 * (var7 + var15_int) / (var7 + var8) + 60;
                        ul.f(-var13 + var5, var17, 2 * var13, 16777215, var18);
                        km.a(var18, 121, 16777215, var17, -var14 + var5, 0, var14 - var13);
                        km.a(0, 80, 16777215, var17, var5 + var13, var18, -var13 + var14);
                        var15_int++;
                        if (var20 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                }
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L13;
              }
              var15_int = stackIn_36_0;
              L17: while (true) {
                L18: {
                  L19: {
                    if (~var15_int <= ~var8) {
                      break L19;
                    } else {
                      var13 = var14;
                      stackOut_38_0 = (var11 + -((1 + var15_int) * (1 + var15_int))) * var12;
                      stackIn_45_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if (var20 != 0) {
                        break L18;
                      } else {
                        var16 = stackIn_39_0;
                        L20: while (true) {
                          L21: {
                            if (var14 * (var14 * var11) <= var16) {
                              break L21;
                            } else {
                              var14--;
                              if (var20 != 0) {
                                continue L17;
                              } else {
                                if (var20 == 0) {
                                  continue L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          var17 = var15_int + 10 + (var6 + -(var4 >> 898305828) - -var7);
                          var18 = (var7 + var15_int) * -52 / (var7 + var8) + 60;
                          ul.f(-var14 + var5, var17, var14 * 2, 16777215, var18);
                          km.a(var18, 125, 16777215, var17, -var13 + var5, 0, var13 - var14);
                          km.a(0, param0 + 90, 16777215, var17, var14 + var5, var18, var13 + -var14);
                          var15_int++;
                          if (var20 == 0) {
                            continue L17;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                  stackOut_44_0 = -2;
                  stackIn_45_0 = stackOut_44_0;
                  break L18;
                }
                L22: {
                  L23: {
                    if (stackIn_45_0 == ~((ja) this).field_a) {
                      break L23;
                    } else {
                      var15 = ji.b(121);
                      ul.e(6, 6, 634, 474);
                      var17 = 10;
                      L24: while (true) {
                        L25: {
                          if (var17 >= 540) {
                            break L25;
                          } else {
                            stackOut_48_0 = var17;
                            stackIn_61_0 = stackOut_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            if (var20 != 0) {
                              break L22;
                            } else {
                              L26: {
                                L27: {
                                  if (stackIn_49_0 < 120) {
                                    break L27;
                                  } else {
                                    if (var17 > 440) {
                                      break L27;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var5 = (int)((double)var17 + Math.cos(0.0001 * (double)var15 + (double)var17) * 32.0);
                                var6 = (int)(80.0 * Math.sin((double)var17 + 0.0003 * (double)var15));
                                var6 += 480;
                                var18 = 0;
                                var19 = (int)(((double)var15 * 0.01 + (double)var17) % (double)wh.field_a[var18]);
                                ab.field_g[var19 + var18 * 12].c(var5, var6);
                                break L26;
                              }
                              var17 += 64;
                              if (var20 == 0) {
                                continue L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        ul.c();
                        break L23;
                      }
                    }
                  }
                  stackOut_60_0 = var2_int;
                  stackIn_61_0 = stackOut_60_0;
                  break L22;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ja.P(" + param0 + ')');
        }
        return stackIn_61_0;
    }

    private final void b(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var12_double = 0.0;
        long var12_long = 0L;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        double var16_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_19_0 = false;
        sc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        sc stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        sc stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        sc stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_29_0 = 0;
        boolean stackIn_69_0 = false;
        int stackIn_77_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_18_0 = false;
        sc stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        sc stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        sc stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        sc stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_28_0 = 0;
        boolean stackOut_68_0 = false;
        int stackOut_76_0 = 0;
        var20 = OrbDefence.field_D ? 1 : 0;
        var3 = this.a((byte) -12);
        var4 = 53;
        var5 = 108;
        var6 = 534;
        var7 = 284;
        var2_int = 0;
        ul.d(var2_int + var4, var2_int + var5, -(2 * var2_int) + var6, -(2 * var2_int) + var7, var3);
        var2_int++;
        ul.d(var2_int + var4, var5 + var2_int, var6 + -(var2_int * 2), -(var2_int * 2) + var7, var3);
        var2_int++;
        ul.d(var2_int + var4, var2_int + var5, -(var2_int * 2) + var6, var7 + -(var2_int * 2), 0);
        var2_int++;
        var8 = var2_int + var5;
        L0: while (true) {
          L1: {
            L2: {
              if (~var8 <= ~(-var2_int + var7 + var5)) {
                break L2;
              } else {
                ul.f(var2_int + var4, var8, var6 + -(var2_int * 2), 0, 128);
                var8++;
                if (var20 != 0) {
                  break L1;
                } else {
                  if (var20 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.a(-29253, hi.field_l);
            var8 = 18;
            break L1;
          }
          L3: {
            if (2 > na.field_a) {
              break L3;
            } else {
              var8 = 20;
              break L3;
            }
          }
          var9 = new String[50];
          var10 = new int[50];
          var11 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var11 >= 50) {
                  break L6;
                } else {
                  var10[var11] = var6 + -24;
                  stackOut_10_0 = 5;
                  stackIn_16_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var20 != 0) {
                    break L5;
                  } else {
                    L7: {
                      if (stackIn_11_0 != na.field_a) {
                        break L7;
                      } else {
                        var10[var11] = var10[var11] - 64;
                        break L7;
                      }
                    }
                    var11++;
                    if (var20 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var11 = jd.field_c.a(t.a(-415993727, new String[1], oa.field_i[na.field_a]), var10, var9);
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L5;
            }
            var12 = stackIn_16_0;
            L8: while (true) {
              L9: {
                L10: {
                  if (var11 <= var12) {
                    break L10;
                  } else {
                    stackOut_18_0 = var9[var12].startsWith("<b>");
                    stackIn_29_0 = stackOut_18_0 ? 1 : 0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var20 != 0) {
                      break L9;
                    } else {
                      L11: {
                        L12: {
                          if (stackIn_19_0) {
                            break L12;
                          } else {
                            L13: {
                              stackOut_21_0 = jd.field_c;
                              stackOut_21_1 = var9[var12];
                              stackOut_21_2 = 12 + var4;
                              stackIn_24_0 = stackOut_21_0;
                              stackIn_24_1 = stackOut_21_1;
                              stackIn_24_2 = stackOut_21_2;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              stackIn_22_2 = stackOut_21_2;
                              if (na.field_a == 5) {
                                stackOut_24_0 = (sc) (Object) stackIn_24_0;
                                stackOut_24_1 = (String) (Object) stackIn_24_1;
                                stackOut_24_2 = stackIn_24_2;
                                stackOut_24_3 = 64;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                stackIn_25_2 = stackOut_24_2;
                                stackIn_25_3 = stackOut_24_3;
                                break L13;
                              } else {
                                stackOut_22_0 = (sc) (Object) stackIn_22_0;
                                stackOut_22_1 = (String) (Object) stackIn_22_1;
                                stackOut_22_2 = stackIn_22_2;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                stackIn_23_2 = stackOut_22_2;
                                stackOut_23_0 = (sc) (Object) stackIn_23_0;
                                stackOut_23_1 = (String) (Object) stackIn_23_1;
                                stackOut_23_2 = stackIn_23_2;
                                stackOut_23_3 = 0;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                stackIn_25_2 = stackOut_23_2;
                                stackIn_25_3 = stackOut_23_3;
                                break L13;
                              }
                            }
                            ((sc) (Object) stackIn_25_0).b(stackIn_25_1, stackIn_25_2 - -stackIn_25_3, var8 * (-(var11 / 2) + var12) + var7 / 2 + var5, 16777215, 0);
                            if (var20 == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        ob.field_I.b(var9[var12], var4 - -12, (var12 - var11 / 2) * var8 + (var5 + var7 / 2), 16777215, 0);
                        break L11;
                      }
                      var12++;
                      if (var20 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                stackOut_28_0 = param0;
                stackIn_29_0 = stackOut_28_0;
                break L9;
              }
              L14: {
                if (stackIn_29_0 <= -74) {
                  break L14;
                } else {
                  field_d = null;
                  break L14;
                }
              }
              L15: {
                L16: {
                  ob.field_I.c(oa.a(oa.field_i.length, (byte) -2, na.field_a - -1), 555, 380, 16777215, -1);
                  if (na.field_a != 0) {
                    if (na.field_a != 1) {
                      L17: {
                        if (na.field_a != 2) {
                          break L17;
                        } else {
                          var12 = 80;
                          var13 = 165;
                          var2_int = 0;
                          L18: while (true) {
                            L19: {
                              if (var2_int >= 5) {
                                break L19;
                              } else {
                                if (var20 != 0) {
                                  break L16;
                                } else {
                                  L20: {
                                    L21: {
                                      if (var2_int <= 4) {
                                        break L21;
                                      } else {
                                        L22: {
                                          if (n.b((byte) -75)) {
                                            break L22;
                                          } else {
                                            if (tc.field_b > 0) {
                                              break L21;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        var13 = var13 + var8 * 2;
                                        me.field_n.a(var12, -40 + var13);
                                        if (var20 == 0) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L23: {
                                      hf.field_g[0 - -(7 * var2_int)].d(var12, var13);
                                      hf.field_g[2 - -(7 * var2_int)].a(-92, var12 - -20, 12 + var13, 10000, 2048);
                                      var14 = var13;
                                      if (var2_int != 2) {
                                        break L23;
                                      } else {
                                        var13 -= 4;
                                        break L23;
                                      }
                                    }
                                    L24: {
                                      if (var2_int == 3) {
                                        var13 -= 6;
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    L25: {
                                      if (4 == var2_int) {
                                        var13 -= 8;
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    hf.field_g[var2_int * 7 + 1].d(var12, var13);
                                    var13 = var14 + 2 * var8;
                                    break L20;
                                  }
                                  var2_int++;
                                  if (var20 == 0) {
                                    continue L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            if (var20 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L26: {
                        if (na.field_a == 3) {
                          break L26;
                        } else {
                          if (na.field_a == 4) {
                            var12 = var4 - -10;
                            var13 = 170;
                            var2_int = 4;
                            L27: while (true) {
                              L28: {
                                if (8 <= var2_int) {
                                  break L28;
                                } else {
                                  if (var20 != 0) {
                                    break L16;
                                  } else {
                                    L29: {
                                      L30: {
                                        L31: {
                                          if (var2_int < 8) {
                                            break L31;
                                          } else {
                                            if (n.b((byte) 93)) {
                                              break L30;
                                            } else {
                                              if (tc.field_b <= 0) {
                                                break L30;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                        ab.field_g[12 * var2_int].d(var12, var13);
                                        var13 = var13 + var8 * 2;
                                        if (var20 == 0) {
                                          break L29;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      var13 = var13 + 2 * var8;
                                      me.field_n.a(var12 + 9, -36 + var13);
                                      break L29;
                                    }
                                    var2_int++;
                                    if (var20 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              if (var20 == 0) {
                                break L16;
                              } else {
                                break L26;
                              }
                            }
                          } else {
                            L32: {
                              if (na.field_a == 5) {
                                break L32;
                              } else {
                                if (na.field_a == 6) {
                                  var12 = 20 + var4;
                                  var13 = 155;
                                  var2_int = 9;
                                  L33: while (true) {
                                    L34: {
                                      L35: {
                                        if (10 < var2_int) {
                                          break L35;
                                        } else {
                                          stackOut_68_0 = n.b((byte) 42);
                                          stackIn_77_0 = stackOut_68_0 ? 1 : 0;
                                          stackIn_69_0 = stackOut_68_0;
                                          if (var20 != 0) {
                                            break L34;
                                          } else {
                                            L36: {
                                              L37: {
                                                L38: {
                                                  if (stackIn_69_0) {
                                                    break L38;
                                                  } else {
                                                    if (0 < tc.field_b) {
                                                      break L37;
                                                    } else {
                                                      break L38;
                                                    }
                                                  }
                                                }
                                                var13 = var13 + var8 * 2;
                                                me.field_n.a(var12, -40 + var13);
                                                if (var20 == 0) {
                                                  break L36;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                              ab.field_g[var2_int * 12].d(var12 + -8, var13);
                                              var13 = var13 + var8 * 2;
                                              break L36;
                                            }
                                            var2_int++;
                                            if (var20 == 0) {
                                              continue L33;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                      var13 = 295;
                                      stackOut_76_0 = 5;
                                      stackIn_77_0 = stackOut_76_0;
                                      break L34;
                                    }
                                    var2_int = stackIn_77_0;
                                    L39: while (true) {
                                      L40: {
                                        if (6 < var2_int) {
                                          break L40;
                                        } else {
                                          if (var20 != 0) {
                                            break L16;
                                          } else {
                                            L41: {
                                              L42: {
                                                if (n.b((byte) -96)) {
                                                  break L42;
                                                } else {
                                                  if (tc.field_b <= 0) {
                                                    break L42;
                                                  } else {
                                                    L43: {
                                                      L44: {
                                                        if (var2_int == 6) {
                                                          break L44;
                                                        } else {
                                                          hf.field_g[7 * var2_int].d(var12, var13);
                                                          if (var20 == 0) {
                                                            break L43;
                                                          } else {
                                                            break L44;
                                                          }
                                                        }
                                                      }
                                                      hf.field_g[7 * var2_int].d(16 + var12, var13);
                                                      hf.field_g[0 - -(var2_int * 7)].d(var12 + -16, var13);
                                                      break L43;
                                                    }
                                                    L45: {
                                                      hf.field_g[2 - -(7 * var2_int)].a(-89, var12 + 20, var13 - -12, 38000, 2048);
                                                      var14 = var13;
                                                      if (2 != var2_int) {
                                                        break L45;
                                                      } else {
                                                        var13 -= 4;
                                                        break L45;
                                                      }
                                                    }
                                                    L46: {
                                                      if (var2_int != 3) {
                                                        break L46;
                                                      } else {
                                                        var13 -= 6;
                                                        break L46;
                                                      }
                                                    }
                                                    L47: {
                                                      if (var2_int == 4) {
                                                        var13 -= 8;
                                                        break L47;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                    L48: {
                                                      L49: {
                                                        if (var2_int != 6) {
                                                          break L49;
                                                        } else {
                                                          var15 = 200;
                                                          var16 = var12;
                                                          var17 = 6 + var13;
                                                          var18 = 32 + var12;
                                                          var19 = var13 + 6;
                                                          ul.f(-1 + var16, var17, var18 + -1, var19, 11176191, var15);
                                                          ul.f(var16 + 1, var17, 1 + var18, var19, 11176191, var15);
                                                          ul.f(var16, var17 + -1, var18, -1 + var19, 11176191, var15);
                                                          ul.f(var16, 1 + var17, var18, var19 + 1, 11176191, var15);
                                                          ul.f(var16, var17, var18, var19, 16777215, var15);
                                                          hf.field_g[1 + var2_int * 7].d(16 + var12, var13);
                                                          hf.field_g[var2_int * 7 + 1].d(-16 + var12, var13);
                                                          if (var20 == 0) {
                                                            break L48;
                                                          } else {
                                                            break L49;
                                                          }
                                                        }
                                                      }
                                                      hf.field_g[1 + 7 * var2_int].d(var12, var13);
                                                      break L48;
                                                    }
                                                    var13 = var14 + 2 * var8;
                                                    if (var20 == 0) {
                                                      break L41;
                                                    } else {
                                                      break L42;
                                                    }
                                                  }
                                                }
                                              }
                                              var13 = var13 + 2 * var8;
                                              me.field_n.a(var12, var13 - 40);
                                              break L41;
                                            }
                                            var2_int++;
                                            if (var20 == 0) {
                                              continue L39;
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                      }
                                      if (var20 == 0) {
                                        break L16;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var12_long = ji.b(-65);
                            var14 = 95;
                            var15 = 190;
                            var16_double = -Math.abs(Math.sin(0.005 * (double)var12_long + (double)var2_int));
                            ul.i(var14, (int)((double)var15 + var16_double * 5.0), 16, 16742399, 64);
                            ul.i(var14, (int)((double)var15 + var16_double * 4.0), 15, 16751103, 96);
                            ul.i(var14, (int)((double)var15 + var16_double * 3.0), 14, 16759807, 128);
                            ul.i(var14, (int)((double)var15 + 2.0 * var16_double), 13, 16768511, 192);
                            ul.f(var14, var15, 12, 16777215);
                            ul.f(var14, (int)((double)var15 + var16_double * 2.0), 6, 16768511);
                            ul.f(var14, (int)(3.0 * var16_double + (double)var15), 5, 16759807);
                            ul.f(var14, (int)(4.0 * var16_double + (double)var15), 4, 16751103);
                            ul.f(var14, (int)(5.0 * var16_double + (double)var15), 3, 16742399);
                            var14 = 80;
                            var15 = 240;
                            hf.field_g[0].d(var14, var15);
                            hf.field_g[2].a(-89, 20 + var14, 12 + var15, 10000, 2048);
                            hf.field_g[1].d(var14, var15);
                            var16 = (int)(Math.sin((double)var12_long * 0.01) * 48.0) + 64;
                            ul.a(15 + var14 << -1730949212, 2 + var15 << 1004656164, var16, 255, ki.field_f);
                            var14 = 85 + (int)(Math.sin(0.003 * (double)var12_long) * 8.0);
                            var15 = 312 + -Math.abs((int)(4.0 * Math.sin(0.0065 * (double)var12_long)));
                            ab.field_g[0].a(var14, var15);
                            break L16;
                          }
                        }
                      }
                      var12 = 10 + var4;
                      var13 = 170;
                      var2_int = 0;
                      L50: while (true) {
                        if (var2_int >= 4) {
                          break L16;
                        } else {
                          ab.field_g[var2_int * 12].d(var12, var13);
                          var13 = var13 + var8 * 2;
                          var2_int++;
                          if (var20 != 0) {
                            break L15;
                          } else {
                            if (var20 == 0) {
                              continue L50;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    } else {
                      var12_double = (double)ji.b(-128) * 0.0025;
                      hg.field_ab.e((int)(88.0 * Math.cos(var12_double)) + 370, 114 - -(int)(Math.sin(1.9 * var12_double) * 4.0), 10);
                      var12_double = var12_double + 0.15;
                      hg.field_ab.e(370 - -(int)(Math.cos(var12_double) * 98.0), (int)(Math.sin(1.9 * var12_double) * 4.0) + 114, 30);
                      var12_double = var12_double + 0.15;
                      hg.field_ab.e(370 - -(int)(108.0 * Math.cos(var12_double)), 114 - -(int)(4.0 * Math.sin(1.9 * var12_double)), 50);
                      var12_double = var12_double + 0.15;
                      hg.field_ab.e((int)(118.0 * Math.cos(var12_double)) + 370, 114 + (int)(Math.sin(1.9 * var12_double) * 4.0), 70);
                      var12_double = var12_double + 0.15;
                      hg.field_ab.c((int)(128.0 * Math.cos(var12_double)) + 370, (int)(Math.sin(var12_double * 1.9) * 4.0) + 114);
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
                break L15;
              }
              return;
            }
          }
        }
    }

    private final String b(int param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_20_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        String stackOut_9_0 = null;
        String stackOut_1_0 = null;
        try {
          L0: {
            if (param0 != 100) {
              if (param0 == 101) {
                stackOut_6_0 = oe.field_q;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 != 102) {
                  L1: {
                    if (param1 <= -65) {
                      break L1;
                    } else {
                      int discarded$2 = this.d(-118, -13);
                      break L1;
                    }
                  }
                  if (param0 != 103) {
                    if (param0 != 104) {
                      stackOut_20_0 = Integer.toString(param0);
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      stackOut_18_0 = mg.field_h;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  } else {
                    stackOut_15_0 = nb.field_o;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  stackOut_9_0 = cc.field_r;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_1_0 = bi.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ja.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        hj var3_ref_hj = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sc stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        sc stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        sc stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        sc stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        sc stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        sc stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        sc stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        sc stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        sc stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        sc stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        sc stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        sc stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        sc stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        sc stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        sc stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        sc stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        sc stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        sc stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        boolean stackIn_88_0 = false;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_100_0 = 0;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        sc stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        sc stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        sc stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        sc stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        sc stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        sc stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        sc stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        sc stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        sc stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        sc stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        sc stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        sc stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        sc stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        sc stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        sc stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        sc stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        sc stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        boolean stackOut_87_0 = false;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_99_0 = 0;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((ja) this).field_a != 0) {
                  break L2;
                } else {
                  L3: {
                    if (fk.field_b.field_o == 640) {
                      break L3;
                    } else {
                      var3_ref_hj = fk.field_b.f();
                      var3_ref_hj.e();
                      var3_ref_hj.d();
                      fk.field_b.b(0, 0, 16711935);
                      ul.e(5, 5, 0, 0, 640, 128);
                      fk.field_b.c(0, 0);
                      cb.field_a.a(-40);
                      fk.field_b = var3_ref_hj;
                      break L3;
                    }
                  }
                  var3 = this.a((byte) -12);
                  var4 = im.field_a[((ja) this).field_a];
                  var5 = wd.field_o[((ja) this).field_a] - 24;
                  var6 = vb.field_g[((ja) this).field_a] + -im.field_a[((ja) this).field_a];
                  var7 = 48 + vh.field_q[((ja) this).field_a].length * ek.field_e[((ja) this).field_a] + -16;
                  var2_int = 0;
                  var8 = lc.field_o * 255 / 100;
                  ul.g(var2_int + var4, var2_int + var5, -(var2_int * 2) + var6, -(2 * var2_int) + var7, var3, var8);
                  var2_int++;
                  ul.g(var4 + var2_int, var2_int + var5, -(2 * var2_int) + var6, var7 - var2_int * 2, var3, var8);
                  var2_int++;
                  ul.g(var2_int + var4, var5 - -var2_int, -(var2_int * 2) + var6, -(2 * var2_int) + var7, 0, var8);
                  var2_int++;
                  var9 = var5 - -var2_int;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (~(-var2_int + (var7 + var5)) >= ~var9) {
                          break L6;
                        } else {
                          ul.c(var2_int + var4, var9, -(2 * var2_int) + var6, 2232627, var8);
                          var9++;
                          if (var10 != 0) {
                            break L5;
                          } else {
                            if (var10 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      fk.field_b.e(10, lc.field_o + -65, 255 * lc.field_o / 100);
                      wj.b((byte) 124);
                      break L5;
                    }
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (1 != ((ja) this).field_a) {
                break L1;
              } else {
                var2_int = this.a((byte) -12);
                im.field_a[((ja) this).field_a] = im.field_a[0];
                vb.field_g[((ja) this).field_a] = vb.field_g[0];
                var3 = im.field_a[((ja) this).field_a];
                var4 = wd.field_o[((ja) this).field_a] + -24;
                var5 = -im.field_a[((ja) this).field_a] + vb.field_g[((ja) this).field_a];
                var6 = 48 + vh.field_q[((ja) this).field_a].length * ek.field_e[((ja) this).field_a];
                var7 = 0;
                var8 = lc.field_o * 255 / 100;
                ul.g(var3 - -var7, var4 - -var7, -(var7 * 2) + var5, var6 + -(2 * var7), var2_int, var8);
                var7++;
                ul.g(var7 + var3, var4 - -var7, -(var7 * 2) + var5, -(2 * var7) + var6, var2_int, var8);
                var7++;
                ul.g(var3 + var7, var7 + var4, var5 - 2 * var7, -(var7 * 2) + var6, 0, var8);
                var7++;
                var9 = var7 + var4;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (-var7 + var6 + var4 <= var9) {
                        break L9;
                      } else {
                        ul.c(var3 - -var7, var9, var5 - var7 * 2, 2232627, var8);
                        var9++;
                        if (var10 != 0) {
                          break L8;
                        } else {
                          if (var10 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    fk.field_b.e(10, 35, 255);
                    break L8;
                  }
                  wj.b((byte) 124);
                  break L1;
                }
              }
            }
            L10: {
              L11: {
                vj.field_b.d();
                ul.d();
                cb.field_a.a(-40);
                if (((ja) this).field_a != 8) {
                  break L11;
                } else {
                  this.a(false);
                  if (var10 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                if (((ja) this).field_a != 2) {
                  break L12;
                } else {
                  this.a(120);
                  if (var10 == 0) {
                    break L10;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (3 != ((ja) this).field_a) {
                  break L13;
                } else {
                  this.b(-95);
                  if (var10 == 0) {
                    break L10;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (4 == ((ja) this).field_a) {
                  break L14;
                } else {
                  L15: {
                    if (((ja) this).field_a != 5) {
                      break L15;
                    } else {
                      this.a((byte) 127, true);
                      if (var10 == 0) {
                        break L10;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (6 == ((ja) this).field_a) {
                    L16: {
                      int discarded$1 = this.a((byte) -12);
                      wd.field_o[((ja) this).field_a] = 230;
                      il.field_f.field_i = wf.field_c.field_e[0].field_d;
                      var2_int = ob.field_I.field_H + 160;
                      var3 = ob.field_I.field_B + (ob.field_I.field_E + 4);
                      ob.field_I.c(fh.field_b, 320, var2_int, 16777215, -1);
                      stackOut_58_0 = ob.field_I;
                      stackOut_58_1 = -113;
                      stackOut_58_2 = 0;
                      stackIn_61_0 = stackOut_58_0;
                      stackIn_61_1 = stackOut_58_1;
                      stackIn_61_2 = stackOut_58_2;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      if (0 == il.field_f.field_i) {
                        stackOut_61_0 = (sc) (Object) stackIn_61_0;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = stackIn_61_2;
                        stackOut_61_3 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        stackIn_62_3 = stackOut_61_3;
                        break L16;
                      } else {
                        stackOut_59_0 = (sc) (Object) stackIn_59_0;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = stackIn_59_2;
                        stackOut_59_3 = 1;
                        stackIn_62_0 = stackOut_59_0;
                        stackIn_62_1 = stackOut_59_1;
                        stackIn_62_2 = stackOut_59_2;
                        stackIn_62_3 = stackOut_59_3;
                        break L16;
                      }
                    }
                    L17: {
                      stackOut_62_0 = (sc) (Object) stackIn_62_0;
                      stackOut_62_1 = stackIn_62_1;
                      stackOut_62_2 = stackIn_62_2;
                      stackOut_62_3 = stackIn_62_3;
                      stackIn_65_0 = stackOut_62_0;
                      stackIn_65_1 = stackOut_62_1;
                      stackIn_65_2 = stackOut_62_2;
                      stackIn_65_3 = stackOut_62_3;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      stackIn_63_2 = stackOut_62_2;
                      stackIn_63_3 = stackOut_62_3;
                      if (dm.field_f == 0) {
                        stackOut_65_0 = (sc) (Object) stackIn_65_0;
                        stackOut_65_1 = stackIn_65_1;
                        stackOut_65_2 = stackIn_65_2;
                        stackOut_65_3 = stackIn_65_3;
                        stackOut_65_4 = 0;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        stackIn_66_3 = stackOut_65_3;
                        stackIn_66_4 = stackOut_65_4;
                        break L17;
                      } else {
                        stackOut_63_0 = (sc) (Object) stackIn_63_0;
                        stackOut_63_1 = stackIn_63_1;
                        stackOut_63_2 = stackIn_63_2;
                        stackOut_63_3 = stackIn_63_3;
                        stackOut_63_4 = 1;
                        stackIn_66_0 = stackOut_63_0;
                        stackIn_66_1 = stackOut_63_1;
                        stackIn_66_2 = stackOut_63_2;
                        stackIn_66_3 = stackOut_63_3;
                        stackIn_66_4 = stackOut_63_4;
                        break L17;
                      }
                    }
                    L18: {
                      ((sc) (Object) stackIn_66_0).c(sa.a((byte) stackIn_66_1, stackIn_66_2 != 0, stackIn_66_3 != 0, stackIn_66_4 != 0), 320, var3 + var2_int, 16777215, -1);
                      stackOut_66_0 = ob.field_I;
                      stackOut_66_1 = 0;
                      stackIn_69_0 = stackOut_66_0;
                      stackIn_69_1 = stackOut_66_1;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      if (dm.field_f == 0) {
                        stackOut_69_0 = (sc) (Object) stackIn_69_0;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = 0;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        break L18;
                      } else {
                        stackOut_67_0 = (sc) (Object) stackIn_67_0;
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = 1;
                        stackIn_70_0 = stackOut_67_0;
                        stackIn_70_1 = stackOut_67_1;
                        stackIn_70_2 = stackOut_67_2;
                        break L18;
                      }
                    }
                    L19: {
                      stackOut_70_0 = (sc) (Object) stackIn_70_0;
                      stackOut_70_1 = stackIn_70_1;
                      stackOut_70_2 = stackIn_70_2;
                      stackIn_73_0 = stackOut_70_0;
                      stackIn_73_1 = stackOut_70_1;
                      stackIn_73_2 = stackOut_70_2;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      stackIn_71_2 = stackOut_70_2;
                      if (0 == il.field_f.field_i) {
                        stackOut_73_0 = (sc) (Object) stackIn_73_0;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = stackIn_73_2;
                        stackOut_73_3 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        stackIn_74_3 = stackOut_73_3;
                        break L19;
                      } else {
                        stackOut_71_0 = (sc) (Object) stackIn_71_0;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = stackIn_71_2;
                        stackOut_71_3 = 1;
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_74_2 = stackOut_71_2;
                        stackIn_74_3 = stackOut_71_3;
                        break L19;
                      }
                    }
                    L20: {
                      ((sc) (Object) stackIn_74_0).c(sd.a(stackIn_74_1 != 0, stackIn_74_2 != 0, stackIn_74_3 != 0, 30775), 320, var2_int + 5 * var3 - -30, 16777215, -1);
                      stackOut_74_0 = ob.field_I;
                      stackOut_74_1 = -14189;
                      stackIn_77_0 = stackOut_74_0;
                      stackIn_77_1 = stackOut_74_1;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      if (il.field_f.field_i == 0) {
                        stackOut_77_0 = (sc) (Object) stackIn_77_0;
                        stackOut_77_1 = stackIn_77_1;
                        stackOut_77_2 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        stackIn_78_2 = stackOut_77_2;
                        break L20;
                      } else {
                        stackOut_75_0 = (sc) (Object) stackIn_75_0;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = 1;
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_78_2 = stackOut_75_2;
                        break L20;
                      }
                    }
                    L21: {
                      stackOut_78_0 = (sc) (Object) stackIn_78_0;
                      stackOut_78_1 = stackIn_78_1;
                      stackOut_78_2 = stackIn_78_2;
                      stackIn_81_0 = stackOut_78_0;
                      stackIn_81_1 = stackOut_78_1;
                      stackIn_81_2 = stackOut_78_2;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      stackIn_79_2 = stackOut_78_2;
                      if (dm.field_f == 0) {
                        stackOut_81_0 = (sc) (Object) stackIn_81_0;
                        stackOut_81_1 = stackIn_81_1;
                        stackOut_81_2 = stackIn_81_2;
                        stackOut_81_3 = 0;
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        stackIn_82_2 = stackOut_81_2;
                        stackIn_82_3 = stackOut_81_3;
                        break L21;
                      } else {
                        stackOut_79_0 = (sc) (Object) stackIn_79_0;
                        stackOut_79_1 = stackIn_79_1;
                        stackOut_79_2 = stackIn_79_2;
                        stackOut_79_3 = 1;
                        stackIn_82_0 = stackOut_79_0;
                        stackIn_82_1 = stackOut_79_1;
                        stackIn_82_2 = stackOut_79_2;
                        stackIn_82_3 = stackOut_79_3;
                        break L21;
                      }
                    }
                    ((sc) (Object) stackIn_82_0).c(tj.a(stackIn_82_1, stackIn_82_2 != 0, stackIn_82_3 != 0, false), 320, 60 + 8 * var3 + var2_int, 16777215, -1);
                    if (var10 == 0) {
                      break L10;
                    } else {
                      break L14;
                    }
                  } else {
                    if (((ja) this).field_a != 7) {
                      break L10;
                    } else {
                      fm.a(241);
                      return;
                    }
                  }
                }
              }
              this.a((byte) 125, false);
              break L10;
            }
            vj.field_b.d();
            var2_int = 0;
            L22: while (true) {
              L23: {
                L24: {
                  if (((ja) this).field_f.field_i <= var2_int) {
                    break L24;
                  } else {
                    stackOut_87_0 = this.e(var2_int, 126);
                    stackIn_100_0 = stackOut_87_0 ? 1 : 0;
                    stackIn_88_0 = stackOut_87_0;
                    if (var10 != 0) {
                      break L23;
                    } else {
                      L25: {
                        if (!stackIn_88_0) {
                          break L25;
                        } else {
                          L26: {
                            stackOut_91_0 = this;
                            stackOut_91_1 = 16;
                            stackIn_96_0 = stackOut_91_0;
                            stackIn_96_1 = stackOut_91_1;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            if (~var2_int != ~((ja) this).field_f.field_h) {
                              stackOut_96_0 = this;
                              stackOut_96_1 = stackIn_96_1;
                              stackOut_96_2 = 0;
                              stackIn_97_0 = stackOut_96_0;
                              stackIn_97_1 = stackOut_96_1;
                              stackIn_97_2 = stackOut_96_2;
                              break L26;
                            } else {
                              stackOut_92_0 = this;
                              stackOut_92_1 = stackIn_92_1;
                              stackIn_94_0 = stackOut_92_0;
                              stackIn_94_1 = stackOut_92_1;
                              stackOut_94_0 = this;
                              stackOut_94_1 = stackIn_94_1;
                              stackOut_94_2 = 1;
                              stackIn_97_0 = stackOut_94_0;
                              stackIn_97_1 = stackOut_94_1;
                              stackIn_97_2 = stackOut_94_2;
                              break L26;
                            }
                          }
                          this.a((byte) stackIn_97_1, stackIn_97_2 != 0, var2_int);
                          break L25;
                        }
                      }
                      var2_int++;
                      if (var10 == 0) {
                        continue L22;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                cb.field_a.a(-40);
                stackOut_99_0 = -91 % ((-83 - param0) / 34);
                stackIn_100_0 = stackOut_99_0;
                break L23;
              }
              var2_int = stackIn_100_0;
              vj.field_b.e(0, 0, 255 * lc.field_o / 100);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ja.S(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        boolean[] var10 = null;
        boolean[] var11 = null;
        boolean[] var12 = null;
        boolean[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        Object var21_ref = null;
        hj var21_ref_hj = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_98_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_97_0 = 0;
        var24 = OrbDefence.field_D ? 1 : 0;
        var4 = this.a((byte) -12);
        var5 = 53;
        var6 = 108;
        var7 = 534;
        var8 = 312;
        var3_int = 0;
        ul.d(var5 + var3_int, var3_int + var6, -(var3_int * 2) + var7, -(2 * var3_int) + var8, var4);
        var3_int++;
        ul.d(var3_int + var5, var3_int + var6, -(2 * var3_int) + var7, -(2 * var3_int) + var8, var4);
        var3_int++;
        ul.d(var5 + var3_int, var6 + var3_int, var7 + -(var3_int * 2), var8 + -(var3_int * 2), 0);
        var3_int++;
        var9_int = var3_int + var6;
        L0: while (true) {
          L1: {
            if (var8 + (var6 + -var3_int) <= var9_int) {
              break L1;
            } else {
              ul.f(var3_int + var5, var9_int, -(var3_int * 2) + var7, 0, 192);
              var9_int++;
              if (var24 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var9 = wc.field_b;
            if (!param1) {
              break L2;
            } else {
              var9 = field_d;
              break L2;
            }
          }
          L3: {
            this.a(-29253, var9);
            var10 = new boolean[]{false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, true, true, true, true, false};
            var11 = new boolean[]{true, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
            var12 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false};
            var13 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
            var5 = 102;
            var14 = 120;
            var15 = 0;
            if (param1) {
              stackOut_7_0 = dm.field_f;
              stackIn_8_0 = stackOut_7_0;
              break L3;
            } else {
              stackOut_6_0 = lb.field_g;
              stackIn_8_0 = stackOut_6_0;
              break L3;
            }
          }
          L4: {
            var16 = stackIn_8_0;
            var17 = -1;
            var18 = ok.a(0, false) ? 1 : 0;
            var19 = 0;
            if (param0 >= 115) {
              break L4;
            } else {
              field_e = true;
              break L4;
            }
          }
          var20_int = 0;
          L5: while (true) {
            L6: {
              L7: {
                if (~var20_int <= ~gj.field_j.length) {
                  break L7;
                } else {
                  var21_ref = null;
                  stackOut_12_0 = -1;
                  stackOut_12_1 = ~(var16 & 1 << var20_int);
                  stackIn_74_0 = stackOut_12_0;
                  stackIn_74_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (var24 != 0) {
                    break L6;
                  } else {
                    L8: {
                      L9: {
                        if (stackIn_13_0 != stackIn_13_1) {
                          var21_ref_hj = bd.field_o[var20_int];
                          break L9;
                        } else {
                          L10: {
                            if (!param1) {
                              break L10;
                            } else {
                              if (var24 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            L12: {
                              if (var12[var20_int]) {
                                break L12;
                              } else {
                                if (!var13[var20_int]) {
                                  break L11;
                                } else {
                                  if (var18 != 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var19++;
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L11;
                            }
                          }
                          L13: {
                            if (tc.field_b > 0) {
                              break L13;
                            } else {
                              if (var10[var20_int]) {
                                var21_ref_hj = me.field_n;
                                break L9;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var21_ref_hj = al.field_d;
                          break L9;
                        }
                      }
                      L14: {
                        L15: {
                          var22 = var5;
                          var23 = var14;
                          if (var12[var20_int]) {
                            break L15;
                          } else {
                            if (!var13[var20_int]) {
                              break L14;
                            } else {
                              if (var18 == 0) {
                                break L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          L17: {
                            var23 = 120;
                            if (var19 <= 0) {
                              break L17;
                            } else {
                              var22 = 482;
                              if (var24 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var22 = 64;
                          break L16;
                        }
                        var19++;
                        break L14;
                      }
                      L18: {
                        if (var22 > ua.field_a) {
                          break L18;
                        } else {
                          if (~(var22 - -32) > ~ua.field_a) {
                            break L18;
                          } else {
                            if (~vl.field_d > ~var23) {
                              break L18;
                            } else {
                              if (~vl.field_d < ~(32 + var23)) {
                                break L18;
                              } else {
                                ul.a(var22 - -16 << 1198079524, 16 + var23 << 64463620, 384, 255, ki.field_f);
                                var17 = var20_int;
                                break L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        var21_ref_hj.a(var22, var23);
                        if (~var22 < ~((ja) this).field_i) {
                          break L19;
                        } else {
                          if (~((ja) this).field_i < ~(32 + var22)) {
                            break L19;
                          } else {
                            if (~((ja) this).field_c > ~var23) {
                              break L19;
                            } else {
                              if (var23 - -32 >= ((ja) this).field_c) {
                                L20: {
                                  L21: {
                                    if (((ja) this).field_h == var20_int) {
                                      break L21;
                                    } else {
                                      ((ja) this).field_h = var20_int;
                                      if (var24 == 0) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  ((ja) this).field_h = -1;
                                  break L20;
                                }
                                ((ja) this).field_i = -1;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      L22: {
                        if (((ja) this).field_h != var20_int) {
                          break L22;
                        } else {
                          ul.a(16 + var22 << 1138898500, 16 + var23 << 131698436, 384, 255, ki.field_f);
                          break L22;
                        }
                      }
                      if (!var12[var20_int]) {
                        var5 += 38;
                        if (522 < var5) {
                          var15 += 32;
                          var5 = 83;
                          var14 = 120 + var15;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var20_int++;
                    if (var24 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              stackOut_73_0 = 0;
              stackOut_73_1 = ((ja) this).field_h;
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              break L6;
            }
            L23: {
              if (stackIn_74_0 > stackIn_74_1) {
                break L23;
              } else {
                var17 = ((ja) this).field_h;
                break L23;
              }
            }
            L24: {
              L25: {
                if (var17 != -1) {
                  break L25;
                } else {
                  ob.field_I.c(kd.field_f, 320, 264, 16777215, -1);
                  if (!n.b((byte) 62)) {
                    break L24;
                  } else {
                    ob.field_I.c(qk.field_a, 320, 32 + (3 * ob.field_I.field_H + 232), 16777215, -1);
                    if (var24 == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              L26: {
                var14 = 220;
                var5 = 470;
                ob.field_I.c(dj.field_e, var5 + -1, var14, 0, 0);
                ob.field_I.c(dj.field_e, var5, -1 + var14, 0, 0);
                ob.field_I.c(dj.field_e, var5, var14, 11154431, -1);
                var14 += 24;
                var20 = Integer.toString(100 * wd.field_D[var17]);
                if (!var11[var17]) {
                  break L26;
                } else {
                  if ((var16 & 1 << var17) != 0) {
                    break L26;
                  } else {
                    var20 = OrbDefence.field_E;
                    break L26;
                  }
                }
              }
              L27: {
                L28: {
                  L29: {
                    L30: {
                      ob.field_I.c(var20, -1 + var5, var14, 0, 0);
                      ob.field_I.c(var20, var5, -1 + var14, 0, 0);
                      ob.field_I.c(var20, var5, var14, 16777215, -1);
                      var5 = 470;
                      var14 = 280;
                      ob.field_I.c(nf.field_n, -1 + var5, var14, 0, 0);
                      ob.field_I.c(nf.field_n, var5, -1 + var14, 0, 0);
                      ob.field_I.c(nf.field_n, var5, var14, 11154431, -1);
                      if (!var11[var17]) {
                        break L30;
                      } else {
                        if (0 != (var16 & 1 << var17)) {
                          break L30;
                        } else {
                          var14 += 32;
                          ob.field_I.c(var20, var5 + -1, var14, 0, 0);
                          ob.field_I.c(var20, var5, var14 - 1, 0, 0);
                          ob.field_I.c(var20, var5, var14, 16777215, -1);
                          if (var24 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    var5 = var5 - (ba.field_e.field_o / 2 + (-1 + wd.field_D[var17]) * ba.field_e.field_o / 6);
                    var3_int = 0;
                    L31: while (true) {
                      if (~wd.field_D[var17] >= ~var3_int) {
                        break L29;
                      } else {
                        ba.field_e.c(var5, 12 + var14);
                        var5 = var5 + ba.field_e.field_o / 3;
                        var3_int++;
                        if (var24 != 0) {
                          break L28;
                        } else {
                          if (var24 == 0) {
                            continue L31;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                  }
                  if ((1 << var17 & var16) == 0) {
                    break L28;
                  } else {
                    stackOut_96_0 = 1;
                    stackIn_98_0 = stackOut_96_0;
                    break L27;
                  }
                }
                stackOut_97_0 = 0;
                stackIn_98_0 = stackOut_97_0;
                break L27;
              }
              L32: {
                L33: {
                  var21 = stackIn_98_0;
                  var14 = 220;
                  var5 = 170;
                  if (var21 == 0) {
                    break L33;
                  } else {
                    ob.field_I.c(cb.field_g, -1 + var5, var14, 0, 0);
                    ob.field_I.c(cb.field_g, var5, var14 - 1, 0, 0);
                    ob.field_I.c(cb.field_g, var5, var14, 2293572, -1);
                    if (var24 == 0) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                ob.field_I.c(hc.field_k, var5 + -1, var14, 0, 0);
                ob.field_I.c(hc.field_k, var5, -1 + var14, 0, 0);
                ob.field_I.c(hc.field_k, var5, var14, 16720452, -1);
                break L32;
              }
              L34: {
                var22 = 160;
                var20 = va.field_b[var17];
                var14 += 10;
                if (!var11[var17]) {
                  break L34;
                } else {
                  if ((1 << var17 & var16) != 0) {
                    break L34;
                  } else {
                    var20 = od.field_h;
                    break L34;
                  }
                }
              }
              L35: {
                L36: {
                  int discarded$3 = ob.field_I.a(var20, -1 + var5 + -(var22 / 2), 8 + var14, var22, 480, 0, 0, 1, 0, ob.field_I.field_H);
                  int discarded$4 = ob.field_I.a(var20, var5 + -(var22 / 2), 8 + var14 + -1, var22, 480, 0, 0, 1, 0, ob.field_I.field_H);
                  int discarded$5 = ob.field_I.a(var20, var5 - var22 / 2, 8 + var14, var22, 480, 16777215, -1, 1, 0, ob.field_I.field_H);
                  var14 = 350;
                  var5 = 320;
                  ob.field_I.c(gj.field_j[var17], var5 + -1, var14, 0, 0);
                  ob.field_I.c(gj.field_j[var17], var5, -1 + var14, 0, 0);
                  ob.field_I.c(gj.field_j[var17], var5, var14, 16777215, -1);
                  var23 = 200;
                  if (var21 == 0) {
                    break L36;
                  } else {
                    bd.field_o[var17].c(256, var23);
                    if (var24 == 0) {
                      break L35;
                    } else {
                      break L36;
                    }
                  }
                }
                L37: {
                  if (tc.field_b > 0) {
                    break L37;
                  } else {
                    if (!var10[var17]) {
                      break L37;
                    } else {
                      me.field_n.c(256, var23);
                      if (var24 == 0) {
                        break L35;
                      } else {
                        break L37;
                      }
                    }
                  }
                }
                al.field_d.c(256, var23);
                break L35;
              }
              var23 = var23 + ob.field_I.field_H;
              break L24;
            }
            return;
          }
        }
    }

    private final void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            vj.field_b.d();
            if (param0 == -29253) {
              param1 = param1.toUpperCase();
              var3_int = cc.field_t.a(param1);
              cc.field_t.c(param1, 320, 96, 1, -1);
              ul.e(5, 5, -(var3_int / 2) + 315, 59, 10 + var3_int, 42);
              cc.field_t.c(param1, 320, 96, 0, -1);
              cb.field_a.a(-40);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ja.Q(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    ja(int param0) {
        ((ja) this).field_i = -1;
        ((ja) this).field_h = -1;
        try {
            ((ja) this).field_a = param0;
            ((ja) this).field_f = new ml(vh.field_q[param0].length);
            fe.a(true);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ja.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_d = "ACHIEVEMENTS THIS GAME";
    }
}
