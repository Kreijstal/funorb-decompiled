/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp {
    static er field_b;
    static int[] field_d;
    private li field_a;
    private nj field_e;
    static r field_c;

    final li a(int param0, li param1) {
        li var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        li stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_e.field_h.field_c;
                break L1;
              }
            }
            if (this.field_e.field_h == var3) {
              this.field_a = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_c;
              var4 = 33 % ((-64 - param0) / 34);
              stackIn_8_0 = (li) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("vp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (li) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final li c(int param0) {
        li var2;
        var2 = this.field_a;
        if (var2 == this.field_e.field_h) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_c;
          if (param0 != 2) {
            field_d = (int[]) null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final li b(int param0) {
        li var2 = null;
        if (param0 != 4) {
            li var3 = (li) null;
            this.a(23, (li) null);
            var2 = this.field_e.field_h.field_a;
            if (!(this.field_e.field_h != var2)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_a;
            return var2;
        }
        var2 = this.field_e.field_h.field_a;
        if (!(this.field_e.field_h != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_a;
        return var2;
    }

    final li a(li param0, int param1) {
        li var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        li stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = this.field_e.field_h.field_a;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != this.field_e.field_h) {
              L2: {
                this.field_a = var3.field_a;
                if (param1 == 3) {
                  break L2;
                } else {
                  this.field_a = (li) null;
                  break L2;
                }
              }
              stackIn_9_0 = (li) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("vp.G(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (li) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    final li d(int param0) {
        li var2;
        var2 = this.field_e.field_h.field_c;
        if (var2 == this.field_e.field_h) {
          this.field_a = null;
          return null;
        } else {
          if (param0 != 4) {
            return (li) null;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -36 / ((28 - param0) / 47);
        return oj.field_O[param1].length;
    }

    vp(nj param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "vp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -91) {
            return;
        }
        field_d = null;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        if (param0 == 18055) {
          L0: {
            L1: {
              L2: {
                if ((param1 ^ -1) <= -1) {
                  break L2;
                } else {
                  if ((param1 ^ -1) == 3) {
                    break L2;
                  } else {
                    if (4 == (param1 ^ -1)) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) == 1) {
                        break L2;
                      } else {
                        if ((param1 ^ -1) == 2) {
                          break L2;
                        } else {
                          if (-7 != param1) {
                            break L1;
                          } else {
                            L3: {
                              L4: {
                                if (param1 == 1) {
                                  break L4;
                                } else {
                                  if (2 == param1) {
                                    break L4;
                                  } else {
                                    if (22 == param1) {
                                      break L4;
                                    } else {
                                      if (param1 == 3) {
                                        break L4;
                                      } else {
                                        if (4 != param1) {
                                          stackIn_83_0 = 0;
                                          break L3;
                                        } else {
                                          return true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackIn_83_0 = 1;
                              break L3;
                            }
                            return stackIn_83_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == 1) {
                break L1;
              } else {
                if (2 == param1) {
                  break L1;
                } else {
                  if (22 == param1) {
                    break L1;
                  } else {
                    if (param1 == 3) {
                      break L1;
                    } else {
                      if (4 != param1) {
                        stackIn_92_0 = 0;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            stackIn_92_0 = 1;
            break L0;
          }
          return stackIn_92_0 != 0;
        } else {
          vp.a(72);
          if ((param1 ^ -1) > -1) {
            if ((param1 ^ -1) != 3) {
              if (4 != (param1 ^ -1)) {
                if ((param1 ^ -1) != 1) {
                  L5: {
                    L6: {
                      if ((param1 ^ -1) == 2) {
                        if (param1 == 1) {
                          break L6;
                        } else {
                          if (2 == param1) {
                            break L6;
                          } else {
                            if (22 == param1) {
                              break L6;
                            } else {
                              if (param1 == 3) {
                                break L6;
                              } else {
                                if (4 != param1) {
                                  stackIn_68_0 = 0;
                                  break L5;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (-7 != param1) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              if (param1 == 1) {
                                break L8;
                              } else {
                                if (2 == param1) {
                                  break L8;
                                } else {
                                  if (22 == param1) {
                                    break L8;
                                  } else {
                                    if (param1 == 3) {
                                      break L8;
                                    } else {
                                      if (4 != param1) {
                                        stackIn_59_0 = 0;
                                        break L7;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackIn_59_0 = 1;
                            break L7;
                          }
                          return stackIn_59_0 != 0;
                        }
                      }
                    }
                    stackIn_68_0 = 1;
                    break L5;
                  }
                  return stackIn_68_0 != 0;
                } else {
                  L9: {
                    L10: {
                      if (param1 == 1) {
                        break L10;
                      } else {
                        if (2 == param1) {
                          break L10;
                        } else {
                          if (22 == param1) {
                            break L10;
                          } else {
                            if (param1 == 3) {
                              break L10;
                            } else {
                              if (4 != param1) {
                                stackIn_48_0 = 0;
                                break L9;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_48_0 = 1;
                    break L9;
                  }
                  return stackIn_48_0 != 0;
                }
              } else {
                if (param1 != 1) {
                  if (2 != param1) {
                    L11: {
                      L12: {
                        if (22 == param1) {
                          break L12;
                        } else {
                          if (param1 == 3) {
                            break L12;
                          } else {
                            if (4 != param1) {
                              stackIn_38_0 = 0;
                              break L11;
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                      stackIn_38_0 = 1;
                      break L11;
                    }
                    return stackIn_38_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (param1 != 1) {
                if (2 != param1) {
                  if (22 != param1) {
                    if (param1 != 3) {
                      if (4 != param1) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            if (param1 != 1) {
              if (2 != param1) {
                L13: {
                  L14: {
                    if (22 == param1) {
                      break L14;
                    } else {
                      if (param1 == 3) {
                        break L14;
                      } else {
                        if (4 != param1) {
                          stackIn_12_0 = 0;
                          break L13;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  break L13;
                }
                return stackIn_12_0 != 0;
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    final li a(byte param0) {
        li var2;
        var2 = this.field_a;
        if (this.field_e.field_h != var2) {
          this.field_a = var2.field_a;
          if (param0 < 13) {
            return (li) null;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    static {
    }
}
