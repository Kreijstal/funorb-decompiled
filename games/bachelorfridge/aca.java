/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aca extends kj {
    static int[] field_g;
    private int field_f;
    static int field_i;
    private boolean field_j;
    static int field_k;
    private eaa field_h;

    final boolean b(int param0) {
        Object var2 = null;
        bma var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        var2 = null;
        var4 = BachelorFridge.field_y;
        ((aca) this).field_f = ((aca) this).field_f - 1;
        if (((aca) this).field_f >= 0) {
          L0: {
            if (!((aca) this).field_j) {
              stackOut_18_0 = 3;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_17_0 = 7;
              stackIn_19_0 = stackOut_17_0;
              break L0;
            }
          }
          var2_int = stackIn_19_0;
          if ((((aca) this).field_f & var2_int) == 0) {
            this.c((byte) -100);
            var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
            if (param0 <= 21) {
              return false;
            } else {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_ref == null) {
                      break L3;
                    } else {
                      int fieldTemp$6 = var2_ref.field_r + 1;
                      var2_ref.field_r = var2_ref.field_r + 1;
                      var3 = 8191 & 8192 * fieldTemp$6 / var2_ref.field_s;
                      var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
                      var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
                      var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
                      boolean discarded$7 = var2_ref.b(true);
                      stackOut_37_0 = var2_ref.field_h;
                      stackIn_43_0 = stackOut_37_0;
                      stackIn_38_0 = stackOut_37_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_38_0 < 0) {
                            var2_ref.a(false);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_42_0 = ((aca) this).field_f;
                  stackIn_43_0 = stackOut_42_0;
                  break L2;
                }
                L5: {
                  L6: {
                    if (stackIn_43_0 >= 0) {
                      break L6;
                    } else {
                      if (!((aca) this).field_h.e(12917)) {
                        break L6;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L5;
                      }
                    }
                  }
                  stackOut_46_0 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  break L5;
                }
                return stackIn_47_0 != 0;
              }
            }
          } else {
            var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
            if (param0 > 21) {
              L7: while (true) {
                L8: {
                  L9: {
                    if (var2_ref == null) {
                      break L9;
                    } else {
                      int fieldTemp$8 = var2_ref.field_r + 1;
                      var2_ref.field_r = var2_ref.field_r + 1;
                      var3 = 8191 & 8192 * fieldTemp$8 / var2_ref.field_s;
                      var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
                      var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
                      var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
                      boolean discarded$9 = var2_ref.b(true);
                      stackOut_23_0 = var2_ref.field_h;
                      stackIn_29_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var4 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (stackIn_24_0 < 0) {
                            var2_ref.a(false);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                        if (var4 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = ((aca) this).field_f;
                  stackIn_29_0 = stackOut_28_0;
                  break L8;
                }
                L11: {
                  L12: {
                    if (stackIn_29_0 >= 0) {
                      break L12;
                    } else {
                      if (!((aca) this).field_h.e(12917)) {
                        break L12;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L11;
                      }
                    }
                  }
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L11;
                }
                return stackIn_33_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
          if (param0 > 21) {
            L13: while (true) {
              L14: {
                L15: {
                  if (var2_ref == null) {
                    break L15;
                  } else {
                    int fieldTemp$10 = var2_ref.field_r + 1;
                    var2_ref.field_r = var2_ref.field_r + 1;
                    var3 = 8191 & 8192 * fieldTemp$10 / var2_ref.field_s;
                    var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
                    var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
                    var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
                    boolean discarded$11 = var2_ref.b(true);
                    stackOut_4_0 = var2_ref.field_h;
                    stackIn_10_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var4 != 0) {
                      break L14;
                    } else {
                      L16: {
                        if (stackIn_5_0 < 0) {
                          var2_ref.a(false);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                      if (var4 == 0) {
                        continue L13;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                stackOut_9_0 = ((aca) this).field_f;
                stackIn_10_0 = stackOut_9_0;
                break L14;
              }
              L17: {
                L18: {
                  if (stackIn_10_0 >= 0) {
                    break L18;
                  } else {
                    if (!((aca) this).field_h.e(12917)) {
                      break L18;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L17;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L17;
              }
              return stackIn_14_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    private final void c(byte param0) {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        int var4 = var3 + var2;
        int var5 = var2 - var3;
        int var6 = !((aca) this).field_j ? 200 : 60;
        bma var7 = new bma(var4, var6 << 4, var5, kla.a(mla.field_b.length, sma.field_I, -2147483648), 50 + kla.a(50, sma.field_I, -2147483648));
        ((aca) this).field_h.a((bw) (Object) var7, true);
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 <= 0) {
          L0: {
            L1: {
              if (param0 < 160) {
                L2: {
                  if (param0 == 8364) {
                    break L2;
                  } else {
                    L3: {
                      if (8218 != param0) {
                        break L3;
                      } else {
                        var2 = -126;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (param0 == 402) {
                        break L4;
                      } else {
                        L5: {
                          if (param0 == 8222) {
                            break L5;
                          } else {
                            L6: {
                              if (param0 == 8230) {
                                break L6;
                              } else {
                                L7: {
                                  if (param0 == 8224) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (param0 == 8225) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (param0 != 710) {
                                            break L9;
                                          } else {
                                            var2 = -120;
                                            if (var3 == 0) {
                                              break L0;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        L10: {
                                          if (param0 == 8240) {
                                            break L10;
                                          } else {
                                            L11: {
                                              if (param0 == 352) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  if (param0 != 8249) {
                                                    break L12;
                                                  } else {
                                                    var2 = -117;
                                                    if (var3 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                L13: {
                                                  if (338 == param0) {
                                                    break L13;
                                                  } else {
                                                    L14: {
                                                      if (param0 == 381) {
                                                        break L14;
                                                      } else {
                                                        L15: {
                                                          if (param0 == 8216) {
                                                            break L15;
                                                          } else {
                                                            L16: {
                                                              if (8217 != param0) {
                                                                break L16;
                                                              } else {
                                                                var2 = -110;
                                                                if (var3 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            L17: {
                                                              if (8220 == param0) {
                                                                break L17;
                                                              } else {
                                                                L18: {
                                                                  if (param0 != 8221) {
                                                                    break L18;
                                                                  } else {
                                                                    var2 = -108;
                                                                    if (var3 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L18;
                                                                    }
                                                                  }
                                                                }
                                                                L19: {
                                                                  if (param0 != 8226) {
                                                                    break L19;
                                                                  } else {
                                                                    var2 = -107;
                                                                    if (var3 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L19;
                                                                    }
                                                                  }
                                                                }
                                                                L20: {
                                                                  if (param0 == 8211) {
                                                                    break L20;
                                                                  } else {
                                                                    L21: {
                                                                      if (8212 != param0) {
                                                                        break L21;
                                                                      } else {
                                                                        var2 = -105;
                                                                        if (var3 == 0) {
                                                                          break L0;
                                                                        } else {
                                                                          break L21;
                                                                        }
                                                                      }
                                                                    }
                                                                    L22: {
                                                                      if (param0 == 732) {
                                                                        break L22;
                                                                      } else {
                                                                        L23: {
                                                                          if (param0 == 8482) {
                                                                            break L23;
                                                                          } else {
                                                                            L24: {
                                                                              if (param0 != 353) {
                                                                                break L24;
                                                                              } else {
                                                                                var2 = -102;
                                                                                if (var3 == 0) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L24;
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (param0 != 8250) {
                                                                                break L25;
                                                                              } else {
                                                                                var2 = -101;
                                                                                if (var3 == 0) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L25;
                                                                                }
                                                                              }
                                                                            }
                                                                            L26: {
                                                                              if (339 != param0) {
                                                                                break L26;
                                                                              } else {
                                                                                var2 = -100;
                                                                                if (var3 == 0) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L26;
                                                                                }
                                                                              }
                                                                            }
                                                                            L27: {
                                                                              if (param0 != 382) {
                                                                                break L27;
                                                                              } else {
                                                                                var2 = -98;
                                                                                if (var3 == 0) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L27;
                                                                                }
                                                                              }
                                                                            }
                                                                            L28: {
                                                                              if (376 != param0) {
                                                                                break L28;
                                                                              } else {
                                                                                var2 = -97;
                                                                                if (var3 == 0) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L28;
                                                                                }
                                                                              }
                                                                            }
                                                                            var2 = 63;
                                                                            if (var3 == 0) {
                                                                              break L0;
                                                                            } else {
                                                                              break L23;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2 = -103;
                                                                        if (var3 == 0) {
                                                                          break L0;
                                                                        } else {
                                                                          break L22;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -104;
                                                                    if (var3 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L20;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -106;
                                                                if (var3 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L17;
                                                                }
                                                              }
                                                            }
                                                            var2 = -109;
                                                            if (var3 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L15;
                                                            }
                                                          }
                                                        }
                                                        var2 = -111;
                                                        if (var3 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    var2 = -114;
                                                    if (var3 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                                var2 = -116;
                                                if (var3 == 0) {
                                                  break L0;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            var2 = -118;
                                            if (var3 == 0) {
                                              break L0;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var2 = -119;
                                        if (var3 == 0) {
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var2 = -121;
                                    if (var3 == 0) {
                                      break L0;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var2 = -122;
                                if (var3 == 0) {
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var2 = -123;
                            if (var3 == 0) {
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var2 = -124;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = -125;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = -128;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                if (param0 <= 255) {
                  break L1;
                } else {
                  L29: {
                    L30: {
                      if (param0 == 8364) {
                        break L30;
                      } else {
                        L31: {
                          if (8218 != param0) {
                            break L31;
                          } else {
                            var2 = -126;
                            if (var3 == 0) {
                              break L29;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if (param0 == 402) {
                            break L32;
                          } else {
                            L33: {
                              if (param0 == 8222) {
                                break L33;
                              } else {
                                L34: {
                                  if (param0 == 8230) {
                                    break L34;
                                  } else {
                                    L35: {
                                      if (param0 == 8224) {
                                        break L35;
                                      } else {
                                        L36: {
                                          if (param0 == 8225) {
                                            break L36;
                                          } else {
                                            L37: {
                                              if (param0 != 710) {
                                                break L37;
                                              } else {
                                                var2 = -120;
                                                if (var3 == 0) {
                                                  break L29;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                            }
                                            L38: {
                                              if (param0 == 8240) {
                                                break L38;
                                              } else {
                                                L39: {
                                                  if (param0 == 352) {
                                                    break L39;
                                                  } else {
                                                    L40: {
                                                      if (param0 != 8249) {
                                                        break L40;
                                                      } else {
                                                        var2 = -117;
                                                        if (var3 == 0) {
                                                          break L29;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    L41: {
                                                      if (338 == param0) {
                                                        break L41;
                                                      } else {
                                                        L42: {
                                                          if (param0 == 381) {
                                                            break L42;
                                                          } else {
                                                            L43: {
                                                              if (param0 == 8216) {
                                                                break L43;
                                                              } else {
                                                                L44: {
                                                                  if (8217 != param0) {
                                                                    break L44;
                                                                  } else {
                                                                    var2 = -110;
                                                                    if (var3 == 0) {
                                                                      break L29;
                                                                    } else {
                                                                      break L44;
                                                                    }
                                                                  }
                                                                }
                                                                L45: {
                                                                  if (8220 == param0) {
                                                                    break L45;
                                                                  } else {
                                                                    L46: {
                                                                      if (param0 != 8221) {
                                                                        break L46;
                                                                      } else {
                                                                        var2 = -108;
                                                                        if (var3 == 0) {
                                                                          break L29;
                                                                        } else {
                                                                          break L46;
                                                                        }
                                                                      }
                                                                    }
                                                                    L47: {
                                                                      if (param0 != 8226) {
                                                                        break L47;
                                                                      } else {
                                                                        var2 = -107;
                                                                        if (var3 == 0) {
                                                                          break L29;
                                                                        } else {
                                                                          break L47;
                                                                        }
                                                                      }
                                                                    }
                                                                    L48: {
                                                                      if (param0 == 8211) {
                                                                        break L48;
                                                                      } else {
                                                                        L49: {
                                                                          if (8212 != param0) {
                                                                            break L49;
                                                                          } else {
                                                                            var2 = -105;
                                                                            if (var3 == 0) {
                                                                              break L29;
                                                                            } else {
                                                                              break L49;
                                                                            }
                                                                          }
                                                                        }
                                                                        L50: {
                                                                          if (param0 == 732) {
                                                                            break L50;
                                                                          } else {
                                                                            L51: {
                                                                              if (param0 == 8482) {
                                                                                break L51;
                                                                              } else {
                                                                                L52: {
                                                                                  if (param0 != 353) {
                                                                                    break L52;
                                                                                  } else {
                                                                                    var2 = -102;
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      break L52;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L53: {
                                                                                  if (param0 != 8250) {
                                                                                    break L53;
                                                                                  } else {
                                                                                    var2 = -101;
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      break L53;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L54: {
                                                                                  if (339 != param0) {
                                                                                    break L54;
                                                                                  } else {
                                                                                    var2 = -100;
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      break L54;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L55: {
                                                                                  if (param0 != 382) {
                                                                                    break L55;
                                                                                  } else {
                                                                                    var2 = -98;
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      break L55;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L56: {
                                                                                  if (376 != param0) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var2 = -97;
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      break L56;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var2 = 63;
                                                                                if (var3 == 0) {
                                                                                  break L29;
                                                                                } else {
                                                                                  break L51;
                                                                                }
                                                                              }
                                                                            }
                                                                            var2 = -103;
                                                                            if (var3 == 0) {
                                                                              break L29;
                                                                            } else {
                                                                              break L50;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2 = -104;
                                                                        if (var3 == 0) {
                                                                          break L29;
                                                                        } else {
                                                                          break L48;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -106;
                                                                    if (var3 == 0) {
                                                                      break L29;
                                                                    } else {
                                                                      break L45;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -109;
                                                                if (var3 == 0) {
                                                                  break L29;
                                                                } else {
                                                                  break L43;
                                                                }
                                                              }
                                                            }
                                                            var2 = -111;
                                                            if (var3 == 0) {
                                                              break L29;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                        }
                                                        var2 = -114;
                                                        if (var3 == 0) {
                                                          break L29;
                                                        } else {
                                                          break L41;
                                                        }
                                                      }
                                                    }
                                                    var2 = -116;
                                                    if (var3 == 0) {
                                                      break L29;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                }
                                                var2 = -118;
                                                if (var3 == 0) {
                                                  break L29;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            var2 = -119;
                                            if (var3 == 0) {
                                              break L29;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                        var2 = -121;
                                        if (var3 == 0) {
                                          break L29;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var2 = -122;
                                    if (var3 == 0) {
                                      break L29;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var2 = -123;
                                if (var3 == 0) {
                                  break L29;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var2 = -124;
                            if (var3 == 0) {
                              break L29;
                            } else {
                              break L32;
                            }
                          }
                        }
                        var2 = -125;
                        if (var3 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var2 = -128;
                    if (var3 == 0) {
                      break L29;
                    } else {
                      var2 = (byte)param0;
                      break L29;
                    }
                  }
                  if (param1 != 8220) {
                    byte discarded$4 = aca.a('ﾵ', 108);
                    return (byte) var2;
                  } else {
                    return (byte) var2;
                  }
                }
              }
            }
            var2 = (byte)param0;
            break L0;
          }
          if (param1 != 8220) {
            byte discarded$5 = aca.a('ﾵ', 108);
            return (byte) var2;
          } else {
            return (byte) var2;
          }
        } else {
          if (param0 >= 128) {
            L57: {
              L58: {
                L59: {
                  if (param0 < 160) {
                    break L59;
                  } else {
                    if (param0 <= 255) {
                      break L58;
                    } else {
                      break L59;
                    }
                  }
                }
                L60: {
                  if (param0 == 8364) {
                    break L60;
                  } else {
                    L61: {
                      if (8218 != param0) {
                        break L61;
                      } else {
                        var2 = -126;
                        if (var3 == 0) {
                          break L57;
                        } else {
                          break L61;
                        }
                      }
                    }
                    L62: {
                      if (param0 == 402) {
                        break L62;
                      } else {
                        L63: {
                          if (param0 == 8222) {
                            break L63;
                          } else {
                            L64: {
                              if (param0 == 8230) {
                                break L64;
                              } else {
                                L65: {
                                  if (param0 == 8224) {
                                    break L65;
                                  } else {
                                    L66: {
                                      if (param0 == 8225) {
                                        break L66;
                                      } else {
                                        L67: {
                                          if (param0 != 710) {
                                            break L67;
                                          } else {
                                            var2 = -120;
                                            if (var3 == 0) {
                                              break L57;
                                            } else {
                                              break L67;
                                            }
                                          }
                                        }
                                        L68: {
                                          if (param0 == 8240) {
                                            break L68;
                                          } else {
                                            L69: {
                                              if (param0 == 352) {
                                                break L69;
                                              } else {
                                                L70: {
                                                  if (param0 != 8249) {
                                                    break L70;
                                                  } else {
                                                    var2 = -117;
                                                    if (var3 == 0) {
                                                      break L57;
                                                    } else {
                                                      break L70;
                                                    }
                                                  }
                                                }
                                                L71: {
                                                  if (338 == param0) {
                                                    break L71;
                                                  } else {
                                                    L72: {
                                                      if (param0 == 381) {
                                                        break L72;
                                                      } else {
                                                        L73: {
                                                          if (param0 == 8216) {
                                                            break L73;
                                                          } else {
                                                            L74: {
                                                              if (8217 != param0) {
                                                                break L74;
                                                              } else {
                                                                var2 = -110;
                                                                if (var3 == 0) {
                                                                  break L57;
                                                                } else {
                                                                  break L74;
                                                                }
                                                              }
                                                            }
                                                            L75: {
                                                              if (8220 == param0) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (param0 != 8221) {
                                                                    break L76;
                                                                  } else {
                                                                    var2 = -108;
                                                                    if (var3 == 0) {
                                                                      break L57;
                                                                    } else {
                                                                      break L76;
                                                                    }
                                                                  }
                                                                }
                                                                L77: {
                                                                  if (param0 != 8226) {
                                                                    break L77;
                                                                  } else {
                                                                    var2 = -107;
                                                                    if (var3 == 0) {
                                                                      break L57;
                                                                    } else {
                                                                      break L77;
                                                                    }
                                                                  }
                                                                }
                                                                L78: {
                                                                  if (param0 == 8211) {
                                                                    break L78;
                                                                  } else {
                                                                    L79: {
                                                                      if (8212 != param0) {
                                                                        break L79;
                                                                      } else {
                                                                        var2 = -105;
                                                                        if (var3 == 0) {
                                                                          break L57;
                                                                        } else {
                                                                          break L79;
                                                                        }
                                                                      }
                                                                    }
                                                                    L80: {
                                                                      if (param0 == 732) {
                                                                        break L80;
                                                                      } else {
                                                                        L81: {
                                                                          if (param0 == 8482) {
                                                                            break L81;
                                                                          } else {
                                                                            L82: {
                                                                              if (param0 != 353) {
                                                                                break L82;
                                                                              } else {
                                                                                var2 = -102;
                                                                                if (var3 == 0) {
                                                                                  break L57;
                                                                                } else {
                                                                                  break L82;
                                                                                }
                                                                              }
                                                                            }
                                                                            L83: {
                                                                              if (param0 != 8250) {
                                                                                break L83;
                                                                              } else {
                                                                                var2 = -101;
                                                                                if (var3 == 0) {
                                                                                  break L57;
                                                                                } else {
                                                                                  break L83;
                                                                                }
                                                                              }
                                                                            }
                                                                            L84: {
                                                                              if (339 != param0) {
                                                                                break L84;
                                                                              } else {
                                                                                var2 = -100;
                                                                                if (var3 == 0) {
                                                                                  break L57;
                                                                                } else {
                                                                                  break L84;
                                                                                }
                                                                              }
                                                                            }
                                                                            L85: {
                                                                              if (param0 != 382) {
                                                                                break L85;
                                                                              } else {
                                                                                var2 = -98;
                                                                                if (var3 == 0) {
                                                                                  break L57;
                                                                                } else {
                                                                                  break L85;
                                                                                }
                                                                              }
                                                                            }
                                                                            L86: {
                                                                              if (376 != param0) {
                                                                                break L86;
                                                                              } else {
                                                                                var2 = -97;
                                                                                if (var3 == 0) {
                                                                                  break L57;
                                                                                } else {
                                                                                  break L86;
                                                                                }
                                                                              }
                                                                            }
                                                                            var2 = 63;
                                                                            if (var3 == 0) {
                                                                              break L57;
                                                                            } else {
                                                                              break L81;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2 = -103;
                                                                        if (var3 == 0) {
                                                                          break L57;
                                                                        } else {
                                                                          break L80;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -104;
                                                                    if (var3 == 0) {
                                                                      break L57;
                                                                    } else {
                                                                      break L78;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -106;
                                                                if (var3 == 0) {
                                                                  break L57;
                                                                } else {
                                                                  break L75;
                                                                }
                                                              }
                                                            }
                                                            var2 = -109;
                                                            if (var3 == 0) {
                                                              break L57;
                                                            } else {
                                                              break L73;
                                                            }
                                                          }
                                                        }
                                                        var2 = -111;
                                                        if (var3 == 0) {
                                                          break L57;
                                                        } else {
                                                          break L72;
                                                        }
                                                      }
                                                    }
                                                    var2 = -114;
                                                    if (var3 == 0) {
                                                      break L57;
                                                    } else {
                                                      break L71;
                                                    }
                                                  }
                                                }
                                                var2 = -116;
                                                if (var3 == 0) {
                                                  break L57;
                                                } else {
                                                  break L69;
                                                }
                                              }
                                            }
                                            var2 = -118;
                                            if (var3 == 0) {
                                              break L57;
                                            } else {
                                              break L68;
                                            }
                                          }
                                        }
                                        var2 = -119;
                                        if (var3 == 0) {
                                          break L57;
                                        } else {
                                          break L66;
                                        }
                                      }
                                    }
                                    var2 = -121;
                                    if (var3 == 0) {
                                      break L57;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                                var2 = -122;
                                if (var3 == 0) {
                                  break L57;
                                } else {
                                  break L64;
                                }
                              }
                            }
                            var2 = -123;
                            if (var3 == 0) {
                              break L57;
                            } else {
                              break L63;
                            }
                          }
                        }
                        var2 = -124;
                        if (var3 == 0) {
                          break L57;
                        } else {
                          break L62;
                        }
                      }
                    }
                    var2 = -125;
                    if (var3 == 0) {
                      break L57;
                    } else {
                      break L60;
                    }
                  }
                }
                var2 = -128;
                if (var3 == 0) {
                  break L57;
                } else {
                  break L58;
                }
              }
              var2 = (byte)param0;
              break L57;
            }
            if (param1 == 8220) {
              return (byte) var2;
            } else {
              byte discarded$6 = aca.a('ﾵ', 108);
              return (byte) var2;
            }
          } else {
            var2 = (byte)param0;
            if (param1 != 8220) {
              byte discarded$7 = aca.a('ﾵ', 108);
              return (byte) var2;
            } else {
              return (byte) var2;
            }
          }
        }
    }

    aca(gj param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((aca) this).field_h = new eaa();
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((aca) this).field_j = stackIn_4_1 != 0;
                if (!((aca) this).field_j) {
                  break L3;
                } else {
                  ((aca) this).field_f = 30;
                  if (BachelorFridge.field_y == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((aca) this).field_f = 100;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("aca.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        bma var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var4 = (bma) (Object) ((aca) this).field_h.b((byte) 90);
        if (param1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = (var4.field_i >> 4) + param2;
              var6 = (var4.field_q >> 4) + param0 - (var4.field_h >> 4);
              mla.field_b[var4.field_v].e(var5, var6);
              var4 = (bma) (Object) ((aca) this).field_h.c(0);
              if (var7 == 0) {
                continue L0;
              } else {
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

    final void a(int param0, int param1, int param2) {
        if (param1 == 0) {
            return;
        }
        ((aca) this).field_f = 8;
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 <= -110) {
            return;
        }
        field_k = -103;
    }

    final static void a(byte param0, int param1) {
        int discarded$5 = fda.b(param0 ^ -117);
        if (param0 == -118) {
            return;
        }
        byte discarded$6 = aca.a('q', -54);
    }

    final static hs a(byte param0, int param1, int param2) {
        byte[] var4_array = null;
        if (bca.field_n[param1][param2] == null) {
        }
        if (!(11 != param2)) {
            param1 = 0;
        }
        if (param0 != -100) {
            field_i = -82;
        }
        if (!(param2 != 10)) {
            param1 = 11;
        }
        hs var3 = bca.field_n[param1][param2].a(0);
        if (var3 == null) {
            Object var4 = null;
            try {
                var4_array = bk.field_v.a((byte) 123, hk.field_h[param2], fl.field_o[param1]);
            } catch (IllegalArgumentException illegalArgumentException) {
            }
            var3 = oo.a(param2, (byte) -77, var4_array, param1);
            bca.field_n[param1][param2] = new al(var3);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_g = new int[12];
        field_k = -1;
    }
}
