/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends dj implements nl {
    static int field_T;
    private int field_S;
    static int field_R;
    static String field_U;
    static byte[] field_K;
    private dg field_Q;

    final String c(byte param0) {
        if (param0 != 69) {
            this.c((byte) -87);
            if (!this.field_l) {
                return null;
            }
            if (null != this.field_j) {
                oe.a(ue.field_e, (byte) -84, qa.field_a + this.field_r - this.field_S);
                return this.field_j;
            }
            return null;
        }
        if (!this.field_l) {
            return null;
        }
        if (null != this.field_j) {
            oe.a(ue.field_e, (byte) -84, qa.field_a + this.field_r - this.field_S);
            return this.field_j;
        }
        return null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 80) {
            field_R = -109;
          }
          stackIn_3_0 = bi.a(false, param1, (byte) -121);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);

          stackIn_6_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        if (param0) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3);
            this.field_S = -this.field_v + (qa.field_a - param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    hc(String param0, bb param1, int param2) {
        super(param0, param1, param2);
    }

    public final dg a(byte param0) {
        if (param0 > -97) {
            field_U = (String) null;
            return this.field_Q;
        }
        return this.field_Q;
    }

    final static char a(char param0, int param1) {
        int var2;
        if (param1 != -227) {
          hc.k(82);
          var2 = param0;
          if (32 != var2) {
            if (var2 != 160) {
              if (var2 != 95) {
                if (var2 != 45) {
                  if (var2 != 91) {
                    if (93 != var2) {
                      if (35 != var2) {
                        if (var2 != 224) {
                          if (var2 != 225) {
                            if (var2 != 226) {
                              if (var2 != 228) {
                                if (var2 != 227) {
                                  if (var2 != 192) {
                                    if (var2 != 193) {
                                      if (var2 != 194) {
                                        if (var2 != 196) {
                                          if (var2 != 195) {
                                            if (var2 != 232) {
                                              if (var2 != 233) {
                                                if (var2 != 234) {
                                                  if (var2 != 235) {
                                                    if (var2 != 200) {
                                                      if (var2 != 201) {
                                                        if (var2 != 202) {
                                                          if (var2 != 203) {
                                                            if (var2 != 237) {
                                                              if (var2 != 238) {
                                                                if (239 != var2) {
                                                                  if (var2 != 205) {
                                                                    if (var2 != 206) {
                                                                      if (var2 != 207) {
                                                                        if (var2 != 242) {
                                                                          if (243 != var2) {
                                                                            if (var2 != 244) {
                                                                              if (var2 != 246) {
                                                                                if (var2 != 245) {
                                                                                  if (var2 != 210) {
                                                                                    if (var2 != 211) {
                                                                                      if (var2 != 212) {
                                                                                        if (var2 != 214) {
                                                                                          if (var2 != 213) {
                                                                                            if (249 != var2) {
                                                                                              if (250 != var2) {
                                                                                                if (var2 != 251) {
                                                                                                  if (var2 != 252) {
                                                                                                    if (var2 != 217) {
                                                                                                      if (218 != var2) {
                                                                                                        if (var2 != 219) {
                                                                                                          if (var2 != 220) {
                                                                                                            if (var2 != 231) {
                                                                                                              if (var2 == 199) {
                                                                                                                return 'c';
                                                                                                              } else {
                                                                                                                if (var2 != 255) {
                                                                                                                  if (var2 == 376) {
                                                                                                                    return 'y';
                                                                                                                  } else {
                                                                                                                    if (var2 != 241) {
                                                                                                                      if (var2 != 209) {
                                                                                                                        if (var2 == 223) {
                                                                                                                          return 'b';
                                                                                                                        } else {
                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'n';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            }
                                                                                            return 'u';
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        }
                                                                        return 'o';
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'e';
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return 'e';
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        return 'a';
                      }
                    }
                  }
                  return param0;
                }
              }
            } else {
              return '_';
            }
          }
          return '_';
        } else {
          var2 = param0;
          if (32 != var2) {
            if (var2 != 160) {
              if (var2 != 95) {
                if (var2 != 45) {
                  if (var2 != 91) {
                    if (93 != var2) {
                      if (35 != var2) {
                        if (var2 != 224) {
                          if (var2 != 225) {
                            if (var2 != 226) {
                              if (var2 != 228) {
                                if (var2 != 227) {
                                  if (var2 != 192) {
                                    if (var2 != 193) {
                                      if (var2 != 194) {
                                        if (var2 != 196) {
                                          if (var2 != 195) {
                                            if (var2 != 232) {
                                              if (var2 != 233) {
                                                if (var2 != 234) {
                                                  if (var2 != 235) {
                                                    if (var2 != 200) {
                                                      if (var2 != 201) {
                                                        if (var2 != 202) {
                                                          if (var2 != 203) {
                                                            if (var2 != 237) {
                                                              if (var2 != 238) {
                                                                if (239 != var2) {
                                                                  if (var2 != 205) {
                                                                    if (var2 != 206) {
                                                                      if (var2 != 207) {
                                                                        if (var2 != 242) {
                                                                          if (243 != var2) {
                                                                            if (var2 != 244) {
                                                                              if (var2 != 246) {
                                                                                if (var2 != 245) {
                                                                                  if (var2 != 210) {
                                                                                    if (var2 != 211) {
                                                                                      if (var2 != 212) {
                                                                                        if (var2 != 214) {
                                                                                          if (var2 != 213) {
                                                                                            if (249 != var2) {
                                                                                              if (250 != var2) {
                                                                                                if (var2 != 251) {
                                                                                                  if (var2 != 252) {
                                                                                                    if (var2 != 217) {
                                                                                                      if (218 != var2) {
                                                                                                        if (var2 != 219) {
                                                                                                          if (var2 != 220) {
                                                                                                            if (var2 != 231) {
                                                                                                              if (var2 == 199) {
                                                                                                                return 'c';
                                                                                                              } else {
                                                                                                                if (var2 != 255) {
                                                                                                                  if (var2 == 376) {
                                                                                                                    return 'y';
                                                                                                                  } else {
                                                                                                                    if (var2 != 241) {
                                                                                                                      if (var2 != 209) {
                                                                                                                        if (var2 == 223) {
                                                                                                                          return 'b';
                                                                                                                        } else {
                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'n';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'u';
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        return 'o';
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            return 'i';
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return 'e';
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        return 'a';
                      }
                    }
                    return param0;
                  } else {
                    return param0;
                  }
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          field_T = -8;
        }
        if (pg.field_c == null) {
          return;
        } else {
          var1 = pg.field_c;
          synchronized (var1) {
            pg.field_c = null;
          }
          return;
        }
    }

    final void a(byte param0, dg param1) {
        try {
            this.field_Q = param1;
            int var3_int = 48 % ((param0 - 34) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(byte param0) {
        super.g((byte) -66);
        if (this.field_Q != null) {
            this.field_Q.b(-28133);
            if (param0 > -16) {
                this.field_S = -4;
                return;
            }
            return;
        }
        if (param0 <= -16) {
            return;
        }
        this.field_S = -4;
    }

    public static void k(int param0) {
        field_U = null;
        field_K = null;
        if (param0 != -243) {
            field_T = -90;
        }
    }

    static {
        field_U = "Go Back";
    }
}
