/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends za {
    static String field_i;
    jaclib.memory.heap.NativeHeap field_h;

    public static void b(int param0) {
        if (param0 != -197) {
            return;
        }
        field_i = null;
    }

    final void b(byte param0) {
        ((cp) this).field_h.a();
        if (param0 < 83) {
            cp.b(126);
        }
    }

    cp(int param0) {
        ((cp) this).field_h = new jaclib.memory.heap.NativeHeap(param0);
    }

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          cp.b(64);
          var2 = param1;
          if (var2 != 32) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 != 95) {
                  if (45 != var2) {
                    L1: {
                      if (var2 == 91) {
                        break L1;
                      } else {
                        if (var2 != 93) {
                          if (35 != var2) {
                            L2: {
                              if (var2 != 224) {
                                if (var2 == 225) {
                                  break L2;
                                } else {
                                  if (var2 != 226) {
                                    if (var2 == 228) {
                                      break L2;
                                    } else {
                                      if (var2 != 227) {
                                        if (192 != var2) {
                                          if (var2 == 193) {
                                            break L2;
                                          } else {
                                            if (var2 != 194) {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (var2 != 233) {
                                                        if (var2 != 234) {
                                                          if (var2 != 235) {
                                                            if (var2 != 200) {
                                                              if (var2 != 201) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (var2 == 203) {
                                                                    break L3;
                                                                  } else {
                                                                    L4: {
                                                                      if (var2 == 237) {
                                                                        break L4;
                                                                      } else {
                                                                        if (var2 == 238) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 != 239) {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 == 206) {
                                                                                break L4;
                                                                              } else {
                                                                                if (207 == var2) {
                                                                                  break L4;
                                                                                } else {
                                                                                  if (242 != var2) {
                                                                                    if (var2 != 243) {
                                                                                      if (var2 != 244) {
                                                                                        L5: {
                                                                                          if (246 == var2) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (245 == var2) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (var2 != 211) {
                                                                                                  if (var2 == 212) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (250 != var2) {
                                                                                                              if (251 == var2) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 == 252) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (var2 == 217) {
                                                                                                                    break L6;
                                                                                                                  } else {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (220 != var2) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (var2 == 255) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if (var2 == 209) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (var2 != 223) {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
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
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'o';
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  }
                                                                }
                                                              } else {
                                                                return 'e';
                                                              }
                                                            } else {
                                                              return 'e';
                                                            }
                                                          } else {
                                                            return 'e';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                return 'a';
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (var2 != 32) {
            if (var2 != 160) {
              L7: {
                if (var2 != 95) {
                  if (45 != var2) {
                    if (var2 != 91) {
                      L8: {
                        if (var2 != 93) {
                          if (35 != var2) {
                            L9: {
                              if (var2 != 224) {
                                if (var2 != 225) {
                                  if (var2 != 226) {
                                    if (var2 == 228) {
                                      break L9;
                                    } else {
                                      if (var2 != 227) {
                                        if (192 != var2) {
                                          if (var2 == 193) {
                                            break L9;
                                          } else {
                                            if (var2 != 194) {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    if (232 == var2) {
                                                      break L10;
                                                    } else {
                                                      if (var2 != 233) {
                                                        if (var2 != 234) {
                                                          if (var2 != 235) {
                                                            if (var2 != 200) {
                                                              if (var2 != 201) {
                                                                if (202 == var2) {
                                                                  break L10;
                                                                } else {
                                                                  if (var2 == 203) {
                                                                    break L10;
                                                                  } else {
                                                                    L11: {
                                                                      if (var2 == 237) {
                                                                        break L11;
                                                                      } else {
                                                                        if (var2 == 238) {
                                                                          break L11;
                                                                        } else {
                                                                          if (var2 != 239) {
                                                                            if (var2 == 205) {
                                                                              break L11;
                                                                            } else {
                                                                              if (var2 == 206) {
                                                                                break L11;
                                                                              } else {
                                                                                if (207 == var2) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L12: {
                                                                                    if (242 != var2) {
                                                                                      if (var2 != 243) {
                                                                                        if (var2 != 244) {
                                                                                          if (246 == var2) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (245 == var2) {
                                                                                              break L12;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L12;
                                                                                              } else {
                                                                                                if (var2 != 211) {
                                                                                                  if (var2 == 212) {
                                                                                                    break L12;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      if (var2 == 213) {
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        L13: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L13;
                                                                                                          } else {
                                                                                                            if (250 != var2) {
                                                                                                              if (251 == var2) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                if (var2 == 252) {
                                                                                                                  break L13;
                                                                                                                } else {
                                                                                                                  if (var2 == 217) {
                                                                                                                    break L13;
                                                                                                                  } else {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L13;
                                                                                                                    } else {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (220 != var2) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (var2 == 255) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if (var2 == 209) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (var2 != 223) {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
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
                                                                                                            } else {
                                                                                                              break L13;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  break L12;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L12;
                                                                                        }
                                                                                      } else {
                                                                                        break L12;
                                                                                      }
                                                                                    } else {
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L11;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  }
                                                                }
                                                              } else {
                                                                break L10;
                                                              }
                                                            } else {
                                                              break L10;
                                                            }
                                                          } else {
                                                            break L10;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      } else {
                                                        break L10;
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                break L9;
                              }
                            }
                            return 'a';
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                      return param1;
                    } else {
                      return param1;
                    }
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              return '_';
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Decline invitation to <%0>'s game";
    }
}
