/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh implements fo {
    int field_f;
    int field_i;
    private boolean field_c;
    int field_p;
    private boolean field_j;
    private boolean field_h;
    private boolean field_n;
    private boolean field_e;
    private int field_b;
    int field_d;
    int field_a;
    private boolean field_m;
    int field_l;
    private boolean field_k;
    int field_o;
    lma field_g;
    private boolean field_q;

    final static void b(int param0, int param1) {
        kh var2 = null;
        var2 = ql.field_k;
        var2.k(param0, -2988);
        var2.i(1, param1 + 22243);
        if (param1 != -22243) {
          return;
        } else {
          var2.i(0, 0);
          return;
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka var7 = null;
        ka var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = ((fh) this).b((byte) -113);
            var4 = ((fh) this).c((byte) 115);
            var5 = ((fh) this).e((byte) -108);
            gqa.a(dfa.a(((fh) this).field_o, 2048, 87), -83584144, var4, var3_int, ((fh) this).field_g.a((fh) this, (byte) 76), var5);
            int discarded$1 = -115;
            if (!nk.c()) {
              return;
            } else {
              if (param0 >= 103) {
                L1: {
                  var6 = gca.field_g[21];
                  var7 = gca.field_g[23];
                  var8 = gca.field_g[22];
                  var9 = 0;
                  if (((fh) this).field_g.o((byte) 111)) {
                    var9 = var9 + 4 * ((fh) this).field_b % 32;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((fh) this).field_m) {
                    if (!((fh) this).field_k) {
                      if (!((fh) this).field_h) {
                        gqa.a(512, -83584144, var4 - -2097152, var3_int, var6, var9);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      gqa.a(1024, -83584144, 2097152 + var4, var3_int, var8, var9);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!((fh) this).field_c) {
                    break L3;
                  } else {
                    if (((fh) this).field_j) {
                      gqa.a(512, -83584144, var4, var3_int + 2097152, var8, var9);
                      break L3;
                    } else {
                      if (!((fh) this).field_k) {
                        gqa.a(0, -83584144, var4, var3_int - -2097152, var6, var9);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (((fh) this).field_e) {
                    if (((fh) this).field_q) {
                      break L4;
                    } else {
                      if (!((fh) this).field_h) {
                        gqa.a(1024, -83584144, var4, var3_int - 2097152, var6, var9);
                        break L4;
                      } else {
                        gqa.a(-512, -83584144, var4, -2097152 + var3_int, var8, var9);
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((fh) this).field_n) {
                    if (((fh) this).field_j) {
                      break L5;
                    } else {
                      if (((fh) this).field_q) {
                        gqa.a(0, -83584144, -2097152 + var4, var3_int, var8, var9);
                        break L5;
                      } else {
                        gqa.a(-512, -83584144, var4 + -2097152, var3_int, var6, var9);
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (!((fh) this).field_m) {
                    break L6;
                  } else {
                    if (!((fh) this).field_c) {
                      break L6;
                    } else {
                      gqa.a(0, -83584144, 2097152 + var4, var3_int + 2097152, var7, var9);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (!((fh) this).field_m) {
                    break L7;
                  } else {
                    if (((fh) this).field_e) {
                      gqa.a(512, -83584144, var4 + 2097152, -2097152 + var3_int, var7, var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (!((fh) this).field_n) {
                    break L8;
                  } else {
                    if (!((fh) this).field_c) {
                      break L8;
                    } else {
                      gqa.a(-512, -83584144, -2097152 + var4, var3_int - -2097152, var7, var9);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (!((fh) this).field_n) {
                    break L9;
                  } else {
                    if (((fh) this).field_e) {
                      gqa.a(1024, -83584144, var4 + -2097152, -2097152 + var3_int, var7, var9);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var3;
            stackOut_49_1 = new StringBuilder().append("fh.DB(").append(param0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L10;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          ((fh) this).field_n = false;
          ((fh) this).field_e = false;
          ((fh) this).field_c = false;
          ((fh) this).field_m = false;
          if (0 == ((fh) this).field_a) {
            var6 = ((fh) this).field_i;
            if (0 == var6) {
              ((fh) this).field_n = true;
              break L0;
            } else {
              if (2 != var6) {
                if (var6 != 4) {
                  if (var6 == 6) {
                    ((fh) this).field_e = true;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((fh) this).field_m = true;
                  break L0;
                }
              } else {
                ((fh) this).field_c = true;
                break L0;
              }
            }
          } else {
            if (1 == ((fh) this).field_a) {
              var6 = ((fh) this).field_i;
              if (0 != var6) {
                if (var6 == 2) {
                  ((fh) this).field_e = true;
                  ((fh) this).field_c = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                ((fh) this).field_m = true;
                ((fh) this).field_n = true;
                break L0;
              }
            } else {
              if (2 == ((fh) this).field_a) {
                var6 = ((fh) this).field_i;
                if (var6 != 0) {
                  if (var6 == 2) {
                    ((fh) this).field_n = true;
                    ((fh) this).field_m = true;
                    ((fh) this).field_c = true;
                    break L0;
                  } else {
                    if (var6 == 4) {
                      ((fh) this).field_e = true;
                      ((fh) this).field_m = true;
                      ((fh) this).field_c = true;
                      break L0;
                    } else {
                      if (6 == var6) {
                        ((fh) this).field_e = true;
                        ((fh) this).field_n = true;
                        ((fh) this).field_m = true;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                } else {
                  ((fh) this).field_c = true;
                  ((fh) this).field_e = true;
                  ((fh) this).field_n = true;
                  break L0;
                }
              } else {
                if (((fh) this).field_a == 3) {
                  ((fh) this).field_m = true;
                  ((fh) this).field_c = true;
                  ((fh) this).field_n = true;
                  ((fh) this).field_e = true;
                  break L0;
                } else {
                  if (((fh) this).field_a == 4) {
                    var6 = ((fh) this).field_i;
                    if (1 != var6) {
                      if (3 != var6) {
                        if (7 == var6) {
                          ((fh) this).field_n = true;
                          ((fh) this).field_e = true;
                          break L0;
                        } else {
                          if (5 == var6) {
                            ((fh) this).field_e = true;
                            ((fh) this).field_m = true;
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                      } else {
                        ((fh) this).field_m = true;
                        ((fh) this).field_c = true;
                        break L0;
                      }
                    } else {
                      ((fh) this).field_n = true;
                      ((fh) this).field_c = true;
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        if (param0) {
          L1: {
            if (((fh) this).field_n) {
              ((fh) this).field_q = true;
              break L1;
            } else {
              if (((fh) this).field_e) {
                ((fh) this).field_q = true;
                break L1;
              } else {
                if (!param4) {
                  L2: {
                    if (!param3) {
                      break L2;
                    } else {
                      L3: {
                        if (((fh) this).field_m) {
                          break L3;
                        } else {
                          if (((fh) this).field_c) {
                            break L3;
                          } else {
                            if (param1 == 24) {
                              L4: {
                                if (!param2) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (((fh) this).field_n) {
                                      break L5;
                                    } else {
                                      if (((fh) this).field_c) {
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  ((fh) this).field_j = true;
                                  break L4;
                                }
                              }
                              L6: {
                                if (0 == ((fh) this).field_g.i(-77)) {
                                  break L6;
                                } else {
                                  if (((fh) this).field_a == 6) {
                                    ((fh) this).field_o = 0;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      ((fh) this).field_k = true;
                      break L2;
                    }
                  }
                  if (param1 == 24) {
                    L7: {
                      if (!param2) {
                        break L7;
                      } else {
                        L8: {
                          if (((fh) this).field_n) {
                            break L8;
                          } else {
                            if (((fh) this).field_c) {
                              break L8;
                            } else {
                              L9: {
                                if (0 == ((fh) this).field_g.i(-77)) {
                                  break L9;
                                } else {
                                  if (((fh) this).field_a == 6) {
                                    ((fh) this).field_o = 0;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        ((fh) this).field_j = true;
                        break L7;
                      }
                    }
                    L10: {
                      if (0 == ((fh) this).field_g.i(-77)) {
                        break L10;
                      } else {
                        if (((fh) this).field_a == 6) {
                          ((fh) this).field_o = 0;
                          break L10;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((fh) this).field_m) {
                    L11: {
                      ((fh) this).field_h = true;
                      if (!param3) {
                        break L11;
                      } else {
                        L12: {
                          if (((fh) this).field_m) {
                            break L12;
                          } else {
                            if (((fh) this).field_c) {
                              break L12;
                            } else {
                              break L11;
                            }
                          }
                        }
                        ((fh) this).field_k = true;
                        break L11;
                      }
                    }
                    if (param1 != 24) {
                      return;
                    } else {
                      L13: {
                        if (!param2) {
                          break L13;
                        } else {
                          L14: {
                            if (((fh) this).field_n) {
                              break L14;
                            } else {
                              if (((fh) this).field_c) {
                                break L14;
                              } else {
                                break L13;
                              }
                            }
                          }
                          ((fh) this).field_j = true;
                          break L13;
                        }
                      }
                      L15: {
                        if (0 == ((fh) this).field_g.i(-77)) {
                          break L15;
                        } else {
                          if (((fh) this).field_a == 6) {
                            ((fh) this).field_o = 0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (((fh) this).field_e) {
                      L16: {
                        ((fh) this).field_h = true;
                        if (!param3) {
                          break L16;
                        } else {
                          L17: {
                            if (((fh) this).field_m) {
                              break L17;
                            } else {
                              if (((fh) this).field_c) {
                                break L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                          ((fh) this).field_k = true;
                          break L16;
                        }
                      }
                      if (param1 == 24) {
                        L18: {
                          if (!param2) {
                            break L18;
                          } else {
                            L19: {
                              if (((fh) this).field_n) {
                                break L19;
                              } else {
                                if (((fh) this).field_c) {
                                  break L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            ((fh) this).field_j = true;
                            break L18;
                          }
                        }
                        L20: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L20;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L21: {
                        if (!param3) {
                          break L21;
                        } else {
                          L22: {
                            if (((fh) this).field_m) {
                              break L22;
                            } else {
                              if (((fh) this).field_c) {
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                          }
                          ((fh) this).field_k = true;
                          break L21;
                        }
                      }
                      if (param1 != 24) {
                        return;
                      } else {
                        L23: {
                          if (!param2) {
                            break L23;
                          } else {
                            L24: {
                              if (((fh) this).field_n) {
                                break L24;
                              } else {
                                if (((fh) this).field_c) {
                                  break L24;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            ((fh) this).field_j = true;
                            break L23;
                          }
                        }
                        L25: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L25;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L25;
                            } else {
                              break L25;
                            }
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
          if (!param4) {
            L26: {
              if (!param3) {
                break L26;
              } else {
                L27: {
                  if (((fh) this).field_m) {
                    break L27;
                  } else {
                    if (((fh) this).field_c) {
                      break L27;
                    } else {
                      if (param1 == 24) {
                        L28: {
                          if (!param2) {
                            break L28;
                          } else {
                            L29: {
                              if (((fh) this).field_n) {
                                break L29;
                              } else {
                                if (((fh) this).field_c) {
                                  break L29;
                                } else {
                                  L30: {
                                    if (0 == ((fh) this).field_g.i(-77)) {
                                      break L30;
                                    } else {
                                      if (((fh) this).field_a == 6) {
                                        ((fh) this).field_o = 0;
                                        break L30;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            ((fh) this).field_j = true;
                            break L28;
                          }
                        }
                        L31: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L31;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L31;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                ((fh) this).field_k = true;
                break L26;
              }
            }
            if (param1 == 24) {
              L32: {
                if (!param2) {
                  break L32;
                } else {
                  L33: {
                    if (((fh) this).field_n) {
                      break L33;
                    } else {
                      if (((fh) this).field_c) {
                        break L33;
                      } else {
                        L34: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L34;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L34;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  ((fh) this).field_j = true;
                  break L32;
                }
              }
              L35: {
                if (0 == ((fh) this).field_g.i(-77)) {
                  break L35;
                } else {
                  if (((fh) this).field_a == 6) {
                    ((fh) this).field_o = 0;
                    break L35;
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            if (((fh) this).field_m) {
              L36: {
                ((fh) this).field_h = true;
                if (!param3) {
                  break L36;
                } else {
                  L37: {
                    if (((fh) this).field_m) {
                      break L37;
                    } else {
                      if (((fh) this).field_c) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                  ((fh) this).field_k = true;
                  break L36;
                }
              }
              if (param1 == 24) {
                L38: {
                  if (!param2) {
                    break L38;
                  } else {
                    L39: {
                      if (((fh) this).field_n) {
                        break L39;
                      } else {
                        if (((fh) this).field_c) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                    ((fh) this).field_j = true;
                    break L38;
                  }
                }
                L40: {
                  if (0 == ((fh) this).field_g.i(-77)) {
                    break L40;
                  } else {
                    if (((fh) this).field_a == 6) {
                      ((fh) this).field_o = 0;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (((fh) this).field_e) {
                ((fh) this).field_h = true;
                if (!param3) {
                  if (param1 == 24) {
                    L41: {
                      if (!param2) {
                        break L41;
                      } else {
                        L42: {
                          if (((fh) this).field_n) {
                            break L42;
                          } else {
                            if (((fh) this).field_c) {
                              break L42;
                            } else {
                              L43: {
                                if (0 == ((fh) this).field_g.i(-77)) {
                                  break L43;
                                } else {
                                  if (((fh) this).field_a == 6) {
                                    ((fh) this).field_o = 0;
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        ((fh) this).field_j = true;
                        break L41;
                      }
                    }
                    L44: {
                      if (0 == ((fh) this).field_g.i(-77)) {
                        break L44;
                      } else {
                        if (((fh) this).field_a == 6) {
                          ((fh) this).field_o = 0;
                          break L44;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!((fh) this).field_m) {
                    if (!((fh) this).field_c) {
                      if (param1 == 24) {
                        L45: {
                          if (!param2) {
                            break L45;
                          } else {
                            L46: {
                              if (((fh) this).field_n) {
                                break L46;
                              } else {
                                if (((fh) this).field_c) {
                                  break L46;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            ((fh) this).field_j = true;
                            break L45;
                          }
                        }
                        L47: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L47;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((fh) this).field_k = true;
                      if (param1 == 24) {
                        L48: {
                          if (!param2) {
                            break L48;
                          } else {
                            L49: {
                              if (((fh) this).field_n) {
                                break L49;
                              } else {
                                if (((fh) this).field_c) {
                                  break L49;
                                } else {
                                  L50: {
                                    if (0 == ((fh) this).field_g.i(-77)) {
                                      break L50;
                                    } else {
                                      if (((fh) this).field_a == 6) {
                                        ((fh) this).field_o = 0;
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            ((fh) this).field_j = true;
                            break L48;
                          }
                        }
                        L51: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L51;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L51;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((fh) this).field_k = true;
                    if (param1 == 24) {
                      L52: {
                        if (!param2) {
                          break L52;
                        } else {
                          L53: {
                            if (((fh) this).field_n) {
                              break L53;
                            } else {
                              if (((fh) this).field_c) {
                                break L53;
                              } else {
                                L54: {
                                  if (0 == ((fh) this).field_g.i(-77)) {
                                    break L54;
                                  } else {
                                    if (((fh) this).field_a == 6) {
                                      ((fh) this).field_o = 0;
                                      break L54;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                          ((fh) this).field_j = true;
                          break L52;
                        }
                      }
                      L55: {
                        if (0 == ((fh) this).field_g.i(-77)) {
                          break L55;
                        } else {
                          if (((fh) this).field_a == 6) {
                            ((fh) this).field_o = 0;
                            break L55;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L56: {
                  if (!param3) {
                    break L56;
                  } else {
                    L57: {
                      if (((fh) this).field_m) {
                        break L57;
                      } else {
                        if (((fh) this).field_c) {
                          break L57;
                        } else {
                          break L56;
                        }
                      }
                    }
                    ((fh) this).field_k = true;
                    break L56;
                  }
                }
                if (param1 == 24) {
                  L58: {
                    if (!param2) {
                      break L58;
                    } else {
                      L59: {
                        if (((fh) this).field_n) {
                          break L59;
                        } else {
                          if (((fh) this).field_c) {
                            break L59;
                          } else {
                            break L58;
                          }
                        }
                      }
                      ((fh) this).field_j = true;
                      break L58;
                    }
                  }
                  L60: {
                    if (0 == ((fh) this).field_g.i(-77)) {
                      break L60;
                    } else {
                      if (((fh) this).field_a == 6) {
                        ((fh) this).field_o = 0;
                        break L60;
                      } else {
                        break L60;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (!param4) {
            L61: {
              if (!param3) {
                break L61;
              } else {
                L62: {
                  if (((fh) this).field_m) {
                    break L62;
                  } else {
                    if (((fh) this).field_c) {
                      break L62;
                    } else {
                      if (param1 != 24) {
                        return;
                      } else {
                        L63: {
                          if (!param2) {
                            break L63;
                          } else {
                            L64: {
                              if (((fh) this).field_n) {
                                break L64;
                              } else {
                                if (((fh) this).field_c) {
                                  break L64;
                                } else {
                                  break L63;
                                }
                              }
                            }
                            ((fh) this).field_j = true;
                            break L63;
                          }
                        }
                        L65: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L65;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                ((fh) this).field_k = true;
                break L61;
              }
            }
            if (param1 == 24) {
              L66: {
                if (!param2) {
                  break L66;
                } else {
                  L67: {
                    if (((fh) this).field_n) {
                      break L67;
                    } else {
                      if (((fh) this).field_c) {
                        break L67;
                      } else {
                        L68: {
                          if (0 == ((fh) this).field_g.i(-77)) {
                            break L68;
                          } else {
                            if (((fh) this).field_a == 6) {
                              ((fh) this).field_o = 0;
                              break L68;
                            } else {
                              break L68;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  ((fh) this).field_j = true;
                  break L66;
                }
              }
              if (0 != ((fh) this).field_g.i(-77)) {
                if (((fh) this).field_a != 6) {
                  return;
                } else {
                  ((fh) this).field_o = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (((fh) this).field_m) {
              L69: {
                ((fh) this).field_h = true;
                if (!param3) {
                  break L69;
                } else {
                  L70: {
                    if (((fh) this).field_m) {
                      break L70;
                    } else {
                      if (((fh) this).field_c) {
                        break L70;
                      } else {
                        break L69;
                      }
                    }
                  }
                  ((fh) this).field_k = true;
                  break L69;
                }
              }
              if (param1 != 24) {
                return;
              } else {
                L71: {
                  if (!param2) {
                    break L71;
                  } else {
                    L72: {
                      if (((fh) this).field_n) {
                        break L72;
                      } else {
                        if (((fh) this).field_c) {
                          break L72;
                        } else {
                          break L71;
                        }
                      }
                    }
                    ((fh) this).field_j = true;
                    break L71;
                  }
                }
                L73: {
                  if (0 == ((fh) this).field_g.i(-77)) {
                    break L73;
                  } else {
                    if (((fh) this).field_a == 6) {
                      ((fh) this).field_o = 0;
                      break L73;
                    } else {
                      break L73;
                    }
                  }
                }
                return;
              }
            } else {
              if (((fh) this).field_e) {
                L74: {
                  ((fh) this).field_h = true;
                  if (!param3) {
                    break L74;
                  } else {
                    L75: {
                      if (((fh) this).field_m) {
                        break L75;
                      } else {
                        if (((fh) this).field_c) {
                          break L75;
                        } else {
                          break L74;
                        }
                      }
                    }
                    ((fh) this).field_k = true;
                    break L74;
                  }
                }
                if (param1 != 24) {
                  return;
                } else {
                  L76: {
                    if (!param2) {
                      break L76;
                    } else {
                      L77: {
                        if (((fh) this).field_n) {
                          break L77;
                        } else {
                          if (((fh) this).field_c) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      ((fh) this).field_j = true;
                      break L76;
                    }
                  }
                  L78: {
                    if (0 == ((fh) this).field_g.i(-77)) {
                      break L78;
                    } else {
                      if (((fh) this).field_a == 6) {
                        ((fh) this).field_o = 0;
                        break L78;
                      } else {
                        break L78;
                      }
                    }
                  }
                  return;
                }
              } else {
                L79: {
                  if (!param3) {
                    break L79;
                  } else {
                    if (((fh) this).field_m) {
                      ((fh) this).field_k = true;
                      break L79;
                    } else {
                      if (((fh) this).field_c) {
                        ((fh) this).field_k = true;
                        break L79;
                      } else {
                        break L79;
                      }
                    }
                  }
                }
                if (param1 != 24) {
                  return;
                } else {
                  L80: {
                    if (!param2) {
                      break L80;
                    } else {
                      if (((fh) this).field_n) {
                        ((fh) this).field_j = true;
                        break L80;
                      } else {
                        if (((fh) this).field_c) {
                          ((fh) this).field_j = true;
                          break L80;
                        } else {
                          break L80;
                        }
                      }
                    }
                  }
                  L81: {
                    if (0 == ((fh) this).field_g.i(-77)) {
                      break L81;
                    } else {
                      if (((fh) this).field_a == 6) {
                        ((fh) this).field_o = 0;
                        break L81;
                      } else {
                        break L81;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    public final int b(byte param0) {
        int var2 = -104 % ((param0 - -23) / 53);
        return ((fh) this).field_g.b((byte) -76) + ((fh) this).field_l;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          ((fh) this).field_m = true;
          return ((fh) this).field_g.c((byte) 126) - -((fh) this).field_f;
        } else {
          return ((fh) this).field_g.c((byte) 126) - -((fh) this).field_f;
        }
    }

    final void a(int param0) {
        int var2 = 0;
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
          var2 = ((fh) this).field_e ? 1 : 0;
          ((fh) this).field_e = ((fh) this).field_c;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
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
        ((fh) this).field_c = stackIn_3_1 != 0;
        if (param0 != 0) {
          int discarded$2 = ((fh) this).b((byte) -30);
          return;
        } else {
          return;
        }
    }

    public final int e(byte param0) {
        Object var3 = null;
        if (param0 >= -86) {
          var3 = null;
          fh.a(true, (java.awt.Canvas) null, -71);
          return ((fh) this).field_g.e((byte) -115);
        } else {
          return ((fh) this).field_g.e((byte) -115);
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((fh) this).a(-19);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (cga.field_f < 10) {
                L2: {
                  var3_int = 0;
                  if (bsa.field_k) {
                    bsa.field_k = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                int discarded$36 = 7;
                et.a((byte) 108, tn.a(-10918), bta.field_i, dla.a(), var3_int != 0);
                break L1;
              } else {
                int discarded$37 = 250;
                if (!qk.i()) {
                  bea.a();
                  int discarded$38 = 113;
                  int discarded$39 = 240;
                  int discarded$40 = 320;
                  gga.b();
                  fga.a(0, false, 0, param1);
                  break L1;
                } else {
                  if (0 != gda.field_c) {
                    dba.a(param1, (byte) 94);
                    break L1;
                  } else {
                    qja.a(false, param0, param2 ^ -128);
                    fga.a(0, false, 0, param1);
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param2 == 0) {
                break L3;
              } else {
                fh.b(107, 37);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("fh.E(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            ((fh) this).field_h = true;
            return ((fh) this).field_g.d((byte) 48);
        }
        return ((fh) this).field_g.d((byte) 48);
    }

    fh() {
        int fieldTemp$0 = ita.field_g;
        ita.field_g = ita.field_g + 1;
        ((fh) this).field_b = fieldTemp$0;
    }

    static {
    }
}
