/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends hp {
    dn field_F;
    private int field_I;
    static int field_K;
    boolean field_H;
    static int field_J;
    static int[] field_G;

    boolean e(byte param0) {
        this.field_I = this.i(35);
        if (param0 == 28) {
          if (-1 == (this.field_I ^ -1)) {
            if (this.field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_F = (dn) null;
          if (-1 == (this.field_I ^ -1)) {
            if (this.field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final int i(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 35) {
          return -13;
        } else {
          L0: {
            if (this.field_H) {
              if (this.field_F.c(true) != this) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        int[] var9 = null;
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
              var9 = (int[]) null;
              rl.a(param0, param7, param1, param6, (int[]) null, param3, param4, (byte) 120, param2);
              if (param5 == -14237) {
                break L1;
              } else {
                field_G = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ei.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final ga d(byte param0) {
        ga var2 = super.d(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (ga) (this);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_I != 0) {
          if (this.field_I >= 256) {
            if (-1 != (param1 ^ -1)) {
              return;
            } else {
              this.a(param2 + this.field_k, this.field_j + param0, (byte) -123);
              super.a(param0, param1, param2, param3 + 0);
              return;
            }
          } else {
            if (null != f.field_e) {
              if (f.field_e.field_w >= this.field_i) {
                if (f.field_e.field_t < this.field_n) {
                  f.field_e = new vn(this.field_i, this.field_n);
                  ki.a((byte) -86, f.field_e);
                  bi.d();
                  this.a(param3, 0, (byte) -121);
                  super.a(-param0 - this.field_j, param1, -this.field_k + -param2, 0);
                  pa.a(param3 ^ -21189);
                  f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
                  return;
                } else {
                  ki.a((byte) -86, f.field_e);
                  bi.d();
                  this.a(param3, 0, (byte) -121);
                  super.a(-param0 - this.field_j, param1, -this.field_k + -param2, 0);
                  pa.a(param3 ^ -21189);
                  f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
                  return;
                }
              } else {
                f.field_e = new vn(this.field_i, this.field_n);
                ki.a((byte) -86, f.field_e);
                bi.d();
                this.a(param3, 0, (byte) -121);
                super.a(-param0 - this.field_j, param1, -this.field_k + -param2, 0);
                pa.a(param3 ^ -21189);
                f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
                return;
              }
            } else {
              f.field_e = new vn(this.field_i, this.field_n);
              ki.a((byte) -86, f.field_e);
              bi.d();
              this.a(param3, 0, (byte) -121);
              super.a(-param0 - this.field_j, param1, -this.field_k + -param2, 0);
              pa.a(param3 ^ -21189);
              f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
              return;
            }
          }
        } else {
          return;
        }
    }

    ei(dn param0, int param1, int param2) {
        super(pk.field_N + -param1 >> -1350254175, -param2 + b.field_l >> 591247969, param1, param2, (io) null);
        try {
            this.field_H = false;
            this.field_I = 0;
            this.field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(int param0, int param1, byte param2);

    final void a(byte param0, int param1, int param2) {
        if (param0 < 79) {
          return;
        } else {
          this.a(-99, -param1 + b.field_l >> -595692095, pk.field_N - param2 >> 2112696897, param2, param1);
          return;
        }
    }

    final static boolean h(int param0) {
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        if (param0 >= -110) {
          L0: {
            field_K = 91;
            if (ul.field_f) {
              vj.field_q = vj.field_q + 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (ma.field_r != sm.field_a) {
              vj.field_o = vj.field_o - 40;
              if (0 >= vj.field_o) {
                vj.field_o = 0;
                ma.field_r = sm.field_a;
                jd.field_c = rc.field_w;
                break L1;
              } else {
                L2: {
                  if (!nm.field_b) {
                    break L2;
                  } else {
                    if (-1 != (sm.field_a ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (-2 != (vk.field_c ^ -1)) {
                            break L4;
                          } else {
                            if (vf.field_f == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (vk.field_c != 5) {
                            break L5;
                          } else {
                            if (vf.field_f == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (-6 != (vk.field_c ^ -1)) {
                            break L6;
                          } else {
                            if (-2 == (vf.field_f ^ -1)) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (5 != vk.field_c) {
                            break L7;
                          } else {
                            if ((vf.field_f ^ -1) == -3) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (vk.field_c != 5) {
                          break L2;
                        } else {
                          if (-5 != (vf.field_f ^ -1)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              if (nm.field_b) {
                if (-401 < (vj.field_o ^ -1)) {
                  vj.field_o = vj.field_o + 40;
                  if (400 >= vj.field_o) {
                    break L1;
                  } else {
                    vj.field_o = 400;
                    break L1;
                  }
                } else {
                  if (nm.field_b) {
                    break L1;
                  } else {
                    if (vj.field_o > 0) {
                      vj.field_o = vj.field_o - 40;
                      if (0 < vj.field_o) {
                        break L1;
                      } else {
                        vj.field_o = 0;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L8: {
                  if (nm.field_b) {
                    break L8;
                  } else {
                    if (vj.field_o > 0) {
                      vj.field_o = vj.field_o - 40;
                      if (0 < vj.field_o) {
                        break L8;
                      } else {
                        vj.field_o = 0;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (!nm.field_b) {
                    break L9;
                  } else {
                    if (-1 != (sm.field_a ^ -1)) {
                      break L9;
                    } else {
                      L10: {
                        if (-2 != (vk.field_c ^ -1)) {
                          if (vk.field_c != 5) {
                            if (-6 != (vk.field_c ^ -1)) {
                              if (5 != vk.field_c) {
                                if (vk.field_c != 5) {
                                  break L9;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L9;
                                  } else {
                                    return true;
                                  }
                                }
                              } else {
                                if ((vf.field_f ^ -1) == -3) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (vk.field_c != 5) {
                                      break L11;
                                    } else {
                                      if (-5 != (vf.field_f ^ -1)) {
                                        break L11;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                  return false;
                                }
                              }
                            } else {
                              if (-2 == (vf.field_f ^ -1)) {
                                break L10;
                              } else {
                                L12: {
                                  L13: {
                                    if (5 != vk.field_c) {
                                      break L13;
                                    } else {
                                      if ((vf.field_f ^ -1) == -3) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (vk.field_c != 5) {
                                      break L14;
                                    } else {
                                      if (-5 != (vf.field_f ^ -1)) {
                                        break L14;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  return false;
                                }
                                return true;
                              }
                            }
                          } else {
                            if (vf.field_f == 0) {
                              break L10;
                            } else {
                              L15: {
                                L16: {
                                  if (-6 != (vk.field_c ^ -1)) {
                                    break L16;
                                  } else {
                                    if (-2 == (vf.field_f ^ -1)) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (5 != vk.field_c) {
                                    break L17;
                                  } else {
                                    if ((vf.field_f ^ -1) == -3) {
                                      break L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (vk.field_c != 5) {
                                    break L18;
                                  } else {
                                    if (-5 != (vf.field_f ^ -1)) {
                                      break L18;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                return false;
                              }
                              return true;
                            }
                          }
                        } else {
                          if (vf.field_f == 0) {
                            break L10;
                          } else {
                            L19: {
                              L20: {
                                if (vk.field_c != 5) {
                                  break L20;
                                } else {
                                  if (vf.field_f == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (-6 != (vk.field_c ^ -1)) {
                                  break L21;
                                } else {
                                  if (-2 == (vf.field_f ^ -1)) {
                                    break L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                if (5 != vk.field_c) {
                                  break L22;
                                } else {
                                  if ((vf.field_f ^ -1) == -3) {
                                    break L19;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              L23: {
                                if (vk.field_c != 5) {
                                  break L23;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L23;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              return false;
                            }
                            return true;
                          }
                        }
                      }
                      return true;
                    }
                  }
                }
                return false;
              }
            }
          }
          if (nm.field_b) {
            if (-1 == (sm.field_a ^ -1)) {
              L24: {
                if (-2 != (vk.field_c ^ -1)) {
                  if (vk.field_c != 5) {
                    if (-6 != (vk.field_c ^ -1)) {
                      if (5 != vk.field_c) {
                        L25: {
                          if (vk.field_c != 5) {
                            break L25;
                          } else {
                            if (-5 != (vf.field_f ^ -1)) {
                              break L25;
                            } else {
                              return true;
                            }
                          }
                        }
                        return false;
                      } else {
                        if ((vf.field_f ^ -1) == -3) {
                          break L24;
                        } else {
                          L26: {
                            if (vk.field_c != 5) {
                              break L26;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L26;
                              } else {
                                return true;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      if (-2 == (vf.field_f ^ -1)) {
                        break L24;
                      } else {
                        if (5 != vk.field_c) {
                          L27: {
                            if (vk.field_c != 5) {
                              break L27;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L27;
                              } else {
                                return true;
                              }
                            }
                          }
                          return false;
                        } else {
                          if ((vf.field_f ^ -1) == -3) {
                            return true;
                          } else {
                            L28: {
                              if (vk.field_c != 5) {
                                break L28;
                              } else {
                                if (-5 != (vf.field_f ^ -1)) {
                                  break L28;
                                } else {
                                  return true;
                                }
                              }
                            }
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    if (vf.field_f == 0) {
                      break L24;
                    } else {
                      L29: {
                        if (-6 != (vk.field_c ^ -1)) {
                          if (5 != vk.field_c) {
                            L30: {
                              if (vk.field_c != 5) {
                                break L30;
                              } else {
                                if (-5 != (vf.field_f ^ -1)) {
                                  break L30;
                                } else {
                                  return true;
                                }
                              }
                            }
                            return false;
                          } else {
                            if ((vf.field_f ^ -1) == -3) {
                              break L29;
                            } else {
                              L31: {
                                if (vk.field_c != 5) {
                                  break L31;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L31;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          if (-2 == (vf.field_f ^ -1)) {
                            break L29;
                          } else {
                            if (5 != vk.field_c) {
                              L32: {
                                if (vk.field_c != 5) {
                                  break L32;
                                } else {
                                  if (-5 != (vf.field_f ^ -1)) {
                                    break L32;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                              return false;
                            } else {
                              if ((vf.field_f ^ -1) == -3) {
                                return true;
                              } else {
                                L33: {
                                  if (vk.field_c != 5) {
                                    break L33;
                                  } else {
                                    if (-5 != (vf.field_f ^ -1)) {
                                      break L33;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  if (vf.field_f == 0) {
                    break L24;
                  } else {
                    L34: {
                      L35: {
                        if (vk.field_c != 5) {
                          break L35;
                        } else {
                          if (vf.field_f == 0) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L36: {
                        if (-6 != (vk.field_c ^ -1)) {
                          break L36;
                        } else {
                          if (-2 == (vf.field_f ^ -1)) {
                            break L34;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (5 != vk.field_c) {
                          break L37;
                        } else {
                          if ((vf.field_f ^ -1) == -3) {
                            break L34;
                          } else {
                            break L37;
                          }
                        }
                      }
                      L38: {
                        if (vk.field_c != 5) {
                          break L38;
                        } else {
                          if (-5 != (vf.field_f ^ -1)) {
                            break L38;
                          } else {
                            return true;
                          }
                        }
                      }
                      return false;
                    }
                    return true;
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          L39: {
            if (ul.field_f) {
              vj.field_q = vj.field_q + 1;
              break L39;
            } else {
              break L39;
            }
          }
          L40: {
            if (ma.field_r != sm.field_a) {
              vj.field_o = vj.field_o - 40;
              if (0 >= vj.field_o) {
                vj.field_o = 0;
                ma.field_r = sm.field_a;
                jd.field_c = rc.field_w;
                break L40;
              } else {
                if (nm.field_b) {
                  if (-1 == (sm.field_a ^ -1)) {
                    L41: {
                      if (-2 != (vk.field_c ^ -1)) {
                        break L41;
                      } else {
                        if (vf.field_f != 0) {
                          break L41;
                        } else {
                          return true;
                        }
                      }
                    }
                    L42: {
                      if (vk.field_c != 5) {
                        break L42;
                      } else {
                        if (vf.field_f != 0) {
                          break L42;
                        } else {
                          return true;
                        }
                      }
                    }
                    L43: {
                      if (-6 != (vk.field_c ^ -1)) {
                        break L43;
                      } else {
                        if (-2 != (vf.field_f ^ -1)) {
                          break L43;
                        } else {
                          return true;
                        }
                      }
                    }
                    L44: {
                      if (5 != vk.field_c) {
                        break L44;
                      } else {
                        if ((vf.field_f ^ -1) != -3) {
                          break L44;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (vk.field_c == 5) {
                      if (-5 == (vf.field_f ^ -1)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              L45: {
                if (!nm.field_b) {
                  break L45;
                } else {
                  if (-401 < (vj.field_o ^ -1)) {
                    vj.field_o = vj.field_o + 40;
                    if (400 >= vj.field_o) {
                      break L40;
                    } else {
                      vj.field_o = 400;
                      break L40;
                    }
                  } else {
                    break L45;
                  }
                }
              }
              if (nm.field_b) {
                break L40;
              } else {
                if (vj.field_o > 0) {
                  vj.field_o = vj.field_o - 40;
                  if (0 < vj.field_o) {
                    break L40;
                  } else {
                    vj.field_o = 0;
                    break L40;
                  }
                } else {
                  break L40;
                }
              }
            }
          }
          if (nm.field_b) {
            if (-1 == (sm.field_a ^ -1)) {
              if (-2 != (vk.field_c ^ -1)) {
                if (vk.field_c != 5) {
                  L46: {
                    if (-6 != (vk.field_c ^ -1)) {
                      if (5 != vk.field_c) {
                        L47: {
                          if (vk.field_c != 5) {
                            break L47;
                          } else {
                            if (-5 != (vf.field_f ^ -1)) {
                              break L47;
                            } else {
                              return true;
                            }
                          }
                        }
                        return false;
                      } else {
                        if ((vf.field_f ^ -1) == -3) {
                          break L46;
                        } else {
                          L48: {
                            if (vk.field_c != 5) {
                              break L48;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L48;
                              } else {
                                return true;
                              }
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      if (-2 == (vf.field_f ^ -1)) {
                        break L46;
                      } else {
                        L49: {
                          L50: {
                            if (5 != vk.field_c) {
                              break L50;
                            } else {
                              if ((vf.field_f ^ -1) == -3) {
                                break L49;
                              } else {
                                break L50;
                              }
                            }
                          }
                          L51: {
                            if (vk.field_c != 5) {
                              break L51;
                            } else {
                              if (-5 != (vf.field_f ^ -1)) {
                                break L51;
                              } else {
                                break L49;
                              }
                            }
                          }
                          return false;
                        }
                        return true;
                      }
                    }
                  }
                  return true;
                } else {
                  if (vf.field_f != 0) {
                    L52: {
                      if (-6 != (vk.field_c ^ -1)) {
                        break L52;
                      } else {
                        if (-2 != (vf.field_f ^ -1)) {
                          break L52;
                        } else {
                          return true;
                        }
                      }
                    }
                    L53: {
                      if (5 != vk.field_c) {
                        break L53;
                      } else {
                        if ((vf.field_f ^ -1) != -3) {
                          break L53;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (vk.field_c == 5) {
                      if (-5 == (vf.field_f ^ -1)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                if (vf.field_f != 0) {
                  L54: {
                    if (vk.field_c != 5) {
                      break L54;
                    } else {
                      if (vf.field_f != 0) {
                        break L54;
                      } else {
                        return true;
                      }
                    }
                  }
                  L55: {
                    if (-6 != (vk.field_c ^ -1)) {
                      break L55;
                    } else {
                      if (-2 != (vf.field_f ^ -1)) {
                        break L55;
                      } else {
                        return true;
                      }
                    }
                  }
                  L56: {
                    if (5 != vk.field_c) {
                      break L56;
                    } else {
                      if ((vf.field_f ^ -1) != -3) {
                        break L56;
                      } else {
                        return true;
                      }
                    }
                  }
                  if (vk.field_c == 5) {
                    if (-5 != (vf.field_f ^ -1)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 != 2634) {
          L0: {
            this.a((byte) -43, -14, -18);
            var2 = this.i(35);
            var3 = -this.field_I + var2;
            if (-1 > (var3 ^ -1)) {
              this.field_I = this.field_I + (-1 + (var3 - -8)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var3) {
              this.field_I = this.field_I + (-16 + var3 + 1) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (0 == this.field_I) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (this.field_H) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              return stackIn_25_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L3: {
            var2 = this.i(35);
            var3 = -this.field_I + var2;
            if (-1 > (var3 ^ -1)) {
              this.field_I = this.field_I + (-1 + (var3 - -8)) / 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 > var3) {
              this.field_I = this.field_I + (-16 + var3 + 1) / 16;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (0 != this.field_I) {
                break L6;
              } else {
                if (0 != var2) {
                  break L6;
                } else {
                  if (this.field_H) {
                    break L6;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L5;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L5;
          }
          return stackIn_12_0 != 0;
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 < 99) {
            field_G = (int[]) null;
        }
    }

    static {
        field_K = 0;
        field_G = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
