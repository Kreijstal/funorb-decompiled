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
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                if (param0 > 80) {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 != null) {
                    try {
                      L1: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        mg.field_f = (int)(var3.longValue() / 1048576L) + 1;
                        break L1;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var2_ref = decompiledCaughtException;
                      return;
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
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
        if (param0) {
          L0: {
            field_c = (lj) null;
            if (103 != this.field_k) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (103 != this.field_k) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        this.field_k = 0;
        this.field_d = 0;
        if (-1 == (this.field_b ^ -1)) {
            this.field_k = ob.field_K;
            if (this.field_b != 0) {
                if (-1 != (this.field_b ^ -1)) {
                    if (param0 == -74) {
                        return;
                    }
                    this.a((byte) 14);
                    return;
                }
                if ((ob.field_K ^ -1) != -100) {
                    if (param0 != -74) {
                        this.a((byte) 14);
                        return;
                    }
                    return;
                }
                this.field_h = this.field_h + 1;
                if (!(this.field_h < this.field_i)) {
                    this.field_h = 0;
                }
                this.field_g = false;
                if (param0 != -74) {
                    this.a((byte) 14);
                    return;
                }
                return;
            }
            if (!(-99 != (ob.field_K ^ -1))) {
                if (!(-1 > (this.field_h ^ -1))) {
                    this.field_h = this.field_i;
                }
                this.field_h = this.field_h - 1;
                this.field_g = false;
            }
            if (-1 != (this.field_b ^ -1)) {
                if (param0 != -74) {
                    this.a((byte) 14);
                    return;
                }
                return;
            }
            if ((ob.field_K ^ -1) == -100) {
                this.field_h = this.field_h + 1;
                if (!(this.field_h < this.field_i)) {
                    this.field_h = 0;
                }
                this.field_g = false;
            }
            if (param0 != -74) {
                this.a((byte) 14);
                return;
            }
            return;
        }
        if (this.field_b == 0) {
            if (-99 != (ob.field_K ^ -1)) {
                if (-1 == (this.field_b ^ -1) && (ob.field_K ^ -1) == -100) {
                    this.field_h = this.field_h + 1;
                    if (!(this.field_h < this.field_i)) {
                        this.field_h = 0;
                    }
                    this.field_g = false;
                }
                if (param0 != -74) {
                    this.a((byte) 14);
                    return;
                }
                return;
            }
            if (!(-1 > (this.field_h ^ -1))) {
                this.field_h = this.field_i;
            }
            this.field_h = this.field_h - 1;
            this.field_g = false;
        }
        if (-1 == (this.field_b ^ -1) && (ob.field_K ^ -1) == -100) {
            this.field_h = this.field_h + 1;
            if (!(this.field_h < this.field_i)) {
                this.field_h = 0;
            }
            this.field_g = false;
        }
        if (param0 != -74) {
            this.a((byte) 14);
            return;
        }
    }

    final boolean b(byte param0) {
        int var2 = -37 / ((75 - param0) / 42);
        return this.field_k == 97 ? true : false;
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
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
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
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
        int var1;
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
                  L1: {
                    this.field_l = this.field_l - 1;
                    if ((gi.field_e ^ -1) != param1) {
                      break L1;
                    } else {
                      if (of.field_G == 0) {
                        this.field_b = 0;
                        break L1;
                      } else {
                        if (this.field_b == 0) {
                          L2: {
                            if (this.field_g) {
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
                            if (this.field_g) {
                              this.field_h = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != this.field_h) {
                              this.field_h = param2;
                              this.field_g = true;
                              return;
                            } else {
                              this.field_h = param2;
                              this.field_g = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_b == 0) {
                    L3: {
                      if (this.field_g) {
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
                      if (!this.field_g) {
                        return;
                      } else {
                        this.field_h = -1;
                        return;
                      }
                    } else {
                      if (param2 != this.field_h) {
                        this.field_h = param2;
                        this.field_g = true;
                        return;
                      } else {
                        this.field_h = param2;
                        this.field_g = true;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_l = va.field_c;
                  this.field_l = this.field_l - 1;
                  if ((gi.field_e ^ -1) == param1) {
                    L4: {
                      if (of.field_G == 0) {
                        this.field_b = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (this.field_b == 0) {
                      L5: {
                        if (this.field_g) {
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
                        if (!this.field_g) {
                          return;
                        } else {
                          this.field_h = -1;
                          return;
                        }
                      } else {
                        if (param2 != this.field_h) {
                          this.field_h = param2;
                          this.field_g = true;
                          return;
                        } else {
                          this.field_h = param2;
                          this.field_g = true;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (this.field_b == 0) {
                      L6: {
                        if (this.field_g) {
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
                        if (this.field_g) {
                          this.field_h = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param2 != this.field_h) {
                          this.field_h = param2;
                          this.field_g = true;
                          return;
                        } else {
                          this.field_h = param2;
                          this.field_g = true;
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
                      this.field_b = 0;
                      break L7;
                    } else {
                      if (this.field_b == 0) {
                        L8: {
                          if (this.field_g) {
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
                          if (this.field_g) {
                            this.field_h = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param2 != this.field_h) {
                            this.field_h = param2;
                            this.field_g = true;
                            return;
                          } else {
                            this.field_h = param2;
                            this.field_g = true;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (this.field_b == 0) {
                  L9: {
                    if (this.field_g) {
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
                    if (this.field_g) {
                      this.field_h = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param2 != this.field_h) {
                      this.field_h = param2;
                      this.field_g = true;
                      return;
                    } else {
                      this.field_h = param2;
                      this.field_g = true;
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
                    this.field_b = 0;
                    break L10;
                  } else {
                    L11: {
                      if (this.field_b != 0) {
                        break L11;
                      } else {
                        L12: {
                          if (this.field_g) {
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
                          if (!this.field_g) {
                            break L11;
                          } else {
                            this.field_h = -1;
                            break L11;
                          }
                        } else {
                          if (param2 != this.field_h) {
                            this.field_h = param2;
                            this.field_g = true;
                            break L11;
                          } else {
                            this.field_h = param2;
                            this.field_g = true;
                            break L11;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_b == 0) {
                L13: {
                  if (this.field_g) {
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
                  if (this.field_g) {
                    this.field_h = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param2 != this.field_h) {
                    this.field_h = param2;
                    this.field_g = true;
                    return;
                  } else {
                    this.field_h = param2;
                    this.field_g = true;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param3) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((ml) (this)).field_g = stackIn_3_1 != 0;
        this.field_b = param2;
        if (!this.field_g) {
          this.field_h = param0;
          return;
        } else {
          this.field_h = param1;
          return;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 99) {
          L0: {
            this.d(58);
            if (96 != this.field_k) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (96 != this.field_k) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void d(byte param0) {
        int var2;
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

    final boolean c(byte param0) {
        int var2 = 26 / ((81 - param0) / 35);
        return -1 != (this.field_b ^ -1) ? true : false;
    }

    final void b(int param0, int param1) {
        this.field_k = 0;
        this.field_d = 0;
        if (param0 != 27163) {
            return;
        }
        if (0 != this.field_b) {
            if (!(0 != this.field_b)) {
                this.field_k = ob.field_K;
            }
            if (this.field_b != 0) {
                if (-1 != (this.field_b ^ -1)) {
                    return;
                }
                if (-99 != (ob.field_K ^ -1) && (ob.field_K ^ -1) != -100) {
                    return;
                }
                this.field_g = false;
                if (this.field_h < 0) {
                    this.field_h = param1;
                    return;
                }
                return;
            }
            if (-98 != (ob.field_K ^ -1)) {
                if (-1 != (this.field_b ^ -1)) {
                    return;
                }
                if (-99 != (ob.field_K ^ -1) && (ob.field_K ^ -1) != -100) {
                    return;
                }
                this.field_g = false;
                if (this.field_h >= 0) {
                    return;
                }
                this.field_h = param1;
                return;
            }
            this.field_h = this.field_h + 1;
            if (!(this.field_h < this.field_i)) {
                this.field_h = 0;
            }
            this.field_g = false;
            if (-1 == (this.field_b ^ -1)) {
                if (-99 != (ob.field_K ^ -1) && (ob.field_K ^ -1) != -100) {
                    return;
                }
                this.field_g = false;
                if (this.field_h >= 0) {
                    return;
                }
                this.field_h = param1;
            }
            return;
        }
        if (-97 != (ob.field_K ^ -1)) {
            if (!(0 != this.field_b)) {
                this.field_k = ob.field_K;
            }
            if (this.field_b == 0 && -98 == (ob.field_K ^ -1)) {
                this.field_h = this.field_h + 1;
                if (!(this.field_h < this.field_i)) {
                    this.field_h = 0;
                }
                this.field_g = false;
            }
            if (-1 == (this.field_b ^ -1)) {
                if (-99 != (ob.field_K ^ -1) && (ob.field_K ^ -1) != -100) {
                    return;
                }
                this.field_g = false;
                if (this.field_h >= 0) {
                    return;
                }
                this.field_h = param1;
            }
            return;
        }
        if (0 >= this.field_h) {
            this.field_h = this.field_i;
        } else {
            this.field_h = this.field_h - 1;
            this.field_g = false;
            if (!(0 != this.field_b)) {
                this.field_k = ob.field_K;
            }
            if (this.field_b == 0 && -98 == (ob.field_K ^ -1)) {
                this.field_h = this.field_h + 1;
                if (!(this.field_h < this.field_i)) {
                    this.field_h = 0;
                }
                this.field_g = false;
            }
            if (-1 == (this.field_b ^ -1)) {
                if (-99 == (ob.field_K ^ -1)) {
                    this.field_g = false;
                    if (this.field_h >= 0) {
                        return;
                    }
                    this.field_h = param1;
                    return;
                }
                if ((ob.field_K ^ -1) == -100) {
                    this.field_g = false;
                    if (this.field_h >= 0) {
                        return;
                    }
                    this.field_h = param1;
                    return;
                }
                return;
            }
            return;
        }
        this.field_h = this.field_h - 1;
        this.field_g = false;
        if (!(0 != this.field_b)) {
            this.field_k = ob.field_K;
        }
        if (this.field_b == 0 && -98 == (ob.field_K ^ -1)) {
            this.field_h = this.field_h + 1;
            if (!(this.field_h < this.field_i)) {
                this.field_h = 0;
            }
            this.field_g = false;
        }
        if (-1 == (this.field_b ^ -1)) {
            if (-99 != (ob.field_K ^ -1) && (ob.field_K ^ -1) != -100) {
                return;
            }
            this.field_g = false;
            if (this.field_h >= 0) {
                return;
            }
            this.field_h = param1;
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
        if (param0 >= -89) {
          L0: {
            this.field_i = -67;
            if (-103 != (this.field_k ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-103 != (this.field_k ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
