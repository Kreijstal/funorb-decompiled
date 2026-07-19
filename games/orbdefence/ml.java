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
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 > 80) {
                  L1: {
                    var1_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var1_ref != null) {
                      try {
                        L2: {
                          var2_ref = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1_ref.invoke((Object) (var2_ref), (Object[]) null));
                          mg.field_f = (int)(var3.longValue() / 1048576L) + 1;
                          break L2;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          var2 = decompiledCaughtException;
                          break L3;
                        }
                      }
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L4;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
            field_c = (lj) null;
            if (103 != this.field_k) {
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
            if (103 != this.field_k) {
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
          field_e = (uj) null;
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
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        this.field_k = 0;
        this.field_d = 0;
        if (-1 != (this.field_b ^ -1)) {
          L0: {
            if (this.field_b != 0) {
              break L0;
            } else {
              if (-99 == (ob.field_K ^ -1)) {
                L1: {
                  if (-1 <= (this.field_h ^ -1)) {
                    this.field_h = this.field_i;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_h = this.field_h - 1;
                this.field_g = false;
                break L0;
              } else {
                L2: {
                  if (-1 != (this.field_b ^ -1)) {
                    break L2;
                  } else {
                    if ((ob.field_K ^ -1) != -100) {
                      break L2;
                    } else {
                      L3: {
                        this.field_h = this.field_h + 1;
                        if (this.field_h >= this.field_i) {
                          this.field_h = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_g = false;
                      break L2;
                    }
                  }
                }
                if (param0 != -74) {
                  discarded$5 = this.a((byte) 14);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          L4: {
            if (-1 != (this.field_b ^ -1)) {
              break L4;
            } else {
              if ((ob.field_K ^ -1) != -100) {
                break L4;
              } else {
                L5: {
                  this.field_h = this.field_h + 1;
                  if (this.field_h >= this.field_i) {
                    this.field_h = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_g = false;
                break L4;
              }
            }
          }
          if (param0 != -74) {
            discarded$6 = this.a((byte) 14);
            return;
          } else {
            return;
          }
        } else {
          this.field_k = ob.field_K;
          if (this.field_b == 0) {
            L6: {
              if (-99 == (ob.field_K ^ -1)) {
                L7: {
                  if (-1 <= (this.field_h ^ -1)) {
                    this.field_h = this.field_i;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_h = this.field_h - 1;
                this.field_g = false;
                break L6;
              } else {
                break L6;
              }
            }
            if (-1 == (this.field_b ^ -1)) {
              L8: {
                if ((ob.field_K ^ -1) != -100) {
                  break L8;
                } else {
                  L9: {
                    this.field_h = this.field_h + 1;
                    if (this.field_h >= this.field_i) {
                      this.field_h = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_g = false;
                  break L8;
                }
              }
              if (param0 != -74) {
                discarded$7 = this.a((byte) 14);
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -74) {
                discarded$8 = this.a((byte) 14);
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (-1 != (this.field_b ^ -1)) {
                break L10;
              } else {
                if ((ob.field_K ^ -1) != -100) {
                  break L10;
                } else {
                  L11: {
                    this.field_h = this.field_h + 1;
                    if (this.field_h >= this.field_i) {
                      this.field_h = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  this.field_g = false;
                  break L10;
                }
              }
            }
            if (param0 != -74) {
              discarded$9 = this.a((byte) 14);
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = -37 / ((75 - param0) / 42);
        return this.field_k == 97 ? true : false;
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (0 == this.field_d) {
            if (this.field_k != 84) {
              if ((this.field_k ^ -1) == -84) {
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
          this.field_h = -91;
          if (0 == this.field_d) {
            if (this.field_k == 84) {
              return true;
            } else {
              L0: {
                if ((this.field_k ^ -1) != -84) {
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
        if (-1 != (this.field_b ^ -1)) {
          if (param0 != 0) {
            field_f = (im) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_h = param1;
          this.field_g = false;
          if (param0 == 0) {
            return;
          } else {
            field_f = (im) null;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_i <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (param0 < this.field_i) {
            L0: {
              this.field_k = 0;
              this.field_d = 0;
              if (gi.field_e != 0) {
                this.field_d = gi.field_e;
                this.field_b = gi.field_e;
                this.field_h = param0;
                this.field_l = aj.field_c;
                this.field_g = true;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_b != 0) {
              if (0 != of.field_G) {
                if ((this.field_l ^ -1) < -1) {
                  this.field_l = this.field_l - 1;
                  if ((gi.field_e ^ -1) != param1) {
                    L1: {
                      if (this.field_b != 0) {
                        break L1;
                      } else {
                        L2: {
                          if (this.field_g) {
                            break L2;
                          } else {
                            if (kd.field_d) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                        L3: {
                          if (param2 < 0) {
                            break L3;
                          } else {
                            L4: {
                              if (param2 != this.field_h) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            this.field_h = param2;
                            this.field_g = true;
                            if (!OrbDefence.field_D) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (!this.field_g) {
                          break L1;
                        } else {
                          this.field_h = -1;
                          break L1;
                        }
                      }
                    }
                    return;
                  } else {
                    L5: {
                      if (of.field_G == 0) {
                        this.field_b = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_b != 0) {
                        break L6;
                      } else {
                        L7: {
                          if (this.field_g) {
                            break L7;
                          } else {
                            if (kd.field_d) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (param2 < 0) {
                            break L8;
                          } else {
                            L9: {
                              if (param2 != this.field_h) {
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            this.field_h = param2;
                            this.field_g = true;
                            if (!OrbDefence.field_D) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (!this.field_g) {
                          break L6;
                        } else {
                          this.field_h = -1;
                          break L6;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  this.field_l = va.field_c;
                  L10: {
                    this.field_l = this.field_l - 1;
                    if ((gi.field_e ^ -1) != param1) {
                      break L10;
                    } else {
                      if (of.field_G == 0) {
                        this.field_b = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (this.field_b == 0) {
                    L11: {
                      if (this.field_g) {
                        break L11;
                      } else {
                        if (kd.field_d) {
                          break L11;
                        } else {
                          return;
                        }
                      }
                    }
                    L12: {
                      if (param2 < 0) {
                        break L12;
                      } else {
                        if (param2 != this.field_h) {
                          this.field_h = param2;
                          this.field_g = true;
                          if (OrbDefence.field_D) {
                            break L12;
                          } else {
                            return;
                          }
                        } else {
                          L13: {
                            this.field_h = param2;
                            this.field_g = true;
                            if (!OrbDefence.field_D) {
                              break L13;
                            } else {
                              if (!this.field_g) {
                                break L13;
                              } else {
                                this.field_h = -1;
                                break L13;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (this.field_g) {
                      this.field_h = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L14: {
                  if ((gi.field_e ^ -1) != param1) {
                    break L14;
                  } else {
                    if (of.field_G == 0) {
                      this.field_b = 0;
                      break L14;
                    } else {
                      if (this.field_b == 0) {
                        L15: {
                          if (this.field_g) {
                            break L15;
                          } else {
                            if (kd.field_d) {
                              break L15;
                            } else {
                              return;
                            }
                          }
                        }
                        L16: {
                          if (param2 < 0) {
                            break L16;
                          } else {
                            if (param2 != this.field_h) {
                              this.field_h = param2;
                              this.field_g = true;
                              if (OrbDefence.field_D) {
                                break L16;
                              } else {
                                return;
                              }
                            } else {
                              this.field_h = param2;
                              this.field_g = true;
                              if (OrbDefence.field_D) {
                                if (!this.field_g) {
                                  return;
                                } else {
                                  this.field_h = -1;
                                  return;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        if (!this.field_g) {
                          return;
                        } else {
                          this.field_h = -1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (this.field_b == 0) {
                  L17: {
                    if (this.field_g) {
                      break L17;
                    } else {
                      if (kd.field_d) {
                        break L17;
                      } else {
                        return;
                      }
                    }
                  }
                  L18: {
                    if (param2 < 0) {
                      break L18;
                    } else {
                      if (param2 != this.field_h) {
                        this.field_h = param2;
                        this.field_g = true;
                        if (OrbDefence.field_D) {
                          break L18;
                        } else {
                          return;
                        }
                      } else {
                        this.field_h = param2;
                        this.field_g = true;
                        if (OrbDefence.field_D) {
                          if (this.field_g) {
                            this.field_h = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_g) {
                    this.field_h = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L19: {
                if ((gi.field_e ^ -1) != param1) {
                  break L19;
                } else {
                  if (of.field_G == 0) {
                    this.field_b = 0;
                    break L19;
                  } else {
                    L20: {
                      if (this.field_b != 0) {
                        break L20;
                      } else {
                        L21: {
                          if (this.field_g) {
                            break L21;
                          } else {
                            if (kd.field_d) {
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                        L22: {
                          if (param2 < 0) {
                            break L22;
                          } else {
                            L23: {
                              if (param2 != this.field_h) {
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            this.field_h = param2;
                            this.field_g = true;
                            if (!OrbDefence.field_D) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (!this.field_g) {
                          break L20;
                        } else {
                          this.field_h = -1;
                          break L20;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_b == 0) {
                L24: {
                  if (this.field_g) {
                    break L24;
                  } else {
                    if (kd.field_d) {
                      break L24;
                    } else {
                      return;
                    }
                  }
                }
                L25: {
                  if (param2 < 0) {
                    break L25;
                  } else {
                    if (param2 != this.field_h) {
                      this.field_h = param2;
                      this.field_g = true;
                      if (OrbDefence.field_D) {
                        break L25;
                      } else {
                        return;
                      }
                    } else {
                      L26: {
                        this.field_h = param2;
                        this.field_g = true;
                        if (!OrbDefence.field_D) {
                          break L26;
                        } else {
                          if (!this.field_g) {
                            break L26;
                          } else {
                            this.field_h = -1;
                            break L26;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_g) {
                  this.field_h = -1;
                  return;
                } else {
                  return;
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
        ((ml) (this)).field_g = stackIn_3_1 != 0;
        this.field_b = param2;
        if (!this.field_g) {
          this.field_h = param0;
          if (OrbDefence.field_D) {
            this.field_h = param1;
            return;
          } else {
            return;
          }
        } else {
          this.field_h = param1;
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
            this.d(58);
            if (96 != this.field_k) {
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
            if (96 != this.field_k) {
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
          this.field_d = 0;
          this.field_k = 0;
          var2 = 82 / ((-64 - param0) / 49);
          if (this.field_b == 0) {
            this.field_k = ob.field_K;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_b != 0) {
            break L1;
          } else {
            if (ob.field_K == 96) {
              L2: {
                if ((this.field_h ^ -1) >= -1) {
                  this.field_h = this.field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_g = false;
              this.field_h = this.field_h - 1;
              break L1;
            } else {
              if (-1 == (this.field_b ^ -1)) {
                if (-98 == (ob.field_K ^ -1)) {
                  this.field_h = this.field_h + 1;
                  this.field_g = false;
                  if (this.field_h < this.field_i) {
                    return;
                  } else {
                    this.field_h = 0;
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
        if (-1 == (this.field_b ^ -1)) {
          if (-98 == (ob.field_K ^ -1)) {
            this.field_h = this.field_h + 1;
            this.field_g = false;
            if (this.field_h >= this.field_i) {
              this.field_h = 0;
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

    final boolean c(byte param0) {
        int var2 = 26 / ((81 - param0) / 35);
        return -1 != (this.field_b ^ -1) ? true : false;
    }

    final void b(int param0, int param1) {
        this.field_k = 0;
        this.field_d = 0;
        if (param0 == 27163) {
          if (0 == this.field_b) {
            if (-97 == (ob.field_K ^ -1)) {
              if (0 < this.field_h) {
                L0: {
                  this.field_h = this.field_h - 1;
                  this.field_g = false;
                  if (0 == this.field_b) {
                    this.field_k = ob.field_K;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (this.field_b != 0) {
                    break L1;
                  } else {
                    if (-98 != (ob.field_K ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        this.field_h = this.field_h + 1;
                        if (this.field_h >= this.field_i) {
                          this.field_h = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      this.field_g = false;
                      break L1;
                    }
                  }
                }
                if (-1 == (this.field_b ^ -1)) {
                  if (-99 != (ob.field_K ^ -1)) {
                    if ((ob.field_K ^ -1) == -100) {
                      this.field_g = false;
                      if (this.field_h >= 0) {
                        return;
                      } else {
                        this.field_h = param1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    this.field_g = false;
                    if (this.field_h >= 0) {
                      return;
                    } else {
                      this.field_h = param1;
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                this.field_h = this.field_i;
                L3: {
                  this.field_h = this.field_h - 1;
                  this.field_g = false;
                  if (0 == this.field_b) {
                    this.field_k = ob.field_K;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (this.field_b != 0) {
                    break L4;
                  } else {
                    if (-98 != (ob.field_K ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        this.field_h = this.field_h + 1;
                        if (this.field_h >= this.field_i) {
                          this.field_h = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_g = false;
                      break L4;
                    }
                  }
                }
                if (-1 == (this.field_b ^ -1)) {
                  L6: {
                    if (-99 == (ob.field_K ^ -1)) {
                      break L6;
                    } else {
                      if ((ob.field_K ^ -1) == -100) {
                        break L6;
                      } else {
                        return;
                      }
                    }
                  }
                  this.field_g = false;
                  if (this.field_h < 0) {
                    this.field_h = param1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L7: {
                if (0 == this.field_b) {
                  this.field_k = ob.field_K;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (this.field_b != 0) {
                  break L8;
                } else {
                  if (-98 != (ob.field_K ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      this.field_h = this.field_h + 1;
                      if (this.field_h >= this.field_i) {
                        this.field_h = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    this.field_g = false;
                    break L8;
                  }
                }
              }
              if (-1 == (this.field_b ^ -1)) {
                L10: {
                  if (-99 == (ob.field_K ^ -1)) {
                    break L10;
                  } else {
                    if ((ob.field_K ^ -1) == -100) {
                      break L10;
                    } else {
                      return;
                    }
                  }
                }
                this.field_g = false;
                if (this.field_h >= 0) {
                  return;
                } else {
                  this.field_h = param1;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L11: {
              if (0 == this.field_b) {
                this.field_k = ob.field_K;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (this.field_b != 0) {
                break L12;
              } else {
                if (-98 != (ob.field_K ^ -1)) {
                  break L12;
                } else {
                  L13: {
                    this.field_h = this.field_h + 1;
                    if (this.field_h >= this.field_i) {
                      this.field_h = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  this.field_g = false;
                  break L12;
                }
              }
            }
            if (-1 == (this.field_b ^ -1)) {
              L14: {
                if (-99 == (ob.field_K ^ -1)) {
                  break L14;
                } else {
                  if ((ob.field_K ^ -1) == -100) {
                    break L14;
                  } else {
                    return;
                  }
                }
              }
              this.field_g = false;
              if (this.field_h >= 0) {
                return;
              } else {
                this.field_h = param1;
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

    final void d(int param0) {
        this.field_d = param0;
        this.field_k = 0;
        if (this.field_b == 0) {
            this.field_k = ob.field_K;
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
            this.field_i = -67;
            if (-103 != (this.field_k ^ -1)) {
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
            if (-103 != (this.field_k ^ -1)) {
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
        this.field_g = false;
        this.field_h = 0;
        this.field_i = param0;
    }

    static {
        field_a = new qd();
        field_f = new im();
    }
}
