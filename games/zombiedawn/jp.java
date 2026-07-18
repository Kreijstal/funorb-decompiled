/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class jp {
    static int[] field_f;
    private int field_e;
    int field_h;
    private int field_b;
    static o field_c;
    static String field_i;
    private int field_k;
    static boolean field_m;
    static String[] field_g;
    static int field_a;
    boolean field_j;
    private int field_l;
    int field_d;

    final void a(byte param0, int param1, int param2) {
        if (~param1 <= ~((jp) this).field_h) {
          throw new IllegalArgumentException();
        } else {
          if (((jp) this).field_h <= param2) {
            throw new IllegalArgumentException();
          } else {
            ((jp) this).field_b = 0;
            ((jp) this).field_e = 0;
            if (ci.field_d != 0) {
              ((jp) this).field_e = ci.field_d;
              ((jp) this).field_d = param2;
              ((jp) this).field_j = true;
              ((jp) this).field_l = ci.field_d;
              ((jp) this).field_k = di.field_M;
              if (((jp) this).field_l != 0) {
                L0: {
                  if (kc.field_R == 0) {
                    break L0;
                  } else {
                    if (((jp) this).field_k > 0) {
                      ((jp) this).field_k = ((jp) this).field_k - 1;
                      break L0;
                    } else {
                      ((jp) this).field_k = rg.field_H;
                      ((jp) this).field_k = ((jp) this).field_k - 1;
                      break L0;
                    }
                  }
                }
                if (ci.field_d == 0) {
                  if (kc.field_R == 0) {
                    L1: {
                      ((jp) this).field_l = 0;
                      if (param0 <= -10) {
                        break L1;
                      } else {
                        field_g = null;
                        break L1;
                      }
                    }
                    L2: {
                      if (0 != ((jp) this).field_l) {
                        break L2;
                      } else {
                        L3: {
                          if (((jp) this).field_j) {
                            break L3;
                          } else {
                            if (!ll.field_a) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (((jp) this).field_j) {
                            ((jp) this).field_d = -1;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          if (~((jp) this).field_d != ~param1) {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            break L2;
                          } else {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            break L2;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    if (param0 <= -10) {
                      L4: {
                        if (0 != ((jp) this).field_l) {
                          break L4;
                        } else {
                          if (((jp) this).field_j) {
                            if (0 > param1) {
                              if (((jp) this).field_j) {
                                ((jp) this).field_d = -1;
                                break L4;
                              } else {
                                return;
                              }
                            } else {
                              if (~((jp) this).field_d != ~param1) {
                                ((jp) this).field_d = param1;
                                ((jp) this).field_j = true;
                                return;
                              } else {
                                ((jp) this).field_d = param1;
                                ((jp) this).field_j = true;
                                return;
                              }
                            }
                          } else {
                            if (!ll.field_a) {
                              break L4;
                            } else {
                              if (0 > param1) {
                                if (((jp) this).field_j) {
                                  ((jp) this).field_d = -1;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                if (~((jp) this).field_d != ~param1) {
                                  ((jp) this).field_d = param1;
                                  ((jp) this).field_j = true;
                                  return;
                                } else {
                                  ((jp) this).field_d = param1;
                                  ((jp) this).field_j = true;
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L5: {
                        field_g = null;
                        if (0 != ((jp) this).field_l) {
                          break L5;
                        } else {
                          L6: {
                            if (((jp) this).field_j) {
                              break L6;
                            } else {
                              if (!ll.field_a) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (((jp) this).field_j) {
                              ((jp) this).field_d = -1;
                              break L5;
                            } else {
                              return;
                            }
                          } else {
                            if (~((jp) this).field_d != ~param1) {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              return;
                            } else {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (param0 <= -10) {
                    L7: {
                      if (0 != ((jp) this).field_l) {
                        break L7;
                      } else {
                        if (((jp) this).field_j) {
                          if (0 > param1) {
                            if (((jp) this).field_j) {
                              ((jp) this).field_d = -1;
                              break L7;
                            } else {
                              return;
                            }
                          } else {
                            if (~((jp) this).field_d != ~param1) {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              return;
                            } else {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              return;
                            }
                          }
                        } else {
                          if (!ll.field_a) {
                            break L7;
                          } else {
                            if (0 > param1) {
                              if (((jp) this).field_j) {
                                ((jp) this).field_d = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (~((jp) this).field_d != ~param1) {
                                ((jp) this).field_d = param1;
                                ((jp) this).field_j = true;
                                return;
                              } else {
                                ((jp) this).field_d = param1;
                                ((jp) this).field_j = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L8: {
                      field_g = null;
                      if (0 != ((jp) this).field_l) {
                        break L8;
                      } else {
                        L9: {
                          if (((jp) this).field_j) {
                            break L9;
                          } else {
                            if (!ll.field_a) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (((jp) this).field_j) {
                            ((jp) this).field_d = -1;
                            break L8;
                          } else {
                            return;
                          }
                        } else {
                          if (~((jp) this).field_d != ~param1) {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            return;
                          } else {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            return;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L10: {
                  if (ci.field_d != 0) {
                    break L10;
                  } else {
                    if (kc.field_R != 0) {
                      break L10;
                    } else {
                      L11: {
                        ((jp) this).field_l = 0;
                        if (param0 <= -10) {
                          break L11;
                        } else {
                          field_g = null;
                          break L11;
                        }
                      }
                      L12: {
                        if (0 != ((jp) this).field_l) {
                          break L12;
                        } else {
                          L13: {
                            if (((jp) this).field_j) {
                              break L13;
                            } else {
                              if (!ll.field_a) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (((jp) this).field_j) {
                              ((jp) this).field_d = -1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (~((jp) this).field_d != ~param1) {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              break L12;
                            } else {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              break L12;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 <= -10) {
                  L14: {
                    if (0 != ((jp) this).field_l) {
                      break L14;
                    } else {
                      if (((jp) this).field_j) {
                        if (0 > param1) {
                          if (((jp) this).field_j) {
                            ((jp) this).field_d = -1;
                            break L14;
                          } else {
                            return;
                          }
                        } else {
                          if (~((jp) this).field_d != ~param1) {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            return;
                          } else {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            return;
                          }
                        }
                      } else {
                        if (!ll.field_a) {
                          break L14;
                        } else {
                          L15: {
                            if (0 > param1) {
                              if (((jp) this).field_j) {
                                ((jp) this).field_d = -1;
                                break L15;
                              } else {
                                break L15;
                              }
                            } else {
                              if (~((jp) this).field_d != ~param1) {
                                ((jp) this).field_d = param1;
                                ((jp) this).field_j = true;
                                break L15;
                              } else {
                                ((jp) this).field_d = param1;
                                ((jp) this).field_j = true;
                                break L15;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L16: {
                    field_g = null;
                    if (0 != ((jp) this).field_l) {
                      break L16;
                    } else {
                      L17: {
                        if (((jp) this).field_j) {
                          break L17;
                        } else {
                          if (!ll.field_a) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (((jp) this).field_j) {
                          ((jp) this).field_d = -1;
                          break L16;
                        } else {
                          break L16;
                        }
                      } else {
                        if (~((jp) this).field_d != ~param1) {
                          ((jp) this).field_d = param1;
                          ((jp) this).field_j = true;
                          break L16;
                        } else {
                          ((jp) this).field_d = param1;
                          ((jp) this).field_j = true;
                          break L16;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L18: {
                if (((jp) this).field_l == 0) {
                  break L18;
                } else {
                  if (kc.field_R == 0) {
                    break L18;
                  } else {
                    if (((jp) this).field_k > 0) {
                      ((jp) this).field_k = ((jp) this).field_k - 1;
                      break L18;
                    } else {
                      ((jp) this).field_k = rg.field_H;
                      ((jp) this).field_k = ((jp) this).field_k - 1;
                      break L18;
                    }
                  }
                }
              }
              L19: {
                if (ci.field_d != 0) {
                  break L19;
                } else {
                  if (kc.field_R != 0) {
                    break L19;
                  } else {
                    L20: {
                      ((jp) this).field_l = 0;
                      if (param0 <= -10) {
                        break L20;
                      } else {
                        field_g = null;
                        break L20;
                      }
                    }
                    L21: {
                      if (0 != ((jp) this).field_l) {
                        break L21;
                      } else {
                        L22: {
                          if (((jp) this).field_j) {
                            break L22;
                          } else {
                            if (!ll.field_a) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (((jp) this).field_j) {
                            ((jp) this).field_d = -1;
                            break L21;
                          } else {
                            break L21;
                          }
                        } else {
                          if (~((jp) this).field_d != ~param1) {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            break L21;
                          } else {
                            ((jp) this).field_d = param1;
                            ((jp) this).field_j = true;
                            break L21;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (param0 <= -10) {
                L23: {
                  if (0 != ((jp) this).field_l) {
                    break L23;
                  } else {
                    if (((jp) this).field_j) {
                      if (0 > param1) {
                        if (((jp) this).field_j) {
                          ((jp) this).field_d = -1;
                          break L23;
                        } else {
                          return;
                        }
                      } else {
                        if (~((jp) this).field_d != ~param1) {
                          ((jp) this).field_d = param1;
                          ((jp) this).field_j = true;
                          return;
                        } else {
                          ((jp) this).field_d = param1;
                          ((jp) this).field_j = true;
                          return;
                        }
                      }
                    } else {
                      if (!ll.field_a) {
                        break L23;
                      } else {
                        L24: {
                          if (0 > param1) {
                            if (((jp) this).field_j) {
                              ((jp) this).field_d = -1;
                              break L24;
                            } else {
                              break L24;
                            }
                          } else {
                            if (~((jp) this).field_d != ~param1) {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              break L24;
                            } else {
                              ((jp) this).field_d = param1;
                              ((jp) this).field_j = true;
                              break L24;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                L25: {
                  field_g = null;
                  if (0 != ((jp) this).field_l) {
                    break L25;
                  } else {
                    L26: {
                      if (((jp) this).field_j) {
                        break L26;
                      } else {
                        if (!ll.field_a) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (0 > param1) {
                      if (((jp) this).field_j) {
                        ((jp) this).field_d = -1;
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      if (~((jp) this).field_d != ~param1) {
                        ((jp) this).field_d = param1;
                        ((jp) this).field_j = true;
                        break L25;
                      } else {
                        ((jp) this).field_d = param1;
                        ((jp) this).field_j = true;
                        break L25;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (param1 <= -68) {
          L0: {
            ((jp) this).field_l = 0;
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((jp) this).field_j = stackIn_5_1 != 0;
          if (((jp) this).field_j) {
            ((jp) this).field_d = param2;
            return;
          } else {
            ((jp) this).field_d = param3;
            return;
          }
        } else {
          return;
        }
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, String param3) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_35_0 = null;
            java.net.URL stackIn_37_0 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_34_0 = null;
            java.net.URL stackOut_36_0 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            var9 = ZombieDawn.field_J;
            try {
              var5_ref = param1.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L3;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        if (param3 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        } else {
                          var6 = var7_int;
                          continue L0;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      if (param2 == null) {
                        break L1;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param3 == null) {
                      break L7;
                    } else {
                      if (param3.length() <= 0) {
                        break L7;
                      } else {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param3);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param2 == null) {
                      break L8;
                    } else {
                      if (param2.length() > 0) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var6 < var5_ref.length()) {
                      StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append('/');
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_34_0 = new java.net.URL(param1, var7.toString());
                      stackIn_35_0 = stackOut_34_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_36_0 = (java.net.URL) param1;
                    stackIn_37_0 = stackOut_36_0;
                    return stackIn_37_0;
                  }
                  return stackIn_35_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_38_0 = (RuntimeException) var5;
                stackOut_38_1 = new StringBuilder().append("jp.F(").append(97).append(',');
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param1 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L11;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L11;
                }
              }
              L12: {
                stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                if (param2 == null) {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "null";
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L12;
                } else {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "{...}";
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  break L12;
                }
              }
              L13: {
                stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param3 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L13;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L13;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + -1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void g(int param0) {
        int var2 = 0;
        var2 = -82 / ((param0 - -60) / 51);
        ((jp) this).field_e = 0;
        ((jp) this).field_b = 0;
        if (((jp) this).field_l == 0) {
          ((jp) this).field_b = kg.field_i;
          return;
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -6) {
          L0: {
            ((jp) this).field_b = -16;
            if (0 == ((jp) this).field_l) {
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
            if (0 == ((jp) this).field_l) {
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

    final void a(int param0, boolean param1, int param2) {
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
          ((jp) this).field_l = 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
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
        ((jp) this).field_j = stackIn_3_1 != 0;
        if (!((jp) this).field_j) {
          if (param2 != -20258) {
            ((jp) this).g(49);
            return;
          } else {
            return;
          }
        } else {
          ((jp) this).field_d = param0;
          if (param2 == -20258) {
            return;
          } else {
            ((jp) this).g(49);
            return;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != -97) {
            return false;
        }
        return ((jp) this).field_b == 96 ? true : false;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -98) {
          L0: {
            ((jp) this).b(42, -37);
            if (((jp) this).field_b != 97) {
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
            if (((jp) this).field_b != 97) {
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

    final void a(int param0) {
        ((jp) this).field_e = 0;
        ((jp) this).field_b = 0;
        if (param0 == 21657) {
          L0: {
            if (0 != ((jp) this).field_l) {
              break L0;
            } else {
              if (kg.field_i == 98) {
                L1: {
                  if (0 >= ((jp) this).field_d) {
                    ((jp) this).field_d = ((jp) this).field_h;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((jp) this).field_d = ((jp) this).field_d - 1;
                ((jp) this).field_j = false;
                break L0;
              } else {
                L2: {
                  if (((jp) this).field_l == 0) {
                    ((jp) this).field_b = kg.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((jp) this).field_l == 0) {
                  if (kg.field_i == 99) {
                    ((jp) this).field_d = ((jp) this).field_d + 1;
                    ((jp) this).field_j = false;
                    if (((jp) this).field_h <= ((jp) this).field_d) {
                      ((jp) this).field_d = 0;
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
            }
          }
          L3: {
            if (((jp) this).field_l == 0) {
              ((jp) this).field_b = kg.field_i;
              break L3;
            } else {
              break L3;
            }
          }
          if (((jp) this).field_l == 0) {
            if (kg.field_i == 99) {
              ((jp) this).field_d = ((jp) this).field_d + 1;
              ((jp) this).field_j = false;
              if (((jp) this).field_h <= ((jp) this).field_d) {
                ((jp) this).field_d = 0;
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
        } else {
          return;
        }
    }

    final static void a() {
        int var1 = 48;
        if (!(null == kk.field_i)) {
            kk.field_i.h((byte) 74);
        }
        ni.field_c = new fh();
        bm.field_d.b(20, (ga) (Object) ni.field_c);
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        if (((jp) this).field_l == 0) {
          ((jp) this).field_d = param0;
          ((jp) this).field_j = false;
          var3 = -31 / ((-12 - param1) / 56);
          return;
        } else {
          var3 = -31 / ((-12 - param1) / 56);
          return;
        }
    }

    final static void b() {
        int discarded$0 = 9;
        rl.c();
        og.b(-126, 4);
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return ((jp) this).field_b == 102 ? true : false;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_i = null;
        field_c = null;
        field_g = null;
    }

    final boolean d(int param0) {
        if (param0 >= -119) {
            ((jp) this).field_h = -98;
            if (((jp) this).field_e != 0) {
                return true;
            }
            if (((jp) this).field_b == 84) {
                return true;
            }
            return ((jp) this).field_b == 83 ? true : false;
        }
        if (((jp) this).field_e != 0) {
            return true;
        }
        if (((jp) this).field_b == 84) {
            return true;
        }
        if (((jp) this).field_b == 83) {
            return true;
        }
        return false;
    }

    final static fn a(byte param0, int param1) {
        tm var2 = null;
        var2 = new tm(param1);
        var2.field_j.e(-1);
        if (param0 <= 123) {
          field_a = -55;
          kn.field_L.a(0, (le) (Object) var2);
          return var2.field_j;
        } else {
          kn.field_L.a(0, (le) (Object) var2);
          return var2.field_j;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -104) {
          L0: {
            field_m = false;
            if (((jp) this).field_b != 103) {
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
            if (((jp) this).field_b != 103) {
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

    final void a(int param0, int param1) {
        ((jp) this).field_e = 0;
        ((jp) this).field_b = 0;
        if (0 == ((jp) this).field_l) {
          if (kg.field_i == 96) {
            if (((jp) this).field_d > 0) {
              ((jp) this).field_d = ((jp) this).field_d - 1;
              ((jp) this).field_j = false;
              if (param1 == ~((jp) this).field_l) {
                L0: {
                  ((jp) this).field_b = kg.field_i;
                  if (0 != ((jp) this).field_l) {
                    break L0;
                  } else {
                    if (kg.field_i == 97) {
                      ((jp) this).field_d = ((jp) this).field_d + 1;
                      ((jp) this).field_j = false;
                      if (~((jp) this).field_h < ~((jp) this).field_d) {
                        break L0;
                      } else {
                        ((jp) this).field_d = 0;
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                L1: {
                  if (((jp) this).field_l != 0) {
                    break L1;
                  } else {
                    L2: {
                      if (kg.field_i == 98) {
                        break L2;
                      } else {
                        if (99 == kg.field_i) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L3: {
                      if (0 > ((jp) this).field_d) {
                        ((jp) this).field_d = param0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((jp) this).field_j = false;
                    break L1;
                  }
                }
                return;
              } else {
                L4: {
                  if (0 != ((jp) this).field_l) {
                    break L4;
                  } else {
                    if (kg.field_i == 97) {
                      ((jp) this).field_d = ((jp) this).field_d + 1;
                      ((jp) this).field_j = false;
                      if (~((jp) this).field_h < ~((jp) this).field_d) {
                        break L4;
                      } else {
                        ((jp) this).field_d = 0;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((jp) this).field_l != 0) {
                    break L5;
                  } else {
                    L6: {
                      if (kg.field_i == 98) {
                        break L6;
                      } else {
                        if (99 == kg.field_i) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (0 > ((jp) this).field_d) {
                        ((jp) this).field_d = param0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((jp) this).field_j = false;
                    break L5;
                  }
                }
                return;
              }
            } else {
              ((jp) this).field_d = ((jp) this).field_h;
              L8: {
                ((jp) this).field_d = ((jp) this).field_d - 1;
                ((jp) this).field_j = false;
                if (param1 != ~((jp) this).field_l) {
                  break L8;
                } else {
                  ((jp) this).field_b = kg.field_i;
                  break L8;
                }
              }
              L9: {
                if (0 != ((jp) this).field_l) {
                  break L9;
                } else {
                  if (kg.field_i == 97) {
                    ((jp) this).field_d = ((jp) this).field_d + 1;
                    ((jp) this).field_j = false;
                    if (~((jp) this).field_h < ~((jp) this).field_d) {
                      break L9;
                    } else {
                      ((jp) this).field_d = 0;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (((jp) this).field_l != 0) {
                  break L10;
                } else {
                  L11: {
                    if (kg.field_i == 98) {
                      break L11;
                    } else {
                      if (99 == kg.field_i) {
                        break L11;
                      } else {
                        return;
                      }
                    }
                  }
                  L12: {
                    if (0 > ((jp) this).field_d) {
                      ((jp) this).field_d = param0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ((jp) this).field_j = false;
                  break L10;
                }
              }
              return;
            }
          } else {
            if (param1 != ~((jp) this).field_l) {
              L13: {
                if (0 != ((jp) this).field_l) {
                  break L13;
                } else {
                  if (kg.field_i == 97) {
                    ((jp) this).field_d = ((jp) this).field_d + 1;
                    ((jp) this).field_j = false;
                    if (~((jp) this).field_h < ~((jp) this).field_d) {
                      break L13;
                    } else {
                      L14: {
                        ((jp) this).field_d = 0;
                        if (((jp) this).field_l != 0) {
                          break L14;
                        } else {
                          L15: {
                            if (kg.field_i == 98) {
                              break L15;
                            } else {
                              if (99 == kg.field_i) {
                                break L15;
                              } else {
                                return;
                              }
                            }
                          }
                          L16: {
                            if (0 > ((jp) this).field_d) {
                              ((jp) this).field_d = param0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          ((jp) this).field_j = false;
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L17: {
                      if (((jp) this).field_l != 0) {
                        break L17;
                      } else {
                        L18: {
                          if (kg.field_i == 98) {
                            break L18;
                          } else {
                            if (99 == kg.field_i) {
                              break L18;
                            } else {
                              return;
                            }
                          }
                        }
                        L19: {
                          if (0 > ((jp) this).field_d) {
                            ((jp) this).field_d = param0;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        ((jp) this).field_j = false;
                        break L17;
                      }
                    }
                    return;
                  }
                }
              }
              L20: {
                if (((jp) this).field_l != 0) {
                  break L20;
                } else {
                  L21: {
                    if (kg.field_i == 98) {
                      break L21;
                    } else {
                      if (99 == kg.field_i) {
                        break L21;
                      } else {
                        return;
                      }
                    }
                  }
                  L22: {
                    if (0 > ((jp) this).field_d) {
                      ((jp) this).field_d = param0;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  ((jp) this).field_j = false;
                  break L20;
                }
              }
              return;
            } else {
              ((jp) this).field_b = kg.field_i;
              if (0 == ((jp) this).field_l) {
                if (kg.field_i == 97) {
                  ((jp) this).field_d = ((jp) this).field_d + 1;
                  ((jp) this).field_j = false;
                  if (~((jp) this).field_h >= ~((jp) this).field_d) {
                    L23: {
                      ((jp) this).field_d = 0;
                      if (((jp) this).field_l != 0) {
                        break L23;
                      } else {
                        L24: {
                          if (kg.field_i == 98) {
                            break L24;
                          } else {
                            if (99 == kg.field_i) {
                              break L24;
                            } else {
                              return;
                            }
                          }
                        }
                        L25: {
                          if (0 > ((jp) this).field_d) {
                            ((jp) this).field_d = param0;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        ((jp) this).field_j = false;
                        break L23;
                      }
                    }
                    return;
                  } else {
                    L26: {
                      if (((jp) this).field_l != 0) {
                        break L26;
                      } else {
                        L27: {
                          if (kg.field_i == 98) {
                            break L27;
                          } else {
                            if (99 == kg.field_i) {
                              break L27;
                            } else {
                              return;
                            }
                          }
                        }
                        L28: {
                          if (0 > ((jp) this).field_d) {
                            ((jp) this).field_d = param0;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        ((jp) this).field_j = false;
                        break L26;
                      }
                    }
                    return;
                  }
                } else {
                  L29: {
                    if (((jp) this).field_l != 0) {
                      break L29;
                    } else {
                      L30: {
                        if (kg.field_i == 98) {
                          break L30;
                        } else {
                          if (99 == kg.field_i) {
                            break L30;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L31: {
                        if (0 > ((jp) this).field_d) {
                          ((jp) this).field_d = param0;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      ((jp) this).field_j = false;
                      break L29;
                    }
                  }
                  return;
                }
              } else {
                L32: {
                  if (((jp) this).field_l != 0) {
                    break L32;
                  } else {
                    L33: {
                      if (kg.field_i == 98) {
                        break L33;
                      } else {
                        if (99 == kg.field_i) {
                          break L33;
                        } else {
                          return;
                        }
                      }
                    }
                    L34: {
                      if (0 > ((jp) this).field_d) {
                        ((jp) this).field_d = param0;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    ((jp) this).field_j = false;
                    break L32;
                  }
                }
                return;
              }
            }
          }
        } else {
          if (param1 != ~((jp) this).field_l) {
            L35: {
              if (0 != ((jp) this).field_l) {
                break L35;
              } else {
                if (kg.field_i == 97) {
                  ((jp) this).field_d = ((jp) this).field_d + 1;
                  ((jp) this).field_j = false;
                  if (~((jp) this).field_h < ~((jp) this).field_d) {
                    break L35;
                  } else {
                    L36: {
                      ((jp) this).field_d = 0;
                      if (((jp) this).field_l != 0) {
                        break L36;
                      } else {
                        L37: {
                          if (kg.field_i == 98) {
                            break L37;
                          } else {
                            if (99 == kg.field_i) {
                              break L37;
                            } else {
                              break L36;
                            }
                          }
                        }
                        L38: {
                          if (0 > ((jp) this).field_d) {
                            ((jp) this).field_d = param0;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        ((jp) this).field_j = false;
                        break L36;
                      }
                    }
                    return;
                  }
                } else {
                  L39: {
                    if (((jp) this).field_l != 0) {
                      break L39;
                    } else {
                      L40: {
                        if (kg.field_i == 98) {
                          break L40;
                        } else {
                          if (99 == kg.field_i) {
                            break L40;
                          } else {
                            break L39;
                          }
                        }
                      }
                      L41: {
                        if (0 > ((jp) this).field_d) {
                          ((jp) this).field_d = param0;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      ((jp) this).field_j = false;
                      break L39;
                    }
                  }
                  return;
                }
              }
            }
            L42: {
              if (((jp) this).field_l != 0) {
                break L42;
              } else {
                L43: {
                  if (kg.field_i == 98) {
                    break L43;
                  } else {
                    if (99 == kg.field_i) {
                      break L43;
                    } else {
                      return;
                    }
                  }
                }
                L44: {
                  if (0 > ((jp) this).field_d) {
                    ((jp) this).field_d = param0;
                    break L44;
                  } else {
                    break L44;
                  }
                }
                ((jp) this).field_j = false;
                break L42;
              }
            }
            return;
          } else {
            L45: {
              ((jp) this).field_b = kg.field_i;
              if (0 != ((jp) this).field_l) {
                break L45;
              } else {
                if (kg.field_i == 97) {
                  ((jp) this).field_d = ((jp) this).field_d + 1;
                  ((jp) this).field_j = false;
                  if (~((jp) this).field_h < ~((jp) this).field_d) {
                    break L45;
                  } else {
                    ((jp) this).field_d = 0;
                    break L45;
                  }
                } else {
                  break L45;
                }
              }
            }
            L46: {
              if (((jp) this).field_l != 0) {
                break L46;
              } else {
                L47: {
                  if (kg.field_i == 98) {
                    break L47;
                  } else {
                    if (99 == kg.field_i) {
                      break L47;
                    } else {
                      break L46;
                    }
                  }
                }
                L48: {
                  if (0 > ((jp) this).field_d) {
                    ((jp) this).field_d = param0;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                ((jp) this).field_j = false;
                break L46;
              }
            }
            return;
          }
        }
    }

    jp(int param0) {
        ((jp) this).field_j = false;
        ((jp) this).field_d = 0;
        ((jp) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[128];
        field_i = "SCORE: <%0>";
        field_g = new String[]{"Ooops. It looks like there are no more humans left with the keycards you need. You'd better press 'ESC' to go to the menu and choose 'Retry'. Now.", "Uh-oh. Now you've done it. You've allowed the human you needed to get killed! Gah. Press 'ESC' to go to the menu and choose 'Retry'.", "Zombies can't use keycards. Come on, you knew that. Press 'ESC' to go to the menu and choose 'Retry'."};
        field_m = false;
    }
}
