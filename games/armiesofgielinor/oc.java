/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends je {
    private int field_Kb;
    static String[] field_Pb;
    static String field_Nb;
    private je field_Lb;
    private StringBuilder field_Qb;
    private je field_Mb;
    static String field_Ib;
    static String field_Jb;
    static String field_Ob;

    public static void k(int param0) {
        field_Jb = null;
        field_Pb = null;
        field_Ib = null;
        field_Nb = null;
        if (param0 != 0) {
          field_Jb = (String) null;
          field_Ob = null;
          return;
        } else {
          field_Ob = null;
          return;
        }
    }

    final int b(boolean param0, boolean param1) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(param0, param1);
        if (!param1) {
          this.field_Mb.field_X = this.field_Qb.toString();
          if (param1) {
            if (0 != tr.field_A) {
              if (this.field_yb == 0) {
                L0: {
                  this.field_Kb = 1;
                  if (param0) {
                    break L0;
                  } else {
                    this.b(false, true);
                    break L0;
                  }
                }
                return this.field_Kb;
              } else {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    this.b(false, true);
                    break L1;
                  }
                }
                return this.field_Kb;
              }
            } else {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  this.b(false, true);
                  break L2;
                }
              }
              return this.field_Kb;
            }
          } else {
            L3: {
              if (param0) {
                break L3;
              } else {
                this.b(false, true);
                break L3;
              }
            }
            return this.field_Kb;
          }
        } else {
          L4: while (true) {
            if (!jd.i((byte) -51)) {
              L5: {
                this.field_Mb.field_X = this.field_Qb.toString();
                if (!param1) {
                  break L5;
                } else {
                  if (0 == tr.field_A) {
                    break L5;
                  } else {
                    if (this.field_yb != 0) {
                      break L5;
                    } else {
                      this.field_Kb = 1;
                      if (!param0) {
                        this.b(false, true);
                        return this.field_Kb;
                      } else {
                        return this.field_Kb;
                      }
                    }
                  }
                }
              }
              if (!param0) {
                this.b(false, true);
                return this.field_Kb;
              } else {
                return this.field_Kb;
              }
            } else {
              L6: {
                if (-86 != (rs.field_q ^ -1)) {
                  break L6;
                } else {
                  if ((this.field_Qb.length() ^ -1) >= -1) {
                    break L6;
                  } else {
                    up.a(' ', -1 + this.field_Qb.length(), this.field_Qb, true);
                    break L6;
                  }
                }
              }
              L7: {
                if (kv.a(false, (CharSequence) ((Object) this.field_Qb), ui.field_i)) {
                  discarded$1 = this.field_Qb.append(ui.field_i);
                  break L7;
                } else {
                  L8: {
                    if (this.field_Qb.length() != 0) {
                      break L8;
                    } else {
                      if (91 == ui.field_i) {
                        discarded$2 = this.field_Qb.append(ui.field_i);
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (-2 != (this.field_Qb.length() ^ -1)) {
                      break L9;
                    } else {
                      if (ui.field_i == 35) {
                        discarded$3 = this.field_Qb.append(ui.field_i);
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (ui.field_i == 93) {
                    discarded$4 = this.field_Qb.append(ui.field_i);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              if ((rs.field_q ^ -1) != -85) {
                if ((rs.field_q ^ -1) != -14) {
                  continue L4;
                } else {
                  return 1;
                }
              } else {
                if (-1 <= (this.field_Qb.length() ^ -1)) {
                  return 1;
                } else {
                  this.field_X = this.field_Qb.toString();
                  return 2;
                }
              }
            }
          }
        }
    }

    final boolean d(byte param0) {
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
        int var2;
        if (0 != this.field_Kb) {
          return false;
        } else {
          if (rs.field_q == 85) {
            if ((this.field_Qb.length() ^ -1) < -1) {
              up.a(' ', this.field_Qb.length() - 1, this.field_Qb, true);
              if ((this.field_Qb.length() ^ -1) > -13) {
                L0: {
                  var2 = Character.toLowerCase(ui.field_i);
                  if (var2 == 32) {
                    var2 = 95;
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if (-1 <= (this.field_Qb.length() ^ -1)) {
                        break L0;
                      } else {
                        discarded$0 = this.field_Qb.append((char) var2);
                        break L0;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if (-1 <= (this.field_Qb.length() ^ -1)) {
                        break L0;
                      } else {
                        discarded$1 = this.field_Qb.append((char) var2);
                        break L0;
                      }
                    }
                  }
                }
                if (ni.a((byte) -125, (char) var2)) {
                  discarded$2 = this.field_Qb.append((char) var2);
                  if (84 == rs.field_q) {
                    if (this.field_Qb.length() <= 0) {
                      L1: {
                        this.field_Kb = 1;
                        if (-14 == (rs.field_q ^ -1)) {
                          this.field_Kb = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L2: {
                        this.field_X = this.field_Qb.toString();
                        this.field_Kb = 2;
                        if (-14 == (rs.field_q ^ -1)) {
                          this.field_Kb = 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L3: {
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  if (mu.a(28799, (char) var2)) {
                    discarded$3 = this.field_Qb.append((char) var2);
                    if (84 == rs.field_q) {
                      if (this.field_Qb.length() <= 0) {
                        L4: {
                          this.field_Kb = 1;
                          if (-14 == (rs.field_q ^ -1)) {
                            this.field_Kb = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (param0 == -101) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        L5: {
                          this.field_X = this.field_Qb.toString();
                          this.field_Kb = 2;
                          if (-14 == (rs.field_q ^ -1)) {
                            this.field_Kb = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (param0 == -101) {
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      L6: {
                        if (-14 == (rs.field_q ^ -1)) {
                          this.field_Kb = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L7: {
                      if (84 == rs.field_q) {
                        if (this.field_Qb.length() <= 0) {
                          this.field_Kb = 1;
                          break L7;
                        } else {
                          this.field_X = this.field_Qb.toString();
                          this.field_Kb = 2;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                if (84 == rs.field_q) {
                  if (this.field_Qb.length() <= 0) {
                    L9: {
                      this.field_Kb = 1;
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L10: {
                      this.field_X = this.field_Qb.toString();
                      this.field_Kb = 2;
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L11: {
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              if ((this.field_Qb.length() ^ -1) > -13) {
                L12: {
                  var2 = Character.toLowerCase(ui.field_i);
                  if (var2 == 32) {
                    var2 = 95;
                    if (var2 != 95) {
                      break L12;
                    } else {
                      if (-1 <= (this.field_Qb.length() ^ -1)) {
                        break L12;
                      } else {
                        discarded$4 = this.field_Qb.append((char) var2);
                        break L12;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L12;
                    } else {
                      if (-1 <= (this.field_Qb.length() ^ -1)) {
                        break L12;
                      } else {
                        discarded$5 = this.field_Qb.append((char) var2);
                        break L12;
                      }
                    }
                  }
                }
                if (ni.a((byte) -125, (char) var2)) {
                  L13: {
                    discarded$6 = this.field_Qb.append((char) var2);
                    if (84 == rs.field_q) {
                      if (this.field_Qb.length() <= 0) {
                        this.field_Kb = 1;
                        break L13;
                      } else {
                        this.field_X = this.field_Qb.toString();
                        this.field_Kb = 2;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if (mu.a(28799, (char) var2)) {
                    L15: {
                      discarded$7 = this.field_Qb.append((char) var2);
                      if (84 == rs.field_q) {
                        if (this.field_Qb.length() <= 0) {
                          this.field_Kb = 1;
                          break L15;
                        } else {
                          this.field_X = this.field_Qb.toString();
                          this.field_Kb = 2;
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L17: {
                      if (84 == rs.field_q) {
                        if (this.field_Qb.length() <= 0) {
                          this.field_Kb = 1;
                          break L17;
                        } else {
                          this.field_X = this.field_Qb.toString();
                          this.field_Kb = 2;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    if (param0 != -101) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                if (84 == rs.field_q) {
                  if (this.field_Qb.length() <= 0) {
                    L19: {
                      this.field_Kb = 1;
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L20: {
                      this.field_X = this.field_Qb.toString();
                      this.field_Kb = 2;
                      if (-14 == (rs.field_q ^ -1)) {
                        this.field_Kb = 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L21: {
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            if ((this.field_Qb.length() ^ -1) > -13) {
              L22: {
                var2 = Character.toLowerCase(ui.field_i);
                if (var2 == 32) {
                  var2 = 95;
                  if (var2 != 95) {
                    break L22;
                  } else {
                    if (-1 <= (this.field_Qb.length() ^ -1)) {
                      break L22;
                    } else {
                      discarded$8 = this.field_Qb.append((char) var2);
                      break L22;
                    }
                  }
                } else {
                  if (var2 != 95) {
                    break L22;
                  } else {
                    if (-1 <= (this.field_Qb.length() ^ -1)) {
                      break L22;
                    } else {
                      discarded$9 = this.field_Qb.append((char) var2);
                      break L22;
                    }
                  }
                }
              }
              if (ni.a((byte) -125, (char) var2)) {
                L23: {
                  discarded$10 = this.field_Qb.append((char) var2);
                  if (84 == rs.field_q) {
                    if (this.field_Qb.length() <= 0) {
                      this.field_Kb = 1;
                      break L23;
                    } else {
                      this.field_X = this.field_Qb.toString();
                      this.field_Kb = 2;
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (-14 == (rs.field_q ^ -1)) {
                    this.field_Kb = 1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                if (param0 != -101) {
                  return false;
                } else {
                  return true;
                }
              } else {
                if (mu.a(28799, (char) var2)) {
                  L25: {
                    discarded$11 = this.field_Qb.append((char) var2);
                    if (84 == rs.field_q) {
                      if (this.field_Qb.length() <= 0) {
                        this.field_Kb = 1;
                        break L25;
                      } else {
                        this.field_X = this.field_Qb.toString();
                        this.field_Kb = 2;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  L27: {
                    if (84 == rs.field_q) {
                      if (this.field_Qb.length() <= 0) {
                        this.field_Kb = 1;
                        break L27;
                      } else {
                        this.field_X = this.field_Qb.toString();
                        this.field_Kb = 2;
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              if (84 == rs.field_q) {
                if (this.field_Qb.length() <= 0) {
                  L29: {
                    this.field_Kb = 1;
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  L30: {
                    this.field_X = this.field_Qb.toString();
                    this.field_Kb = 2;
                    if (-14 == (rs.field_q ^ -1)) {
                      this.field_Kb = 1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                L31: {
                  if (-14 == (rs.field_q ^ -1)) {
                    this.field_Kb = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (param0 != -101) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    oc(int param0, int param1, int param2, int param3, String param4, je param5, je param6, je param7) {
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
        this.field_Kb = 0;
        try {
          L0: {
            this.field_Lb = new je(0L, param6, param4);
            this.a(this.field_Lb, 112);
            this.field_Mb = new je(0L, param7);
            this.field_Mb.field_N = 16764006;
            this.a(this.field_Mb, 74);
            this.field_Mb.field_I = "|";
            this.field_Qb = new StringBuilder(12);
            var9_int = this.field_Lb.j(122);
            this.field_Lb.a(jn.field_d, -20500, var9_int, 3, 5);
            this.field_Mb.a(jn.field_d, -20500, var9_int, 3 + jn.field_d, 5);
            var10 = var9_int + 5 + 5;
            var11 = 3 + (2 * jn.field_d + 3);
            var12 = jp.a(param0, param2, var10, -1);
            var13 = pd.a(var11, 0, param1, param3);
            this.a(var11, -20500, var10, var13, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var9);

            stackIn_5_1 = new StringBuilder().append("oc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_Nb = "<%0> has declined the invitation.";
        field_Jb = "Type your email address again to make sure it's correct";
        field_Ib = "<%0> must play <%1> more rated games before playing with the current options.";
        field_Pb = new String[]{"All scores", "My scores", "Best each"};
        field_Ob = "That name is not available";
    }
}
