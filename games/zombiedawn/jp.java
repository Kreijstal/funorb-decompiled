/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (param1 >= this.field_h) {
          throw new IllegalArgumentException();
        } else {
          if (this.field_h <= param2) {
            throw new IllegalArgumentException();
          } else {
            this.field_b = 0;
            this.field_e = 0;
            if (-1 != (ci.field_d ^ -1)) {
              this.field_e = ci.field_d;
              this.field_d = param2;
              this.field_j = true;
              this.field_l = ci.field_d;
              this.field_k = di.field_M;
              if (this.field_l != 0) {
                L0: {
                  if (-1 == (kc.field_R ^ -1)) {
                    break L0;
                  } else {
                    if (-1 > (this.field_k ^ -1)) {
                      this.field_k = this.field_k - 1;
                      break L0;
                    } else {
                      this.field_k = rg.field_H;
                      this.field_k = this.field_k - 1;
                      break L0;
                    }
                  }
                }
                if (ci.field_d == 0) {
                  if (kc.field_R != 0) {
                    if (param0 <= -10) {
                      L1: {
                        if (0 != this.field_l) {
                          break L1;
                        } else {
                          if (this.field_j) {
                            if (0 > param1) {
                              if (this.field_j) {
                                this.field_d = -1;
                                break L1;
                              } else {
                                return;
                              }
                            } else {
                              if (this.field_d != param1) {
                                this.field_d = param1;
                                this.field_j = true;
                                return;
                              } else {
                                this.field_d = param1;
                                this.field_j = true;
                                return;
                              }
                            }
                          } else {
                            if (!ll.field_a) {
                              break L1;
                            } else {
                              if (0 > param1) {
                                if (this.field_j) {
                                  this.field_d = -1;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                if (this.field_d != param1) {
                                  this.field_d = param1;
                                  this.field_j = true;
                                  return;
                                } else {
                                  this.field_d = param1;
                                  this.field_j = true;
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L2: {
                        field_g = (String[]) null;
                        if (0 != this.field_l) {
                          break L2;
                        } else {
                          L3: {
                            if (this.field_j) {
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
                            if (this.field_j) {
                              this.field_d = -1;
                              break L2;
                            } else {
                              return;
                            }
                          } else {
                            if (this.field_d != param1) {
                              this.field_d = param1;
                              this.field_j = true;
                              return;
                            } else {
                              this.field_d = param1;
                              this.field_j = true;
                              return;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L4: {
                      this.field_l = 0;
                      if (param0 <= -10) {
                        break L4;
                      } else {
                        field_g = (String[]) null;
                        break L4;
                      }
                    }
                    L5: {
                      if (0 != this.field_l) {
                        break L5;
                      } else {
                        L6: {
                          if (this.field_j) {
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
                          if (this.field_j) {
                            this.field_d = -1;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          if (this.field_d != param1) {
                            this.field_d = param1;
                            this.field_j = true;
                            break L5;
                          } else {
                            this.field_d = param1;
                            this.field_j = true;
                            break L5;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (param0 <= -10) {
                    if (0 == this.field_l) {
                      if (this.field_j) {
                        if (0 > param1) {
                          if (!this.field_j) {
                            return;
                          } else {
                            this.field_d = -1;
                            return;
                          }
                        } else {
                          if (this.field_d != param1) {
                            this.field_d = param1;
                            this.field_j = true;
                            return;
                          } else {
                            this.field_d = param1;
                            this.field_j = true;
                            return;
                          }
                        }
                      } else {
                        if (ll.field_a) {
                          if (0 > param1) {
                            if (this.field_j) {
                              this.field_d = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (this.field_d != param1) {
                              this.field_d = param1;
                              this.field_j = true;
                              return;
                            } else {
                              this.field_d = param1;
                              this.field_j = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    field_g = (String[]) null;
                    if (0 == this.field_l) {
                      L7: {
                        if (this.field_j) {
                          break L7;
                        } else {
                          if (ll.field_a) {
                            break L7;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (this.field_j) {
                          this.field_d = -1;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (this.field_d != param1) {
                          this.field_d = param1;
                          this.field_j = true;
                          return;
                        } else {
                          this.field_d = param1;
                          this.field_j = true;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L8: {
                  if (ci.field_d != 0) {
                    break L8;
                  } else {
                    if (kc.field_R != 0) {
                      break L8;
                    } else {
                      L9: {
                        this.field_l = 0;
                        if (param0 <= -10) {
                          break L9;
                        } else {
                          field_g = (String[]) null;
                          break L9;
                        }
                      }
                      L10: {
                        if (0 != this.field_l) {
                          break L10;
                        } else {
                          L11: {
                            if (this.field_j) {
                              break L11;
                            } else {
                              if (!ll.field_a) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (0 > param1) {
                            if (this.field_j) {
                              this.field_d = -1;
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            if (this.field_d != param1) {
                              this.field_d = param1;
                              this.field_j = true;
                              break L10;
                            } else {
                              this.field_d = param1;
                              this.field_j = true;
                              break L10;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 <= -10) {
                  if (0 == this.field_l) {
                    if (this.field_j) {
                      if (0 > param1) {
                        if (!this.field_j) {
                          return;
                        } else {
                          this.field_d = -1;
                          return;
                        }
                      } else {
                        if (this.field_d != param1) {
                          this.field_d = param1;
                          this.field_j = true;
                          return;
                        } else {
                          this.field_d = param1;
                          this.field_j = true;
                          return;
                        }
                      }
                    } else {
                      if (ll.field_a) {
                        L12: {
                          if (0 > param1) {
                            if (this.field_j) {
                              this.field_d = -1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (this.field_d != param1) {
                              this.field_d = param1;
                              this.field_j = true;
                              break L12;
                            } else {
                              this.field_d = param1;
                              this.field_j = true;
                              break L12;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L13: {
                    field_g = (String[]) null;
                    if (0 != this.field_l) {
                      break L13;
                    } else {
                      L14: {
                        if (this.field_j) {
                          break L14;
                        } else {
                          if (!ll.field_a) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (0 > param1) {
                        if (this.field_j) {
                          this.field_d = -1;
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        if (this.field_d != param1) {
                          this.field_d = param1;
                          this.field_j = true;
                          break L13;
                        } else {
                          this.field_d = param1;
                          this.field_j = true;
                          break L13;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L15: {
                if (this.field_l == 0) {
                  break L15;
                } else {
                  if (-1 == (kc.field_R ^ -1)) {
                    break L15;
                  } else {
                    if (-1 > (this.field_k ^ -1)) {
                      this.field_k = this.field_k - 1;
                      break L15;
                    } else {
                      this.field_k = rg.field_H;
                      this.field_k = this.field_k - 1;
                      break L15;
                    }
                  }
                }
              }
              L16: {
                if (ci.field_d != 0) {
                  break L16;
                } else {
                  if (kc.field_R != 0) {
                    break L16;
                  } else {
                    L17: {
                      this.field_l = 0;
                      if (param0 <= -10) {
                        break L17;
                      } else {
                        field_g = (String[]) null;
                        break L17;
                      }
                    }
                    L18: {
                      if (0 != this.field_l) {
                        break L18;
                      } else {
                        L19: {
                          if (this.field_j) {
                            break L19;
                          } else {
                            if (!ll.field_a) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        if (0 > param1) {
                          if (this.field_j) {
                            this.field_d = -1;
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          if (this.field_d != param1) {
                            this.field_d = param1;
                            this.field_j = true;
                            break L18;
                          } else {
                            this.field_d = param1;
                            this.field_j = true;
                            break L18;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (param0 <= -10) {
                if (0 == this.field_l) {
                  if (this.field_j) {
                    if (0 > param1) {
                      if (!this.field_j) {
                        return;
                      } else {
                        this.field_d = -1;
                        return;
                      }
                    } else {
                      if (this.field_d != param1) {
                        this.field_d = param1;
                        this.field_j = true;
                        return;
                      } else {
                        this.field_d = param1;
                        this.field_j = true;
                        return;
                      }
                    }
                  } else {
                    if (ll.field_a) {
                      L20: {
                        if (0 > param1) {
                          if (this.field_j) {
                            this.field_d = -1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (this.field_d != param1) {
                            this.field_d = param1;
                            this.field_j = true;
                            break L20;
                          } else {
                            this.field_d = param1;
                            this.field_j = true;
                            break L20;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L21: {
                  field_g = (String[]) null;
                  if (0 != this.field_l) {
                    break L21;
                  } else {
                    L22: {
                      if (this.field_j) {
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
                      if (this.field_j) {
                        this.field_d = -1;
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      if (this.field_d != param1) {
                        this.field_d = param1;
                        this.field_j = true;
                        break L21;
                      } else {
                        this.field_d = param1;
                        this.field_j = true;
                        break L21;
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
            this.field_l = 0;
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
          ((jp) (this)).field_j = stackIn_5_1 != 0;
          if (this.field_j) {
            this.field_d = param2;
            return;
          } else {
            this.field_d = param3;
            return;
          }
        } else {
          return;
        }
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, String param3, int param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = ZombieDawn.field_J;
            try {
              L0: {
                L1: {
                  if (param0 == 97) {
                    break L1;
                  } else {
                    field_c = (o) null;
                    break L1;
                  }
                }
                var5_ref = param1.getFile();
                var6 = 0;
                L2: while (true) {
                  L3: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) <= -1) {
                        if (-1 >= (param4 ^ -1)) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L4;
                      } else {
                        var6 = var7_int;
                        continue L2;
                      }
                    }
                  }
                  L5: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L5;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param3 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L7;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if ((var7_int ^ -1) <= -1) {
                      if (param2 == null) {
                        var6 = var7_int;
                        continue L2;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L2;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    var7 = new StringBuilder(var6);
                    discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (param4 > 0) {
                      discarded$10 = var7.append("/l=");
                      discarded$11 = var7.append(Integer.toString(param4));
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param3 == null) {
                      break L9;
                    } else {
                      if (-1 <= (param3.length() ^ -1)) {
                        break L9;
                      } else {
                        discarded$12 = var7.append("/p=");
                        discarded$13 = var7.append(param3);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param2 == null) {
                      break L10;
                    } else {
                      if (param2.length() > 0) {
                        discarded$14 = var7.append("/s=");
                        discarded$15 = var7.append(param2);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var6 < var5_ref.length()) {
                      discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L11;
                    } else {
                      discarded$17 = var7.append('/');
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackOut_41_0 = new java.net.URL(param1, var7.toString());
                      stackIn_42_0 = stackOut_41_0;
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_43_0 = (java.net.URL) (param1);
                    stackIn_44_0 = stackOut_43_0;
                    return stackIn_44_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) (var5);
                stackOut_45_1 = new StringBuilder().append("jp.F(").append(param0).append(',');
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param1 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L13;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L13;
                }
              }
              L14: {
                stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param2 == null) {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L14;
                } else {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L14;
                }
              }
              L15: {
                stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param3 == null) {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L15;
                } else {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L15;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param4 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void g(int param0) {
        int var2 = 0;
        var2 = -82 / ((param0 - -60) / 51);
        this.field_e = 0;
        this.field_b = 0;
        if (this.field_l == 0) {
          this.field_b = kg.field_i;
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
            this.field_b = -16;
            if (0 == this.field_l) {
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
            if (0 == this.field_l) {
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
          this.field_l = 0;
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
        ((jp) (this)).field_j = stackIn_3_1 != 0;
        if (!this.field_j) {
          if (param2 != -20258) {
            this.g(49);
            return;
          } else {
            return;
          }
        } else {
          this.field_d = param0;
          if (param2 == -20258) {
            return;
          } else {
            this.g(49);
            return;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != -97) {
            return false;
        }
        return (this.field_b ^ -1) == -97 ? true : false;
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
            this.b(42, -37);
            if ((this.field_b ^ -1) != -98) {
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
            if ((this.field_b ^ -1) != -98) {
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
        this.field_e = 0;
        this.field_b = 0;
        if (param0 == 21657) {
          L0: {
            if (0 != this.field_l) {
              break L0;
            } else {
              if (kg.field_i == 98) {
                L1: {
                  if (0 >= this.field_d) {
                    this.field_d = this.field_h;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_d = this.field_d - 1;
                this.field_j = false;
                break L0;
              } else {
                L2: {
                  if (this.field_l == 0) {
                    this.field_b = kg.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_l == 0) {
                  if ((kg.field_i ^ -1) == -100) {
                    this.field_d = this.field_d + 1;
                    this.field_j = false;
                    if (this.field_h <= this.field_d) {
                      this.field_d = 0;
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
            if (this.field_l == 0) {
              this.field_b = kg.field_i;
              break L3;
            } else {
              break L3;
            }
          }
          if (this.field_l == 0) {
            if ((kg.field_i ^ -1) == -100) {
              this.field_d = this.field_d + 1;
              this.field_j = false;
              if (this.field_h <= this.field_d) {
                this.field_d = 0;
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

    final static void a(byte param0) {
        int var1 = -48 / ((param0 - 16) / 50);
        if (!(null == kk.field_i)) {
            kk.field_i.h((byte) 74);
        }
        ni.field_c = new fh();
        bm.field_d.b(20, ni.field_c);
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        if (this.field_l == 0) {
          this.field_d = param0;
          this.field_j = false;
          var3 = -31 / ((-12 - param1) / 56);
          return;
        } else {
          var3 = -31 / ((-12 - param1) / 56);
          return;
        }
    }

    final static void b(byte param0) {
        rl.c(9);
        if (param0 != -50) {
            field_a = -13;
            og.b(-126, 4);
            return;
        }
        og.b(-126, 4);
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return (this.field_b ^ -1) == -103 ? true : false;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_a = 85;
          field_i = null;
          field_c = null;
          field_g = null;
          return;
        } else {
          field_i = null;
          field_c = null;
          field_g = null;
          return;
        }
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -119) {
          if (-1 == (this.field_e ^ -1)) {
            if (-85 != (this.field_b ^ -1)) {
              if ((this.field_b ^ -1) == -84) {
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
          this.field_h = -98;
          if (-1 == (this.field_e ^ -1)) {
            if (-85 == (this.field_b ^ -1)) {
              return true;
            } else {
              L0: {
                if ((this.field_b ^ -1) != -84) {
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

    final static fn a(byte param0, int param1) {
        tm var2 = null;
        var2 = new tm(param1);
        var2.field_j.e(-1);
        if (param0 <= 123) {
          field_a = -55;
          kn.field_L.a(0, var2);
          return var2.field_j;
        } else {
          kn.field_L.a(0, var2);
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
            if ((this.field_b ^ -1) != -104) {
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
            if ((this.field_b ^ -1) != -104) {
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
        this.field_e = 0;
        this.field_b = 0;
        if (0 == this.field_l) {
          if (-97 == (kg.field_i ^ -1)) {
            if (-1 > (this.field_d ^ -1)) {
              this.field_d = this.field_d - 1;
              this.field_j = false;
              if (param1 != (this.field_l ^ -1)) {
                L0: {
                  if (0 != this.field_l) {
                    break L0;
                  } else {
                    if (-98 == (kg.field_i ^ -1)) {
                      this.field_d = this.field_d + 1;
                      this.field_j = false;
                      if (this.field_h > this.field_d) {
                        break L0;
                      } else {
                        this.field_d = 0;
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                L1: {
                  if (-1 != (this.field_l ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (-99 == (kg.field_i ^ -1)) {
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
                      if (0 > this.field_d) {
                        this.field_d = param0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_j = false;
                    break L1;
                  }
                }
                return;
              } else {
                L4: {
                  this.field_b = kg.field_i;
                  if (0 != this.field_l) {
                    break L4;
                  } else {
                    if (-98 == (kg.field_i ^ -1)) {
                      this.field_d = this.field_d + 1;
                      this.field_j = false;
                      if (this.field_h > this.field_d) {
                        break L4;
                      } else {
                        this.field_d = 0;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-1 != (this.field_l ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (-99 == (kg.field_i ^ -1)) {
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
                      if (0 > this.field_d) {
                        this.field_d = param0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_j = false;
                    break L5;
                  }
                }
                return;
              }
            } else {
              this.field_d = this.field_h;
              L8: {
                this.field_d = this.field_d - 1;
                this.field_j = false;
                if (param1 != (this.field_l ^ -1)) {
                  break L8;
                } else {
                  this.field_b = kg.field_i;
                  break L8;
                }
              }
              L9: {
                if (0 != this.field_l) {
                  break L9;
                } else {
                  if (-98 == (kg.field_i ^ -1)) {
                    this.field_d = this.field_d + 1;
                    this.field_j = false;
                    if (this.field_h > this.field_d) {
                      break L9;
                    } else {
                      this.field_d = 0;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              if (-1 == (this.field_l ^ -1)) {
                if (-99 != (kg.field_i ^ -1)) {
                  if (99 != kg.field_i) {
                    return;
                  } else {
                    L10: {
                      if (0 > this.field_d) {
                        this.field_d = param0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    this.field_j = false;
                    return;
                  }
                } else {
                  L11: {
                    if (0 > this.field_d) {
                      this.field_d = param0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  this.field_j = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (param1 != (this.field_l ^ -1)) {
              L12: {
                if (0 != this.field_l) {
                  break L12;
                } else {
                  if (-98 == (kg.field_i ^ -1)) {
                    this.field_d = this.field_d + 1;
                    this.field_j = false;
                    if (this.field_h > this.field_d) {
                      break L12;
                    } else {
                      L13: {
                        this.field_d = 0;
                        if (-1 != (this.field_l ^ -1)) {
                          break L13;
                        } else {
                          L14: {
                            if (-99 == (kg.field_i ^ -1)) {
                              break L14;
                            } else {
                              if (99 == kg.field_i) {
                                break L14;
                              } else {
                                return;
                              }
                            }
                          }
                          L15: {
                            if (0 > this.field_d) {
                              this.field_d = param0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          this.field_j = false;
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      if (-1 != (this.field_l ^ -1)) {
                        break L16;
                      } else {
                        L17: {
                          if (-99 == (kg.field_i ^ -1)) {
                            break L17;
                          } else {
                            if (99 == kg.field_i) {
                              break L17;
                            } else {
                              return;
                            }
                          }
                        }
                        L18: {
                          if (0 > this.field_d) {
                            this.field_d = param0;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        this.field_j = false;
                        break L16;
                      }
                    }
                    return;
                  }
                }
              }
              L19: {
                if (-1 != (this.field_l ^ -1)) {
                  break L19;
                } else {
                  L20: {
                    if (-99 == (kg.field_i ^ -1)) {
                      break L20;
                    } else {
                      if (99 == kg.field_i) {
                        break L20;
                      } else {
                        return;
                      }
                    }
                  }
                  L21: {
                    if (0 > this.field_d) {
                      this.field_d = param0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  this.field_j = false;
                  break L19;
                }
              }
              return;
            } else {
              this.field_b = kg.field_i;
              if (0 == this.field_l) {
                if (-98 == (kg.field_i ^ -1)) {
                  this.field_d = this.field_d + 1;
                  this.field_j = false;
                  if (this.field_h <= this.field_d) {
                    this.field_d = 0;
                    if (-1 == (this.field_l ^ -1)) {
                      if (-99 != (kg.field_i ^ -1)) {
                        if (99 != kg.field_i) {
                          return;
                        } else {
                          L22: {
                            if (0 > this.field_d) {
                              this.field_d = param0;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          this.field_j = false;
                          return;
                        }
                      } else {
                        L23: {
                          if (0 > this.field_d) {
                            this.field_d = param0;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        this.field_j = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (-1 == (this.field_l ^ -1)) {
                      if (-99 != (kg.field_i ^ -1)) {
                        if (99 == kg.field_i) {
                          L24: {
                            if (0 > this.field_d) {
                              this.field_d = param0;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          this.field_j = false;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L25: {
                          if (0 > this.field_d) {
                            this.field_d = param0;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        this.field_j = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L26: {
                    if (-1 != (this.field_l ^ -1)) {
                      break L26;
                    } else {
                      L27: {
                        if (-99 == (kg.field_i ^ -1)) {
                          break L27;
                        } else {
                          if (99 == kg.field_i) {
                            break L27;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L28: {
                        if (0 > this.field_d) {
                          this.field_d = param0;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      this.field_j = false;
                      break L26;
                    }
                  }
                  return;
                }
              } else {
                if (-1 == (this.field_l ^ -1)) {
                  if (-99 != (kg.field_i ^ -1)) {
                    if (99 == kg.field_i) {
                      L29: {
                        if (0 > this.field_d) {
                          this.field_d = param0;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      this.field_j = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L30: {
                      if (0 > this.field_d) {
                        this.field_d = param0;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    this.field_j = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param1 != (this.field_l ^ -1)) {
            L31: {
              if (0 != this.field_l) {
                break L31;
              } else {
                if (-98 == (kg.field_i ^ -1)) {
                  this.field_d = this.field_d + 1;
                  this.field_j = false;
                  if (this.field_h > this.field_d) {
                    break L31;
                  } else {
                    L32: {
                      this.field_d = 0;
                      if (-1 != (this.field_l ^ -1)) {
                        break L32;
                      } else {
                        L33: {
                          if (-99 == (kg.field_i ^ -1)) {
                            break L33;
                          } else {
                            if (99 == kg.field_i) {
                              break L33;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L34: {
                          if (0 > this.field_d) {
                            this.field_d = param0;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        this.field_j = false;
                        break L32;
                      }
                    }
                    return;
                  }
                } else {
                  L35: {
                    if (-1 != (this.field_l ^ -1)) {
                      break L35;
                    } else {
                      L36: {
                        if (-99 == (kg.field_i ^ -1)) {
                          break L36;
                        } else {
                          if (99 == kg.field_i) {
                            break L36;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L37: {
                        if (0 > this.field_d) {
                          this.field_d = param0;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      this.field_j = false;
                      break L35;
                    }
                  }
                  return;
                }
              }
            }
            if (-1 == (this.field_l ^ -1)) {
              if (-99 != (kg.field_i ^ -1)) {
                if (99 != kg.field_i) {
                  return;
                } else {
                  L38: {
                    if (0 > this.field_d) {
                      this.field_d = param0;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  this.field_j = false;
                  return;
                }
              } else {
                L39: {
                  if (0 > this.field_d) {
                    this.field_d = param0;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                this.field_j = false;
                return;
              }
            } else {
              return;
            }
          } else {
            L40: {
              this.field_b = kg.field_i;
              if (0 != this.field_l) {
                break L40;
              } else {
                if (-98 == (kg.field_i ^ -1)) {
                  this.field_d = this.field_d + 1;
                  this.field_j = false;
                  if (this.field_h > this.field_d) {
                    break L40;
                  } else {
                    this.field_d = 0;
                    break L40;
                  }
                } else {
                  break L40;
                }
              }
            }
            L41: {
              if (-1 != (this.field_l ^ -1)) {
                break L41;
              } else {
                L42: {
                  if (-99 == (kg.field_i ^ -1)) {
                    break L42;
                  } else {
                    if (99 == kg.field_i) {
                      break L42;
                    } else {
                      break L41;
                    }
                  }
                }
                L43: {
                  if (0 > this.field_d) {
                    this.field_d = param0;
                    break L43;
                  } else {
                    break L43;
                  }
                }
                this.field_j = false;
                break L41;
              }
            }
            return;
          }
        }
    }

    jp(int param0) {
        this.field_j = false;
        this.field_d = 0;
        this.field_h = param0;
    }

    static {
        field_f = new int[128];
        field_i = "SCORE: <%0>";
        field_g = new String[]{"Ooops. It looks like there are no more humans left with the keycards you need. You'd better press 'ESC' to go to the menu and choose 'Retry'. Now.", "Uh-oh. Now you've done it. You've allowed the human you needed to get killed! Gah. Press 'ESC' to go to the menu and choose 'Retry'.", "Zombies can't use keycards. Come on, you knew that. Press 'ESC' to go to the menu and choose 'Retry'."};
        field_m = false;
    }
}
