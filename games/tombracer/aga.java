/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aga {
    private int field_g;
    private int field_h;
    private int field_i;
    private short[] field_b;
    static String field_a;
    private int field_e;
    ob field_c;
    private int field_f;
    int field_d;

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_d;
        if (2 == var2) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                if (var3 == 0) {
                                  this.field_i = 2048;
                                  this.field_g = 0;
                                  this.field_h = 2048;
                                  this.field_f = 1;
                                  if (var3 != 0) {
                                    break L10;
                                  } else {
                                    if (param0 != 87) {
                                      this.b((byte) -61);
                                      return;
                                    } else {
                                      return;
                                    }
                                  }
                                } else {
                                  if ((var2 ^ -1) == -4) {
                                    break L10;
                                  } else {
                                    if ((var2 ^ -1) != -5) {
                                      if (5 == var2) {
                                        break L9;
                                      } else {
                                        L11: {
                                          if ((var2 ^ -1) != -13) {
                                            break L11;
                                          } else {
                                            if (var3 == 0) {
                                              break L8;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (-14 != (var2 ^ -1)) {
                                            break L12;
                                          } else {
                                            if (var3 == 0) {
                                              break L7;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        if (-11 == (var2 ^ -1)) {
                                          break L6;
                                        } else {
                                          L13: {
                                            if ((var2 ^ -1) != -12) {
                                              break L13;
                                            } else {
                                              if (var3 == 0) {
                                                break L5;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          if (6 == var2) {
                                            break L4;
                                          } else {
                                            L14: {
                                              if (-8 != (var2 ^ -1)) {
                                                break L14;
                                              } else {
                                                if (var3 == 0) {
                                                  break L3;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            L15: {
                                              if (-9 != (var2 ^ -1)) {
                                                break L15;
                                              } else {
                                                if (var3 == 0) {
                                                  break L2;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L16: {
                                              if (9 != var2) {
                                                break L16;
                                              } else {
                                                if (var3 == 0) {
                                                  break L1;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            if (14 == var2) {
                                              this.field_i = 2048;
                                              this.field_g = 1280;
                                              this.field_h = 768;
                                              this.field_f = 1;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                this.field_f = 1;
                                                this.field_h = 512;
                                                this.field_i = 4096;
                                                this.field_g = 1536;
                                                this.field_h = 256;
                                                this.field_g = 1792;
                                                this.field_f = 1;
                                                this.field_i = 8192;
                                                this.field_h = 2048;
                                                this.field_i = 2048;
                                                this.field_f = 0;
                                                this.field_g = 0;
                                                if (param0 != 87) {
                                                  this.b((byte) -61);
                                                  return;
                                                } else {
                                                  return;
                                                }
                                              }
                                            } else {
                                              L17: {
                                                if (15 != var2) {
                                                  break L17;
                                                } else {
                                                  if (var3 == 0) {
                                                    this.field_f = 1;
                                                    this.field_h = 512;
                                                    this.field_i = 4096;
                                                    this.field_g = 1536;
                                                    if (var3 == 0) {
                                                      break L0;
                                                    } else {
                                                      this.field_h = 256;
                                                      this.field_g = 1792;
                                                      this.field_f = 1;
                                                      this.field_i = 8192;
                                                      this.field_h = 2048;
                                                      this.field_i = 2048;
                                                      this.field_f = 0;
                                                      this.field_g = 0;
                                                      if (param0 == 87) {
                                                        return;
                                                      } else {
                                                        this.b((byte) -61);
                                                        return;
                                                      }
                                                    }
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              if (16 == var2) {
                                                this.field_h = 256;
                                                this.field_g = 1792;
                                                this.field_f = 1;
                                                this.field_i = 8192;
                                                if (var3 == 0) {
                                                  break L0;
                                                } else {
                                                  this.field_h = 2048;
                                                  this.field_i = 2048;
                                                  this.field_f = 0;
                                                  this.field_g = 0;
                                                  if (param0 == 87) {
                                                    return;
                                                  } else {
                                                    this.b((byte) -61);
                                                    return;
                                                  }
                                                }
                                              } else {
                                                this.field_h = 2048;
                                                this.field_i = 2048;
                                                this.field_f = 0;
                                                this.field_g = 0;
                                                if (param0 == 87) {
                                                  return;
                                                } else {
                                                  this.b((byte) -61);
                                                  return;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      this.field_h = 2048;
                                      this.field_g = 0;
                                      this.field_f = 4;
                                      this.field_i = 2048;
                                      this.field_f = 4;
                                      this.field_h = 2048;
                                      this.field_i = 8192;
                                      this.field_g = 0;
                                      this.field_g = 0;
                                      this.field_i = 2048;
                                      this.field_f = 2;
                                      this.field_h = 2048;
                                      this.field_i = 8192;
                                      this.field_h = 2048;
                                      this.field_g = 0;
                                      this.field_f = 2;
                                      this.field_h = 512;
                                      this.field_i = 2048;
                                      this.field_g = 1536;
                                      this.field_f = 3;
                                      this.field_f = 3;
                                      this.field_g = 1536;
                                      this.field_h = 512;
                                      this.field_i = 4096;
                                      this.field_g = 1280;
                                      this.field_i = 2048;
                                      this.field_h = 768;
                                      this.field_f = 3;
                                      this.field_f = 3;
                                      this.field_h = 768;
                                      this.field_i = 4096;
                                      this.field_g = 1280;
                                      this.field_f = 3;
                                      this.field_g = 1024;
                                      this.field_h = 1024;
                                      this.field_i = 2048;
                                      this.field_g = 1024;
                                      this.field_h = 1024;
                                      this.field_i = 4096;
                                      this.field_f = 3;
                                      this.field_i = 2048;
                                      this.field_g = 1280;
                                      this.field_h = 768;
                                      this.field_f = 1;
                                      this.field_f = 1;
                                      this.field_h = 512;
                                      this.field_i = 4096;
                                      this.field_g = 1536;
                                      this.field_h = 256;
                                      this.field_g = 1792;
                                      this.field_f = 1;
                                      this.field_i = 8192;
                                      this.field_h = 2048;
                                      this.field_i = 2048;
                                      this.field_f = 0;
                                      this.field_g = 0;
                                      L18: {
                                        if (param0 == 87) {
                                          break L18;
                                        } else {
                                          this.b((byte) -61);
                                          break L18;
                                        }
                                      }
                                      return;
                                    }
                                  }
                                }
                              }
                              this.field_f = 1;
                              this.field_h = 2048;
                              this.field_g = 0;
                              this.field_i = 4096;
                              if (var3 != 0) {
                                this.field_h = 2048;
                                this.field_g = 0;
                                this.field_f = 4;
                                this.field_i = 2048;
                                if (var3 != 0) {
                                  break L9;
                                } else {
                                  if (param0 != 87) {
                                    this.b((byte) -61);
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                if (param0 != 87) {
                                  this.b((byte) -61);
                                  return;
                                } else {
                                  return;
                                }
                              }
                            }
                            this.field_f = 4;
                            this.field_h = 2048;
                            this.field_i = 8192;
                            this.field_g = 0;
                            if (var3 != 0) {
                              break L8;
                            } else {
                              if (param0 != 87) {
                                this.b((byte) -61);
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                          this.field_g = 0;
                          this.field_i = 2048;
                          this.field_f = 2;
                          this.field_h = 2048;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                        this.field_i = 8192;
                        this.field_h = 2048;
                        this.field_g = 0;
                        this.field_f = 2;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                      this.field_h = 512;
                      this.field_i = 2048;
                      this.field_g = 1536;
                      this.field_f = 3;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                    this.field_f = 3;
                    this.field_g = 1536;
                    this.field_h = 512;
                    this.field_i = 4096;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                  this.field_g = 1280;
                  this.field_i = 2048;
                  this.field_h = 768;
                  this.field_f = 3;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
                this.field_f = 3;
                this.field_h = 768;
                this.field_i = 4096;
                this.field_g = 1280;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              this.field_f = 3;
              this.field_g = 1024;
              this.field_h = 1024;
              this.field_i = 2048;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            this.field_g = 1024;
            this.field_h = 1024;
            this.field_i = 4096;
            this.field_f = 3;
            if (var3 == 0) {
              break L0;
            } else {
              L19: {
                this.field_i = 2048;
                this.field_g = 1280;
                this.field_h = 768;
                this.field_f = 1;
                this.field_f = 1;
                this.field_h = 512;
                this.field_i = 4096;
                this.field_g = 1536;
                this.field_h = 256;
                this.field_g = 1792;
                this.field_f = 1;
                this.field_i = 8192;
                this.field_h = 2048;
                this.field_i = 2048;
                this.field_f = 0;
                this.field_g = 0;
                if (param0 == 87) {
                  break L19;
                } else {
                  this.b((byte) -61);
                  break L19;
                }
              }
              return;
            }
          }
          if (param0 == 87) {
            return;
          } else {
            this.b((byte) -61);
            return;
          }
        } else {
          L20: {
            L21: {
              L22: {
                L23: {
                  L24: {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              L30: {
                                if ((var2 ^ -1) == -4) {
                                  this.field_f = 1;
                                  this.field_h = 2048;
                                  this.field_g = 0;
                                  this.field_i = 4096;
                                  if (var3 == 0) {
                                    break L20;
                                  } else {
                                    break L30;
                                  }
                                } else {
                                  if ((var2 ^ -1) == -5) {
                                    break L30;
                                  } else {
                                    if (5 == var2) {
                                      break L29;
                                    } else {
                                      L31: {
                                        if ((var2 ^ -1) != -13) {
                                          break L31;
                                        } else {
                                          if (var3 == 0) {
                                            break L28;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      L32: {
                                        if (-14 != (var2 ^ -1)) {
                                          break L32;
                                        } else {
                                          if (var3 == 0) {
                                            break L27;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                      if (-11 == (var2 ^ -1)) {
                                        break L26;
                                      } else {
                                        L33: {
                                          if ((var2 ^ -1) != -12) {
                                            break L33;
                                          } else {
                                            if (var3 == 0) {
                                              break L25;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        if (6 == var2) {
                                          break L24;
                                        } else {
                                          L34: {
                                            if (-8 != (var2 ^ -1)) {
                                              break L34;
                                            } else {
                                              if (var3 == 0) {
                                                break L23;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          L35: {
                                            if (-9 != (var2 ^ -1)) {
                                              break L35;
                                            } else {
                                              if (var3 == 0) {
                                                break L22;
                                              } else {
                                                break L35;
                                              }
                                            }
                                          }
                                          L36: {
                                            if (9 != var2) {
                                              break L36;
                                            } else {
                                              if (var3 == 0) {
                                                break L21;
                                              } else {
                                                break L36;
                                              }
                                            }
                                          }
                                          if (14 == var2) {
                                            this.field_i = 2048;
                                            this.field_g = 1280;
                                            this.field_h = 768;
                                            this.field_f = 1;
                                            if (var3 == 0) {
                                              break L20;
                                            } else {
                                              this.field_f = 1;
                                              this.field_h = 512;
                                              this.field_i = 4096;
                                              this.field_g = 1536;
                                              this.field_h = 256;
                                              this.field_g = 1792;
                                              this.field_f = 1;
                                              this.field_i = 8192;
                                              this.field_h = 2048;
                                              this.field_i = 2048;
                                              this.field_f = 0;
                                              this.field_g = 0;
                                              L37: {
                                                if (param0 == 87) {
                                                  break L37;
                                                } else {
                                                  this.b((byte) -61);
                                                  break L37;
                                                }
                                              }
                                              return;
                                            }
                                          } else {
                                            L38: {
                                              if (15 != var2) {
                                                break L38;
                                              } else {
                                                if (var3 == 0) {
                                                  this.field_f = 1;
                                                  this.field_h = 512;
                                                  this.field_i = 4096;
                                                  this.field_g = 1536;
                                                  if (var3 == 0) {
                                                    break L20;
                                                  } else {
                                                    this.field_h = 256;
                                                    this.field_g = 1792;
                                                    this.field_f = 1;
                                                    this.field_i = 8192;
                                                    this.field_h = 2048;
                                                    this.field_i = 2048;
                                                    this.field_f = 0;
                                                    this.field_g = 0;
                                                    L39: {
                                                      if (param0 == 87) {
                                                        break L39;
                                                      } else {
                                                        this.b((byte) -61);
                                                        break L39;
                                                      }
                                                    }
                                                    return;
                                                  }
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            if (16 == var2) {
                                              this.field_h = 256;
                                              this.field_g = 1792;
                                              this.field_f = 1;
                                              this.field_i = 8192;
                                              if (var3 == 0) {
                                                break L20;
                                              } else {
                                                L40: {
                                                  this.field_h = 2048;
                                                  this.field_i = 2048;
                                                  this.field_f = 0;
                                                  this.field_g = 0;
                                                  if (param0 == 87) {
                                                    break L40;
                                                  } else {
                                                    this.b((byte) -61);
                                                    break L40;
                                                  }
                                                }
                                                return;
                                              }
                                            } else {
                                              L41: {
                                                this.field_h = 2048;
                                                this.field_i = 2048;
                                                this.field_f = 0;
                                                this.field_g = 0;
                                                if (param0 == 87) {
                                                  break L41;
                                                } else {
                                                  this.b((byte) -61);
                                                  break L41;
                                                }
                                              }
                                              return;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_h = 2048;
                              this.field_g = 0;
                              this.field_f = 4;
                              this.field_i = 2048;
                              if (var3 == 0) {
                                break L20;
                              } else {
                                break L29;
                              }
                            }
                            this.field_f = 4;
                            this.field_h = 2048;
                            this.field_i = 8192;
                            this.field_g = 0;
                            if (var3 == 0) {
                              break L20;
                            } else {
                              break L28;
                            }
                          }
                          this.field_g = 0;
                          this.field_i = 2048;
                          this.field_f = 2;
                          this.field_h = 2048;
                          if (var3 == 0) {
                            break L20;
                          } else {
                            break L27;
                          }
                        }
                        this.field_i = 8192;
                        this.field_h = 2048;
                        this.field_g = 0;
                        this.field_f = 2;
                        if (var3 == 0) {
                          break L20;
                        } else {
                          break L26;
                        }
                      }
                      this.field_h = 512;
                      this.field_i = 2048;
                      this.field_g = 1536;
                      this.field_f = 3;
                      if (var3 == 0) {
                        break L20;
                      } else {
                        break L25;
                      }
                    }
                    this.field_f = 3;
                    this.field_g = 1536;
                    this.field_h = 512;
                    this.field_i = 4096;
                    if (var3 == 0) {
                      break L20;
                    } else {
                      break L24;
                    }
                  }
                  this.field_g = 1280;
                  this.field_i = 2048;
                  this.field_h = 768;
                  this.field_f = 3;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    break L23;
                  }
                }
                this.field_f = 3;
                this.field_h = 768;
                this.field_i = 4096;
                this.field_g = 1280;
                if (var3 == 0) {
                  break L20;
                } else {
                  break L22;
                }
              }
              this.field_f = 3;
              this.field_g = 1024;
              this.field_h = 1024;
              this.field_i = 2048;
              if (var3 == 0) {
                break L20;
              } else {
                break L21;
              }
            }
            this.field_g = 1024;
            this.field_h = 1024;
            this.field_i = 4096;
            this.field_f = 3;
            if (var3 == 0) {
              break L20;
            } else {
              this.field_i = 2048;
              this.field_g = 1280;
              this.field_h = 768;
              this.field_f = 1;
              this.field_f = 1;
              this.field_h = 512;
              this.field_i = 4096;
              this.field_g = 1536;
              this.field_h = 256;
              this.field_g = 1792;
              this.field_f = 1;
              this.field_i = 8192;
              this.field_h = 2048;
              this.field_i = 2048;
              this.field_f = 0;
              this.field_g = 0;
              L42: {
                if (param0 == 87) {
                  break L42;
                } else {
                  this.b((byte) -61);
                  break L42;
                }
              }
              return;
            }
          }
          if (param0 != 87) {
            this.b((byte) -61);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, ha param2, int param3, int param4, int param5, int param6) {
        nl[] discarded$2 = null;
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
              this.field_c = param2.a(param5, param1, param0, param3, param6, 1.0f);
              if (param4 == 512) {
                break L1;
              } else {
                discarded$2 = aga.a(-83);
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
            stackOut_3_1 = new StringBuilder().append("aga.E(").append(param0).append(',').append(param1).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_17_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 == -1814184927) {
          if (!param0) {
            var5 = 2047 & param1 * this.field_i / 50 + this.field_e;
            var6 = this.field_f;
            if (var6 != 1) {
              if (-4 != (var6 ^ -1)) {
                if (4 == var6) {
                  if (var7 == 0) {
                    L0: {
                      var4 = var5 >> -611924438 << -822238229;
                      if (var7 == 0) {
                        break L0;
                      } else {
                        L1: {
                          var4 = var5;
                          if ((var5 ^ -1) <= -1025) {
                            stackOut_177_0 = 2048 + -var5;
                            stackIn_178_0 = stackOut_177_0;
                            break L1;
                          } else {
                            stackOut_176_0 = var5;
                            stackIn_178_0 = stackOut_176_0;
                            break L1;
                          }
                        }
                        var4 = stackIn_178_0 << -1365349471;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          var4 = 2048;
                          break L0;
                        }
                      }
                    }
                    L2: {
                      if (var7 == 0) {
                        break L2;
                      } else {
                        var4 = 2048;
                        break L2;
                      }
                    }
                    this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                    return;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (-3 == (var6 ^ -1)) {
                            var4 = var5;
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          } else {
                            if (5 == var6) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if ((var5 ^ -1) <= -1025) {
                            stackOut_168_0 = 2048 + -var5;
                            stackIn_169_0 = stackOut_168_0;
                            break L6;
                          } else {
                            stackOut_167_0 = var5;
                            stackIn_169_0 = stackOut_167_0;
                            break L6;
                          }
                        }
                        var4 = stackIn_169_0 << -1365349471;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      var4 = 2048;
                      break L3;
                    }
                    L7: {
                      if (var7 == 0) {
                        break L7;
                      } else {
                        var4 = 2048;
                        break L7;
                      }
                    }
                    this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                    return;
                  }
                } else {
                  L8: {
                    L9: {
                      L10: {
                        if (-3 == (var6 ^ -1)) {
                          var4 = var5;
                          if (var7 == 0) {
                            break L8;
                          } else {
                            break L10;
                          }
                        } else {
                          if (5 == var6) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L11: {
                        if ((var5 ^ -1) <= -1025) {
                          stackOut_155_0 = 2048 + -var5;
                          stackIn_156_0 = stackOut_155_0;
                          break L11;
                        } else {
                          stackOut_154_0 = var5;
                          stackIn_156_0 = stackOut_154_0;
                          break L11;
                        }
                      }
                      var4 = stackIn_156_0 << -1365349471;
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                    var4 = 2048;
                    break L8;
                  }
                  L12: {
                    if (var7 == 0) {
                      break L12;
                    } else {
                      var4 = 2048;
                      break L12;
                    }
                  }
                  this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                  return;
                }
              } else {
                L13: {
                  var4 = ooa.field_e[var5] >> -1814184927;
                  if (var7 == 0) {
                    break L13;
                  } else {
                    L14: {
                      var4 = var5 >> -611924438 << -822238229;
                      var4 = var5;
                      if ((var5 ^ -1) <= -1025) {
                        stackOut_141_0 = 2048 + -var5;
                        stackIn_142_0 = stackOut_141_0;
                        break L14;
                      } else {
                        stackOut_140_0 = var5;
                        stackIn_142_0 = stackOut_140_0;
                        break L14;
                      }
                    }
                    var4 = stackIn_142_0 << -1365349471;
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var4 = 2048;
                      break L13;
                    }
                  }
                }
                L15: {
                  if (var7 == 0) {
                    break L15;
                  } else {
                    var4 = 2048;
                    break L15;
                  }
                }
                this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                return;
              }
            } else {
              if (var7 != 0) {
                if (-4 != (var6 ^ -1)) {
                  if (4 == var6) {
                    L16: {
                      L17: {
                        L18: {
                          if (-3 == (var6 ^ -1)) {
                            var4 = var5;
                            if (var7 == 0) {
                              break L16;
                            } else {
                              break L18;
                            }
                          } else {
                            if (5 == var6) {
                              break L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L19: {
                          if ((var5 ^ -1) <= -1025) {
                            stackOut_130_0 = 2048 + -var5;
                            stackIn_131_0 = stackOut_130_0;
                            break L19;
                          } else {
                            stackOut_129_0 = var5;
                            stackIn_131_0 = stackOut_129_0;
                            break L19;
                          }
                        }
                        var4 = stackIn_131_0 << -1365349471;
                        if (var7 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                      var4 = 2048;
                      break L16;
                    }
                    L20: {
                      if (var7 == 0) {
                        break L20;
                      } else {
                        var4 = 2048;
                        break L20;
                      }
                    }
                    this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                    return;
                  } else {
                    L21: {
                      L22: {
                        L23: {
                          if (-3 == (var6 ^ -1)) {
                            var4 = var5;
                            if (var7 == 0) {
                              break L21;
                            } else {
                              break L23;
                            }
                          } else {
                            if (5 == var6) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L24: {
                          if ((var5 ^ -1) <= -1025) {
                            stackOut_118_0 = 2048 + -var5;
                            stackIn_119_0 = stackOut_118_0;
                            break L24;
                          } else {
                            stackOut_117_0 = var5;
                            stackIn_119_0 = stackOut_117_0;
                            break L24;
                          }
                        }
                        var4 = stackIn_119_0 << -1365349471;
                        if (var7 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                      var4 = 2048;
                      break L21;
                    }
                    L25: {
                      if (var7 == 0) {
                        break L25;
                      } else {
                        var4 = 2048;
                        break L25;
                      }
                    }
                    this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                    return;
                  }
                } else {
                  L26: {
                    var4 = ooa.field_e[var5] >> -1814184927;
                    if (var7 == 0) {
                      break L26;
                    } else {
                      L27: {
                        var4 = var5 >> -611924438 << -822238229;
                        var4 = var5;
                        if ((var5 ^ -1) <= -1025) {
                          stackOut_104_0 = 2048 + -var5;
                          stackIn_105_0 = stackOut_104_0;
                          break L27;
                        } else {
                          stackOut_103_0 = var5;
                          stackIn_105_0 = stackOut_103_0;
                          break L27;
                        }
                      }
                      var4 = stackIn_105_0 << -1365349471;
                      if (var7 == 0) {
                        break L26;
                      } else {
                        var4 = 2048;
                        break L26;
                      }
                    }
                  }
                  L28: {
                    if (var7 == 0) {
                      break L28;
                    } else {
                      var4 = 2048;
                      break L28;
                    }
                  }
                  this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                  return;
                }
              } else {
                L29: {
                  var4 = 1024 - -(qu.field_b[var5 << -2069246749] >> -1696208892);
                  if (var7 == 0) {
                    break L29;
                  } else {
                    L30: {
                      var4 = ooa.field_e[var5] >> -1814184927;
                      var4 = var5 >> -611924438 << -822238229;
                      var4 = var5;
                      if ((var5 ^ -1) <= -1025) {
                        stackOut_94_0 = 2048 + -var5;
                        stackIn_95_0 = stackOut_94_0;
                        break L30;
                      } else {
                        stackOut_93_0 = var5;
                        stackIn_95_0 = stackOut_93_0;
                        break L30;
                      }
                    }
                    var4 = stackIn_95_0 << -1365349471;
                    if (var7 == 0) {
                      break L29;
                    } else {
                      var4 = 2048;
                      break L29;
                    }
                  }
                }
                L31: {
                  if (var7 == 0) {
                    break L31;
                  } else {
                    var4 = 2048;
                    break L31;
                  }
                }
                this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                return;
              }
            }
          } else {
            var4 = 2048;
            this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
            return;
          }
        } else {
          field_a = (String) null;
          if (!param0) {
            var5 = 2047 & param1 * this.field_i / 50 + this.field_e;
            var6 = this.field_f;
            if (var6 == 1) {
              L32: {
                if (var7 == 0) {
                  var4 = 1024 - -(qu.field_b[var5 << -2069246749] >> -1696208892);
                  if (var7 != 0) {
                    break L32;
                  } else {
                    L33: {
                      if (var7 == 0) {
                        break L33;
                      } else {
                        var4 = 2048;
                        break L33;
                      }
                    }
                    this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                    return;
                  }
                } else {
                  if (-4 == (var6 ^ -1)) {
                    break L32;
                  } else {
                    if (4 == var6) {
                      if (var7 != 0) {
                        if (-3 != (var6 ^ -1)) {
                          if (5 != var6) {
                            L34: {
                              var4 = 2048;
                              if (var7 == 0) {
                                break L34;
                              } else {
                                var4 = 2048;
                                break L34;
                              }
                            }
                            this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                            return;
                          } else {
                            L35: {
                              if ((var5 ^ -1) <= -1025) {
                                stackOut_60_0 = 2048 + -var5;
                                stackIn_61_0 = stackOut_60_0;
                                break L35;
                              } else {
                                stackOut_59_0 = var5;
                                stackIn_61_0 = stackOut_59_0;
                                break L35;
                              }
                            }
                            L36: {
                              var4 = stackIn_61_0 << -1365349471;
                              if (var7 == 0) {
                                break L36;
                              } else {
                                var4 = 2048;
                                break L36;
                              }
                            }
                            L37: {
                              if (var7 == 0) {
                                break L37;
                              } else {
                                var4 = 2048;
                                break L37;
                              }
                            }
                            this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                            return;
                          }
                        } else {
                          L38: {
                            var4 = var5;
                            if (var7 == 0) {
                              break L38;
                            } else {
                              L39: {
                                if ((var5 ^ -1) <= -1025) {
                                  stackOut_51_0 = 2048 + -var5;
                                  stackIn_52_0 = stackOut_51_0;
                                  break L39;
                                } else {
                                  stackOut_50_0 = var5;
                                  stackIn_52_0 = stackOut_50_0;
                                  break L39;
                                }
                              }
                              var4 = stackIn_52_0 << -1365349471;
                              if (var7 == 0) {
                                break L38;
                              } else {
                                var4 = 2048;
                                break L38;
                              }
                            }
                          }
                          L40: {
                            if (var7 == 0) {
                              break L40;
                            } else {
                              var4 = 2048;
                              break L40;
                            }
                          }
                          this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                          return;
                        }
                      } else {
                        L41: {
                          var4 = var5 >> -611924438 << -822238229;
                          if (var7 == 0) {
                            break L41;
                          } else {
                            L42: {
                              var4 = var5;
                              if ((var5 ^ -1) <= -1025) {
                                stackOut_41_0 = 2048 + -var5;
                                stackIn_42_0 = stackOut_41_0;
                                break L42;
                              } else {
                                stackOut_40_0 = var5;
                                stackIn_42_0 = stackOut_40_0;
                                break L42;
                              }
                            }
                            var4 = stackIn_42_0 << -1365349471;
                            if (var7 == 0) {
                              break L41;
                            } else {
                              var4 = 2048;
                              break L41;
                            }
                          }
                        }
                        L43: {
                          if (var7 == 0) {
                            break L43;
                          } else {
                            var4 = 2048;
                            break L43;
                          }
                        }
                        this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                        return;
                      }
                    } else {
                      L44: {
                        L45: {
                          L46: {
                            if (-3 == (var6 ^ -1)) {
                              var4 = var5;
                              if (var7 == 0) {
                                break L44;
                              } else {
                                break L46;
                              }
                            } else {
                              if (5 == var6) {
                                break L46;
                              } else {
                                break L45;
                              }
                            }
                          }
                          L47: {
                            if ((var5 ^ -1) <= -1025) {
                              stackOut_31_0 = 2048 + -var5;
                              stackIn_32_0 = stackOut_31_0;
                              break L47;
                            } else {
                              stackOut_30_0 = var5;
                              stackIn_32_0 = stackOut_30_0;
                              break L47;
                            }
                          }
                          var4 = stackIn_32_0 << -1365349471;
                          if (var7 == 0) {
                            break L44;
                          } else {
                            break L45;
                          }
                        }
                        var4 = 2048;
                        break L44;
                      }
                      L48: {
                        if (var7 == 0) {
                          break L48;
                        } else {
                          var4 = 2048;
                          break L48;
                        }
                      }
                      this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                      return;
                    }
                  }
                }
              }
              var4 = ooa.field_e[var5] >> -1814184927;
              if (var7 != 0) {
                L49: {
                  var4 = var5 >> -611924438 << -822238229;
                  var4 = var5;
                  if ((var5 ^ -1) <= -1025) {
                    stackOut_80_0 = 2048 + -var5;
                    stackIn_81_0 = stackOut_80_0;
                    break L49;
                  } else {
                    stackOut_79_0 = var5;
                    stackIn_81_0 = stackOut_79_0;
                    break L49;
                  }
                }
                L50: {
                  var4 = stackIn_81_0 << -1365349471;
                  if (var7 == 0) {
                    break L50;
                  } else {
                    var4 = 2048;
                    break L50;
                  }
                }
                L51: {
                  if (var7 == 0) {
                    break L51;
                  } else {
                    var4 = 2048;
                    break L51;
                  }
                }
                this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                return;
              } else {
                L52: {
                  if (var7 == 0) {
                    break L52;
                  } else {
                    var4 = 2048;
                    break L52;
                  }
                }
                this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
                return;
              }
            } else {
              L53: {
                L54: {
                  L55: {
                    L56: {
                      L57: {
                        if (-4 == (var6 ^ -1)) {
                          var4 = ooa.field_e[var5] >> -1814184927;
                          if (var7 == 0) {
                            break L53;
                          } else {
                            break L57;
                          }
                        } else {
                          L58: {
                            if (4 != var6) {
                              break L58;
                            } else {
                              if (var7 == 0) {
                                break L57;
                              } else {
                                break L58;
                              }
                            }
                          }
                          if (-3 == (var6 ^ -1)) {
                            break L56;
                          } else {
                            if (5 == var6) {
                              break L55;
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                      var4 = var5 >> -611924438 << -822238229;
                      if (var7 == 0) {
                        break L53;
                      } else {
                        break L56;
                      }
                    }
                    var4 = var5;
                    if (var7 == 0) {
                      break L53;
                    } else {
                      break L55;
                    }
                  }
                  L59: {
                    if ((var5 ^ -1) <= -1025) {
                      stackOut_16_0 = 2048 + -var5;
                      stackIn_17_0 = stackOut_16_0;
                      break L59;
                    } else {
                      stackOut_15_0 = var5;
                      stackIn_17_0 = stackOut_15_0;
                      break L59;
                    }
                  }
                  var4 = stackIn_17_0 << -1365349471;
                  if (var7 == 0) {
                    break L53;
                  } else {
                    break L54;
                  }
                }
                var4 = 2048;
                break L53;
              }
              L60: {
                if (var7 == 0) {
                  break L60;
                } else {
                  var4 = 2048;
                  break L60;
                }
              }
              this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
              return;
            }
          } else {
            var4 = 2048;
            this.field_c.a((byte) 105, (float)((var4 * this.field_h >> -581138165) + this.field_g) / 2048.0f);
            return;
          }
        }
    }

    public static void a(byte param0) {
        nl[] discarded$0 = null;
        if (param0 != -113) {
            discarded$0 = aga.a(111);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static nl[] a(int param0) {
        if (param0 != -1025) {
          field_a = (String) null;
          return new nl[]{vw.field_a, ub.field_d, npa.field_f};
        } else {
          return new nl[]{vw.field_a, ub.field_d, npa.field_f};
        }
    }

    final static g a(boolean param0, int param1) {
        qg[] var2 = null;
        int var3 = 0;
        qg var4 = null;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var8 = 0;
        qg[] var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var9 = cm.field_a;
          var2 = var9;
          var3 = 0;
          L0: while (true) {
            stackOut_3_0 = var9.length;
            stackOut_3_1 = var3;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            L1: while (true) {
              if (stackIn_4_0 > stackIn_4_1) {
                var4 = var9[var3];
                var5 = var4.field_c;
                var6 = 0;
                L2: while (true) {
                  L3: {
                    if (var5.length <= var6) {
                      break L3;
                    } else {
                      var7 = var5[var6];
                      stackOut_8_0 = param1 ^ -1;
                      stackOut_8_1 = var7.field_a ^ -1;
                      stackIn_4_0 = stackOut_8_0;
                      stackIn_4_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var8 != 0) {
                        continue L1;
                      } else {
                        if (stackIn_9_0 != stackIn_9_1) {
                          var6++;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        } else {
                          return var7;
                        }
                      }
                    }
                  }
                  var3++;
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return (g) null;
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 != -42) {
          this.a(32, (byte) 21);
          this.field_d = param0;
          this.b((byte) 87);
          return;
        } else {
          this.field_d = param0;
          this.b((byte) 87);
          return;
        }
    }

    aga(ha param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ooa.field_e != null) {
                break L1;
              } else {
                pd.b(2);
                break L1;
              }
            }
            this.a(param4, param3, param0, param6, 512, param2, param5);
            var9_int = (-ri.field_q + 2 * param6 >> cn.field_b) + 1;
            this.field_b = new short[var9_int];
            var10 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var10 >= this.field_b.length) {
                    break L4;
                  } else {
                    this.field_b[var10] = (short)var9_int;
                    var10++;
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
                this.a(param7, (byte) -42);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("aga.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_a = "You have 1 unread message!";
    }
}
