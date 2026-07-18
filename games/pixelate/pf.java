/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static fm field_d;
    private int field_k;
    private int field_a;
    private int field_g;
    private boolean field_c;
    private int field_i;
    int field_j;
    int field_h;
    static wm field_f;
    static String field_l;
    static boolean field_e;
    static String field_b;
    static String field_m;

    final void a(boolean param0, int param1) {
        if (!param0) {
          if (-1 == ((pf) this).field_i) {
            ((pf) this).field_c = false;
            ((pf) this).field_j = param1;
            return;
          } else {
            return;
          }
        } else {
          ((pf) this).a(false, -5, -120, 105);
          if (-1 != ((pf) this).field_i) {
            return;
          } else {
            ((pf) this).field_c = false;
            ((pf) this).field_j = param1;
            return;
          }
        }
    }

    final static int a(boolean param0) {
        return (int)(1000000000L / wa.field_b);
    }

    final boolean d(int param0) {
        int var2 = -101 % ((param0 - -51) / 33);
        return ((pf) this).field_g == 103 ? true : false;
    }

    final void a(byte param0) {
        L0: {
          ((pf) this).field_g = 0;
          ((pf) this).field_k = 0;
          if (0 != ((pf) this).field_i) {
            break L0;
          } else {
            if (ke.field_a == 98) {
              L1: {
                if (0 >= ((pf) this).field_j) {
                  ((pf) this).field_j = ((pf) this).field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((pf) this).field_j = ((pf) this).field_j - 1;
              ((pf) this).field_c = false;
              break L0;
            } else {
              L2: {
                if (((pf) this).field_i == 0) {
                  ((pf) this).field_g = ke.field_a;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (((pf) this).field_i == 0) {
                if (ke.field_a == 99) {
                  ((pf) this).field_j = ((pf) this).field_j + 1;
                  ((pf) this).field_c = false;
                  if (~((pf) this).field_h < ~((pf) this).field_j) {
                    if (param0 == -48) {
                      return;
                    } else {
                      boolean discarded$6 = ((pf) this).c(64);
                      return;
                    }
                  } else {
                    ((pf) this).field_j = 0;
                    if (param0 == -48) {
                      return;
                    } else {
                      boolean discarded$7 = ((pf) this).c(64);
                      return;
                    }
                  }
                } else {
                  if (param0 == -48) {
                    return;
                  } else {
                    boolean discarded$8 = ((pf) this).c(64);
                    return;
                  }
                }
              } else {
                L3: {
                  if (param0 == -48) {
                    break L3;
                  } else {
                    boolean discarded$9 = ((pf) this).c(64);
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
        L4: {
          if (((pf) this).field_i == 0) {
            ((pf) this).field_g = ke.field_a;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((pf) this).field_i != 0) {
            break L5;
          } else {
            if (ke.field_a != 99) {
              break L5;
            } else {
              ((pf) this).field_j = ((pf) this).field_j + 1;
              ((pf) this).field_c = false;
              if (~((pf) this).field_h < ~((pf) this).field_j) {
                break L5;
              } else {
                ((pf) this).field_j = 0;
                if (param0 == -48) {
                  return;
                } else {
                  boolean discarded$10 = ((pf) this).c(64);
                  return;
                }
              }
            }
          }
        }
        if (param0 == -48) {
          return;
        } else {
          boolean discarded$11 = ((pf) this).c(64);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_m = null;
        field_f = null;
        field_l = null;
        field_d = null;
    }

    final void a(int param0, int param1) {
        if (param0 < 46) {
          boolean discarded$1 = ((pf) this).a(6);
          ((pf) this).field_k = 0;
          ((pf) this).field_g = 0;
          if (0 == ((pf) this).field_i) {
            if (ke.field_a != 96) {
              L0: {
                if (((pf) this).field_i == 0) {
                  ((pf) this).field_g = ke.field_a;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (((pf) this).field_i != 0) {
                  break L1;
                } else {
                  if (ke.field_a == 97) {
                    ((pf) this).field_j = ((pf) this).field_j + 1;
                    if (((pf) this).field_j < ((pf) this).field_h) {
                      ((pf) this).field_c = false;
                      break L1;
                    } else {
                      L2: {
                        ((pf) this).field_j = 0;
                        ((pf) this).field_c = false;
                        if (((pf) this).field_i != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (ke.field_a == 98) {
                              break L3;
                            } else {
                              if (ke.field_a == 99) {
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                          ((pf) this).field_c = false;
                          if (((pf) this).field_j >= 0) {
                            break L2;
                          } else {
                            ((pf) this).field_j = param1;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L4: {
                      if (((pf) this).field_i != 0) {
                        break L4;
                      } else {
                        L5: {
                          if (ke.field_a == 98) {
                            break L5;
                          } else {
                            if (ke.field_a == 99) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        ((pf) this).field_c = false;
                        if (((pf) this).field_j >= 0) {
                          break L4;
                        } else {
                          ((pf) this).field_j = param1;
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L6: {
                if (((pf) this).field_i != 0) {
                  break L6;
                } else {
                  L7: {
                    if (ke.field_a == 98) {
                      break L7;
                    } else {
                      if (ke.field_a == 99) {
                        break L7;
                      } else {
                        return;
                      }
                    }
                  }
                  ((pf) this).field_c = false;
                  if (((pf) this).field_j >= 0) {
                    break L6;
                  } else {
                    ((pf) this).field_j = param1;
                    return;
                  }
                }
              }
              return;
            } else {
              if (((pf) this).field_j > 0) {
                L8: {
                  ((pf) this).field_c = false;
                  ((pf) this).field_j = ((pf) this).field_j - 1;
                  if (((pf) this).field_i == 0) {
                    ((pf) this).field_g = ke.field_a;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (((pf) this).field_i != 0) {
                    break L9;
                  } else {
                    if (ke.field_a == 97) {
                      L10: {
                        ((pf) this).field_j = ((pf) this).field_j + 1;
                        if (((pf) this).field_j < ((pf) this).field_h) {
                          break L10;
                        } else {
                          ((pf) this).field_j = 0;
                          break L10;
                        }
                      }
                      ((pf) this).field_c = false;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L11: {
                  if (((pf) this).field_i != 0) {
                    break L11;
                  } else {
                    L12: {
                      if (ke.field_a == 98) {
                        break L12;
                      } else {
                        if (ke.field_a == 99) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    ((pf) this).field_c = false;
                    if (((pf) this).field_j >= 0) {
                      break L11;
                    } else {
                      ((pf) this).field_j = param1;
                      break L11;
                    }
                  }
                }
                return;
              } else {
                ((pf) this).field_j = ((pf) this).field_h;
                L13: {
                  ((pf) this).field_c = false;
                  ((pf) this).field_j = ((pf) this).field_j - 1;
                  if (((pf) this).field_i == 0) {
                    ((pf) this).field_g = ke.field_a;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((pf) this).field_i != 0) {
                    break L14;
                  } else {
                    if (ke.field_a == 97) {
                      L15: {
                        ((pf) this).field_j = ((pf) this).field_j + 1;
                        if (((pf) this).field_j < ((pf) this).field_h) {
                          break L15;
                        } else {
                          ((pf) this).field_j = 0;
                          break L15;
                        }
                      }
                      ((pf) this).field_c = false;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                if (((pf) this).field_i == 0) {
                  if (ke.field_a != 98) {
                    if (ke.field_a == 99) {
                      ((pf) this).field_c = false;
                      if (((pf) this).field_j >= 0) {
                        return;
                      } else {
                        ((pf) this).field_j = param1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((pf) this).field_c = false;
                    if (((pf) this).field_j >= 0) {
                      return;
                    } else {
                      ((pf) this).field_j = param1;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L16: {
              if (((pf) this).field_i == 0) {
                ((pf) this).field_g = ke.field_a;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (((pf) this).field_i != 0) {
                break L17;
              } else {
                if (ke.field_a == 97) {
                  ((pf) this).field_j = ((pf) this).field_j + 1;
                  if (((pf) this).field_j < ((pf) this).field_h) {
                    ((pf) this).field_c = false;
                    break L17;
                  } else {
                    L18: {
                      ((pf) this).field_j = 0;
                      ((pf) this).field_c = false;
                      if (((pf) this).field_i != 0) {
                        break L18;
                      } else {
                        L19: {
                          if (ke.field_a == 98) {
                            break L19;
                          } else {
                            if (ke.field_a == 99) {
                              break L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                        ((pf) this).field_c = false;
                        if (((pf) this).field_j >= 0) {
                          break L18;
                        } else {
                          ((pf) this).field_j = param1;
                          break L18;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L20: {
                    if (((pf) this).field_i != 0) {
                      break L20;
                    } else {
                      L21: {
                        if (ke.field_a == 98) {
                          break L21;
                        } else {
                          if (ke.field_a == 99) {
                            break L21;
                          } else {
                            break L20;
                          }
                        }
                      }
                      ((pf) this).field_c = false;
                      if (((pf) this).field_j >= 0) {
                        break L20;
                      } else {
                        ((pf) this).field_j = param1;
                        break L20;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L22: {
              if (((pf) this).field_i != 0) {
                break L22;
              } else {
                L23: {
                  if (ke.field_a == 98) {
                    break L23;
                  } else {
                    if (ke.field_a == 99) {
                      break L23;
                    } else {
                      return;
                    }
                  }
                }
                ((pf) this).field_c = false;
                if (((pf) this).field_j >= 0) {
                  break L22;
                } else {
                  ((pf) this).field_j = param1;
                  return;
                }
              }
            }
            return;
          }
        } else {
          L24: {
            ((pf) this).field_k = 0;
            ((pf) this).field_g = 0;
            if (0 != ((pf) this).field_i) {
              break L24;
            } else {
              if (ke.field_a != 96) {
                break L24;
              } else {
                if (((pf) this).field_j > 0) {
                  L25: {
                    ((pf) this).field_c = false;
                    ((pf) this).field_j = ((pf) this).field_j - 1;
                    if (((pf) this).field_i == 0) {
                      ((pf) this).field_g = ke.field_a;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (((pf) this).field_i != 0) {
                      break L26;
                    } else {
                      if (ke.field_a == 97) {
                        ((pf) this).field_j = ((pf) this).field_j + 1;
                        if (((pf) this).field_j < ((pf) this).field_h) {
                          ((pf) this).field_c = false;
                          break L26;
                        } else {
                          ((pf) this).field_j = 0;
                          ((pf) this).field_c = false;
                          break L26;
                        }
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (((pf) this).field_i != 0) {
                      break L27;
                    } else {
                      L28: {
                        if (ke.field_a == 98) {
                          break L28;
                        } else {
                          if (ke.field_a == 99) {
                            break L28;
                          } else {
                            break L27;
                          }
                        }
                      }
                      ((pf) this).field_c = false;
                      if (((pf) this).field_j >= 0) {
                        break L27;
                      } else {
                        ((pf) this).field_j = param1;
                        break L27;
                      }
                    }
                  }
                  return;
                } else {
                  ((pf) this).field_j = ((pf) this).field_h;
                  L29: {
                    ((pf) this).field_c = false;
                    ((pf) this).field_j = ((pf) this).field_j - 1;
                    if (((pf) this).field_i == 0) {
                      ((pf) this).field_g = ke.field_a;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (((pf) this).field_i != 0) {
                      break L30;
                    } else {
                      if (ke.field_a == 97) {
                        ((pf) this).field_j = ((pf) this).field_j + 1;
                        if (((pf) this).field_j < ((pf) this).field_h) {
                          ((pf) this).field_c = false;
                          break L30;
                        } else {
                          ((pf) this).field_j = 0;
                          ((pf) this).field_c = false;
                          break L30;
                        }
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    if (((pf) this).field_i != 0) {
                      break L31;
                    } else {
                      L32: {
                        if (ke.field_a == 98) {
                          break L32;
                        } else {
                          if (ke.field_a == 99) {
                            break L32;
                          } else {
                            break L31;
                          }
                        }
                      }
                      ((pf) this).field_c = false;
                      if (((pf) this).field_j >= 0) {
                        break L31;
                      } else {
                        ((pf) this).field_j = param1;
                        break L31;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L33: {
            if (((pf) this).field_i == 0) {
              ((pf) this).field_g = ke.field_a;
              break L33;
            } else {
              break L33;
            }
          }
          L34: {
            if (((pf) this).field_i != 0) {
              break L34;
            } else {
              if (ke.field_a == 97) {
                ((pf) this).field_j = ((pf) this).field_j + 1;
                if (((pf) this).field_j < ((pf) this).field_h) {
                  ((pf) this).field_c = false;
                  break L34;
                } else {
                  L35: {
                    ((pf) this).field_j = 0;
                    ((pf) this).field_c = false;
                    if (((pf) this).field_i != 0) {
                      break L35;
                    } else {
                      L36: {
                        if (ke.field_a == 98) {
                          break L36;
                        } else {
                          if (ke.field_a == 99) {
                            break L36;
                          } else {
                            break L35;
                          }
                        }
                      }
                      ((pf) this).field_c = false;
                      if (((pf) this).field_j >= 0) {
                        break L35;
                      } else {
                        ((pf) this).field_j = param1;
                        break L35;
                      }
                    }
                  }
                  return;
                }
              } else {
                L37: {
                  if (((pf) this).field_i != 0) {
                    break L37;
                  } else {
                    L38: {
                      if (ke.field_a == 98) {
                        break L38;
                      } else {
                        if (ke.field_a == 99) {
                          break L38;
                        } else {
                          break L37;
                        }
                      }
                    }
                    ((pf) this).field_c = false;
                    if (((pf) this).field_j >= 0) {
                      break L37;
                    } else {
                      ((pf) this).field_j = param1;
                      break L37;
                    }
                  }
                }
                return;
              }
            }
          }
          L39: {
            if (((pf) this).field_i != 0) {
              break L39;
            } else {
              L40: {
                if (ke.field_a == 98) {
                  break L40;
                } else {
                  if (ke.field_a == 99) {
                    break L40;
                  } else {
                    return;
                  }
                }
              }
              ((pf) this).field_c = false;
              if (((pf) this).field_j >= 0) {
                break L39;
              } else {
                ((pf) this).field_j = param1;
                return;
              }
            }
          }
          return;
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 35) {
          L0: {
            pf.b(116, 24);
            if (0 == ((pf) this).field_i) {
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
            if (0 == ((pf) this).field_i) {
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

    final void b(byte param0) {
        if (param0 != -71) {
          return;
        } else {
          L0: {
            ((pf) this).field_g = 0;
            ((pf) this).field_k = 0;
            if (((pf) this).field_i == 0) {
              ((pf) this).field_g = ke.field_a;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != -97) {
            return true;
        }
        return ((pf) this).field_g == 96 ? true : false;
    }

    final static jk[] a(pc param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        jk[] var4 = null;
        int var5 = 0;
        jk var6_ref_jk = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        jk[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk[] stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c(8, (byte) -34);
            if (var2_int <= 0) {
              var3 = param0.c(12, (byte) -34);
              var4 = new jk[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_11_0 = (jk[]) var4;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    if (!tj.a(param0, -32)) {
                      var6 = param0.c(wg.a(var5 - 1, 15598), (byte) -34);
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_jk = new jk();
                      int discarded$12 = param0.c(24, (byte) -34);
                      int discarded$13 = param0.c(24, (byte) -34);
                      var6_ref_jk.field_b = param0.c(24, (byte) -34);
                      int discarded$14 = param0.c(9, (byte) -34);
                      int discarded$15 = param0.c(12, (byte) -34);
                      int discarded$16 = param0.c(12, (byte) -34);
                      int discarded$17 = param0.c(12, (byte) -34);
                      var4[var5] = var6_ref_jk;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (jk[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("pf.O(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 77 + ')');
        }
        return stackIn_12_0;
    }

    final void a(int param0, int param1, int param2) {
        if (((pf) this).field_h <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (param0 >= ((pf) this).field_h) {
            throw new IllegalArgumentException();
          } else {
            ((pf) this).field_g = 0;
            ((pf) this).field_k = 0;
            if (nm.field_c == 0) {
              L0: {
                if (((pf) this).field_i == 0) {
                  break L0;
                } else {
                  if (ef.field_b == 0) {
                    break L0;
                  } else {
                    L1: {
                      if (((pf) this).field_a <= 0) {
                        ((pf) this).field_a = gb.field_a;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((pf) this).field_a = ((pf) this).field_a - 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (~nm.field_c != param2) {
                  break L2;
                } else {
                  if (0 != ef.field_b) {
                    break L2;
                  } else {
                    ((pf) this).field_i = 0;
                    if (((pf) this).field_i == 0) {
                      L3: {
                        if (((pf) this).field_c) {
                          break L3;
                        } else {
                          if (im.field_Jb) {
                            break L3;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (!((pf) this).field_c) {
                          return;
                        } else {
                          ((pf) this).field_j = -1;
                          return;
                        }
                      } else {
                        if (param1 != ((pf) this).field_j) {
                          ((pf) this).field_c = true;
                          ((pf) this).field_j = param1;
                          return;
                        } else {
                          ((pf) this).field_c = true;
                          ((pf) this).field_j = param1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (((pf) this).field_i == 0) {
                L4: {
                  if (((pf) this).field_c) {
                    break L4;
                  } else {
                    if (im.field_Jb) {
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                if (0 > param1) {
                  if (!((pf) this).field_c) {
                    return;
                  } else {
                    ((pf) this).field_j = -1;
                    return;
                  }
                } else {
                  if (param1 != ((pf) this).field_j) {
                    ((pf) this).field_c = true;
                    ((pf) this).field_j = param1;
                    return;
                  } else {
                    ((pf) this).field_c = true;
                    ((pf) this).field_j = param1;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              ((pf) this).field_j = param0;
              ((pf) this).field_c = true;
              ((pf) this).field_i = nm.field_c;
              ((pf) this).field_k = nm.field_c;
              ((pf) this).field_a = tj.field_v;
              if (((pf) this).field_i != 0) {
                if (ef.field_b != 0) {
                  L5: {
                    if (((pf) this).field_a <= 0) {
                      ((pf) this).field_a = gb.field_a;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    ((pf) this).field_a = ((pf) this).field_a - 1;
                    if (~nm.field_c != param2) {
                      break L6;
                    } else {
                      if (0 != ef.field_b) {
                        break L6;
                      } else {
                        ((pf) this).field_i = 0;
                        break L6;
                      }
                    }
                  }
                  if (((pf) this).field_i == 0) {
                    if (!((pf) this).field_c) {
                      L7: {
                        if (im.field_Jb) {
                          if (0 > param1) {
                            if (!((pf) this).field_c) {
                              return;
                            } else {
                              ((pf) this).field_j = -1;
                              return;
                            }
                          } else {
                            if (param1 != ((pf) this).field_j) {
                              ((pf) this).field_c = true;
                              ((pf) this).field_j = param1;
                              break L7;
                            } else {
                              ((pf) this).field_c = true;
                              ((pf) this).field_j = param1;
                              return;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      return;
                    } else {
                      if (0 > param1) {
                        if (!((pf) this).field_c) {
                          return;
                        } else {
                          ((pf) this).field_j = -1;
                          return;
                        }
                      } else {
                        if (param1 != ((pf) this).field_j) {
                          ((pf) this).field_c = true;
                          ((pf) this).field_j = param1;
                          return;
                        } else {
                          ((pf) this).field_c = true;
                          ((pf) this).field_j = param1;
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L8: {
                    if (~nm.field_c != param2) {
                      break L8;
                    } else {
                      if (0 != ef.field_b) {
                        break L8;
                      } else {
                        ((pf) this).field_i = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (((pf) this).field_i != 0) {
                      break L9;
                    } else {
                      L10: {
                        if (((pf) this).field_c) {
                          break L10;
                        } else {
                          if (im.field_Jb) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (((pf) this).field_c) {
                          ((pf) this).field_j = -1;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        if (param1 != ((pf) this).field_j) {
                          ((pf) this).field_c = true;
                          ((pf) this).field_j = param1;
                          break L9;
                        } else {
                          ((pf) this).field_c = true;
                          ((pf) this).field_j = param1;
                          break L9;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  if (~nm.field_c != param2) {
                    break L11;
                  } else {
                    if (0 != ef.field_b) {
                      break L11;
                    } else {
                      ((pf) this).field_i = 0;
                      break L11;
                    }
                  }
                }
                L12: {
                  if (((pf) this).field_i != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (((pf) this).field_c) {
                        break L13;
                      } else {
                        if (im.field_Jb) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (0 > param1) {
                      if (((pf) this).field_c) {
                        ((pf) this).field_j = -1;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      if (param1 != ((pf) this).field_j) {
                        ((pf) this).field_c = true;
                        ((pf) this).field_j = param1;
                        break L12;
                      } else {
                        ((pf) this).field_c = true;
                        ((pf) this).field_j = param1;
                        break L12;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        td.field_d = gn.field_w[param0];
        hm.field_a = un.field_k[param0];
        wa.field_a = uf.field_c[param0];
        if (param1 != -31383) {
            pf.b(63, 96);
        }
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (160 <= param1) {
              L0: {
                if (255 >= param1) {
                  var2 = (byte)param1;
                  break L0;
                } else {
                  if (param1 != 8364) {
                    if (param1 == 8218) {
                      var2 = -126;
                      return (byte) var2;
                    } else {
                      if (param1 == 402) {
                        var2 = -125;
                        return (byte) var2;
                      } else {
                        if (param1 != 8222) {
                          if (param1 == 8230) {
                            var2 = -123;
                            return (byte) var2;
                          } else {
                            if (param1 == 8224) {
                              var2 = -122;
                              return (byte) var2;
                            } else {
                              if (param1 == 8225) {
                                var2 = -121;
                                return (byte) var2;
                              } else {
                                if (710 == param1) {
                                  var2 = -120;
                                  return (byte) var2;
                                } else {
                                  if (8240 == param1) {
                                    var2 = -119;
                                    return (byte) var2;
                                  } else {
                                    if (param1 != 352) {
                                      if (param1 != 8249) {
                                        if (param1 != 338) {
                                          if (param1 == 381) {
                                            var2 = -114;
                                            return (byte) var2;
                                          } else {
                                            if (param1 != 8216) {
                                              if (8217 == param1) {
                                                var2 = -110;
                                                return (byte) var2;
                                              } else {
                                                if (param1 != 8220) {
                                                  if (param1 != 8221) {
                                                    if (param1 != 8226) {
                                                      if (param1 != 8211) {
                                                        if (param1 != 8212) {
                                                          if (param1 == 732) {
                                                            var2 = -104;
                                                            return (byte) var2;
                                                          } else {
                                                            if (param1 != 8482) {
                                                              if (353 != param1) {
                                                                if (param1 != 8250) {
                                                                  if (param1 == 339) {
                                                                    var2 = -100;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (382 == param1) {
                                                                      var2 = -98;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      if (param1 == 376) {
                                                                        var2 = -97;
                                                                        return (byte) var2;
                                                                      } else {
                                                                        var2 = 63;
                                                                        return (byte) var2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  return (byte) var2;
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                return (byte) var2;
                                                              }
                                                            } else {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        break L0;
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      break L0;
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L0;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              }
                                            } else {
                                              var2 = -111;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          var2 = -116;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -118;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var2 = -124;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var2 = -128;
                    break L0;
                  }
                }
              }
              return (byte) var2;
            } else {
              L1: {
                if (param1 != 8364) {
                  if (param1 != 8218) {
                    if (param1 != 402) {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (param1 != 8225) {
                              if (710 != param1) {
                                if (8240 != param1) {
                                  if (param1 != 352) {
                                    if (param1 != 8249) {
                                      if (param1 != 338) {
                                        if (param1 != 381) {
                                          if (param1 != 8216) {
                                            if (8217 != param1) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (param1 != 8226) {
                                                    if (param1 != 8211) {
                                                      if (param1 != 8212) {
                                                        if (param1 != 732) {
                                                          if (param1 != 8482) {
                                                            if (353 != param1) {
                                                              if (param1 != 8250) {
                                                                if (param1 != 339) {
                                                                  if (382 == param1) {
                                                                    var2 = -98;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L1;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var2 = -100;
                                                                  return (byte) var2;
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L1;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var2 = -103;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          return (byte) var2;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L1;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              return (byte) var2;
                                            }
                                          } else {
                                            var2 = -111;
                                            break L1;
                                          }
                                        } else {
                                          var2 = -114;
                                          return (byte) var2;
                                        }
                                      } else {
                                        var2 = -116;
                                        break L1;
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  } else {
                                    var2 = -118;
                                    break L1;
                                  }
                                } else {
                                  var2 = -119;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -120;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -122;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        break L1;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  break L1;
                }
              }
              return (byte) var2;
            }
          } else {
            var2 = (byte)param1;
            return (byte) var2;
          }
        } else {
          if (160 <= param1) {
            if (255 < param1) {
              L2: {
                if (param1 != 8364) {
                  if (param1 != 8218) {
                    if (param1 != 402) {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (param1 != 8225) {
                              if (710 == param1) {
                                var2 = -120;
                                return (byte) var2;
                              } else {
                                if (8240 == param1) {
                                  var2 = -119;
                                  break L2;
                                } else {
                                  if (param1 != 352) {
                                    if (param1 != 8249) {
                                      if (param1 != 338) {
                                        if (param1 == 381) {
                                          var2 = -114;
                                          break L2;
                                        } else {
                                          if (param1 != 8216) {
                                            if (8217 == param1) {
                                              var2 = -110;
                                              break L2;
                                            } else {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (param1 != 8226) {
                                                    if (param1 != 8211) {
                                                      if (param1 != 8212) {
                                                        if (param1 == 732) {
                                                          var2 = -104;
                                                          break L2;
                                                        } else {
                                                          if (param1 != 8482) {
                                                            if (353 != param1) {
                                                              if (param1 != 8250) {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  break L2;
                                                                } else {
                                                                  if (382 == param1) {
                                                                    var2 = -98;
                                                                    break L2;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L2;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var2 = -103;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var2 = -111;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        var2 = -116;
                                        break L2;
                                      }
                                    } else {
                                      var2 = -117;
                                      break L2;
                                    }
                                  } else {
                                    var2 = -118;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -122;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        break L2;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  break L2;
                }
              }
              return (byte) var2;
            } else {
              var2 = (byte)param1;
              return (byte) var2;
            }
          } else {
            L3: {
              if (param1 != 8364) {
                if (param1 != 8218) {
                  if (param1 != 402) {
                    if (param1 != 8222) {
                      if (param1 != 8230) {
                        if (param1 != 8224) {
                          if (param1 != 8225) {
                            if (710 == param1) {
                              var2 = -120;
                              return (byte) var2;
                            } else {
                              if (8240 == param1) {
                                var2 = -119;
                                break L3;
                              } else {
                                if (param1 != 352) {
                                  if (param1 != 8249) {
                                    if (param1 != 338) {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        break L3;
                                      } else {
                                        if (param1 != 8216) {
                                          if (8217 == param1) {
                                            var2 = -110;
                                            break L3;
                                          } else {
                                            if (param1 != 8220) {
                                              if (param1 != 8221) {
                                                if (param1 != 8226) {
                                                  if (param1 != 8211) {
                                                    if (param1 != 8212) {
                                                      if (param1 == 732) {
                                                        var2 = -104;
                                                        break L3;
                                                      } else {
                                                        if (param1 != 8482) {
                                                          if (353 != param1) {
                                                            if (param1 != 8250) {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                                break L3;
                                                              } else {
                                                                if (382 == param1) {
                                                                  var2 = -98;
                                                                  break L3;
                                                                } else {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                    break L3;
                                                                  } else {
                                                                    var2 = 63;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                            break L3;
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L3;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                  break L3;
                                                }
                                              } else {
                                                var2 = -108;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -109;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          var2 = -111;
                                          break L3;
                                        }
                                      }
                                    } else {
                                      var2 = -116;
                                      break L3;
                                    }
                                  } else {
                                    var2 = -117;
                                    break L3;
                                  }
                                } else {
                                  var2 = -118;
                                  break L3;
                                }
                              }
                            }
                          } else {
                            var2 = -121;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -122;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -123;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -124;
                      break L3;
                    }
                  } else {
                    var2 = -125;
                    return (byte) var2;
                  }
                } else {
                  var2 = -126;
                  return (byte) var2;
                }
              } else {
                var2 = -128;
                break L3;
              }
            }
            return (byte) var2;
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 102) {
          L0: {
            ((pf) this).a(-122, 90, 40);
            if (97 != ((pf) this).field_g) {
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
            if (97 != ((pf) this).field_g) {
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

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              am.a(-7749, (java.awt.Component) (Object) param0);
              te.a((byte) -47, (java.awt.Component) (Object) param0);
              if (null != gp.field_Lb) {
                gp.field_Lb.a(param1 + 18421, (java.awt.Component) (Object) param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("pf.K(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ((pf) this).field_i = 0;
        if (param2 == 17068) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((pf) this).field_c = stackIn_5_1 != 0;
          if (!((pf) this).field_c) {
            ((pf) this).field_j = param3;
            return;
          } else {
            ((pf) this).field_j = param1;
            return;
          }
        } else {
          return;
        }
    }

    pf(int param0) {
        ((pf) this).field_j = 0;
        ((pf) this).field_c = false;
        ((pf) this).field_h = param0;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -75) {
          L0: {
            ((pf) this).field_k = 25;
            if (102 != ((pf) this).field_g) {
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
            if (102 != ((pf) this).field_g) {
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

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 4) {
          if (((pf) this).field_k == 0) {
            if (((pf) this).field_g != 84) {
              if (((pf) this).field_g == 83) {
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
          int discarded$6 = pf.a(true);
          if (((pf) this).field_k == 0) {
            if (((pf) this).field_g == 84) {
              return true;
            } else {
              L0: {
                if (((pf) this).field_g != 83) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Service unavailable";
        field_f = new wm(10, 2, 2, 0);
        field_b = "Friends can be added in multiplayer<nbsp>games";
        field_m = "Kick";
    }
}
