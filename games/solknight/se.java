/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ej {
    private mf field_u;
    private mf field_r;
    private mf field_v;
    private rl field_n;
    private boolean field_m;
    private int[] field_w;
    private int field_A;
    private int field_s;
    private boolean field_o;
    static String field_z;
    static String field_x;
    private rl field_y;
    private int field_p;
    private int[] field_t;
    private int field_l;
    private rl field_q;

    final synchronized void a(int param0, int param1, boolean param2, rl param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_33_0 = 0;
        mf stackIn_41_0 = null;
        mf stackIn_42_0 = null;
        mf stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        mf stackIn_49_0 = null;
        mf stackIn_50_0 = null;
        mf stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        mf stackOut_48_0 = null;
        mf stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        mf stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        mf stackOut_40_0 = null;
        mf stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        mf stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((se) this).field_o) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    if (((se) this).field_s <= 0) {
                      L3: {
                        if (null == ((se) this).field_q) {
                          break L3;
                        } else {
                          ((se) this).field_v.a((byte) 97);
                          break L3;
                        }
                      }
                      ((se) this).field_q = param3;
                      if (param3 != null) {
                        ((se) this).field_v.a(false, param3, true);
                        this.a((byte) -71, ((se) this).field_v, param4, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null != ((se) this).field_n) {
                          ((se) this).field_r.a((byte) 97);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((se) this).field_n = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        ((se) this).field_r.a(false, param3, true);
                        this.a((byte) -113, ((se) this).field_r, param4, param5);
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L5: {
              stackOut_15_0 = this;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (!param2) {
                stackOut_17_0 = this;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L5;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L5;
              }
            }
            L6: {
              ((se) this).field_o = stackIn_18_1 != 0;
              if (param1 == 0) {
                break L6;
              } else {
                ((se) this).field_A = -21;
                break L6;
              }
            }
            if (((se) this).field_n == param3) {
              ((se) this).field_s = param0;
              this.a((byte) -106, ((se) this).field_r, param4, param5);
              return;
            } else {
              if (((se) this).field_q == param3) {
                ((se) this).field_s = -param0;
                this.a((byte) -84, ((se) this).field_v, param4, param5);
                return;
              } else {
                L7: {
                  if (null != ((se) this).field_n) {
                    if (null == ((se) this).field_q) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (((se) this).field_l >= 524288) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L8;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                if (var7_int != 0) {
                  L9: {
                    if (null == ((se) this).field_n) {
                      break L9;
                    } else {
                      ((se) this).field_r.a((byte) 97);
                      break L9;
                    }
                  }
                  L10: {
                    ((se) this).field_n = param3;
                    if (param3 == null) {
                      break L10;
                    } else {
                      L11: {
                        stackOut_48_0 = ((se) this).field_r;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (param2) {
                          stackOut_50_0 = (mf) (Object) stackIn_50_0;
                          stackOut_50_1 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L11;
                        } else {
                          stackOut_49_0 = (mf) (Object) stackIn_49_0;
                          stackOut_49_1 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          break L11;
                        }
                      }
                      ((mf) (Object) stackIn_51_0).a(stackIn_51_1 != 0, param3, true);
                      this.a((byte) -84, ((se) this).field_r, param4, param5);
                      break L10;
                    }
                  }
                  ((se) this).field_s = param0;
                  break L0;
                } else {
                  L12: {
                    if (((se) this).field_q == null) {
                      break L12;
                    } else {
                      ((se) this).field_v.a((byte) 97);
                      break L12;
                    }
                  }
                  L13: {
                    ((se) this).field_q = param3;
                    if (param3 != null) {
                      L14: {
                        stackOut_40_0 = ((se) this).field_v;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (param2) {
                          stackOut_42_0 = (mf) (Object) stackIn_42_0;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L14;
                        } else {
                          stackOut_41_0 = (mf) (Object) stackIn_41_0;
                          stackOut_41_1 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L14;
                        }
                      }
                      ((mf) (Object) stackIn_43_0).a(stackIn_43_1 != 0, param3, true);
                      this.a((byte) -95, ((se) this).field_v, param4, param5);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  ((se) this).field_s = -param0;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var7;
            stackOut_54_1 = new StringBuilder().append("se.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L15;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L15;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param0 != -15705) {
            field_z = null;
            ((se) this).field_p = param1;
            return;
        }
        ((se) this).field_p = param1;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (((se) this).field_l > 0) {
          L0: {
            if (((se) this).field_n != null) {
              ((se) this).field_r.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (1048576 > ((se) this).field_l) {
            L1: {
              if (null == ((se) this).field_q) {
                break L1;
              } else {
                ((se) this).field_v.a(param0);
                break L1;
              }
            }
            L2: {
              if (((se) this).field_A <= 0) {
                break L2;
              } else {
                if (null != ((se) this).field_y) {
                  ((se) this).field_u.a(param0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (((se) this).field_o) {
              L3: {
                if (((se) this).field_s <= 0) {
                  break L3;
                } else {
                  if (!((se) this).field_r.d(144)) {
                    L4: {
                      ((se) this).field_o = false;
                      ((se) this).field_s = -((se) this).field_s;
                      ((se) this).field_n = null;
                      if (((se) this).field_s == 0) {
                        break L4;
                      } else {
                        ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                        if (((se) this).field_l >= 1048576) {
                          ((se) this).field_l = 1048576;
                          if (((se) this).field_o) {
                            break L4;
                          } else {
                            ((se) this).field_s = 0;
                            if (((se) this).field_m) {
                              break L4;
                            } else {
                              if (null == ((se) this).field_q) {
                                ((se) this).field_q = null;
                                break L4;
                              } else {
                                ((se) this).field_v.a((byte) 97);
                                ((se) this).field_q = null;
                                return;
                              }
                            }
                          }
                        } else {
                          if (0 < ((se) this).field_l) {
                            break L4;
                          } else {
                            ((se) this).field_l = 0;
                            if (!((se) this).field_o) {
                              ((se) this).field_s = 0;
                              if (!((se) this).field_m) {
                                L5: {
                                  if (null != ((se) this).field_n) {
                                    ((se) this).field_r.a((byte) 97);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                ((se) this).field_n = null;
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
                    }
                    return;
                  } else {
                    break L3;
                  }
                }
              }
              if (((se) this).field_s < 0) {
                if (((se) this).field_v.d(144)) {
                  L6: {
                    if (((se) this).field_s == 0) {
                      break L6;
                    } else {
                      ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                      if (((se) this).field_l >= 1048576) {
                        ((se) this).field_l = 1048576;
                        if (((se) this).field_o) {
                          break L6;
                        } else {
                          ((se) this).field_s = 0;
                          if (((se) this).field_m) {
                            break L6;
                          } else {
                            if (null == ((se) this).field_q) {
                              ((se) this).field_q = null;
                              break L6;
                            } else {
                              ((se) this).field_v.a((byte) 97);
                              ((se) this).field_q = null;
                              return;
                            }
                          }
                        }
                      } else {
                        if (0 < ((se) this).field_l) {
                          break L6;
                        } else {
                          ((se) this).field_l = 0;
                          if (!((se) this).field_o) {
                            ((se) this).field_s = 0;
                            if (!((se) this).field_m) {
                              L7: {
                                if (null != ((se) this).field_n) {
                                  ((se) this).field_r.a((byte) 97);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              ((se) this).field_n = null;
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
                  }
                  return;
                } else {
                  ((se) this).field_o = false;
                  ((se) this).field_s = -((se) this).field_s;
                  ((se) this).field_q = null;
                  if (((se) this).field_s != 0) {
                    ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                    if (((se) this).field_l >= 1048576) {
                      L8: {
                        ((se) this).field_l = 1048576;
                        if (((se) this).field_o) {
                          break L8;
                        } else {
                          ((se) this).field_s = 0;
                          if (((se) this).field_m) {
                            break L8;
                          } else {
                            if (null == ((se) this).field_q) {
                              ((se) this).field_q = null;
                              break L8;
                            } else {
                              ((se) this).field_v.a((byte) 97);
                              ((se) this).field_q = null;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      if (0 >= ((se) this).field_l) {
                        ((se) this).field_l = 0;
                        if (!((se) this).field_o) {
                          ((se) this).field_s = 0;
                          if (!((se) this).field_m) {
                            L9: {
                              if (null != ((se) this).field_n) {
                                ((se) this).field_r.a((byte) 97);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            ((se) this).field_n = null;
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
                  } else {
                    return;
                  }
                }
              } else {
                L10: {
                  if (((se) this).field_s == 0) {
                    break L10;
                  } else {
                    ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                    if (((se) this).field_l >= 1048576) {
                      ((se) this).field_l = 1048576;
                      if (((se) this).field_o) {
                        break L10;
                      } else {
                        ((se) this).field_s = 0;
                        if (((se) this).field_m) {
                          break L10;
                        } else {
                          if (null == ((se) this).field_q) {
                            ((se) this).field_q = null;
                            break L10;
                          } else {
                            ((se) this).field_v.a((byte) 97);
                            ((se) this).field_q = null;
                            return;
                          }
                        }
                      }
                    } else {
                      if (0 < ((se) this).field_l) {
                        break L10;
                      } else {
                        ((se) this).field_l = 0;
                        if (!((se) this).field_o) {
                          ((se) this).field_s = 0;
                          if (!((se) this).field_m) {
                            L11: {
                              if (null != ((se) this).field_n) {
                                ((se) this).field_r.a((byte) 97);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            ((se) this).field_n = null;
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
                }
                return;
              }
            } else {
              if (((se) this).field_s != 0) {
                ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                if (((se) this).field_l >= 1048576) {
                  ((se) this).field_l = 1048576;
                  if (!((se) this).field_o) {
                    L12: {
                      ((se) this).field_s = 0;
                      if (((se) this).field_m) {
                        break L12;
                      } else {
                        if (null == ((se) this).field_q) {
                          ((se) this).field_q = null;
                          break L12;
                        } else {
                          ((se) this).field_v.a((byte) 97);
                          ((se) this).field_q = null;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (0 >= ((se) this).field_l) {
                    ((se) this).field_l = 0;
                    if (!((se) this).field_o) {
                      ((se) this).field_s = 0;
                      if (((se) this).field_m) {
                        return;
                      } else {
                        L13: {
                          if (null != ((se) this).field_n) {
                            ((se) this).field_r.a((byte) 97);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        ((se) this).field_n = null;
                        return;
                      }
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
          } else {
            L14: {
              if (((se) this).field_A <= 0) {
                break L14;
              } else {
                if (null != ((se) this).field_y) {
                  ((se) this).field_u.a(param0);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (!((se) this).field_o) {
                break L15;
              } else {
                L16: {
                  if (((se) this).field_s <= 0) {
                    break L16;
                  } else {
                    if (((se) this).field_r.d(144)) {
                      break L16;
                    } else {
                      L17: {
                        ((se) this).field_o = false;
                        ((se) this).field_s = -((se) this).field_s;
                        ((se) this).field_n = null;
                        if (((se) this).field_s == 0) {
                          break L17;
                        } else {
                          ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                          if (((se) this).field_l >= 1048576) {
                            ((se) this).field_l = 1048576;
                            if (((se) this).field_o) {
                              break L17;
                            } else {
                              ((se) this).field_s = 0;
                              if (((se) this).field_m) {
                                break L17;
                              } else {
                                L18: {
                                  if (null == ((se) this).field_q) {
                                    break L18;
                                  } else {
                                    ((se) this).field_v.a((byte) 97);
                                    break L18;
                                  }
                                }
                                ((se) this).field_q = null;
                                break L17;
                              }
                            }
                          } else {
                            if (0 < ((se) this).field_l) {
                              break L17;
                            } else {
                              ((se) this).field_l = 0;
                              if (!((se) this).field_o) {
                                ((se) this).field_s = 0;
                                if (!((se) this).field_m) {
                                  L19: {
                                    if (null != ((se) this).field_n) {
                                      ((se) this).field_r.a((byte) 97);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  ((se) this).field_n = null;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (((se) this).field_s >= 0) {
                  break L15;
                } else {
                  if (((se) this).field_v.d(144)) {
                    break L15;
                  } else {
                    L20: {
                      ((se) this).field_o = false;
                      ((se) this).field_s = -((se) this).field_s;
                      ((se) this).field_q = null;
                      if (((se) this).field_s == 0) {
                        break L20;
                      } else {
                        ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                        if (((se) this).field_l >= 1048576) {
                          ((se) this).field_l = 1048576;
                          if (((se) this).field_o) {
                            break L20;
                          } else {
                            ((se) this).field_s = 0;
                            if (((se) this).field_m) {
                              break L20;
                            } else {
                              if (null == ((se) this).field_q) {
                                ((se) this).field_q = null;
                                break L20;
                              } else {
                                ((se) this).field_v.a((byte) 97);
                                ((se) this).field_q = null;
                                break L20;
                              }
                            }
                          }
                        } else {
                          if (0 < ((se) this).field_l) {
                            break L20;
                          } else {
                            ((se) this).field_l = 0;
                            if (!((se) this).field_o) {
                              ((se) this).field_s = 0;
                              if (!((se) this).field_m) {
                                L21: {
                                  if (null != ((se) this).field_n) {
                                    ((se) this).field_r.a((byte) 97);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                ((se) this).field_n = null;
                                break L20;
                              } else {
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (((se) this).field_s != 0) {
              ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
              if (((se) this).field_l >= 1048576) {
                ((se) this).field_l = 1048576;
                if (!((se) this).field_o) {
                  ((se) this).field_s = 0;
                  if (!((se) this).field_m) {
                    if (null == ((se) this).field_q) {
                      ((se) this).field_q = null;
                      return;
                    } else {
                      ((se) this).field_v.a((byte) 97);
                      ((se) this).field_q = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (0 >= ((se) this).field_l) {
                  ((se) this).field_l = 0;
                  if (!((se) this).field_o) {
                    ((se) this).field_s = 0;
                    if (!((se) this).field_m) {
                      L22: {
                        if (null != ((se) this).field_n) {
                          ((se) this).field_r.a((byte) 97);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      ((se) this).field_n = null;
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
            } else {
              return;
            }
          }
        } else {
          L23: {
            if (1048576 <= ((se) this).field_l) {
              break L23;
            } else {
              if (null == ((se) this).field_q) {
                break L23;
              } else {
                ((se) this).field_v.a(param0);
                break L23;
              }
            }
          }
          L24: {
            if (((se) this).field_A <= 0) {
              break L24;
            } else {
              if (null != ((se) this).field_y) {
                ((se) this).field_u.a(param0);
                break L24;
              } else {
                break L24;
              }
            }
          }
          L25: {
            if (!((se) this).field_o) {
              break L25;
            } else {
              L26: {
                if (((se) this).field_s <= 0) {
                  break L26;
                } else {
                  if (((se) this).field_r.d(144)) {
                    break L26;
                  } else {
                    L27: {
                      ((se) this).field_o = false;
                      ((se) this).field_s = -((se) this).field_s;
                      ((se) this).field_n = null;
                      if (((se) this).field_s == 0) {
                        break L27;
                      } else {
                        ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                        if (((se) this).field_l >= 1048576) {
                          ((se) this).field_l = 1048576;
                          if (((se) this).field_o) {
                            break L27;
                          } else {
                            ((se) this).field_s = 0;
                            if (((se) this).field_m) {
                              break L27;
                            } else {
                              if (null == ((se) this).field_q) {
                                ((se) this).field_q = null;
                                break L27;
                              } else {
                                ((se) this).field_v.a((byte) 97);
                                ((se) this).field_q = null;
                                break L27;
                              }
                            }
                          }
                        } else {
                          if (0 < ((se) this).field_l) {
                            break L27;
                          } else {
                            ((se) this).field_l = 0;
                            if (!((se) this).field_o) {
                              ((se) this).field_s = 0;
                              if (!((se) this).field_m) {
                                L28: {
                                  if (null != ((se) this).field_n) {
                                    ((se) this).field_r.a((byte) 97);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                ((se) this).field_n = null;
                                break L27;
                              } else {
                                break L27;
                              }
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (((se) this).field_s >= 0) {
                break L25;
              } else {
                if (((se) this).field_v.d(144)) {
                  break L25;
                } else {
                  L29: {
                    ((se) this).field_o = false;
                    ((se) this).field_s = -((se) this).field_s;
                    ((se) this).field_q = null;
                    if (((se) this).field_s == 0) {
                      break L29;
                    } else {
                      ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
                      if (((se) this).field_l >= 1048576) {
                        ((se) this).field_l = 1048576;
                        if (((se) this).field_o) {
                          break L29;
                        } else {
                          ((se) this).field_s = 0;
                          if (((se) this).field_m) {
                            break L29;
                          } else {
                            if (null == ((se) this).field_q) {
                              ((se) this).field_q = null;
                              break L29;
                            } else {
                              ((se) this).field_v.a((byte) 97);
                              ((se) this).field_q = null;
                              break L29;
                            }
                          }
                        }
                      } else {
                        if (0 < ((se) this).field_l) {
                          break L29;
                        } else {
                          ((se) this).field_l = 0;
                          if (!((se) this).field_o) {
                            ((se) this).field_s = 0;
                            if (!((se) this).field_m) {
                              L30: {
                                if (null != ((se) this).field_n) {
                                  ((se) this).field_r.a((byte) 97);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              ((se) this).field_n = null;
                              break L29;
                            } else {
                              break L29;
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (((se) this).field_s != 0) {
            ((se) this).field_l = ((se) this).field_l + ((se) this).field_s * param0;
            if (((se) this).field_l >= 1048576) {
              ((se) this).field_l = 1048576;
              if (!((se) this).field_o) {
                ((se) this).field_s = 0;
                if (!((se) this).field_m) {
                  if (null != ((se) this).field_q) {
                    ((se) this).field_v.a((byte) 97);
                    ((se) this).field_q = null;
                    return;
                  } else {
                    ((se) this).field_q = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (0 >= ((se) this).field_l) {
                ((se) this).field_l = 0;
                if (!((se) this).field_o) {
                  ((se) this).field_s = 0;
                  if (((se) this).field_m) {
                    return;
                  } else {
                    L31: {
                      if (null != ((se) this).field_n) {
                        ((se) this).field_r.a((byte) 97);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    ((se) this).field_n = null;
                    return;
                  }
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
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (((se) this).field_p <= 0) {
              ((se) this).a(param2);
              return;
            } else {
              L1: {
                if (!((se) this).field_o) {
                  break L1;
                } else {
                  L2: {
                    if (((se) this).field_s <= 0) {
                      break L2;
                    } else {
                      if (((se) this).field_r.d(144)) {
                        break L2;
                      } else {
                        ((se) this).field_n = null;
                        ((se) this).field_s = -((se) this).field_s;
                        ((se) this).field_o = false;
                        break L1;
                      }
                    }
                  }
                  if (((se) this).field_s >= 0) {
                    break L1;
                  } else {
                    if (((se) this).field_v.d(144)) {
                      break L1;
                    } else {
                      ((se) this).field_q = null;
                      ((se) this).field_o = false;
                      ((se) this).field_s = -((se) this).field_s;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (((se) this).field_l >> 12) * ((se) this).field_p / 256;
                var5 = ((se) this).field_p + -var4_int;
                if (((se) this).field_s != 0) {
                  ((se) this).field_l = ((se) this).field_l + param2 * ((se) this).field_s;
                  if (((se) this).field_l >= 1048576) {
                    ((se) this).field_l = 1048576;
                    if (((se) this).field_o) {
                      break L3;
                    } else {
                      ((se) this).field_s = 0;
                      if (((se) this).field_m) {
                        break L3;
                      } else {
                        L4: {
                          if (((se) this).field_q != null) {
                            ((se) this).field_v.a((byte) 97);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((se) this).field_q = null;
                        break L3;
                      }
                    }
                  } else {
                    if (0 >= ((se) this).field_l) {
                      ((se) this).field_l = 0;
                      if (((se) this).field_o) {
                        break L3;
                      } else {
                        ((se) this).field_s = 0;
                        if (((se) this).field_m) {
                          break L3;
                        } else {
                          L5: {
                            if (((se) this).field_n != null) {
                              ((se) this).field_r.a((byte) 97);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((se) this).field_n = null;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!gj.field_u) {
                  stackOut_31_0 = param2;
                  stackIn_32_0 = stackOut_31_0;
                  break L6;
                } else {
                  stackOut_30_0 = param2 << 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (((se) this).field_A >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (null != ((se) this).field_n) {
                      break L8;
                    } else {
                      if (((se) this).field_q == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((se) this).field_r.a(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (((se) this).field_w == null) {
                            break L10;
                          } else {
                            if (((se) this).field_w.length >= var6) {
                              fk.a(((se) this).field_w, 0, var6);
                              fk.a(((se) this).field_t, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((se) this).field_w = new int[var6];
                        ((se) this).field_t = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((se) this).field_r.a(((se) this).field_w, 0, param2);
                        ((se) this).field_v.a(((se) this).field_t, 0, param2);
                        if (gj.field_u) {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_47_0 = stackOut_46_0;
                          break L11;
                        } else {
                          stackOut_45_0 = param1;
                          stackIn_47_0 = stackOut_45_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_47_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (((se) this).field_t[var8] * var5 + ((se) this).field_w[var8] * var4_int >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((se) this).field_v.a(param0, param1, param2);
                      break L7;
                    }
                  }
                }
              }
              L13: {
                if (((se) this).field_y == null) {
                  break L13;
                } else {
                  if (0 == ((se) this).field_A) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (null == ((se) this).field_w) {
                          break L15;
                        } else {
                          if (((se) this).field_w.length >= var6) {
                            fk.a(((se) this).field_w, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((se) this).field_w = new int[var6];
                      ((se) this).field_t = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((se) this).field_u.a(((se) this).field_w, 0, param2);
                      if (!gj.field_u) {
                        stackOut_60_0 = param1;
                        stackIn_61_0 = stackOut_60_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_59_0 = param1 << 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_61_0;
                    var8 = ((se) this).field_A * ((se) this).field_p / 256;
                    var9 = ((se) this).field_p + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 + ((se) this).field_w[var10] * var8 >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var4;
            stackOut_65_1 = new StringBuilder().append("se.AA(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L18;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, mf param1, int param2, int param3) {
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
              param1.b(param3, -1, -129);
              param1.b(param2, (byte) -110);
              if (param0 <= -61) {
                break L1;
              } else {
                ej discarded$2 = ((se) this).b();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("se.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ej b() {
        return null;
    }

    final ej a() {
        return null;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_z = null;
    }

    private se() throws Throwable {
        throw new Error();
    }

    final synchronized int d() {
        return 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_x = "Invalid password.";
    }
}
