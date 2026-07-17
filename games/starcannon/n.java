/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private int field_j;
    static hg field_l;
    int field_k;
    private int field_d;
    static String field_g;
    private int field_h;
    private int field_e;
    static String field_f;
    static qc field_a;
    int field_b;
    private int field_c;
    private boolean field_i;

    final static void a(int param0, int param1, int param2, int param3, hl param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var6_int = (-param3 + param0 << 8) / param4.field_x;
              var7 = param4.field_w * var6_int + (param3 << 8);
              param2 = param2 + param4.field_w;
              param1 = param1 + param4.field_y;
              var8 = param2 - -(ki.field_j * param1);
              var9 = 0;
              var10 = param4.field_v;
              var11 = param4.field_u;
              var12 = -var11 + ki.field_j;
              if (param1 < ki.field_e) {
                var14 = ki.field_e - param1;
                var9 = var9 + var11 * var14;
                var8 = var8 + var14 * ki.field_j;
                var10 = var10 - var14;
                param1 = ki.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param2 < ki.field_l) {
                var14 = -param2 + ki.field_l;
                var12 = var12 + var14;
                var7 = var7 + var14 * var6_int;
                param2 = ki.field_l;
                var8 = var8 + var14;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var11 = var11 - var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 + var10 <= ki.field_i) {
                break L3;
              } else {
                var10 = var10 - (param1 - (-var10 + ki.field_i));
                break L3;
              }
            }
            L4: {
              if (param2 + var11 > ki.field_g) {
                var14 = param2 - (-var11 + ki.field_g);
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if (var10 > 0) {
                  param1 = -var10;
                  L6: while (true) {
                    if (0 <= param1) {
                      break L0;
                    } else {
                      var14 = var7;
                      param2 = -var11;
                      L7: while (true) {
                        if (param2 >= 0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param1++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = 256 - var15;
                            if (var15 < 0) {
                              var9++;
                              var8++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param4.field_B[incrementValue$1];
                                if (var17 == 0) {
                                  break L9;
                                } else {
                                  if (var15 > 255) {
                                    ki.field_a[var8] = var17;
                                    break L9;
                                  } else {
                                    var18 = ki.field_a[var8];
                                    var19 = 16711935 & (16711935 & var18) * var16 + var15 * (16711935 & var17) >> 8;
                                    ki.field_a[var8] = w.a(w.a(var18, 65280) * var16 + w.a(var17, 65280) * var15 >> 8, 65280) + var19;
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param2++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("n.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + -2 + 41);
        }
    }

    final boolean e(byte param0) {
        int var2 = 96 / ((param0 - 4) / 44);
        return ((n) this).field_j == 96 ? true : false;
    }

    final void a(boolean param0, boolean param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((n) this).field_i = stackIn_3_1 != 0;
        if (param0) {
          L1: {
            boolean discarded$2 = ((n) this).e(-61);
            ((n) this).field_e = 0;
            if (((n) this).field_i) {
              ((n) this).field_k = param3;
              break L1;
            } else {
              ((n) this).field_k = param2;
              break L1;
            }
          }
          return;
        } else {
          L2: {
            ((n) this).field_e = 0;
            if (((n) this).field_i) {
              ((n) this).field_k = param3;
              break L2;
            } else {
              ((n) this).field_k = param2;
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 < ((n) this).field_b) {
          if (param0 < ((n) this).field_b) {
            ((n) this).field_h = 0;
            var4 = 53 % ((-29 - param2) / 39);
            ((n) this).field_c = 0;
            ((n) this).field_j = 0;
            if (kg.field_a != 0) {
              ((n) this).field_i = true;
              ((n) this).field_e = kg.field_a;
              ((n) this).field_d = m.field_e;
              ((n) this).field_k = param0;
              ((n) this).field_c = kg.field_a;
              ((n) this).field_h = kg.field_a;
              if (((n) this).field_e != 0) {
                if (te.field_b == 0) {
                  L0: {
                    if (kg.field_a != 0) {
                      break L0;
                    } else {
                      if (te.field_b != 0) {
                        break L0;
                      } else {
                        ((n) this).field_e = 0;
                        if (((n) this).field_e == 0) {
                          if (((n) this).field_i) {
                            if (param1 >= 0) {
                              if (((n) this).field_k != param1) {
                                ((n) this).field_i = true;
                                ((n) this).field_k = param1;
                                return;
                              } else {
                                ((n) this).field_i = true;
                                ((n) this).field_k = param1;
                                return;
                              }
                            } else {
                              if (!((n) this).field_i) {
                                return;
                              } else {
                                ((n) this).field_k = -1;
                                return;
                              }
                            }
                          } else {
                            if (uf.field_d) {
                              if (param1 >= 0) {
                                if (((n) this).field_k != param1) {
                                  ((n) this).field_i = true;
                                  ((n) this).field_k = param1;
                                  return;
                                } else {
                                  ((n) this).field_i = true;
                                  ((n) this).field_k = param1;
                                  return;
                                }
                              } else {
                                if (!((n) this).field_i) {
                                  return;
                                } else {
                                  ((n) this).field_k = -1;
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (((n) this).field_e == 0) {
                    if (((n) this).field_i) {
                      if (param1 >= 0) {
                        if (((n) this).field_k != param1) {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        } else {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        }
                      } else {
                        if (((n) this).field_i) {
                          ((n) this).field_k = -1;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (uf.field_d) {
                        if (param1 >= 0) {
                          if (((n) this).field_k != param1) {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          } else {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          }
                        } else {
                          if (((n) this).field_i) {
                            ((n) this).field_k = -1;
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (((n) this).field_d > 0) {
                    L1: {
                      ((n) this).field_d = ((n) this).field_d - 1;
                      if (kg.field_a != 0) {
                        break L1;
                      } else {
                        if (te.field_b != 0) {
                          break L1;
                        } else {
                          ((n) this).field_e = 0;
                          break L1;
                        }
                      }
                    }
                    if (((n) this).field_e == 0) {
                      L2: {
                        if (((n) this).field_i) {
                          break L2;
                        } else {
                          if (uf.field_d) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 >= 0) {
                        if (((n) this).field_k != param1) {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        } else {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        }
                      } else {
                        L3: {
                          if (((n) this).field_i) {
                            ((n) this).field_k = -1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((n) this).field_d = md.field_c;
                    ((n) this).field_c = ((n) this).field_e;
                    L4: {
                      ((n) this).field_d = ((n) this).field_d - 1;
                      if (kg.field_a != 0) {
                        break L4;
                      } else {
                        if (te.field_b != 0) {
                          break L4;
                        } else {
                          ((n) this).field_e = 0;
                          break L4;
                        }
                      }
                    }
                    if (((n) this).field_e == 0) {
                      L5: {
                        if (((n) this).field_i) {
                          break L5;
                        } else {
                          if (uf.field_d) {
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 >= 0) {
                        if (((n) this).field_k != param1) {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        } else {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        }
                      } else {
                        if (((n) this).field_i) {
                          ((n) this).field_k = -1;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L6: {
                  if (kg.field_a != 0) {
                    break L6;
                  } else {
                    if (te.field_b != 0) {
                      break L6;
                    } else {
                      ((n) this).field_e = 0;
                      if (((n) this).field_e == 0) {
                        L7: {
                          if (((n) this).field_i) {
                            break L7;
                          } else {
                            if (uf.field_d) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 >= 0) {
                          if (((n) this).field_k != param1) {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          } else {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          }
                        } else {
                          L8: {
                            if (((n) this).field_i) {
                              ((n) this).field_k = -1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (((n) this).field_e == 0) {
                  if (((n) this).field_i) {
                    if (param1 >= 0) {
                      if (((n) this).field_k != param1) {
                        ((n) this).field_i = true;
                        ((n) this).field_k = param1;
                        return;
                      } else {
                        ((n) this).field_i = true;
                        ((n) this).field_k = param1;
                        return;
                      }
                    } else {
                      if (((n) this).field_i) {
                        ((n) this).field_k = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (uf.field_d) {
                      if (param1 >= 0) {
                        if (((n) this).field_k != param1) {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        } else {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        }
                      } else {
                        L9: {
                          if (((n) this).field_i) {
                            ((n) this).field_k = -1;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L10: {
                if (((n) this).field_e == 0) {
                  break L10;
                } else {
                  if (te.field_b == 0) {
                    break L10;
                  } else {
                    if (((n) this).field_d > 0) {
                      L11: {
                        ((n) this).field_d = ((n) this).field_d - 1;
                        if (kg.field_a != 0) {
                          break L11;
                        } else {
                          if (te.field_b != 0) {
                            break L11;
                          } else {
                            ((n) this).field_e = 0;
                            break L11;
                          }
                        }
                      }
                      if (((n) this).field_e == 0) {
                        L12: {
                          if (((n) this).field_i) {
                            break L12;
                          } else {
                            if (uf.field_d) {
                              break L12;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 >= 0) {
                          if (((n) this).field_k != param1) {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          } else {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          }
                        } else {
                          L13: {
                            if (((n) this).field_i) {
                              ((n) this).field_k = -1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((n) this).field_d = md.field_c;
                      ((n) this).field_c = ((n) this).field_e;
                      L14: {
                        ((n) this).field_d = ((n) this).field_d - 1;
                        if (kg.field_a != 0) {
                          break L14;
                        } else {
                          if (te.field_b != 0) {
                            break L14;
                          } else {
                            ((n) this).field_e = 0;
                            break L14;
                          }
                        }
                      }
                      if (((n) this).field_e == 0) {
                        L15: {
                          if (((n) this).field_i) {
                            break L15;
                          } else {
                            if (uf.field_d) {
                              break L15;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 >= 0) {
                          if (((n) this).field_k != param1) {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          } else {
                            ((n) this).field_i = true;
                            ((n) this).field_k = param1;
                            return;
                          }
                        } else {
                          L16: {
                            if (((n) this).field_i) {
                              ((n) this).field_k = -1;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L17: {
                if (kg.field_a != 0) {
                  break L17;
                } else {
                  if (te.field_b != 0) {
                    break L17;
                  } else {
                    ((n) this).field_e = 0;
                    if (((n) this).field_e == 0) {
                      L18: {
                        if (((n) this).field_i) {
                          break L18;
                        } else {
                          if (uf.field_d) {
                            break L18;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param1 >= 0) {
                        if (((n) this).field_k != param1) {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        } else {
                          ((n) this).field_i = true;
                          ((n) this).field_k = param1;
                          return;
                        }
                      } else {
                        L19: {
                          if (((n) this).field_i) {
                            ((n) this).field_k = -1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (((n) this).field_e == 0) {
                if (((n) this).field_i) {
                  if (param1 >= 0) {
                    if (((n) this).field_k != param1) {
                      ((n) this).field_i = true;
                      ((n) this).field_k = param1;
                      return;
                    } else {
                      ((n) this).field_i = true;
                      ((n) this).field_k = param1;
                      return;
                    }
                  } else {
                    if (((n) this).field_i) {
                      ((n) this).field_k = -1;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (uf.field_d) {
                    if (param1 >= 0) {
                      if (((n) this).field_k != param1) {
                        ((n) this).field_i = true;
                        ((n) this).field_k = param1;
                        return;
                      } else {
                        ((n) this).field_i = true;
                        ((n) this).field_k = param1;
                        return;
                      }
                    } else {
                      L20: {
                        if (((n) this).field_i) {
                          ((n) this).field_k = -1;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -18433) {
          if (2 != ((n) this).field_c) {
            if (-97 == ((n) this).field_j) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((n) this).field_h = -10;
          if (2 == ((n) this).field_c) {
            return true;
          } else {
            L0: {
              if (-97 != ((n) this).field_j) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        var3 = 71 % ((-9 - param0) / 55);
        if (0 == ((n) this).field_e) {
          ((n) this).field_k = param1;
          ((n) this).field_i = false;
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        if (param0 == 92) {
          ((n) this).field_j = 0;
          ((n) this).field_h = 0;
          ((n) this).field_c = 0;
          if (((n) this).field_e != 0) {
            if (0 != ((n) this).field_e) {
              if (((n) this).field_e == 0) {
                if (lb.field_B == 97) {
                  ((n) this).field_k = ((n) this).field_k + 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_k < ((n) this).field_b) {
                    return;
                  } else {
                    ((n) this).field_k = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (96 == lb.field_B) {
                if (0 < ((n) this).field_k) {
                  ((n) this).field_k = ((n) this).field_k - 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_e == 0) {
                    if (lb.field_B == 97) {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_k < ((n) this).field_b) {
                        return;
                      } else {
                        ((n) this).field_k = 0;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((n) this).field_k = ((n) this).field_b;
                  ((n) this).field_k = ((n) this).field_k - 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_e == 0) {
                    if (lb.field_B == 97) {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_k >= ((n) this).field_b) {
                        ((n) this).field_k = 0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (((n) this).field_e == 0) {
                  if (lb.field_B == 97) {
                    ((n) this).field_k = ((n) this).field_k + 1;
                    ((n) this).field_i = false;
                    if (((n) this).field_k < ((n) this).field_b) {
                      return;
                    } else {
                      ((n) this).field_k = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L0: {
              ((n) this).field_j = lb.field_B;
              if (0 != ((n) this).field_e) {
                break L0;
              } else {
                if (96 == lb.field_B) {
                  if (0 < ((n) this).field_k) {
                    L1: {
                      ((n) this).field_k = ((n) this).field_k - 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_e != 0) {
                        break L1;
                      } else {
                        if (lb.field_B != 97) {
                          break L1;
                        } else {
                          ((n) this).field_k = ((n) this).field_k + 1;
                          ((n) this).field_i = false;
                          if (((n) this).field_k >= ((n) this).field_b) {
                            ((n) this).field_k = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ((n) this).field_k = ((n) this).field_b;
                    L2: {
                      ((n) this).field_k = ((n) this).field_k - 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_e != 0) {
                        break L2;
                      } else {
                        if (lb.field_B != 97) {
                          break L2;
                        } else {
                          ((n) this).field_k = ((n) this).field_k + 1;
                          ((n) this).field_i = false;
                          if (((n) this).field_k >= ((n) this).field_b) {
                            ((n) this).field_k = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (((n) this).field_e == 0) {
              if (lb.field_B == 97) {
                ((n) this).field_k = ((n) this).field_k + 1;
                ((n) this).field_i = false;
                if (((n) this).field_k < ((n) this).field_b) {
                  return;
                } else {
                  ((n) this).field_k = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((n) this).field_j = -19;
          ((n) this).field_j = 0;
          ((n) this).field_h = 0;
          ((n) this).field_c = 0;
          if (((n) this).field_e == 0) {
            ((n) this).field_j = lb.field_B;
            if (0 != ((n) this).field_e) {
              L3: {
                if (((n) this).field_e != 0) {
                  break L3;
                } else {
                  if (lb.field_B != 97) {
                    break L3;
                  } else {
                    ((n) this).field_k = ((n) this).field_k + 1;
                    ((n) this).field_i = false;
                    if (((n) this).field_k >= ((n) this).field_b) {
                      ((n) this).field_k = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              return;
            } else {
              L4: {
                if (96 == lb.field_B) {
                  if (0 < ((n) this).field_k) {
                    ((n) this).field_k = ((n) this).field_k - 1;
                    ((n) this).field_i = false;
                    break L4;
                  } else {
                    ((n) this).field_k = ((n) this).field_b;
                    ((n) this).field_k = ((n) this).field_k - 1;
                    ((n) this).field_i = false;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (((n) this).field_e != 0) {
                  break L5;
                } else {
                  if (lb.field_B != 97) {
                    break L5;
                  } else {
                    ((n) this).field_k = ((n) this).field_k + 1;
                    ((n) this).field_i = false;
                    if (((n) this).field_k >= ((n) this).field_b) {
                      ((n) this).field_k = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              return;
            }
          } else {
            L6: {
              if (0 != ((n) this).field_e) {
                break L6;
              } else {
                if (96 == lb.field_B) {
                  if (0 < ((n) this).field_k) {
                    ((n) this).field_k = ((n) this).field_k - 1;
                    ((n) this).field_i = false;
                    break L6;
                  } else {
                    ((n) this).field_k = ((n) this).field_b;
                    ((n) this).field_k = ((n) this).field_k - 1;
                    ((n) this).field_i = false;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (((n) this).field_e != 0) {
                break L7;
              } else {
                if (lb.field_B != 97) {
                  break L7;
                } else {
                  ((n) this).field_k = ((n) this).field_k + 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_k >= ((n) this).field_b) {
                    ((n) this).field_k = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void c(byte param0) {
        ((n) this).field_c = 0;
        ((n) this).field_h = 0;
        if (param0 < 23) {
          L0: {
            field_a = null;
            ((n) this).field_j = 0;
            if (((n) this).field_e == 0) {
              ((n) this).field_j = lb.field_B;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((n) this).field_j = 0;
            if (((n) this).field_e == 0) {
              ((n) this).field_j = lb.field_B;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean d(byte param0) {
        int var2 = 14 % ((param0 - -50) / 44);
        return ((n) this).field_j == 97 ? true : false;
    }

    public static void f(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 0) {
            n.f(14);
            field_a = null;
            field_l = null;
            return;
        }
        field_a = null;
        field_l = null;
    }

    final void b(int param0, int param1) {
        ((n) this).field_c = 0;
        ((n) this).field_h = 0;
        ((n) this).field_j = 0;
        if (((n) this).field_e != 0) {
          if (param1 < -55) {
            L0: {
              if (((n) this).field_e == 0) {
                ((n) this).field_j = lb.field_B;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((n) this).field_e != 0) {
                break L1;
              } else {
                if (lb.field_B == 97) {
                  L2: {
                    ((n) this).field_k = ((n) this).field_k + 1;
                    if (~((n) this).field_b >= ~((n) this).field_k) {
                      ((n) this).field_k = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((n) this).field_i = false;
                  break L1;
                } else {
                  L3: {
                    if (((n) this).field_e != 0) {
                      break L3;
                    } else {
                      if (lb.field_B == 98) {
                        if (((n) this).field_k >= 0) {
                          ((n) this).field_i = false;
                          return;
                        } else {
                          ((n) this).field_k = param0;
                          ((n) this).field_i = false;
                          return;
                        }
                      } else {
                        if (lb.field_B != 99) {
                          break L3;
                        } else {
                          if (((n) this).field_k >= 0) {
                            ((n) this).field_i = false;
                            return;
                          } else {
                            ((n) this).field_k = param0;
                            ((n) this).field_i = false;
                            return;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            L4: {
              if (((n) this).field_e != 0) {
                break L4;
              } else {
                if (lb.field_B == 98) {
                  if (((n) this).field_k >= 0) {
                    ((n) this).field_i = false;
                    return;
                  } else {
                    ((n) this).field_k = param0;
                    ((n) this).field_i = false;
                    return;
                  }
                } else {
                  if (lb.field_B != 99) {
                    break L4;
                  } else {
                    if (((n) this).field_k >= 0) {
                      ((n) this).field_i = false;
                      return;
                    } else {
                      ((n) this).field_k = param0;
                      ((n) this).field_i = false;
                      return;
                    }
                  }
                }
              }
            }
            return;
          } else {
            L5: {
              ((n) this).c((byte) -59);
              if (((n) this).field_e == 0) {
                ((n) this).field_j = lb.field_B;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((n) this).field_e != 0) {
                break L6;
              } else {
                if (lb.field_B == 97) {
                  L7: {
                    ((n) this).field_k = ((n) this).field_k + 1;
                    if (~((n) this).field_b >= ~((n) this).field_k) {
                      ((n) this).field_k = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((n) this).field_i = false;
                  break L6;
                } else {
                  L8: {
                    if (((n) this).field_e != 0) {
                      break L8;
                    } else {
                      L9: {
                        if (lb.field_B == 98) {
                          break L9;
                        } else {
                          if (lb.field_B != 99) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (((n) this).field_k >= 0) {
                        ((n) this).field_i = false;
                        return;
                      } else {
                        ((n) this).field_k = param0;
                        ((n) this).field_i = false;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L10: {
              if (((n) this).field_e != 0) {
                break L10;
              } else {
                if (lb.field_B == 98) {
                  if (((n) this).field_k >= 0) {
                    ((n) this).field_i = false;
                    return;
                  } else {
                    ((n) this).field_k = param0;
                    ((n) this).field_i = false;
                    return;
                  }
                } else {
                  if (lb.field_B != 99) {
                    break L10;
                  } else {
                    if (((n) this).field_k >= 0) {
                      ((n) this).field_i = false;
                      return;
                    } else {
                      ((n) this).field_k = param0;
                      ((n) this).field_i = false;
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          if (lb.field_B == 96) {
            if (((n) this).field_k > 0) {
              L11: {
                ((n) this).field_i = false;
                ((n) this).field_k = ((n) this).field_k - 1;
                if (param1 < -55) {
                  break L11;
                } else {
                  ((n) this).c((byte) -59);
                  break L11;
                }
              }
              L12: {
                if (((n) this).field_e == 0) {
                  ((n) this).field_j = lb.field_B;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (((n) this).field_e != 0) {
                  break L13;
                } else {
                  if (lb.field_B == 97) {
                    L14: {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      if (~((n) this).field_b >= ~((n) this).field_k) {
                        ((n) this).field_k = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((n) this).field_i = false;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L15: {
                if (((n) this).field_e != 0) {
                  break L15;
                } else {
                  L16: {
                    if (lb.field_B == 98) {
                      break L16;
                    } else {
                      if (lb.field_B != 99) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (((n) this).field_k >= 0) {
                    ((n) this).field_i = false;
                    return;
                  } else {
                    ((n) this).field_k = param0;
                    ((n) this).field_i = false;
                    return;
                  }
                }
              }
              return;
            } else {
              ((n) this).field_k = ((n) this).field_b;
              ((n) this).field_i = false;
              ((n) this).field_k = ((n) this).field_k - 1;
              if (param1 < -55) {
                L17: {
                  if (((n) this).field_e == 0) {
                    ((n) this).field_j = lb.field_B;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (((n) this).field_e != 0) {
                    break L18;
                  } else {
                    if (lb.field_B == 97) {
                      L19: {
                        ((n) this).field_k = ((n) this).field_k + 1;
                        if (~((n) this).field_b >= ~((n) this).field_k) {
                          ((n) this).field_k = 0;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      ((n) this).field_i = false;
                      break L18;
                    } else {
                      L20: {
                        if (((n) this).field_e != 0) {
                          break L20;
                        } else {
                          L21: {
                            if (lb.field_B == 98) {
                              break L21;
                            } else {
                              if (lb.field_B != 99) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (((n) this).field_k >= 0) {
                            ((n) this).field_i = false;
                            return;
                          } else {
                            ((n) this).field_k = param0;
                            ((n) this).field_i = false;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L22: {
                  if (((n) this).field_e != 0) {
                    break L22;
                  } else {
                    if (lb.field_B == 98) {
                      if (((n) this).field_k >= 0) {
                        ((n) this).field_i = false;
                        return;
                      } else {
                        ((n) this).field_k = param0;
                        ((n) this).field_i = false;
                        return;
                      }
                    } else {
                      if (lb.field_B != 99) {
                        break L22;
                      } else {
                        if (((n) this).field_k >= 0) {
                          ((n) this).field_i = false;
                          return;
                        } else {
                          ((n) this).field_k = param0;
                          ((n) this).field_i = false;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L23: {
                  ((n) this).c((byte) -59);
                  if (((n) this).field_e == 0) {
                    ((n) this).field_j = lb.field_B;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (((n) this).field_e != 0) {
                    break L24;
                  } else {
                    if (lb.field_B == 97) {
                      L25: {
                        ((n) this).field_k = ((n) this).field_k + 1;
                        if (~((n) this).field_b >= ~((n) this).field_k) {
                          ((n) this).field_k = 0;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      ((n) this).field_i = false;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                }
                L26: {
                  if (((n) this).field_e != 0) {
                    break L26;
                  } else {
                    L27: {
                      if (lb.field_B == 98) {
                        break L27;
                      } else {
                        if (lb.field_B != 99) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (((n) this).field_k >= 0) {
                      ((n) this).field_i = false;
                      return;
                    } else {
                      ((n) this).field_k = param0;
                      ((n) this).field_i = false;
                      return;
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (param1 >= -55) {
              L28: {
                ((n) this).c((byte) -59);
                if (((n) this).field_e == 0) {
                  ((n) this).field_j = lb.field_B;
                  break L28;
                } else {
                  break L28;
                }
              }
              if (((n) this).field_e == 0) {
                L29: {
                  if (lb.field_B == 97) {
                    L30: {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      if (~((n) this).field_b >= ~((n) this).field_k) {
                        ((n) this).field_k = 0;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    ((n) this).field_i = false;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L31: {
                  if (((n) this).field_e != 0) {
                    break L31;
                  } else {
                    L32: {
                      if (lb.field_B == 98) {
                        break L32;
                      } else {
                        if (lb.field_B != 99) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    if (((n) this).field_k >= 0) {
                      ((n) this).field_i = false;
                      return;
                    } else {
                      ((n) this).field_k = param0;
                      ((n) this).field_i = false;
                      return;
                    }
                  }
                }
                return;
              } else {
                L33: {
                  if (((n) this).field_e != 0) {
                    break L33;
                  } else {
                    L34: {
                      if (lb.field_B == 98) {
                        break L34;
                      } else {
                        if (lb.field_B != 99) {
                          break L33;
                        } else {
                          break L34;
                        }
                      }
                    }
                    if (((n) this).field_k >= 0) {
                      ((n) this).field_i = false;
                      return;
                    } else {
                      ((n) this).field_k = param0;
                      ((n) this).field_i = false;
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              L35: {
                if (((n) this).field_e == 0) {
                  ((n) this).field_j = lb.field_B;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (((n) this).field_e != 0) {
                  break L36;
                } else {
                  if (lb.field_B == 97) {
                    L37: {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      if (~((n) this).field_b >= ~((n) this).field_k) {
                        ((n) this).field_k = 0;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    ((n) this).field_i = false;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              L38: {
                if (((n) this).field_e != 0) {
                  break L38;
                } else {
                  L39: {
                    if (lb.field_B == 98) {
                      break L39;
                    } else {
                      if (lb.field_B != 99) {
                        break L38;
                      } else {
                        break L39;
                      }
                    }
                  }
                  if (((n) this).field_k >= 0) {
                    ((n) this).field_i = false;
                    return;
                  } else {
                    ((n) this).field_k = param0;
                    ((n) this).field_i = false;
                    return;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -104) {
          L0: {
            boolean discarded$10 = ((n) this).c(-116);
            if (((n) this).field_j != 103) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((n) this).field_j != 103) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean g(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (0 == ((n) this).field_h) {
            if (((n) this).field_j != 84) {
              if (((n) this).field_j == 83) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ((n) this).field_b = -28;
          if (0 == ((n) this).field_h) {
            if (((n) this).field_j == 84) {
              return true;
            } else {
              L0: {
                if (-84 != ((n) this).field_j) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = -106 % ((param0 - 26) / 50);
        return ((n) this).field_j == 102 ? true : false;
    }

    final boolean d(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == -1) {
          if (((n) this).field_c != 1) {
            if (((n) this).field_j != 97) {
              L0: {
                if (84 == ((n) this).field_j) {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L0;
                } else {
                  if (((n) this).field_j != 83) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_20_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$21 = ((n) this).d((byte) -84);
          if (((n) this).field_c != 1) {
            if (((n) this).field_j != 97) {
              L1: {
                if (84 == ((n) this).field_j) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                } else {
                  if (((n) this).field_j != 83) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_10_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final boolean h(int param0) {
        if (param0 != -84) {
            ((n) this).field_i = true;
            if (0 != ((n) this).field_c) {
                return true;
            }
            if (((n) this).field_j == 84) {
                return true;
            }
            return ((n) this).field_j == 83 ? true : false;
        }
        if (0 != ((n) this).field_c) {
            return true;
        }
        if (((n) this).field_j == 84) {
            return true;
        }
        if (((n) this).field_j == 83) {
            return true;
        }
        return false;
    }

    final void a(int param0) {
        ((n) this).field_j = 0;
        ((n) this).field_c = 0;
        ((n) this).field_h = 0;
        if (param0 != ((n) this).field_e) {
          L0: {
            if (((n) this).field_e != 0) {
              break L0;
            } else {
              if (lb.field_B != 98) {
                break L0;
              } else {
                if (((n) this).field_k > 0) {
                  ((n) this).field_k = ((n) this).field_k - 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_e == 0) {
                    if (lb.field_B == 99) {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_k < ((n) this).field_b) {
                        return;
                      } else {
                        ((n) this).field_k = 0;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((n) this).field_k = ((n) this).field_b;
                  ((n) this).field_k = ((n) this).field_k - 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_e == 0) {
                    if (lb.field_B == 99) {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_k < ((n) this).field_b) {
                        return;
                      } else {
                        ((n) this).field_k = 0;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (((n) this).field_e == 0) {
            if (lb.field_B == 99) {
              ((n) this).field_k = ((n) this).field_k + 1;
              ((n) this).field_i = false;
              if (((n) this).field_k >= ((n) this).field_b) {
                ((n) this).field_k = 0;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((n) this).field_j = lb.field_B;
          if (((n) this).field_e == 0) {
            if (lb.field_B == 98) {
              if (((n) this).field_k > 0) {
                L1: {
                  ((n) this).field_k = ((n) this).field_k - 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_e != 0) {
                    break L1;
                  } else {
                    if (lb.field_B != 99) {
                      break L1;
                    } else {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_k >= ((n) this).field_b) {
                        ((n) this).field_k = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              } else {
                ((n) this).field_k = ((n) this).field_b;
                L2: {
                  ((n) this).field_k = ((n) this).field_k - 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_e != 0) {
                    break L2;
                  } else {
                    if (lb.field_B != 99) {
                      break L2;
                    } else {
                      ((n) this).field_k = ((n) this).field_k + 1;
                      ((n) this).field_i = false;
                      if (((n) this).field_k >= ((n) this).field_b) {
                        ((n) this).field_k = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L3: {
                if (((n) this).field_e != 0) {
                  break L3;
                } else {
                  if (lb.field_B != 99) {
                    break L3;
                  } else {
                    ((n) this).field_k = ((n) this).field_k + 1;
                    ((n) this).field_i = false;
                    if (((n) this).field_k >= ((n) this).field_b) {
                      ((n) this).field_k = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              return;
            }
          } else {
            L4: {
              if (((n) this).field_e != 0) {
                break L4;
              } else {
                if (lb.field_B != 99) {
                  break L4;
                } else {
                  ((n) this).field_k = ((n) this).field_k + 1;
                  ((n) this).field_i = false;
                  if (((n) this).field_k >= ((n) this).field_b) {
                    ((n) this).field_k = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            return false;
        }
        return 0 != ((n) this).field_e ? true : false;
    }

    n(int param0) {
        ((n) this).field_k = 0;
        ((n) this).field_i = false;
        ((n) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Create a free account to start using this feature";
        field_f = "Waiting for graphics";
    }
}
