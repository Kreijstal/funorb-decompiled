/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends sna {
    private StringBuilder field_Ab;
    static int field_vb;
    private sna field_xb;
    static String field_wb;
    private int field_zb;
    private sna field_yb;
    static kv field_Bb;

    oa(int param0, int param1, int param2, int param3, String param4, sna param5, sna param6, sna param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_zb = 0;
        try {
          L0: {
            this.field_xb = new sna(0L, param6, param4);
            this.a(-1, this.field_xb);
            this.field_yb = new sna(0L, param7);
            this.field_yb.field_gb = 16764006;
            this.a(-1, this.field_yb);
            this.field_yb.field_pb = "|";
            this.field_Ab = new StringBuilder(12);
            var9_int = this.field_xb.e(-1);
            this.field_xb.a(rg.field_h, 31407, var9_int, 5, 3);
            this.field_yb.a(rg.field_h, 31407, var9_int, 5, 3 + rg.field_h);
            var10 = 5 - -var9_int - -5;
            var11 = 6 - -(rg.field_h * 2);
            var12 = oi.a(param2, var10, param0, -21264);
            var13 = nga.a(var11, param1, (byte) 99, param3);
            this.a(var11, 31407, var10, var12, var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var9);

            stackIn_5_1 = new StringBuilder().append("oa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        var3 = -46 / ((param1 - 30) / 32);
        this.a(19842, param0);
        if (!param0) {
          this.field_yb.field_Z = this.field_Ab.toString();
          if (param0) {
            if (lf.field_c != 0) {
              if (this.field_R == 0) {
                this.field_zb = 1;
                return this.field_zb;
              } else {
                return this.field_zb;
              }
            } else {
              return this.field_zb;
            }
          } else {
            return this.field_zb;
          }
        } else {
          L0: while (true) {
            if (kaa.b(127)) {
              L1: {
                if (gf.field_k != 85) {
                  break L1;
                } else {
                  if (this.field_Ab.length() > 0) {
                    sw.a(this.field_Ab, 4, this.field_Ab.length() - 1, ' ');
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (ok.a((CharSequence) ((Object) this.field_Ab), dla.field_j, (byte) -19)) {
                  discarded$0 = this.field_Ab.append(dla.field_j);
                  break L2;
                } else {
                  L3: {
                    if (this.field_Ab.length() != 0) {
                      break L3;
                    } else {
                      if (dla.field_j == 91) {
                        discarded$1 = this.field_Ab.append(dla.field_j);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (this.field_Ab.length() != 1) {
                      break L4;
                    } else {
                      if (dla.field_j == 35) {
                        discarded$2 = this.field_Ab.append(dla.field_j);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (dla.field_j != 93) {
                    break L2;
                  } else {
                    discarded$3 = this.field_Ab.append(dla.field_j);
                    break L2;
                  }
                }
              }
              if (84 == gf.field_k) {
                if ((this.field_Ab.length() ^ -1) >= -1) {
                  return 1;
                } else {
                  this.field_Z = this.field_Ab.toString();
                  return 2;
                }
              } else {
                if (gf.field_k != 13) {
                  continue L0;
                } else {
                  return 1;
                }
              }
            } else {
              this.field_yb.field_Z = this.field_Ab.toString();
              if (param0) {
                if (lf.field_c != 0) {
                  if (this.field_R != 0) {
                    return this.field_zb;
                  } else {
                    this.field_zb = 1;
                    return this.field_zb;
                  }
                } else {
                  return this.field_zb;
                }
              } else {
                return this.field_zb;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_Bb = null;
        field_wb = null;
        if (param0 <= 107) {
            field_Bb = (kv) null;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9, boolean param10, int param11, boolean param12, boolean param13) {
        jja.field_m = null;
        er.e(9941);
        param1 = ot.a(param8, param11, param1, param3, param2, param6, (byte) 92);
        lr.a(param7, param5, param0, param9, param2, 1, param4, param13, param10, param1);
        bf.a(param5, param10, (byte) -88);
        rh.a(param5, 67, param1, param8);
        if (param12) {
          field_Bb = (kv) null;
          return;
        } else {
          return;
        }
    }

    final boolean b(boolean param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        int var2;
        if (-1 != (this.field_zb ^ -1)) {
          return false;
        } else {
          if (!param0) {
            this.b(true, -4);
            if (85 == gf.field_k) {
              L0: {
                if (-1 <= (this.field_Ab.length() ^ -1)) {
                  break L0;
                } else {
                  sw.a(this.field_Ab, 4, this.field_Ab.length() - 1, ' ');
                  break L0;
                }
              }
              if (this.field_Ab.length() < 12) {
                L1: {
                  var2 = Character.toLowerCase(dla.field_j);
                  if (var2 == 32) {
                    var2 = 95;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (var2 == 95) {
                  if (0 < this.field_Ab.length()) {
                    L2: {
                      discarded$0 = this.field_Ab.append((char) var2);
                      if (ml.a(-130697146, (char) var2)) {
                        discarded$1 = this.field_Ab.append((char) var2);
                        break L2;
                      } else {
                        if (!ula.a((char) var2, 48)) {
                          break L2;
                        } else {
                          discarded$2 = this.field_Ab.append((char) var2);
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if ((gf.field_k ^ -1) != -85) {
                        break L3;
                      } else {
                        if ((this.field_Ab.length() ^ -1) < -1) {
                          this.field_Z = this.field_Ab.toString();
                          this.field_zb = 2;
                          break L3;
                        } else {
                          this.field_zb = 1;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (13 != gf.field_k) {
                        break L4;
                      } else {
                        this.field_zb = 1;
                        break L4;
                      }
                    }
                    return true;
                  } else {
                    if (ml.a(-130697146, (char) var2)) {
                      L5: {
                        discarded$3 = this.field_Ab.append((char) var2);
                        if ((gf.field_k ^ -1) != -85) {
                          break L5;
                        } else {
                          if ((this.field_Ab.length() ^ -1) < -1) {
                            this.field_Z = this.field_Ab.toString();
                            this.field_zb = 2;
                            break L5;
                          } else {
                            this.field_zb = 1;
                            break L5;
                          }
                        }
                      }
                      if (13 != gf.field_k) {
                        return true;
                      } else {
                        this.field_zb = 1;
                        return true;
                      }
                    } else {
                      if (!ula.a((char) var2, 48)) {
                        if ((gf.field_k ^ -1) != -85) {
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            this.field_zb = 1;
                            return true;
                          }
                        } else {
                          if ((this.field_Ab.length() ^ -1) < -1) {
                            this.field_Z = this.field_Ab.toString();
                            this.field_zb = 2;
                            if (13 != gf.field_k) {
                              return true;
                            } else {
                              this.field_zb = 1;
                              return true;
                            }
                          } else {
                            this.field_zb = 1;
                            if (13 != gf.field_k) {
                              return true;
                            } else {
                              this.field_zb = 1;
                              return true;
                            }
                          }
                        }
                      } else {
                        discarded$4 = this.field_Ab.append((char) var2);
                        if ((gf.field_k ^ -1) != -85) {
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            this.field_zb = 1;
                            return true;
                          }
                        } else {
                          if ((this.field_Ab.length() ^ -1) < -1) {
                            L6: {
                              this.field_Z = this.field_Ab.toString();
                              this.field_zb = 2;
                              if (13 != gf.field_k) {
                                break L6;
                              } else {
                                this.field_zb = 1;
                                break L6;
                              }
                            }
                            return true;
                          } else {
                            L7: {
                              this.field_zb = 1;
                              if (13 != gf.field_k) {
                                break L7;
                              } else {
                                this.field_zb = 1;
                                break L7;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (ml.a(-130697146, (char) var2)) {
                    L8: {
                      discarded$5 = this.field_Ab.append((char) var2);
                      if ((gf.field_k ^ -1) != -85) {
                        break L8;
                      } else {
                        if ((this.field_Ab.length() ^ -1) < -1) {
                          this.field_Z = this.field_Ab.toString();
                          this.field_zb = 2;
                          break L8;
                        } else {
                          this.field_zb = 1;
                          break L8;
                        }
                      }
                    }
                    if (13 == gf.field_k) {
                      this.field_zb = 1;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (!ula.a((char) var2, 48)) {
                      if ((gf.field_k ^ -1) != -85) {
                        if (13 != gf.field_k) {
                          return true;
                        } else {
                          this.field_zb = 1;
                          return true;
                        }
                      } else {
                        if ((this.field_Ab.length() ^ -1) < -1) {
                          this.field_Z = this.field_Ab.toString();
                          this.field_zb = 2;
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            this.field_zb = 1;
                            return true;
                          }
                        } else {
                          this.field_zb = 1;
                          if (13 != gf.field_k) {
                            return true;
                          } else {
                            this.field_zb = 1;
                            return true;
                          }
                        }
                      }
                    } else {
                      discarded$6 = this.field_Ab.append((char) var2);
                      if ((gf.field_k ^ -1) != -85) {
                        if (13 == gf.field_k) {
                          this.field_zb = 1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        if ((this.field_Ab.length() ^ -1) >= -1) {
                          L9: {
                            this.field_zb = 1;
                            if (13 != gf.field_k) {
                              break L9;
                            } else {
                              this.field_zb = 1;
                              break L9;
                            }
                          }
                          return true;
                        } else {
                          L10: {
                            this.field_Z = this.field_Ab.toString();
                            this.field_zb = 2;
                            if (13 != gf.field_k) {
                              break L10;
                            } else {
                              this.field_zb = 1;
                              break L10;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                }
              } else {
                if ((gf.field_k ^ -1) != -85) {
                  if (13 != gf.field_k) {
                    return true;
                  } else {
                    this.field_zb = 1;
                    return true;
                  }
                } else {
                  if ((this.field_Ab.length() ^ -1) < -1) {
                    this.field_Z = this.field_Ab.toString();
                    this.field_zb = 2;
                    if (13 != gf.field_k) {
                      return true;
                    } else {
                      this.field_zb = 1;
                      return true;
                    }
                  } else {
                    this.field_zb = 1;
                    if (13 != gf.field_k) {
                      return true;
                    } else {
                      this.field_zb = 1;
                      return true;
                    }
                  }
                }
              }
            } else {
              L11: {
                if (this.field_Ab.length() < 12) {
                  L12: {
                    var2 = Character.toLowerCase(dla.field_j);
                    if (var2 == 32) {
                      var2 = 95;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var2 != 95) {
                      break L13;
                    } else {
                      if (0 >= this.field_Ab.length()) {
                        break L13;
                      } else {
                        L14: {
                          discarded$7 = this.field_Ab.append((char) var2);
                          if (ml.a(-130697146, (char) var2)) {
                            discarded$8 = this.field_Ab.append((char) var2);
                            break L14;
                          } else {
                            if (!ula.a((char) var2, 48)) {
                              break L14;
                            } else {
                              discarded$9 = this.field_Ab.append((char) var2);
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if ((gf.field_k ^ -1) != -85) {
                            break L15;
                          } else {
                            if ((this.field_Ab.length() ^ -1) < -1) {
                              this.field_Z = this.field_Ab.toString();
                              this.field_zb = 2;
                              break L15;
                            } else {
                              this.field_zb = 1;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (13 != gf.field_k) {
                            break L16;
                          } else {
                            this.field_zb = 1;
                            break L16;
                          }
                        }
                        return true;
                      }
                    }
                  }
                  if (ml.a(-130697146, (char) var2)) {
                    L17: {
                      discarded$10 = this.field_Ab.append((char) var2);
                      if ((gf.field_k ^ -1) != -85) {
                        break L17;
                      } else {
                        if ((this.field_Ab.length() ^ -1) < -1) {
                          this.field_Z = this.field_Ab.toString();
                          this.field_zb = 2;
                          break L17;
                        } else {
                          this.field_zb = 1;
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (13 != gf.field_k) {
                        break L18;
                      } else {
                        this.field_zb = 1;
                        break L18;
                      }
                    }
                    return true;
                  } else {
                    if (!ula.a((char) var2, 48)) {
                      break L11;
                    } else {
                      L19: {
                        discarded$11 = this.field_Ab.append((char) var2);
                        if ((gf.field_k ^ -1) != -85) {
                          break L19;
                        } else {
                          if ((this.field_Ab.length() ^ -1) < -1) {
                            this.field_Z = this.field_Ab.toString();
                            this.field_zb = 2;
                            break L19;
                          } else {
                            this.field_zb = 1;
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (13 != gf.field_k) {
                          break L20;
                        } else {
                          this.field_zb = 1;
                          break L20;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  break L11;
                }
              }
              if ((gf.field_k ^ -1) != -85) {
                if (13 == gf.field_k) {
                  this.field_zb = 1;
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((this.field_Ab.length() ^ -1) >= -1) {
                  L21: {
                    this.field_zb = 1;
                    if (13 != gf.field_k) {
                      break L21;
                    } else {
                      this.field_zb = 1;
                      break L21;
                    }
                  }
                  return true;
                } else {
                  L22: {
                    this.field_Z = this.field_Ab.toString();
                    this.field_zb = 2;
                    if (13 != gf.field_k) {
                      break L22;
                    } else {
                      this.field_zb = 1;
                      break L22;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L23: {
              if (85 != gf.field_k) {
                break L23;
              } else {
                if (-1 <= (this.field_Ab.length() ^ -1)) {
                  break L23;
                } else {
                  sw.a(this.field_Ab, 4, this.field_Ab.length() - 1, ' ');
                  break L23;
                }
              }
            }
            L24: {
              if (this.field_Ab.length() < 12) {
                L25: {
                  var2 = Character.toLowerCase(dla.field_j);
                  if (var2 == 32) {
                    var2 = 95;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var2 != 95) {
                    break L26;
                  } else {
                    if (0 >= this.field_Ab.length()) {
                      break L26;
                    } else {
                      L27: {
                        discarded$12 = this.field_Ab.append((char) var2);
                        if (ml.a(-130697146, (char) var2)) {
                          discarded$13 = this.field_Ab.append((char) var2);
                          break L27;
                        } else {
                          if (!ula.a((char) var2, 48)) {
                            break L27;
                          } else {
                            discarded$14 = this.field_Ab.append((char) var2);
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if ((gf.field_k ^ -1) != -85) {
                          break L28;
                        } else {
                          if ((this.field_Ab.length() ^ -1) < -1) {
                            this.field_Z = this.field_Ab.toString();
                            this.field_zb = 2;
                            break L28;
                          } else {
                            this.field_zb = 1;
                            break L28;
                          }
                        }
                      }
                      if (13 == gf.field_k) {
                        this.field_zb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                if (ml.a(-130697146, (char) var2)) {
                  L29: {
                    discarded$15 = this.field_Ab.append((char) var2);
                    if ((gf.field_k ^ -1) != -85) {
                      break L29;
                    } else {
                      if ((this.field_Ab.length() ^ -1) < -1) {
                        this.field_Z = this.field_Ab.toString();
                        this.field_zb = 2;
                        break L29;
                      } else {
                        this.field_zb = 1;
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (13 != gf.field_k) {
                      break L30;
                    } else {
                      this.field_zb = 1;
                      break L30;
                    }
                  }
                  return true;
                } else {
                  if (!ula.a((char) var2, 48)) {
                    break L24;
                  } else {
                    L31: {
                      discarded$16 = this.field_Ab.append((char) var2);
                      if ((gf.field_k ^ -1) != -85) {
                        break L31;
                      } else {
                        if ((this.field_Ab.length() ^ -1) < -1) {
                          this.field_Z = this.field_Ab.toString();
                          this.field_zb = 2;
                          break L31;
                        } else {
                          this.field_zb = 1;
                          break L31;
                        }
                      }
                    }
                    L32: {
                      if (13 != gf.field_k) {
                        break L32;
                      } else {
                        this.field_zb = 1;
                        break L32;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L24;
              }
            }
            if ((gf.field_k ^ -1) != -85) {
              if (13 == gf.field_k) {
                this.field_zb = 1;
                return true;
              } else {
                return true;
              }
            } else {
              if ((this.field_Ab.length() ^ -1) >= -1) {
                L33: {
                  this.field_zb = 1;
                  if (13 != gf.field_k) {
                    break L33;
                  } else {
                    this.field_zb = 1;
                    break L33;
                  }
                }
                return true;
              } else {
                L34: {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                  if (13 != gf.field_k) {
                    break L34;
                  } else {
                    this.field_zb = 1;
                    break L34;
                  }
                }
                return true;
              }
            }
          }
        }
    }

    static {
        field_wb = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
