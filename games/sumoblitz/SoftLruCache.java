/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SoftLruCache {
    private int remainingCapacity;
    private SecondaryNodeDeque recency;
    private int capacity;
    static PacketBuffer field_e;
    static String achievementsThisGameText;
    private IterableNodeHashTable entries;
    static SpriteData[] field_a;
    static int field_f;

    final static RasterBuffer a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          RasterBuffer stackIn_2_0 = null;
          RasterBuffer stackIn_4_0 = null;
          ImageProducerRasterBuffer stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("rk");
              var5 = (RasterBuffer) (var4.newInstance());
              if (param2 != 0) {
                stackIn_2_0 = (RasterBuffer) null;
                return stackIn_2_0;
              }
              var5.a(param3, param0, param1, param2 - 119);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).a(param3, param0, param1, -125);
              stackIn_6_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("sd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object nextValue(byte guard) {
        CacheReferenceNode var2;
        Object var3;
        CacheReferenceNode var4;
        int var5;
        byte[] var6;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (CacheReferenceNode) (this.entries.next(-1));
        while (var2 != null) {
          var3 = var2.getValue((byte) 107);
          if (var3 != null) {
            return var3;
          }
          var4 = var2;
          var2 = (CacheReferenceNode) (this.entries.next(-1));
          var4.unlink(false);
          var4.unlinkSecondary(-5106);
          this.remainingCapacity = this.remainingCapacity + var4.weight;
        }
        if (guard == -92) {
          return null;
        }
        var6 = (byte[]) null;
        SoftLruCache.decodeCp1252((byte[]) null, 41, -100, 63);
        return null;
    }

    final Object get(long key, int guard) {
        StrongCacheReference var6 = null;
        CacheReferenceNode var7 = (CacheReferenceNode) (this.entries.get(575, key));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.getValue((byte) -81);
        if (var5 == null) {
          var7.unlink(false);
          var7.unlinkSecondary(-5106);
          this.remainingCapacity = this.remainingCapacity + var7.weight;
          return null;
        }
        if (var7.isSoftReference(115)) {
          var6 = new StrongCacheReference(var5, var7.weight);
          this.entries.put(-20657, var6, var7.key);
          this.recency.addLast((DualLinkNode) (var6), (byte) -122);
          ((CacheReferenceNode) ((Object) var6)).secondaryKey = 0L;
          var7.unlink(false);
          var7.unlinkSecondary(-5106);
        } else {
          this.recency.addLast((DualLinkNode) (var7), (byte) -124);
          var7.secondaryKey = 0L;
        }
        if (guard <= 43) {
          this.remainingCapacity = 126;
        }
        return var5;
    }

    final void age(int maxStrongAge, int guard) {
        long fieldTemp$0 = 0L;
        CacheReferenceNode var3;
        SoftCacheReference var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 22663) {
          return;
        }
        var3 = (CacheReferenceNode) (this.recency.first(-1));
        while (var3 != null) {
          if (var3.isSoftReference(guard ^ -22690)) {
            if (var3.getValue((byte) -62) == null) {
              var3.unlink(false);
              var3.unlinkSecondary(-5106);
              this.remainingCapacity = this.remainingCapacity + var3.weight;
            }
          } else {
            fieldTemp$0 = var3.secondaryKey + 1L;
            var3.secondaryKey = var3.secondaryKey + 1L;
            if (fieldTemp$0 <= (long)maxStrongAge) {
              var3 = (CacheReferenceNode) (this.recency.next((byte) -122));
              continue;
            }
            var4 = new SoftCacheReference(var3.getValue((byte) -102), var3.weight);
            this.entries.put(guard ^ -2104, var4, var3.key);
            pt.a(var3, 2066481250, var4);
            var3.unlink(false);
            var3.unlinkSecondary(-5106);
          }
          var3 = (CacheReferenceNode) (this.recency.next((byte) -122));
        }
        return;
    }

    static long bitwiseAnd(long left, long right) {
        return left & right;
    }

    final static void writeReflectionReply(pl packet, int guard) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_66_0 = null;
          StringBuilder stackIn_66_1 = null;
          String stackIn_67_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          ReflectionCheck var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          ReflectionCheck var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (guard <= 126) {
              return;
            }
            var13 = (ReflectionCheck) (qr.reflectionChecks.first(-77));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var17.size > var4; var4++) {
              if (var13.fieldTasks[var4] != null) {
                if (2 == var13.fieldTasks[var4].status) {
                  var13.errors[var4] = -5;
                }
                if (0 == var13.fieldTasks[var4].status) {
                  var3 = 1;
                }
              }
              if (null != var13.methodTasks[var4]) {
                if (2 == var13.methodTasks[var4].status) {
                  var13.errors[var4] = -6;
                }
                if (var13.methodTasks[var4].status == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = packet.position;
            packet.writeInt(48, var17.id);
            for (var5 = 0; var17.size > var5; var5++) {
              if (var17.errors[var5] == 0) {
                try {
                  var6_int = var17.operations[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.fieldTasks[var5].result);
                    var8 = var15.getInt((Object) null);
                    packet.writeByte((byte) 106, 0);
                    packet.writeInt(48, var8);
                  } else {
                    if (1 == var6_int) {
                      var16_ref = (java.lang.reflect.Field) (var17.fieldTasks[var5].result);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.fieldValues[var5]);
                      packet.writeByte((byte) 92, 0);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.fieldTasks[var5].result);
                        var8 = var26.getModifiers();
                        packet.writeByte((byte) 88, 0);
                        packet.writeInt(48, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.methodTasks[var5].result);
                    var25 = var17.arguments[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      packet.writeByte((byte) 39, 0);
                    } else if (var10 instanceof Number) {
                      packet.writeByte((byte) 56, 1);
                      packet.writeLong(false, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      packet.writeByte((byte) 49, 4);
                    } else {
                      packet.writeByte((byte) 34, 2);
                      packet.writeCp1252String((String) (var10), (byte) -104);
                    }
                  } else {
                    if (4 == var6_int) {
                      var27 = (java.lang.reflect.Method) (var17.methodTasks[var5].result);
                      var8Lifetime1 = var27.getModifiers();
                      packet.writeByte((byte) 93, 0);
                      packet.writeInt(48, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 93, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 41, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 108, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 42, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 53, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 86, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 106, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 33, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 18, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 48, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  packet.writeByte((byte) 125, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  packet.writeByte((byte) 86, -21);
                }
              } else {
                packet.writeByte((byte) 118, var17.errors[var5]);
              }
            }
            packet.appendCrc32(var4, false);
            var17.unlink(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_66_0 = var2;
            stackIn_66_1 = new StringBuilder().append("sd.G(");
            if (packet == null) {
              stackIn_67_2 = "null";
            } else {
              stackIn_67_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SoftLruCache(int maxWeight) {
        this(maxWeight, maxWeight);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = Sumoblitz.field_L ? 1 : 0;
        if (param3 != 27) {
          field_a = (SpriteData[]) null;
        }
        if (param4 > param5) {
          if (param4 < param2) {
            TickClock.a(SoftwareRasterizer.pixels, param6, param5, param2, param1, param0, param3 + 1955582389, param7, param4);
          } else {
            if (param2 <= param5) {
              TickClock.a(SoftwareRasterizer.pixels, param0, param2, param4, param1, param7, 1955582416, param6, param5);
            } else {
              TickClock.a(SoftwareRasterizer.pixels, param0, param5, param4, param1, param6, param3 ^ 1955582411, param7, param2);
            }
          }
        } else {
          if (param2 <= param5) {
            if (param2 > param4) {
              TickClock.a(SoftwareRasterizer.pixels, param7, param4, param5, param1, param6, 1955582416, param0, param2);
            } else {
              TickClock.a(SoftwareRasterizer.pixels, param7, param2, param5, param1, param0, 1955582416, param6, param4);
            }
          } else {
            TickClock.a(SoftwareRasterizer.pixels, param6, param4, param2, param1, param7, 1955582416, param0, param5);
          }
        }
    }

    private final void removeEntry(CacheReferenceNode entry, byte guard) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (entry != null) {
            entry.unlink(false);
            entry.unlinkSecondary(-5106);
            this.remainingCapacity = this.remainingCapacity + entry.weight;
          }
          if (guard != -124) {
            field_a = (SpriteData[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sd.M(");
          if (entry == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    final void put(long key, Object value, byte guard) {
        try {
          this.putWeighted(1, (byte) -95, value, key);
          if (guard != 19) {
            this.remove(-95L, false);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sd.J(" + key + ',' + (value != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final Object firstValue(int guard) {
        CacheReferenceNode var2;
        Object var3;
        CacheReferenceNode var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (CacheReferenceNode) (this.entries.first(-1));
        if (guard != 0) {
          return (Object) null;
        }
        while (var2 != null) {
          var3 = var2.getValue((byte) 103);
          if (var3 != null) {
            return var3;
          }
          var4 = var2;
          var2 = (CacheReferenceNode) (this.entries.next(-1));
          var4.unlink(false);
          var4.unlinkSecondary(-5106);
          this.remainingCapacity = this.remainingCapacity + var4.weight;
        }
        return null;
    }

    final static String decodeCp1252(byte[] bytes, int offset, int length, int guard) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var11 = new char[length];
          var10 = var11;
          var4 = var10;
          if (guard != 26564) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var5 = 0;
          for (var6 = 0; var6 < length; var6++) {
            var7 = 255 & bytes[offset + var6];
            if (0 != var7) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = AccountCreationProgressDialog.CP1252_EXTENSION[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_18_0 = new String(var11, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("sd.H(");
          if (bytes == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(offset).append(',').append(length).append(',').append(guard).append(')').toString());
        }
    }

    private final void remove(long key, boolean guard) {
        CacheReferenceNode var4 = (CacheReferenceNode) (this.entries.get(575, key));
        if (guard) {
          this.putWeighted(-43, (byte) -104, (Object) null, -101L);
        }
        this.removeEntry(var4, (byte) -124);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          field_a = (SpriteData[]) null;
        }
        field_a = null;
        achievementsThisGameText = null;
        field_e = null;
    }

    private final void putWeighted(int weight, byte guard, Object value, long key) {
        CacheReferenceNode var6 = null;
        StrongCacheReference var6_ref = null;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.capacity < weight) {
            throw new IllegalStateException();
          }
          this.remove(key, false);
          this.remainingCapacity = this.remainingCapacity - weight;
          while (0 > this.remainingCapacity) {
            var6 = (CacheReferenceNode) (this.recency.removeFirst((byte) -61));
            this.removeEntry(var6, (byte) -124);
          }
          var6_ref = new StrongCacheReference(value, weight);
          this.entries.put(-20657, var6_ref, key);
          int var7 = 2 % ((12 - guard) / 33);
          this.recency.addLast((DualLinkNode) (var6_ref), (byte) -122);
          ((CacheReferenceNode) ((Object) var6_ref)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sd.B(" + weight + ',' + guard + ',' + (value != null ? "{...}" : "null") + ',' + key + ')');
        }
    }

    private SoftLruCache(int maxWeight, int maxBuckets) {
        int var3;
        this.recency = new SecondaryNodeDeque();
        this.remainingCapacity = maxWeight;
        this.capacity = maxWeight;
        for (var3 = 1; var3 + var3 < maxWeight; var3 = var3 + var3) {
          if (maxBuckets > var3) {
            continue;
          }
          break;
        }
        this.entries = new IterableNodeHashTable(var3);
    }

    static {
        field_e = new PacketBuffer(256);
        achievementsThisGameText = "ACHIEVEMENTS THIS GAME";
    }
}
