/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private int field_b;
    private boolean field_g;
    static lj field_c;
    private int field_d;
    static qd field_a;
    int field_i;
    int field_h;
    private int field_k;
    private int field_l;
    static im field_f;
    static uj field_e;
    static int field_j;

    final static void a(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 > 80) {
                var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (var1_ref != null) {
                  try {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                    mg.field_f = (int)(var3.longValue() / 1048576L) + 1;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_c = null;
            if (103 != ((ml) this).field_k) {
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
            if (103 != ((ml) this).field_k) {
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

    public static void a(boolean param0) {
        if (!param0) {
          field_e = null;
          field_e = null;
          field_f = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final void e(byte param0) {
        ((ml) this).field_k = 0;
        ((ml) this).field_d = 0;
        if (-1 != (((ml) this).field_b ^ -1)) {
          L0: {
            if (((ml) this).field_b != -1) {
              break L0;
            } else {
              if (-99 == ob.field_K) {
                L1: {
                  if (-1 <= (((ml) this).field_h ^ -1)) {
                    ((ml) this).field_h = ((ml) this).field_i;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ml) this).field_h = ((ml) this).field_h - 1;
                ((ml) this).field_g = false;
                break L0;
              } else {
                L2: {
                  if (-1 != (((ml) this).field_b ^ -1)) {
                    break L2;
                  } else {
                    if ((ob.field_K ^ -1) != -100) {
                      break L2;
                    } else {
                      L3: {
                        ((ml) this).field_h = ((ml) this).field_h + 1;
                        if (((ml) this).field_h >= ((ml) this).field_i) {
                          ((ml) this).field_h = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((ml) this).field_g = false;
                      break L2;
                    }
                  }
                }
                if (param0 == -74) {
                  return;
                } else {
                  boolean discarded$7 = ((ml) this).a((byte) 14);
                  return;
                }
              }
            }
          }
          L4: {
            if (-1 != (((ml) this).field_b ^ -1)) {
              break L4;
            } else {
              if ((ob.field_K ^ -1) != -100) {
                break L4;
              } else {
                L5: {
                  ((ml) this).field_h = ((ml) this).field_h + 1;
                  if (((ml) this).field_h >= ((ml) this).field_i) {
                    ((ml) this).field_h = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((ml) this).field_g = false;
                break L4;
              }
            }
          }
          if (param0 == -74) {
            return;
          } else {
            boolean discarded$8 = ((ml) this).a((byte) 14);
            return;
          }
        } else {
          ((ml) this).field_k = ob.field_K;
          if (((ml) this).field_b == -1) {
            L6: {
              if (-99 == ob.field_K) {
                L7: {
                  if (-1 >= ((ml) this).field_h) {
                    ((ml) this).field_h = ((ml) this).field_i;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((ml) this).field_h = ((ml) this).field_h - 1;
                ((ml) this).field_g = false;
                break L6;
              } else {
                break L6;
              }
            }
            if (-1 == (((ml) this).field_b ^ -1)) {
              L8: {
                if ((ob.field_K ^ -1) != -100) {
                  break L8;
                } else {
                  L9: {
                    ((ml) this).field_h = ((ml) this).field_h + 1;
                    if (((ml) this).field_h >= ((ml) this).field_i) {
                      ((ml) this).field_h = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((ml) this).field_g = false;
                  break L8;
                }
              }
              if (param0 == -74) {
                return;
              } else {
                boolean discarded$9 = ((ml) this).a((byte) 14);
                return;
              }
            } else {
              if (param0 == -74) {
                return;
              } else {
                boolean discarded$10 = ((ml) this).a((byte) 14);
                return;
              }
            }
          } else {
            if (-1 == ((ml) this).field_b) {
              if ((ob.field_K ^ -1) == -100) {
                L10: {
                  ((ml) this).field_h = ((ml) this).field_h + 1;
                  if (((ml) this).field_h >= ((ml) this).field_i) {
                    ((ml) this).field_h = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((ml) this).field_g = false;
                if (param0 == -74) {
                  return;
                } else {
                  boolean discarded$11 = ((ml) this).a((byte) 14);
                  return;
                }
              } else {
                if (param0 == -74) {
                  return;
                } else {
                  boolean discarded$12 = ((ml) this).a((byte) 14);
                  return;
                }
              }
            } else {
              if (param0 != -74) {
                boolean discarded$13 = ((ml) this).a((byte) 14);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = -37 / ((75 - param0) / 42);
        return ((ml) this).field_k == 97 ? true : false;
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (0 == ((ml) this).field_d) {
            if (((ml) this).field_k != 84) {
              if ((((ml) this).field_k ^ -1) == -84) {
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
          ((ml) this).field_h = -91;
          if (0 == ((ml) this).field_d) {
            if (((ml) this).field_k == 84) {
              return true;
            } else {
              L0: {
                if ((((ml) this).field_k ^ -1) != -84) {
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

    final static boolean b(int param0) {
        int var1 = 0;
        var1 = 64 % ((-35 - param0) / 46);
        if (null != b.field_n) {
          if (b.field_n.k(3469) == null) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1) {
        if (-1 != (((ml) this).field_b ^ -1)) {
          if (param0 != 0) {
            field_f = null;
            return;
          } else {
            return;
          }
        } else {
          ((ml) this).field_h = param1;
          ((ml) this).field_g = false;
          if (param0 == 0) {
            return;
          } else {
            field_f = null;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (((ml) this).field_i <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (param0 < ((ml) this).field_i) {
            L0: {
              ((ml) this).field_k = 0;
              ((ml) this).field_d = 0;
              if (gi.field_e != 0) {
                ((ml) this).field_d = gi.field_e;
                ((ml) this).field_b = gi.field_e;
                ((ml) this).field_h = param0;
                ((ml) this).field_l = aj.field_c;
                ((ml) this).field_g = true;
                break L0;
              } else {
                break L0;
              }
            }
            if (((ml) this).field_b != 0) {
              if (0 != of.field_G) {
                if ((((ml) this).field_l ^ -1) < -1) {
                  L1: {
                    ((ml) this).field_l = ((ml) this).field_l - 1;
                    if ((gi.field_e ^ -1) != param1) {
                      break L1;
                    } else {
                      if (of.field_G == 0) {
                        ((ml) this).field_b = 0;
                        break L1;
                      } else {
                        if (((ml) this).field_b == 0) {
                          L2: {
                            if (((ml) this).field_g) {
                              break L2;
                            } else {
                              if (kd.field_d) {
                                break L2;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param2 < 0) {
                            if (((ml) this).field_g) {
                              ((ml) this).field_h = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != ((ml) this).field_h) {
                              ((ml) this).field_h = param2;
                              ((ml) this).field_g = true;
                              return;
                            } else {
                              ((ml) this).field_h = param2;
                              ((ml) this).field_g = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (((ml) this).field_b == 0) {
                    L3: {
                      if (((ml) this).field_g) {
                        break L3;
                      } else {
                        if (kd.field_d) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param2 < 0) {
                      if (!((ml) this).field_g) {
                        return;
                      } else {
                        ((ml) this).field_h = -1;
                        return;
                      }
                    } else {
                      if (param2 != ((ml) this).field_h) {
                        ((ml) this).field_h = param2;
                        ((ml) this).field_g = true;
                        return;
                      } else {
                        ((ml) this).field_h = param2;
                        ((ml) this).field_g = true;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((ml) this).field_l = va.field_c;
                  ((ml) this).field_l = ((ml) this).field_l - 1;
                  if ((gi.field_e ^ -1) == param1) {
                    L4: {
                      if (of.field_G == 0) {
                        ((ml) this).field_b = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (((ml) this).field_b == 0) {
                      L5: {
                        if (((ml) this).field_g) {
                          break L5;
                        } else {
                          if (kd.field_d) {
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param2 < 0) {
                        if (!((ml) this).field_g) {
                          return;
                        } else {
                          ((ml) this).field_h = -1;
                          return;
                        }
                      } else {
                        if (param2 != ((ml) this).field_h) {
                          ((ml) this).field_h = param2;
                          ((ml) this).field_g = true;
                          return;
                        } else {
                          ((ml) this).field_h = param2;
                          ((ml) this).field_g = true;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((ml) this).field_b == 0) {
                      L6: {
                        if (((ml) this).field_g) {
                          break L6;
                        } else {
                          if (kd.field_d) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param2 < 0) {
                        if (((ml) this).field_g) {
                          ((ml) this).field_h = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param2 != ((ml) this).field_h) {
                          ((ml) this).field_h = param2;
                          ((ml) this).field_g = true;
                          return;
                        } else {
                          ((ml) this).field_h = param2;
                          ((ml) this).field_g = true;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if ((gi.field_e ^ -1) != param1) {
                    break L7;
                  } else {
                    if (of.field_G == 0) {
                      ((ml) this).field_b = 0;
                      break L7;
                    } else {
                      if (((ml) this).field_b == 0) {
                        L8: {
                          if (((ml) this).field_g) {
                            break L8;
                          } else {
                            if (kd.field_d) {
                              break L8;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param2 < 0) {
                          if (((ml) this).field_g) {
                            ((ml) this).field_h = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param2 != ((ml) this).field_h) {
                            ((ml) this).field_h = param2;
                            ((ml) this).field_g = true;
                            return;
                          } else {
                            ((ml) this).field_h = param2;
                            ((ml) this).field_g = true;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (((ml) this).field_b == 0) {
                  L9: {
                    if (((ml) this).field_g) {
                      break L9;
                    } else {
                      if (kd.field_d) {
                        break L9;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param2 < 0) {
                    if (((ml) this).field_g) {
                      ((ml) this).field_h = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param2 != ((ml) this).field_h) {
                      ((ml) this).field_h = param2;
                      ((ml) this).field_g = true;
                      return;
                    } else {
                      ((ml) this).field_h = param2;
                      ((ml) this).field_g = true;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L10: {
                if ((gi.field_e ^ -1) != param1) {
                  break L10;
                } else {
                  if (of.field_G == 0) {
                    ((ml) this).field_b = 0;
                    break L10;
                  } else {
                    L11: {
                      if (((ml) this).field_b != 0) {
                        break L11;
                      } else {
                        L12: {
                          if (((ml) this).field_g) {
                            break L12;
                          } else {
                            if (kd.field_d) {
                              break L12;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (param2 < 0) {
                          if (!((ml) this).field_g) {
                            break L11;
                          } else {
                            ((ml) this).field_h = -1;
                            break L11;
                          }
                        } else {
                          if (param2 != ((ml) this).field_h) {
                            ((ml) this).field_h = param2;
                            ((ml) this).field_g = true;
                            break L11;
                          } else {
                            ((ml) this).field_h = param2;
                            ((ml) this).field_g = true;
                            break L11;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (((ml) this).field_b == 0) {
                L13: {
                  if (((ml) this).field_g) {
                    break L13;
                  } else {
                    if (kd.field_d) {
                      break L13;
                    } else {
                      return;
                    }
                  }
                }
                if (param2 < 0) {
                  if (((ml) this).field_g) {
                    ((ml) this).field_h = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param2 != ((ml) this).field_h) {
                    ((ml) this).field_h = param2;
                    ((ml) this).field_g = true;
                    return;
                  } else {
                    ((ml) this).field_h = param2;
                    ((ml) this).field_g = true;
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
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
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
          if (!param3) {
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
        ((ml) this).field_g = stackIn_3_1 != 0;
        ((ml) this).field_b = param2;
        if (!((ml) this).field_g) {
          ((ml) this).field_h = param0;
          return;
        } else {
          ((ml) this).field_h = param1;
          return;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 99) {
          L0: {
            ((ml) this).d(58);
            if (96 != ((ml) this).field_k) {
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
            if (96 != ((ml) this).field_k) {
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

    final void d(byte param0) {
        int var2 = 0;
        L0: {
          ((ml) this).field_d = 0;
          ((ml) this).field_k = 0;
          var2 = 82 / ((-64 - param0) / 49);
          if (((ml) this).field_b == 0) {
            ((ml) this).field_k = ob.field_K;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((ml) this).field_b != 0) {
            break L1;
          } else {
            if (ob.field_K == 96) {
              L2: {
                if ((((ml) this).field_h ^ -1) >= -1) {
                  ((ml) this).field_h = ((ml) this).field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((ml) this).field_g = false;
              ((ml) this).field_h = ((ml) this).field_h - 1;
              break L1;
            } else {
              if (-1 == ((ml) this).field_b) {
                if (-98 == ob.field_K) {
                  ((ml) this).field_h = ((ml) this).field_h + 1;
                  ((ml) this).field_g = false;
                  if (((ml) this).field_h < ((ml) this).field_i) {
                    return;
                  } else {
                    ((ml) this).field_h = 0;
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
        if (-1 == ((ml) this).field_b) {
          if (-98 == ob.field_K) {
            ((ml) this).field_h = ((ml) this).field_h + 1;
            ((ml) this).field_g = false;
            if (((ml) this).field_h < ((ml) this).field_i) {
              return;
            } else {
              ((ml) this).field_h = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        int var2 = 26 / ((81 - param0) / 35);
        return -1 != (((ml) this).field_b ^ -1) ? true : false;
    }

    final void b(int param0, int param1) {
        ((ml) this).field_k = 0;
        ((ml) this).field_d = 0;
        if (param0 == 27163) {
          if (0 == ((ml) this).field_b) {
            if (-97 == ob.field_K) {
              if (0 < ((ml) this).field_h) {
                L0: {
                  ((ml) this).field_h = ((ml) this).field_h - 1;
                  ((ml) this).field_g = false;
                  if (0 == ((ml) this).field_b) {
                    ((ml) this).field_k = ob.field_K;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (((ml) this).field_b != -1) {
                    break L1;
                  } else {
                    if (-98 != ob.field_K) {
                      break L1;
                    } else {
                      L2: {
                        ((ml) this).field_h = ((ml) this).field_h + 1;
                        if (((ml) this).field_h >= ((ml) this).field_i) {
                          ((ml) this).field_h = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ((ml) this).field_g = false;
                      break L1;
                    }
                  }
                }
                if (-1 != ((ml) this).field_b) {
                  return;
                } else {
                  if (-99 != ob.field_K) {
                    if ((ob.field_K ^ -1) != -100) {
                      return;
                    } else {
                      ((ml) this).field_g = false;
                      if (((ml) this).field_h < 0) {
                        ((ml) this).field_h = param1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((ml) this).field_g = false;
                    if (((ml) this).field_h < 0) {
                      ((ml) this).field_h = param1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((ml) this).field_h = ((ml) this).field_i;
                L3: {
                  ((ml) this).field_h = ((ml) this).field_h - 1;
                  ((ml) this).field_g = false;
                  if (0 == ((ml) this).field_b) {
                    ((ml) this).field_k = ob.field_K;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (((ml) this).field_b != -1) {
                    break L4;
                  } else {
                    if (-98 != ob.field_K) {
                      break L4;
                    } else {
                      L5: {
                        ((ml) this).field_h = ((ml) this).field_h + 1;
                        if (((ml) this).field_h >= ((ml) this).field_i) {
                          ((ml) this).field_h = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ((ml) this).field_g = false;
                      break L4;
                    }
                  }
                }
                L6: {
                  if (-1 != ((ml) this).field_b) {
                    break L6;
                  } else {
                    L7: {
                      if (-99 == ob.field_K) {
                        break L7;
                      } else {
                        if ((ob.field_K ^ -1) == -100) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    ((ml) this).field_g = false;
                    if (((ml) this).field_h < 0) {
                      ((ml) this).field_h = param1;
                      break L6;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              L8: {
                if (0 == ((ml) this).field_b) {
                  ((ml) this).field_k = ob.field_K;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (((ml) this).field_b != -1) {
                  break L9;
                } else {
                  if (-98 != ob.field_K) {
                    break L9;
                  } else {
                    L10: {
                      ((ml) this).field_h = ((ml) this).field_h + 1;
                      if (((ml) this).field_h >= ((ml) this).field_i) {
                        ((ml) this).field_h = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((ml) this).field_g = false;
                    break L9;
                  }
                }
              }
              L11: {
                if (-1 != ((ml) this).field_b) {
                  break L11;
                } else {
                  L12: {
                    if (-99 == ob.field_K) {
                      break L12;
                    } else {
                      if ((ob.field_K ^ -1) == -100) {
                        break L12;
                      } else {
                        return;
                      }
                    }
                  }
                  ((ml) this).field_g = false;
                  if (((ml) this).field_h < 0) {
                    ((ml) this).field_h = param1;
                    break L11;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            L13: {
              if (0 == ((ml) this).field_b) {
                ((ml) this).field_k = ob.field_K;
                break L13;
              } else {
                break L13;
              }
            }
            if (((ml) this).field_b == -1) {
              if (-98 == ob.field_K) {
                L14: {
                  ((ml) this).field_h = ((ml) this).field_h + 1;
                  if (((ml) this).field_h >= ((ml) this).field_i) {
                    ((ml) this).field_h = 0;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  ((ml) this).field_g = false;
                  if (-1 != ((ml) this).field_b) {
                    break L15;
                  } else {
                    L16: {
                      if (-99 == ob.field_K) {
                        break L16;
                      } else {
                        if (ob.field_K == -100) {
                          break L16;
                        } else {
                          return;
                        }
                      }
                    }
                    ((ml) this).field_g = false;
                    if (((ml) this).field_h < 0) {
                      ((ml) this).field_h = param1;
                      break L15;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                if (-1 == ((ml) this).field_b) {
                  L17: {
                    if (-99 == ob.field_K) {
                      break L17;
                    } else {
                      if ((ob.field_K ^ -1) == -100) {
                        break L17;
                      } else {
                        return;
                      }
                    }
                  }
                  ((ml) this).field_g = false;
                  if (((ml) this).field_h < 0) {
                    ((ml) this).field_h = param1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (-1 == ((ml) this).field_b) {
                L18: {
                  if (-99 == (ob.field_K ^ -1)) {
                    break L18;
                  } else {
                    if ((ob.field_K ^ -1) == -100) {
                      break L18;
                    } else {
                      return;
                    }
                  }
                }
                ((ml) this).field_g = false;
                if (((ml) this).field_h >= 0) {
                  return;
                } else {
                  ((ml) this).field_h = param1;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void d(int param0) {
        ((ml) this).field_d = param0;
        ((ml) this).field_k = 0;
        if (((ml) this).field_b == 0) {
            ((ml) this).field_k = ob.field_K;
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -89) {
          L0: {
            ((ml) this).field_i = -67;
            if (-103 != ((ml) this).field_k) {
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
            if (-103 != ((ml) this).field_k) {
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

    ml(int param0) {
        ((ml) this).field_g = false;
        ((ml) this).field_h = 0;
        ((ml) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new qd();
        field_f = new im();
    }
}
